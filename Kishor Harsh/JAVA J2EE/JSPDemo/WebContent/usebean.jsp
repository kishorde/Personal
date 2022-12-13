<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="student" class="com.cybage.bean.Student"/>
	
	<%-- <jsp:setProperty property="id" name="student" param="id"/>
	<jsp:setProperty property="name" name="student" param="name"/>
	<jsp:setProperty property="marks" name="student" param="marks"/>
 --%>
 
 	<jsp:setProperty property="*" name="student" />
 	
 	
	<jsp:getProperty property="id" name="student"/>	
	<jsp:getProperty property="name" name="student"/>	
	<jsp:getProperty property="marks" name="student"/>	
	

</body>
</html>