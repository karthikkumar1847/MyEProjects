<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font size="5" color="green">First Name : </font><%= session.getAttribute("fname") %><br/>
<font size="5" color="green">Last Name : </font><%= session.getAttribute("lname") %><br/>
<font size="5" color="green">Middle Name : </font><%= session.getAttribute("mname") %><br/>
<font size="5" color="green">Gender : </font><%= session.getAttribute("gender") %><br/>
<font size="5" color="blue">Apt/Street : </font><%= session.getAttribute("aptName") %><br/>
<font size="5" color="blue">City : </font><%= session.getAttribute("cityName") %><br/>
<font size="5" color="blue">State : </font><%= session.getAttribute("stateName") %><br/>
<font size="5" color="blue">Country : </font><%= session.getAttribute("countryName") %><br/>
<font size="5" color="blue">Phone Number : </font><%= session.getAttribute("phoneNumber") %><br/>
<font size="5" color="red">Bank Name : </font><%= session.getAttribute("bankName") %><br/>
<font size="5" color="red">Account Number : </font><%= session.getAttribute("AccountNumber") %><br/>
<font size="5" color="red">SSN : </font><%= session.getAttribute("ssn") %><br/>
</body>
</html>