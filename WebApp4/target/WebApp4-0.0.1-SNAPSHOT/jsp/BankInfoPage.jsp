<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Process Bank Info</h2>
<form:form modelAttribute="bankForm" method="post" action="bankInfo.do">
	<table>
		<tr>
			<td><form:label path="bankName">Bank Name: </form:label>
			<td><form:input path="bankName"/>
		<tr>
			<td><form:label path="accountNumber">Account Number: </form:label>
			<td><form:input path="accountNumber"/>
		<tr>
			<td><form:label path="ssn">SSN: </form:label>
			<td><form:input path="ssn"/>
		<tr>
			<td><td colspan="2"><input type="submit" value="Submit" /></td>
		
	</table>


</form:form>
</body>
</body>
</html>