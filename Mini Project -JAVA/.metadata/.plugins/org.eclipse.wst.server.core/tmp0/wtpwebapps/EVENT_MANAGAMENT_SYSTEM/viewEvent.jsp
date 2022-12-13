<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

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
<body>


<%@include file="/navbar/organizerNavbar.jsp" %>

<h1>View Event: </h1>

<table>
		<tr>
		<th>Event Name </th>
		
		<th>Event City </th>
		<th>Category Id </th>
		<th>Event Price </th>
		<th>Event Date </th>
		<th>Action </th>
		</tr>

		<c:forEach items="${eventlist}" var="events">
		<tr>
		<td>${events.eventName}</td>
		
		<td>${events.eventCity}</td>
		<td>${events.categoryId}</td>
		<td>${events.eventPrice}</td>
		<td>${events.eventDate}</td>
		
		
		<td>
			<a href="EventDetailsUpdateServlet?id=${events.eventId }">Update</a> | 
			<a href="EventDetailsDeleteServlet?id=${events.eventId }">Delete</a>
		</td>
		
			
		</tr>
		
		</c:forEach>
</table>

	
	<%@include file="/navbar/footerCommon.jsp" %>

</body>
</html>