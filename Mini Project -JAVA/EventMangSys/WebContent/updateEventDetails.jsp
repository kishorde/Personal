<%@page import="com.cybage.model.EventDetails"%>
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

<h1>Update event Details:</h1>

<% EventDetails eventdetails =(EventDetails)request.getAttribute("eventdetails"); %>


<form action="EventDetailsUpdateServlet" method="post">
	
	<input type="text" name="eventName" value="<%= eventdetails.getEventName()%>">
	<%-- <input type="text" name="eventCategory" value="<%= eventdetails.getEventCategory()%>"> --%>
	<input type="text" name="eventCity" value="<%= eventdetails.getEventCity()%>">
	<input type="text" name="eventDate" value="<%= eventdetails.getEventDate()%>">
	<input type="number" name="eventPrice" value="<%= eventdetails.getEventPrice()%>">
	<input type="submit">
	
</form>

</body>
</html>