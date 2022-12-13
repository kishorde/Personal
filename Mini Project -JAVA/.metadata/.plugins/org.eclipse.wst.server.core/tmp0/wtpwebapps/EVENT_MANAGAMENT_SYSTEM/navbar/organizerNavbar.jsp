<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>

<div class="NavBar" style="left: 0; height: 3.75em; width : 100%; background-color:#173F5F;">
		<img src="images/cec.png" alt="CEC" style="height:3.75em; width:4.75em; padding-left:1em;  text-align:center;">
		
		
		<a href ="LogoutController" style="float:right; padding:1em; "text-decoration: none;><button>LOGOUT</button></a>
		<a href="ViewOrganizerBookedEvents" style="float:right; padding:1em; color:white; text-decoration: none;"><b>View Booking Requests</b></a>
		<a href="EventDetailsViewServlet" style="float:right; padding:1em; color:white; text-decoration: none;"><b>View event</b></a>
		<a href="EventDetailsAddServlet" style="float:right; padding:1em; color:white; text-decoration: none;"><b>Add Event</b></a>
		<a href="/EVENT_MANAGAMENT_SYSTEM/organizerPage.jsp" style="float:right; padding:1em; color:white; text-decoration: none;"><b>Home</b></a>
	</div>

</body>
</html>