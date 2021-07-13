<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pay Time Sheet</title>
</head>
<body>
<a href="Log.jsp">Log</a>
<a href="View.jsp">View</a>
<a href="Modify.jsp">Modify</a>
<p style="color:red;">Log Unsuccessful!</p>
<form action = "logServlet" method="post">
<p>Employee ID</p>
<select name="ssn"> 
<option> </option>
<option>${Student.getSsn()}</option></select>



<p>PayType</p>
<select name="paytype"> 
<option> </option>
<option>${Student.getPaytypeid()} </option></select>


<p>Date</p>
<select name = "month"> 
<option>Month</option>
<option>1</option>
<option>2 </option>
<option>3</option>
<option>4 </option>
<option>5</option>
<option>6 </option>
<option>7</option>
<option>8 </option>
<option>9</option>
<option>10</option>
<option>11</option>
<option>12</option>

</select>

<select name = "day"> 
<option>Day</option>
<option>1</option>
<option>2 </option>
<option>3</option>
<option>4 </option>
<option>5</option>
<option>6 </option>
<option>7</option>
<option>8 </option>
<option>9</option>
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

<select name = "year"> 
<option>Year</option>
<option>2021</option>
<option>2022 </option>
<option>2023</option>
<option>2024 </option>
<option>2025</option>
</select>

<br>



<p>Time</p>
<p>In</p>
<select name = "hourin"> 
<option>Hour</option>
<option>1</option>
<option>2 </option>
<option>3</option>
<option>4 </option>
<option>5</option>
<option>6 </option>
<option>7</option>
<option>8 </option>
<option>9</option>
<option>10</option>
<option>11</option>
<option>12</option>
</select>


<select name = "minin"> 
<option>Min</option>
<option>00</option>
<option>15 </option>
<option>30</option>
<option>45 </option>
</select>

<select name = "momentin"> 
<option>AM/PM</option>
<option>AM</option>
<option>PM </option>
</select>

<br>

<p>Out</p>
<select name = "hourout"> 
<option>Hour</option>
<option>1</option>
<option>2 </option>
<option>3</option>
<option>4 </option>
<option>5</option>
<option>6 </option>
<option>7</option>
<option>8 </option>
<option>9</option>
<option>10</option>
<option>11</option>
<option>12</option>
</select>


<select name = "minout"> 
<option>Min</option>
<option>00</option>
<option>15 </option>
<option>30</option>
<option>45 </option>
</select>

<select name = "momentout"> 
<option>AM/PM</option>
<option>AM</option>
<option>PM </option>
</select>

<br>

<button type="submit">Log</button>

</form>

</body>
</html>