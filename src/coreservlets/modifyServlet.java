package coreservlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/modify")
public class modifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uID = "cst4713";
		String password = "password1";
		
		HttpSession session = request.getSession();
		CourseLookUpService courseservice = new CourseRegistered();
		Student student = courseservice.findStudent(uID, password);
		session.setAttribute("Student", student);
		//lookupservice2 service = new mapper2();
		modifyService service = new modifyMapper();
		String emplid = request.getParameter("modssn");
		String month = request.getParameter("modmonth");
		String day = request.getParameter("modday");
		String year = request.getParameter("modyear");
		

		
		String date = month + "/" + day + "/" + year;
		
	    modifyBean mod1 = service.mod1(emplid,uID,password,date);
		String address;
		request.setAttribute("mod1", mod1);
		
		System.out.println("This is from the modify servlet");
		System.out.println(emplid);
		System.out.println(month);
		System.out.println(day);
		System.out.println(year);
		System.out.println(date);
		
		//System.out.println("The date object in modify is: " + dateobject.getDay() + " " + dateobject.getYear() + " " + dateobject.getMonth());
		 
		 if(mod1.getTimeinhour() != null){
			 address = "/Modify.jsp";
		 }
		 else{
			 address = "/WEB-INF/results/ModifiedFailed.jsp";
		 }
		    RequestDispatcher dispatcher = request.getRequestDispatcher(address);
		    dispatcher.forward(request, response);		
}

 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
	}