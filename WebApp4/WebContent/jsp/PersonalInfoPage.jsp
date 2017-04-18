<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Process Personal Info</h2>
<%@include file="/jsp/Error.jsp" %>
<form:form modelAttribute="AllForm" method="post" action="personalInfo.do" >

	<table>
		<tr>
			<td><form:label path="firstName">First Name:</form:label>
			<td><form:input path="firstName"/>
			
		<tr>
			<td><form:label path="lastName">Last Name:</form:label>
			<td><form:input path="lastName"/>
			
		<tr>
			<td><form:label path="middleName">Middle Name:</form:label>
			<td><form:input path="middleName"/>
		<tr>
			<td><form:label path="gender">Gender:</form:label>
			<td><form:radiobutton path="gender" value="Male"/>Male
			<form:radiobutton path="gender" value="Female"/>Female
		<tr>
			<td colspan="2"><input type="submit" value="Submit" /></td>
	</table>	
</form:form>
</body>
</html>