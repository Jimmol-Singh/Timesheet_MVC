package coreservlets;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import coreservlets.MyDButil;

public class CourseRegistered implements CourseLookUpService {

	@Override
	public Student findStudent(String uID, String passWord) {
		Student student = new Student();
		ArrayList<String> ArrayListCourse = new ArrayList<String>();
		ArrayList<String> ArrayListType = new ArrayList<String>();
        String sqlStr = "Select * from dbo.Students";
        String sqlStr2 = "Select * from dbo.PayTypeTbl";
            try (MyDButil dButil = new MyDButil();) {

                ResultSet resultSet = dButil.getQuery(sqlStr, uID, passWord);
                ResultSet resultSet2 = dButil.getQuery(sqlStr2, uID, passWord);
                while(resultSet.next()){
                	System.out.println();
				    ArrayListCourse.add("<option>" + resultSet.getString(1)+ "</option>");
				
					System.out.println("Mapping");				
					
                }
                while(resultSet2.next()){
                	System.out.println();
				    ArrayListType.add("<option>" + resultSet2.getString(1)+ "</option>");
				
					System.out.println("Mapping");	
                }
                
                
                //if (resultSet.next()) {
                	
                	//student = new Student();
                	//student.setSsn( resultSet.getString(1));
                	//student.setPaytypeid(resultSet.getString(5)  );
                	
                    //System.out.println("Successful login access!");
                    //System.out.println(student.getSsn() + " " + student.getPaytypeid());
               // }
        		
				System.out.println("It worked!");
				student.setMySsn(ArrayListCourse);
				student.setMyPaymentType(ArrayListType);
				resultSet.close();
				dButil.closeConn();
                
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return student;
        
    }
}
	
