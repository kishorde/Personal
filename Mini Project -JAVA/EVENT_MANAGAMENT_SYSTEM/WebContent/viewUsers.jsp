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

<%@include file="/navbar/adminNavbar.jsp" %>
	

<h1>View User List: </h1>

<table>
		<tr>
		<th> Name </th>
		
		<th>Email </th>
		<th>Contact No </th>
		<th>Role </th>
		
		</tr>
		
		
		<c:forEach items="${userlist}" var="ul">
		<tr>
		<td>${ul.name}</td>
		
		<td>${ul.email}</td>
		<td>${ul.contact}</td>
		<td>${ul.role}</td>
		
		
		
			
		</tr>
		
		</c:forEach>
</table>

<%@include file="/navbar/footerCommon.jsp" %>

</body>
</html>