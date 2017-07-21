<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Result Page</title>
</head>
<body>
	<c:if test="${ketqua!=null}">
		${ketqua}
	</c:if>
	
	<c:if test="${ketqua==null}">
		<c:forEach items="${listemp}" var="list">
			${list.name}
			<br/>
		</c:forEach>
	</c:if>
</body>
