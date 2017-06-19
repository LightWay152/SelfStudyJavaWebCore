<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<h3>Form Personal</h3>
	<h3><%= request.getAttribute("msginsertstudent")!=null ? request.getAttribute("msginsertstudent") : " "%></h3>
	<form action="HomeController" method="post">
		Student Name: <input type="text" name="studentname"/>
	<br/>
	<br/>
	Province: 
	<select name="dropdownprovince">
		<c:forEach items="${listprovince}" var="l">
			<option value="${l.provinceid}">${l.provincename}</option>	
		</c:forEach>
	</select>
	<br/>
	<br/>
	<input type="submit" value="Register">
	</form>
</body>
</html>
