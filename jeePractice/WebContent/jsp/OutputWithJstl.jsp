<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><h4>
Personal Information <br></h4>
FirstName     : ${fn} <br>
MiddleName    : ${mn}<br>
Gender        : ${gender}<br><h4>
Contact Information <br></h4>
Address	      : ${addr}<br>
City          : ${city}<br>
State         : ${state}<br>
Country       : ${country}<br>
Phone Number  : ${phno}<br>
<h4>Bank Information <br></h4>
BankName      : ${bname}<br>
AccountNumber : ${acno}<br>
SSN           : ${ssn}<br>
</body>
</html>