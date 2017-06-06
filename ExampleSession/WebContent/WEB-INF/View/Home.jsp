<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Welcome: <%= session.getAttribute("sessionusername") %></h1>
	<br/>
	<form action="LogoutController" method="post">
		<input type="submit" value="Logout">
	</form>
</body>
