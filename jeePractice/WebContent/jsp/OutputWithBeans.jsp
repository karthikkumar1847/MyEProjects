<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="pInfoVO" class="com.vr.VO.PersonalInfoVO" scope="session"/>
	<font color=red size=5>First Name: </font>
	<jsp:getProperty property="fn" name="pInfoVO"/><br>
	<font color=red size=5>Last Name: </font>
	<jsp:getProperty property="ln" name="pInfoVO"/><br>
	<font color=red size=5>Middle Name: </font>
	<jsp:getProperty property="mn" name="pInfoVO"/><br>
	<font color=red size=5>Gender: </font>
	<jsp:getProperty property="gender" name="pInfoVO"/><br>
	
	
	<font color=red size=5>Address : </font>
	<jsp:getProperty property="add" name="pInfoVO"/><br>
	<font color=red size=5>City : </font>
	<jsp:getProperty property="city" name="pInfoVO"/><br>
	<font color=red size=5>State : </font>
	<jsp:getProperty property="state" name="pInfoVO"/><br>
	<font color=red size=5>Country : </font>
	<jsp:getProperty property="country" name="pInfoVO"/><br>
	<font color=red size=5>Phone Number : </font>
	<jsp:getProperty property="phno" name="pInfoVO"/><br>
	
	
	<font color=red size=5>Bank Name : </font>
	<jsp:getProperty property="bname" name="pInfoVO"/><br>
	<font color=red size=5>Account Number : </font>
	<jsp:getProperty property="actno" name="pInfoVO"/><br>
	<font color=red size=5>SSN : </font>
	<jsp:getProperty property="ssn" name="pInfoVO"/><br>
	
</body>
</html>