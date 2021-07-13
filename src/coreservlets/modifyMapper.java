package coreservlets;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class modifyMapper implements modifyService {

	public modifyBean mod1(String emplid, String uID, String passWord, String date){
		
		System.out.println("The emplid for modifymapper is " + emplid);
		
		modifyBean coursebean = new modifyBean();
		
		ArrayList<String> arraytest = new ArrayList<String>();
		String timein="";
		String timeout="";
		String timeincommand = "Select CAST(dbo.TimeSheetTbl.[StartTime] as time) from dbo.TimeSheetTbl WHERE  dbo.TimeSheetTbl.EmpID ='" + emplid +"' AND CONVERT(DATETIME, FLOOR(CONVERT(FLOAT, dbo.TimeSheetTbl.StartTime))) = '" + date + "'";
		String timeoutcommand= "Select cast(dbo.TimeSheetTbl.EndTime as time) [EndTime] from dbo.TimeSheetTbl WHERE  dbo.TimeSheetTbl.EmpID ='" + emplid +"' AND CONVERT(DATETIME, FLOOR(CONVERT(FLOAT, dbo.TimeSheetTbl.StartTime))) = '" + date + "'";
 
      
         
		 //String sqlstr2 = "INSERT INTO [CUNY_DB].[dbo].[TimeSheetTbl] VALUES (" + "'" +emplid + "'"+  ","  + "'" + starttime +"'" +"," + "'" + endtime+ "'" + "," + "'" + paytype +"'"  + ")";
         //String sqlstr = "SELECT * FROM [CUNY_DB].[dbo].[TimeSheetTbl]";
		 String sqlstr = "select t.StartTime, t.EndTime, t.PayTypeID from dbo.TimeSheetTbl as t where t.EmpID = "+emplid;
 		 if( emplid!= null){
				try {
					MyDButil db = new MyDButil();
					ResultSet resultset = db.getQuery(timeincommand, uID, passWord);
					ResultSet resultset2 = db.getQuery(timeoutcommand, uID, passWord);
					//ResultSet resultset2 = db.getQuery(sqlstr2);
		
					while(resultset.next()){
	
					   // ArrayListCourse.add( resultset.getString(1)+ resultset.getString(2)+ resultset.getString(3));
					  //  ArrayListType.add(resultset2.getString(1)+ resultset2.getString(2));
					
						
					    timein = resultset.getString(1);
					    System.out.println(timein);
						System.out.println("Mapping");				
						
					}
		
					System.out.println("It worked!");
					
					
					
					while(resultset2.next()){
						
						
							
						    timeout = resultset2.getString(1);
						    System.out.println(timeout);
							System.out.println("Mapping");				
							
						}
					
					
					coursebean.setMonth(date.substring(0, 2));
					coursebean.setDay(date.substring(3, 5));
					coursebean.setYear(date.substring(6, 10));
					
					
					coursebean.setEmplid(emplid);
				    coursebean.setTimeinhour(timein.substring(0,2));
				    coursebean.setTimeinmin(timein.substring(3,5));
				    coursebean.setTimeinseconds(timein.substring(6,8));
				
				    
				    coursebean.setTimeouthour(timeout.substring(0,2));
				    coursebean.setTimeoutmin(timeout.substring(3,5));
				    coursebean.setTimeoutseconds(timeout.substring(6,8));
					
					
					
					
					
					
					resultset.close();
					resultset2.close();
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