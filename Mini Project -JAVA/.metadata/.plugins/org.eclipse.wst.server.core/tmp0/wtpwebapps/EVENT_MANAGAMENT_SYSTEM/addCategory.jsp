<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@include file="navbar/adminNavbar.jsp" %>

<form action="AdminCategoryAddServlet" method="post">

<h1>Add Category</h1>
<input type="text" name="eventCategory" placeholder="Enter Category">
<input type="submit" value="Add">

</form>

<%@include file="navbar/footerCommon.jsp" %>

</body>
</html>