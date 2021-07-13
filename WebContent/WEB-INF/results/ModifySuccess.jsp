<%@ page language="java" session="true" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Modify Page</title>
</head>
<body>
<a href="success.jsp">Log</a>
<a href="View.jsp">View</a>
<a href="Modify.jsp">Modify</a>
<p style="color:green;">Modification Successful!</p>
<form action = "modify" method="post">
<p>Employee ID</p>
<select name="modssn"> 
<option> </option>
<option>${Student.getSsn()}</option></select>


<p>Date</p>
<select name="modmonth"> 
<option>Month</option>
<option>01</option>
<option>02 </option>
<option>03</option>
<option>04 </option>
<option>05</option>
<option>06 </option>
<option>07</option>
<option>08</option>
<option>09</option>
<option>10</option>
<option>11</option>
<option>12</option>

</select>

<select name = "modday"> 
<option>Day</option>
<option>01</option>
<option>02 </option>
<option>03</option>
<option>04 </option>
<option>05</option>
<option>06 </option>
<option>07</option>
<option>08 </option>
<option>09</option>
<option>10</option>
<option>11</option>
<option>12</option>
<option>13</option>
<option>14 </option>
<option>15</option>
<option>16 </option>
<option>17</option>
<option>18 </option>
<option>19</option>
<option>20</option>
<option>21</option>
<option>22</option>
<option>23</option>
<option>24</option>
<option>25</option>
<option>26</option>
<option>27</option>
<option>28</option>
<option>29</option>
<option>30</option>
<option>31</option>
</select>

<select name = "modyear"> 
<option>Year</option>
<option>2021</option>
<option>2022 </option>
<option>2023</option>
<option>2024 </option>
<option>2025</option>
</select>

<button type="submit">Load</button>
</form>



  
  



<form action="updateServlet" method = "post">





  
<h3 name = "studentid" hidden>${mod1.getEmplid()}</h3>
<h3 name="hello">${mod1.getEmplid()}</h3>




  <p>Time in</p>
  <label>HH:</label>
  <input type="text"  name="inhh" value="${mod1.getTimeinhour()}"><br><br>
  <label>MM:</label>
  <input type="text"  name="inmm" value="${mod1.getTimeinmin()}"><br><br>
  <label>SS:</label>
  <input type="text"  name="inss" value="${mod1.getTimeinseconds()} "><br><br>
  
  
  
  <p>Time out</p>
  <label>HH:</label>
  <input type="text"  name="outhh" value="${mod1.getTimeouthour()}"><br><br>
  <label>MM:</label>
  <input type="text"  name="outmm" value="${mod1.getTimeoutmin()}"><br><br>
  <label>SS:</label>
  <input type="text"  name="outss" value="${mod1.getTimeoutseconds()}"><br><br>
  
  
  <p>PayType</p>
<select name="modpaytype"> 
<option> </option>
<option>${Student.getPaytypeid()} </option></select>
 

 <input type="hidden"  name="hiddenYear" value="${mod1.getYear()}">
 <input type="hidden"  name="hiddenMonth" value="${mod1.getMonth()}">
 <input type="hidden"  name="hiddenDay" value="${mod1.getDay()}">

 <select name="updatessn"> 
<option>${mod1.getEmplid()}</option></select>
  
  
<button type "submit">Modify</button>
</form>

 ${mod1.getTimeinmin()}  ${mod1.getTimeinseconds()} <br>
${mod1.getTimeouthour()} ${mod1.getTimeoutmin()}  ${mod1.getTimeoutseconds()}



</body>
</html>