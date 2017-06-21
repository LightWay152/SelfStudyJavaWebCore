<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>QuizOnline Page</title>
</head>
<body>
	
	<h4><%= request.getAttribute("msg")!=null ? request.getAttribute("msg") : " " %></h4>
	<form action="QuizController" method="post">
		<c:forEach items="${listincomplete}" var="list">
			<p>${list.number}. ${list.question}</p>
			<input type="radio" name="ans[${list.number}]" value="A"> ${list.option1}
			<br>
			<input type="radio" name="ans[${list.number}]" value="B"> ${list.option2}
			<br>
			<input type="radio" name="ans[${list.number}]" value="C"> ${list.option3}
			<br>
			<input type="radio" name="ans[${list.number}]" value="D"> ${list.option4}
			<br>
		</c:forEach>
		<br>
		<input type="submit" value="TabScript">
	</form>
	
</body>
