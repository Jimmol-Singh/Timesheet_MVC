package coreservlets;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class updateMapper implements updateService{

	@Override
	public updatebean method(String starttime, String endtime, String paytype, String emplid, String uID, String passWord, String date) {
		


		updatebean coursebean = new updatebean();
		ArrayList<String> test = new ArrayList<String>();
		//ArrayList<String> ArrayListType = new ArrayList<String>();
		

		System.out.println("This is from the updated mapper");
		System.out.println(starttime);
		System.out.println(endtime);
		System.out.println(date);
		System.out.println(paytype);
		System.out.println("Updated MAPPER EMPLID " + emplid);
         
      
      

		
		
		//String sqlstr = "UPDATE dbo.TimeSheetTbl SET StartTime='" + starttime + " EndTime='" + endtime + "'," + "PayTypeID='" + paytype + "WHERE  dbo.TimeSheetTbl.EmpID ='" + emplid + "' AND CONVERT(DATETIME, FLOOR(CONVERT(FLOAT, dbo.TimeSheetTbl.StartTime))) = '" + date +"'";
		String sqlstr = "UPDATE dbo.TimeSheetTbl SET StartTime=' " + starttime +"', EndTime='" + endtime + "', PayTypeID='" + paytype + "' WHERE  dbo.TimeSheetTbl.EmpID ='" + emplid + "' AND CONVERT(DATETIME, FLOOR(CONVERT(FLOAT, dbo.TimeSheetTbl.StartTime))) = '" + date + "'";
		
		
		if( emplid!= null){
				try {
					MyDButil db = new MyDButil();
					db.getQuery(sqlstr, uID, passWord);
				
				   // ResultSet rs =  db.getQuery(sqlstr, uID, passWord);
					
		           
		            
					System.out.println("It worked!");
					
					
					//coursebean.setTieoutSchedule(ArrayListCourse);
					//coursebean.setTimeinSchedule(ArrayListType);
					modifyBean testarraylist = new modifyBean();
					
					
					coursebean.setIdforstudent(emplid);
					//resultset.close();
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
