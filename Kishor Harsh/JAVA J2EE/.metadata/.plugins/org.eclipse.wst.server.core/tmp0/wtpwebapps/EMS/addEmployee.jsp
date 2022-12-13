<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Employees:</h1>
	
	<form action="EmployeeServlet" method="post">
		
		<input type="number" name="id" placeholder="enter id">
		<input type="text" name="name" placeholder="enter name">
		<input type="number" name="salary" placeholder="enter salary">
		<input type="submit">
	</form>
</body>
</html>