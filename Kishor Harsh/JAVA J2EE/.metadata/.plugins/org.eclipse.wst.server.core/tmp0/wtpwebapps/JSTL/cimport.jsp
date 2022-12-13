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
<%-- 	<c:import var="webData" url="https://www.cybage.com/"/>
	<c:out value="${webData}" escapeXml="false"/>
 --%>
 
 	<c:out value="importing cout.html"/>
 	<c:import var="staticData" url="/cout.html"/>
 	<c:out value="${staticData}" escapeXml="false"/>
 
 </body>
</html>