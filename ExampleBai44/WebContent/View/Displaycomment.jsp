<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Display Comment</title>
</head>
<body>
	<c:forEach items="${listcomment}" var="list">
		<p>${list.username}</p>
		<p>${list.content}</p>
	</c:forEach>
</body>
