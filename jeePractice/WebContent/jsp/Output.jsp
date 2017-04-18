<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<font color=red size=5>First Name: </font>
	<%=session.getAttribute("fn") %><br>
	<font color=red size=5>Last Name: </font>
	<%=session.getAttribute("ln") %><br>
	<font color=red size=5>Middle Name: </font>
	<%=session.getAttribute("mn") %><br>
	<font color=red size=5>Gender: </font>
	<%=session.getAttribute("gender") %><br>
	
 	<font color=red size=5>Address : </font>
	<%=session.getAttribute("addr") %><br>
	<font color=red size=5>City : </font>
	<%=session.getAttribute("city") %><br>
	<font color=red size=5>State : </font>
	<%=session.getAttribute("state") %><br>
	<font color=red size=5>Country : </font>
	<%=session.getAttribute("country") %><br>
	<font color=red size=5>Phone Number : </font>
	<%=session.getAttribute("phno") %><br>
	
	
	<font color=red size=5>Bank Name : </font>
	<%=session.getAttribute("bname") %><br>
	<font color=red size=5>Account Number : </font>
	<%=session.getAttribute("acno") %><br>
	<font color=red size=5>SSN : </font>
	<%=session.getAttribute("ssn") %><br>
		
</body>
</html>