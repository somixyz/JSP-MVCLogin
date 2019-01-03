<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="org.login.app.mvc.dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Successful login!
	
	<jsp:useBean id="user" class="org.login.app.mvc.dto.User" scope="request">
		<jsp:setProperty property="username" name="user" value="NewUser" />
	</jsp:useBean>
	Hello <jsp:getProperty property="username" name="user"></jsp:getProperty>
	 

</body>
</html>