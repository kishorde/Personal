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

<c:out value="Hello from JSTL"/><br>

<c:set var="msg" value="Welcome"></c:set>
<c:out value="${msg}"></c:out>

<c:set var="num" value="10"></c:set>
<c:out value="${num}"></c:out>
<br>
<!-- param is used to take input value and print it  -->
<c:out value="${param.name}"></c:out>
<c:out value="${param.address}"></c:out>


<c:out value="${param.name}"></c:out>
<c:out value="${param.email}"></c:out>


</body>
</html>