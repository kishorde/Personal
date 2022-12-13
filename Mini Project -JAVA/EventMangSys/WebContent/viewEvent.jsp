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

<h1>View Event: </h1>

<table>
		<tr>
		<th>Event Name |</th>
		
		<th>Event City |</th>
		<th>Event Price |</th>
		<th>Event Date |</th>
		<th>Category Id |</th>
		<th>Action </th>
		</tr>
		
		
		<c:forEach items="${eventlist}" var="events">
		<tr>
		<td>${events.eventName}</td>
		
		<td>${events.eventCity}</td>
		<td>${events.eventPrice}</td>
		<td>${events.eventDate}</td>
		<td>${events.categoryId}</td>
		
		
		<td>
			<a href="eventDetailsUpdateServlet?id=${events.eventId }">Update</a> | 
			<a href="eventDetailsDeleteServlet?id=${events.eventId }">Delete</a>
		</td>
		
			
		</tr>
		
		</c:forEach>
</table>

</body>
</html>