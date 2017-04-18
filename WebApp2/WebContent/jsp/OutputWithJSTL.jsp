<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>jstl output</title>
</head>
<body>
<h1 align="center">Output with JSTL</h1>
	
	<table>
	<tr><td><font size="5" color="green">First Name : </font>
	<td><c:out value="${aInfoVO.firstName }"/><br/> 
	
	<tr><td><font size="5" color="green">Last Name : </font>
	<td><c:out value="${aInfoVO.lastName }"/><br/>
	
	<tr><td><font size="5" color="green">Middle Name : </font>
	<td><c:out value="${aInfoVO.middleName }"/><br/>
	
	<tr><td><font size="5" color="green">Gender : </font>
	<td><c:out value="${aInfoVO.gender }"/><br/>
	
	<tr><td><font size="5" color="blue">Apt/Street : </font>
	<td><c:out value="${aInfoVO.apt }"/><br/>
	
	<tr><td><font size="5" color="blue">City : </font>
	<td><c:out value="${aInfoVO.city }"/><br/>
	
	<tr><td><font size="5" color="blue">State : </font>
	<td><c:out value="${aInfoVO.state }"/><br/>
	
	<tr><td><font size="5" color="blue">Country : </font>
	<td><c:out value="${aInfoVO.country }"/><br/>
	
	<tr><td><font size="5" color="blue">Phone Number : </font>
	<td><c:out value="${aInfoVO.phoneNumber }"/><br/>
	
	<tr><td><font size="5" color="red">Bank Name : </font>
	<td><c:out value="${aInfoVO.bankName }"/><br/>
	
	<tr><td><font size="5" color="red">Account Number : </font>
	<td><c:out value="${aInfoVO.accountNumber }"/><br/>
	
	<tr><td><font size="5" color="red">SSN : </font>
	<td><c:out value="${aInfoVO.ssn }"/>
	</table>
</body>
</html>