<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- <%= "Welcome"+(String)application.getAttribute("uname") %> -->
<%= "Welcome"+request.getParameter("name") %>

	<%--<h1><%= application.getAttribute("uname")%></h1>  --%>
	

</body>
</html>