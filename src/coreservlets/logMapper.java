package coreservlets;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class logMapper implements logService {

	@Override
	public logBean log(String starttime, String endtime, String paytype, String emplid, String uID, String passWord) {
		
		logBean coursebean = new logBean();
		ArrayList<String> ArrayListCourse = new ArrayList<String>();
		ArrayList<String> ArrayListType = new ArrayList<String>();
		//
         
      
         
		 String sqlstr2 = "INSERT INTO [CUNY_DB].[dbo].[TimeSheetTbl] VALUES (" + "'" +emplid + "'"+  ","  + "'" + starttime +"'" +"," + "'" + endtime+ "'" + "," + "'" + paytype +"'"  + ")";
         //String sqlstr = "SELECT * FROM [CUNY_DB].[dbo].[TimeSheetTbl]";
		 String sqlstr = "SELECT * FROM dbo.TimeSheetTbl  INNER JOIN dbo.PayTypeTbl ON dbo.TimeSheetTbl.PayTypeID = dbo.PayTypeTbl.PayTypeID WHERE dbo.TimeSheetTbl.EmpID = " + emplid + "";
 		 if( emplid!= null){
				try {
					MyDButil db = new MyDButil();
					ResultSet resultset = db.getQuery(sqlstr, uID, passWord);
					//ResultSet resultset2 = db.getQuery(sqlstr2);
				    ResultSet rs =  db.getQuery(sqlstr2, uID, passWord);
		/*
					while(resultset.next()){
	
					    ArrayListCourse.add( resultset.getString(1)+ resultset.getString(2));
					  //  ArrayListType.add(resultset2.getString(1)+ resultset2.getString(2));
					
						System.out.println("Mapping");				
						
					}
		*/
					System.out.println("It worked!");
					coursebean.setSchedule(ArrayListCourse);
					coursebean.setSchedule2(ArrayListType);
					//resultset2.close();
					resultset.close();
					db.closeConn();
					
					
				} catch (ClassNotFoundException | SQLException e) {
								
				     e.printStackTrace();     
				}
				
				return coursebean;				
			} else{
				return (null);
			}
		
		
		
		
		
	}

}
