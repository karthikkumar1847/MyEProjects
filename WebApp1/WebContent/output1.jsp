<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
int i = 10;
int j =20;
int sum = i+j;
int sub = j-i;
int mul = i*j;
int div = j/i;

%>
Value of i = <%=i %></br>
Value of j = <%=j %></br>
Value of sum = <%=sum %></br>
Value of sub = <%=sub %></br>
Value of mul = <%=mul %></br>
Value of div = <%=div %></br>
</body>
</html>