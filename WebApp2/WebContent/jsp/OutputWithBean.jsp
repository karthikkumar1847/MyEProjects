<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bean Output</title>
</head>
<body>
<h1 align="center">Output with Bean</h1>
	<jsp:useBean id="aInfoVO" class="com.servlet.pkg.VO.AllInfoVO" scope="session"/>
	
	<table>
	<tr><td><font size="5" color="green">First Name : </font>
	<td><jsp:getProperty property="firstName" name="aInfoVO"/><br/>
	
	<tr><td><font size="5" color="green">Last Name : </font>
	<td><jsp:getProperty property="lastName" name="aInfoVO"/><br/>
	
	<tr><td><font size="5" color="green">Middle Name : </font>
	<td><jsp:getProperty property="middleName" name="aInfoVO"/><br/>
	
	<tr><td><font size="5" color="green">Gender : </font>
	<td><jsp:getProperty property="gender" name="aInfoVO"/><br/>
	
	<tr><td><font size="5" color="blue">Apt/Street : </font>
	<td><jsp:getProperty property="apt" name="aInfoVO"/><br/>
	
	<tr><td><font size="5" color="blue">City : </font>
	<td><jsp:getProperty property="city" name="aInfoVO"/><br/>
	
	<tr><td><font size="5" color="blue">State : </font>
	<td><jsp:getProperty property="state" name="aInfoVO"/><br/>
	
	<tr><td><font size="5" color="blue">Country : </font>
	<td><jsp:getProperty property="country" name="aInfoVO"/><br/>
	
	<tr><td><font size="5" color="blue">Phone Number : </font>
	<td><jsp:getProperty property="phoneNumber" name="aInfoVO"/><br/>
	
	<tr><td><font size="5" color="red">Bank Name : </font>
	<td><jsp:getProperty property="bankName" name="aInfoVO"/><br/>
	
	<tr><td><font size="5" color="red">Account Number : </font>
	<td><jsp:getProperty property="accountNumber" name="aInfoVO"/><br/>
	
	<tr><td><font size="5" color="red">SSN : </font>
	<td><jsp:getProperty property="ssn" name="aInfoVO"/>
	</table>
</body>
</html>