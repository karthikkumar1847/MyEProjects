<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<%String errors =(String) request.getSession().getAttribute("errors"); %>

<%if(!errors.equals("") && errors!=null){ %>
<h3><font color="red" face="Arial, Helvetica, sans-serif" size="3">Please correct 
the following errors and try again:</font></h3>
	<ul>
		<font size="2" color="black" face="Arial, Helvetica, sans-serif">
			<%=request.getSession().getAttribute("errors") %>
		</font>
	</ul>
<% request.getSession().removeAttribute("errors"); %>
<%} %>>
</body>
</html>