<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		
		application.setAttribute("uname",userName);
		
		if(userName.equals("Kishor") && password.equals("chicku")){%>
			<jsp:forward page="welcome.jsp"/>
	
		<% }
 		else
		{
			out.print("Invalid Credentials");%>
			
			<jsp:include page="login.jsp"></jsp:include>
			
		 <% }
		
	%>
			
			<%-- <%@ include file="login.jsp" %>--%>
	
</body>
</html>