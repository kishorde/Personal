<%@page import="com.cybage.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	Employee employee=(Employee)request.getAttribute("empl");
%>
	
	<form action="EditEmployeeControllerServlet" method="post">
	<input type="number" name="id" value="<%= employee.getId()%>">
	<input type="text" name="name" value="<%= employee.getName() %>">
	<input type="number" name="salary" value="<%= employee.getSalary() %>">
	<input type="submit">
	</form>
</body>
</html>