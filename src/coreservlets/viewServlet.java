package coreservlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/viewServlet")
public class viewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uID = "cst4713";
		String password = "password1";
		
	   // String emplid = request.getParameter("ssn");
		String emplid = request.getParameter("ssn");
	    viewMapper service = new viewMapper();
	    viewBean view = service.view(emplid, uID, password);
	    request.setAttribute("ssn", emplid);
	    request.setAttribute("view", view);

    
	    String address;
	    if (view.getViewInfo() != null){
	    	address = "/WEB-INF/results/ViewSuccess.jsp";
	    }
	    	
	    else {
	    	address = "/WEB-INF/results/ViewFailed.jsp";
	    }
	    RequestDispatcher dispatcher = request.getRequestDispatcher(address);
	    dispatcher.forward(request, response);		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}