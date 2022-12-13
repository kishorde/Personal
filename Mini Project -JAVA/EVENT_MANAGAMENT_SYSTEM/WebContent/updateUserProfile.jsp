<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@page import="com.cybage.model.Registration"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%@ include file="/navbar/userNavbar.jsp" %>


<% Registration userDetails=(Registration)request.getAttribute("userDetails"); %>

<h1> Update Profile</h1>
<form action="UserProfileUpdateServlet" method="post">

<input type="number" name="userId" value="<%=userDetails.getUserID()%>">
<input type="text" name="userName" value="<%=userDetails.getName()%>">
<input type="text" name="userEmail" value="<%=userDetails.getEmail()%>">
<input type="password" name="userPassword" value="<%=userDetails.getPassword() %>">
<input type="text" name="userContact" value="<%=userDetails.getContact() %>">

<input type="submit">

</form>



<%@include file="/navbar/footerCommon.jsp" %>
</body>
</html>