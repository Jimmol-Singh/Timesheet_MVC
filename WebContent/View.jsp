<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Page</title>
</head>
<body>
<a href="Log.jsp">Log</a>
<a href="View.jsp">View</a>
<a href="Modify.jsp">Modify</a>
<form action = "viewServlet" method="post">
<p>Employee ID</p>
<select name="ssn"> 
<option> </option>
<option>${Student.getSsn()}</option></select>

<button type="submit">Log</button>
</form>

<table style="width: 65%">
  <tr>
  	<td align="center">
  		<table >
		  <tr>
		    <th align="left">Emplid ID</th>
		    <th align="left">Start Time</th>
		    <th align="left">End Time</th>
		    <th align="left">Pay Amount</th>
		    <th align="left">Hour Diff</th>
		    <th align="left">Total</th>
		  </tr> 
 			${view.getViewInfo()}
 		</table>
 	</td>
  </tr>
</table>
<p>Total: $ ${view.getViewTotal()}</p>
</body>
</html>