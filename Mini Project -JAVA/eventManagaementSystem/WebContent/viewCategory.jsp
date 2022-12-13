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

<%@include file="/navbar/adminnavbar.jsp" %>

<h1>View Category: </h1>

<table>
		<tr>
		<th>categoryId  |</th>
		<th>Event Category</th>
		</tr>
				
		<c:forEach items="${categoryList }" var="categorylist">
		<tr>
		<td>${categorylist.categoryId}</td>
		<td>${categorylist.categoryName}</td>
		<td>
			<a href="AdminCategoryUpdateServlet?id=${categorylist.categoryId}">Edit</a> | 
			<a href="AdminCategoryDeleteServlet?id=${categorylist.categoryId }">Delete</a>
		</td>
			
		</tr>
		
		</c:forEach>
</table>


<%@include file="/navbar/footerCommon.jsp" %>
</body>
</html>