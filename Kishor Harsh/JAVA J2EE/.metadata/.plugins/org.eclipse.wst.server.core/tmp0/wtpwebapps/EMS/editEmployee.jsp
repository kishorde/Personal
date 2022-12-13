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
	<h1>Edit :</h1>
	
	<%
		Employee employee=(Employee)request.getAttribute("empl");
	%>
	
	<form action="EditEmployeeControllerServlet" method="post">
		<input type="number" id="id" name="id" value="<%= employee.getId() %>" disable="disable">
		<!--  this id cant be updated -->
		
		<input type="text" name="name" id="name" placeholder="enter name" value="<%= employee.getName() %>">
		
		<input type="number" name="salary" id="salary" placeholder="enter salary" value="<%= employee.getSalary() %>">
		
		<input type="submit">
	</form>
</body>
</html>