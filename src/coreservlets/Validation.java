package coreservlets;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import coreservlets.Student;
import coreservlets.CourseLookUpService;
import coreservlets.CourseRegistered;
@WebServlet("/Validation")
public class Validation extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CourseLookUpService service = new CourseRegistered();
		String uID = request.getParameter("uID");
	    String passWord = request.getParameter("passWord");
	    HttpSession session = request.getSession();
	    	    
        session.setAttribute("databaseID", uID);
        session.setAttribute("password", passWord);
        //Student student = service.findStudent(uID, passWord);
       // session.setAttribute("Student", student);
        
        String address;
        //if (student != null || uID == "cst4713" && passWord == "password1")
        	//address ="/WEB-INF/results/success.jsp";
       
        
        if(uID.equals("cst4713") && passWord.equals("password1")){
        	  Student student = service.findStudent(uID, passWord);
        	  session.setAttribute("Student", student);
        	  address = "/Log.jsp";
        	}
        	
        else{
        	address = "/WEB-INF/results/failed.jsp";
        }
            
	    RequestDispatcher dispatcher = request.getRequestDispatcher(address);
	    dispatcher.forward(request, response);	
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
doGet(request, response);
}
}