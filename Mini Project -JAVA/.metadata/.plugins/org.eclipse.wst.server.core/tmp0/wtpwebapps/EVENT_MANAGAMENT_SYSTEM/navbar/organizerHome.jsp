<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div style="background-color: pink; height:100%; width:100%">
<h1>Welcome Event Organizer</h1>

<h1><%= session.getAttribute("userName") %></h1>
</div>

</body>
</html>