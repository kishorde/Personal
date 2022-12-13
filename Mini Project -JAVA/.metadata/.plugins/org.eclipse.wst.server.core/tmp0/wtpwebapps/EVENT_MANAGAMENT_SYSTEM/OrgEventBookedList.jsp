<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	table{
		border: 2.5px solid black;
		
	}
	td{
		padding:10px;
		font-size: 25px;
	}
	th{
	border: 2.5px solid black;
	padding:10px;
	font-size: 35px;
	}
	
</style>
</head>
<body>

<%@include file="/navbar/organizerNavbar.jsp" %>

<h1>View Event: </h1>

<table>
		<tr>
		<th>Event id </th>
		
		
		<th>Booking status </th>
		<th>Options</th>
		
		</tr>

		<c:forEach items="${bookingOrglist}" var="bookingOrglist">
		<tr>
		<td>${bookingOrglist.eventId}</td>
		
		<td>${bookingOrglist.status}</td>
		
		
		<td>
			<a href="#">Confirm |</a>
			<a href="#">Cancel</a>
		</td>
		
			
		</tr>
		
		</c:forEach>
</table>

	
	<%@include file="/navbar/footerCommon.jsp" %>

</body>
</html>