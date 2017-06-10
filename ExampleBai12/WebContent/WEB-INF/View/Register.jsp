<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Register Page</title>
</head>
<body>
	<h2><%= request.getAttribute("msgRegister") != null ? request.getAttribute("msgRegister") : " " %></h2>
	<form action="RegisterController" method="post">
		User name: <input type="text" name="uname"/>
		<br/>
		<br/>
		Password: <input type="password" name="pass"/>
		<br/>
		<br/>
		<input type="submit" value="Register"/>
	</form>
</body>
