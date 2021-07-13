<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<body>
<form action = "Validation" method="post">
<table border = "1">
<tr>
<th colspan="2">USER LOGIN</th>
<tr>
<td>Database ID:</td>
<td><input type="text" name = "uID" maxlength = "7"/></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="text" name = "passWord" maxlength = "9"/></td>
</tr>
<tr>
<td colspan="2" style="text-align:center"><input type="submit" value="SUBMIT"/></td>
</tr>
</table>
</form>
</body>
</html>