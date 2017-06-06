<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<h5><%= request.getAttribute("message2")!=null?request.getAttribute("message2"):" "%></h5>
	<form action="LoginController" method="post">
		<input type="text" name="username">
		<br/>
		<br/>
		<input type="password" name="password">
		<br/>
		<br/>
		<input type="submit" value="Login">
	</form>
</body>
