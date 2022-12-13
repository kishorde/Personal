<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Server Pages</title>
</head>
<body>
	
	<%= new Date()  %>
	<br>
	<%= 8*10 %><br>
	<%= "Happy Diwali!!" %>
	<br>
	
	
<%
	String msg = "hello";
	int a = 10;
	int b = 20;
	int c = a+b;
	out.print(msg);%><br>

<% 	
	out.print("c= " + c);

%><br>
<%@ include file="welcome.jsp"%>


	
</body>
</html>