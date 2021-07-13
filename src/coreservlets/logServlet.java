package coreservlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logServlet")
public class logServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		//lookupservice2 service = new mapper2();
		logService service = new logMapper();
		String emplid = request.getParameter("ssn");
		String paytype = request.getParameter("paytype");
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");
		
		String momentin = request.getParameter("momentin");
		String momentout = request.getParameter("momentout"); 
		
	/*	
		String emplid = "111223333";
		String paytype = "4";
		String month = "12";
		String day = "1";
		String year = "2021";
		
		String momentin = "AM";
		String momentout = "PM";
	*/	
		
		
		String date = month + "/" + day + "/" + year;
		
		String hourin = request.getParameter("hourin");
		String minin = request.getParameter("minin");
		String inTime = hourin + ":" + minin + " " + momentin;
		
	
		
		String hourout = request.getParameter("hourout");
		String minout = request.getParameter("minout"); 
		
		
		
		
		//String hourin = "4";
		//String minin = "15";
		
		//String inTime = hourin + ":" + minin + " " + momentin;
		
	/*
		
		String hourout = request.getParameter("hourout");
		String minout = request.getParameter("minout"); */
		
		
		
	//	String hourout = "5";
	//	String minout =  "30";
		
		String outTime = hourout + ":" + minout + " " + momentout;
		
		String clockedIn = date + " " +  inTime;
		
		String clockedOut = date + " " + outTime;
		
		String uID = "cst4713";
		String password = "password1";
		
		logBean log = service.log(clockedIn, clockedOut, paytype, emplid, uID, password);
	    
		
		
		
		
		 
	//	 session.setAttribute("schedule", schedule);

	 
		 
		 String address;
		 
		 if(log.getSchedule() != null){
			 address = "/WEB-INF/results/LogSuccess.jsp";
		 }
		 else{
			 address = "/WEB-INF/results/LogFailed.jsp";
		 }
		 
		 
		/* 
		 
		 if (schedule.getSchedule() != null){
			 address ="/WEB-INF/results/success.jsp";
		 }
		   else{
			 address = "/WEB-INF/results/failed.jsp";
		   }
		   
	*/	  
			    RequestDispatcher dispatcher = request.getRequestDispatcher(address);
			    dispatcher.forward(request, response);		
	}
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doGet(request, response);
	    }
}

