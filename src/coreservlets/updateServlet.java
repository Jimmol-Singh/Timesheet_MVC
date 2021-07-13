package coreservlets;


import java.io.IOException;
import coreservlets.modifyServlet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.ResultSet;
import java.sql.SQLException;


@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String uID = "cst4713";
		String password = "password1";
		
		HttpSession session = request.getSession();
		updateService service = new updateMapper();
	
		/*
		String emplid = request.getParameter("modssn");
		session.setAttribute("emplid", emplid);
		String month = request.getParameter("modmonth");
		session.setAttribute("month", month);
		String day = request.getParameter("modday");
		session.setAttribute("day", day);
		String year = request.getParameter("modyear");
		session.setAttribute("year", year);
		String paytypeid = request.getParameter("modpaytype");
		session.setAttribute("paytypeid", paytypeid);
		*/
		
		StoreDate dateobject = new StoreDate();
		String paytypeid = request.getParameter("modpaytype");
	
		
		String hiddenyear=request.getParameter("hiddenYear");
		String hiddenmonth=request.getParameter("hiddenMonth");
		String hiddenday=request.getParameter("hiddenDay");
		String emplid = request.getParameter("emplidTest");
		String hello = request.getParameter("hello");
		String test = request.getParameter("updatessn");
		
		
		String date = hiddenmonth + "/" + hiddenday + "/" + hiddenyear;
		session.setAttribute("date", date);
		
		String hourin = request.getParameter("inhh");
		String minin = request.getParameter("inmm");
		String ssin = request.getParameter("inss");
		
		String Timein = hourin + ":" + minin + ":" + ssin;
		String updatedTimein = date + " " + Timein;
		
		
		session.setAttribute("updatedTimein", updatedTimein);
		
		String hourout = request.getParameter("outhh");
		String minout = request.getParameter("outmm");
		String ssout = request.getParameter("outss");
		
		String Timeout = hourout + ":" + minout + ":" + ssout;
		
		
		String updatedTimeout = date + " " + Timeout;
		session.setAttribute("updatedTimeout", updatedTimeout);
		
		//String sqlUpdateCommand = "UPDATE dbo.TimeSheetTbl SET StartTime='" + updatedTimein + "', EndTime='" + updatedTimeout + "', PayTypeID=' " + paytypeid + "' WHERE  dbo.TimeSheetTbl.EmpID ='" + emplid+ "' AND CONVERT(DATETIME, FLOOR(CONVERT(FLOAT, dbo.TimeSheetTbl.StartTime))) = '" +date+ "';";
		
		//String command = "UPDATE dbo.TimeSheetTbl SET StartTime='2021-01-01 05:00:00.000', EndTime='2021-01-01 14:00:00.000', PayTypeID='1' WHERE  dbo.TimeSheetTbl.EmpID ='047246964' AND CONVERT(DATETIME, FLOOR(CONVERT(FLOAT, dbo.TimeSheetTbl.StartTime))) = '01/01/2021';";
		//String command = "UPDATE dbo.TimeSheetTbl SET StartTime='" + updatedTimein + " EndTime='" + updatedTimeout + "'," + "PayTypeID='" + paytypeid + "WHERE  dbo.TimeSheetTbl.EmpID ='" + emplid + "' AND CONVERT(DATETIME, FLOOR(CONVERT(FLOAT, dbo.TimeSheetTbl.StartTime))) = '" + date +"';";
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("---------------------------------------");
		System.out.println("hidden day " + hiddenday);
		System.out.println("hidden month " + hiddenmonth);
		System.out.println("hidden year " +hiddenyear);
		System.out.println("Time in " + updatedTimein);
		System.out.println("Time oout" + updatedTimeout);
		System.out.println("Emplid " + emplid);
		System.out.println("Emplid from tag " + hello);
		System.out.println("Update ssn is " + test);
		
		
		
		
		//System.out.println("The dateobject values " + dateobject.getDay() +  " " + dateobject.getMonth()+ " " + dateobject.getYear());
		updatebean update = service.method(updatedTimein, updatedTimeout, paytypeid, test, uID, password, date);
		session.setAttribute("update", update);
		modifyBean test1 = new modifyBean();
		
		
	    String address;
	    
	    if(update.getIdforstudent() != null){
	    	address = "/WEB-INF/results/ModifySuccess.jsp";
	    }
	    else{
	    	address="/WEB-INF/results/ModifiedFailed.jsp";
	    }
	    
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher(address);
	    dispatcher.forward(request, response);	
	
		 
		   
}

 protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
	}