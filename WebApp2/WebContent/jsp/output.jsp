<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OutPut Page</title>
</head>
<body>
<h1 align="center">Out Put (Done with Jsp Tags)</h1>
<table>
<tr><td><font size="5" color="green">First Name : </font></td><td><%= session.getAttribute("fn") %></td>
<tr><td><font size="5" color="green">Last Name : </font></td><td><%= session.getAttribute("ln") %></td>
<tr><td><font size="5" color="green">Middle Name : </font></td><td><%= session.getAttribute("mn") %></td>
<tr><td><font size="5" color="green">Gender : </font></td><td><%= session.getAttribute("gender") %></td>
<tr><td><font size="5" color="blue">Apt/Street : </font></td><td><%= session.getAttribute("apt") %></td>
<tr><td><font size="5" color="blue">City : </font></td><td><%= session.getAttribute("city") %></td>
<tr><td><font size="5" color="blue">State : </font></td><td><%= session.getAttribute("state") %>
<tr><td><font size="5" color="blue">Country : </font></td><td><%= session.getAttribute("country") %></td>
<tr><td><font size="5" color="blue">Phone Number : </font></td><td><%= session.getAttribute("phno") %></td>
<tr><td><font size="5" color="red">Bank Name : </font></td><td><%= session.getAttribute("bankName") %></td>
<tr><td><font size="5" color="red">Account Number : </font></td><td><%= session.getAttribute("actno") %></td>
<tr><td><font size="5" color="red">SSN : </font></td><td><%= session.getAttribute("ssn") %></td>
</table>
</body>
</html>