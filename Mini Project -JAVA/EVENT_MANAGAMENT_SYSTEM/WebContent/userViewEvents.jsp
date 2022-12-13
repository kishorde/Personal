<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>

<style>
	#maincard{
	
		display:flex;
		flex-wrap: wrap;
	}
</style>
<body>
<%@ include file="/navbar/userNavbar.jsp" %>



<h1 class="m-5">eventlist :</h1>

<div id="maincard" class="m-5" >
<c:forEach items="${eventLists }" var="eventlist">
		
		
		
<div class="card m-2" style="width: 18rem;" >

<form action="BookingServlet" method="post">
   <div class="card-body">
   
   
   <input type="hidden" name="eventId" value=${eventlist.eventId } >
    <h5 class="card-title">Event Name : ${eventlist.eventName } </h5>
    <h5 class="card-title">Price : ${eventlist.eventPrice } </h5>
    <h5 class="card-title">Date : ${eventlist.eventDate } </h5>
    <h5 class="card-title">City : ${eventlist.eventCity } </h5>
    <input type="hidden" name="organizerId" value=${eventlist.eventOrganizerId } >
    <p class="card-text" name="categoryId">categoryId : ${eventlist.categoryId }</p>
    
    
    <button type="submit">Book</button>
  </div>
  </form>
 
</div>

 </c:forEach>
</div>
	




<%@include file="/navbar/footerCommon.jsp" %>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>