<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Process Contact Info</h2>
<form:form modelAttribute="contactForm" method="post" action="contactInfo.do">
	<table>
		<tr>
			<td><form:label path="apt">Apt/Street: </form:label>
			<td><form:input path="apt"/>
		<tr>
			<td><form:label path="city">City: </form:label>
			<td><form:input path="city"/>
		<tr>
			<td><form:label path="state">State: </form:label>
			<td><form:input path="state"/>
		<tr>
			<td><form:label path="country">Country: </form:label>
			<td><form:input path="country"/>
		<tr>
			<td><form:label path="phoneNumber">Phone Number: </form:label>
			<td><form:input path="phoneNumber"/>
		<tr>
			<td><td colspan="2"><input type="submit" value="Submit" /></td>
		
	</table>


</form:form>

</html>