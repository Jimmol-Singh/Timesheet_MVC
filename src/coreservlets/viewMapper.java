package coreservlets;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class viewMapper implements viewService
{
	public viewBean view(String emplid, String uID, String passWord){
		
		viewBean coursebean1 = new viewBean();
		ArrayList<String> ArrayList = new ArrayList<String>();
		ArrayList<Double> ArrayList1 = new ArrayList<Double>();
		//String sqlstr = "SELECT * FROM dbo.TimeSheetTbl  INNER JOIN dbo.PayTypeTbl ON dbo.TimeSheetTbl.PayTypeID = dbo.PayTypeTbl.PayTypeID WHERE dbo.TimeSheetTbl.EmpID = " + emplid + "";
		String sqlstr = "select t.EmpID as SSN, t.StartTime as StartTime, t.EndTime as EndTime, p.PayAmount as PayAmount, DATEDIFF(HOUR, t.StartTime , t.EndTime) AS HourDiff, PayAmount*DATEDIFF(HOUR, t.StartTime , t.EndTime) as Total from dbo.PayTypeTbl as p, dbo.TimeSheetTbl as t where t.EmpID = "+emplid+" and t.PayTypeID = p.PayTypeID";
		double a = 0;

		if( emplid!= null){
				try {
					MyDButil db = new MyDButil();
					ResultSet resultset = db.getQuery(sqlstr, uID, passWord);
					//ResultSet resultset2 = db.getQuery(sqlstr2);
		
					while(resultset.next()){
	
						ArrayList.add("<TR><TD>" + resultset.getString(1)+ "</TD> <TD>" +resultset.getString(2) +"</TD> <TD>" + resultset.getString(3)+"</TD> <TD>"  + resultset.getString(4) +"</TD> <TD>"+ resultset.getString(5)+"</TD><TD>"+ resultset.getString(6) + "</TD></TR>" );
					  //  ArrayListType.add(resultset2.getString(1)+ resultset2.getString(2));
					    a = a + Double.parseDouble(resultset.getString(6));				 
					    
					    ArrayList1.add(a);
					    System.out.println("Total Sum = " + a);
						System.out.println("Mapping");				
						
					}
		
					
					System.out.println("It worked!");
					coursebean1.setViewInfo(ArrayList);
					coursebean1.setViewTotal(ArrayList1);
					//resultset2.close();
					resultset.close();
					db.closeConn();
					
					
				} catch (ClassNotFoundException | SQLException e) {
								
				     e.printStackTrace();     
				}
				
				return coursebean1;				
			} else{
				return (null);
			}
		
		
		
		
		
	}

}