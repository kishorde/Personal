<%@page import="com.cybage.model.AdminCategory"%>
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
		AdminCategory admincategory=(AdminCategory)request.getAttribute("admincategory");
	%>
	<form action="adminCategoryUpdateServlet" method="post">
		
		<input type="hidden" name="categoryId" value="<%= admincategory.getCategoryId()%>">
		<input type="text" name="categoryName" value="<%= admincategory.getCategoryName()%>">
		
		<input type="submit">
	</form>

</body>
</html>