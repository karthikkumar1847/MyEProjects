<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Process Personal Info</h2>
<form:form modelAttribute="personalForm" method="post" action="personalInfo.do" >

	<table>
		<tr>
			<td><form:label path="firstName">First Name:</form:label>
			<td><form:input path="firstName"/>
			
		<tr>
			<td><form:label path="lastName">Last Name:</form:label>
			<td><form:input path="lastName"/>
			
		<tr>
			<td><form:label path="middleName">Last Name:</form:label>
			<td><form:input path="middleName"/>
		<tr>
			<td><form:label path="gender">Last Name:</form:label>
			<td><form:radiobuttons path="gender"/>
		<tr>
			<td colspan="2"><input type="submit" value="Submit" /></td>
	</table>	
</form:form>
</body>
</html>