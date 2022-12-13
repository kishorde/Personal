<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Event</title>
</head>
<style>
input{
padding:10px;

}
</style>
<body>


<%@include file="/navbar/organizerNavbar.jsp" %>
	
	
	<h1>Add Event </h1>
	
	<form action="EventDetailsAddServlet" method="post">
		<input type="text" name="eventName" placeholder="enter name">
		
		<select name="eventCategory" value="select">
		<c:forEach items="${applicationScope.categoryList}" var="eventcat">
  		<option value="${eventcat.categoryId}">${eventcat.categoryName}</option>
  		</c:forEach>
  		</select>
  		
		 <!-- <input type="text" name="eventCategory" placeholder="enter category"> -->
  		
		<input type="text" name="eventCity" placeholder="enter city">
		<input type="date" name="eventDate" placeholder="enter date">
		<input type="number" name="eventPrice" placeholder="enter price">
		
		
		
		<!-- <input type="text" name="eventCategory" placeholder="enter category"> -->
		<input type="submit">
	</form>
	
	
	<%@include file="/navbar/footerCommon.jsp" %>
	
</body>
</html>