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
	<h1> Employee List: </h1>
	
	<table>
		<tr>
		<th>Employee ID</th>
		<th>Employee NAME</th>
		<th>Employee Salary</th>
		<th>Employee Salary</th>
		<th>Action</th>
		</tr>
		
		
		<c:forEach items="${empList }" var="emp">
		<tr>
		<td>${emp.id}</td>
		<td>${emp.name}</td>
		<td>${emp.salary}</td>
		<td>
			<a href="EditEmployeeControllerServlet?id=${emp.id}">Edit</a> | 
			<a href="DeleteControllerServlet?id=${emp.id }">Delete</a>
		</td>
			
		</tr>
		
		</c:forEach>
		
	</table>
	
	<div>-------------------------------------------------------------</div>
</body>
</html>