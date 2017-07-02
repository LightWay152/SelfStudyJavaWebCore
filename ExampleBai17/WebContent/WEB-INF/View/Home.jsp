<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Home Page</title>
	<link href="Bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="Bootstrap/js/jquery-3.2.1.min.js"></script>
    <script src="Bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h3>Page : ${numberpage}</h3>
	<table border = '1'>
		<tr>
			<th>
				id
			</th>
			<th>
				name
			</th>
			<th>
				salary
			</th>
		</tr>
		<c:forEach items="${listemp}" var="employee">
			<tr>
				<td>
					${employee.id}
				</td>	
				<td>
					${employee.name}
				</td>	
				<td>
					${employee.salary}
				</td>				
			</tr>
	  </c:forEach>
	</table>
		
	<ul class = "pagination">
		<c:if test="${numberpage == 1}">
		   <li class = "disabled"><a href = "">&laquo;</a></li>
		   <li><a href = "HomeForward?pageid=1">1</a></li>
		   <li><a href = "HomeForward?pageid=2">2</a></li>
		   <li><a href = "HomeForward?pageid=${numberpage+1}">&raquo;</a></li>
	   </c:if>
	   <c:if test="${numberpage == maxpageid}">
		   <li><a href = "HomeForward?pageid=${numberpage-1}">&laquo;</a></li>
		   <li><a href = "HomeForward?pageid=1">1</a></li>
		   <li><a href = "HomeForward?pageid=2">2</a></li>
		   <li class = "disabled"><a href = "">&raquo;</a></li>
	   </c:if>
	   <c:if test="${numberpage > 1 && numberpage < maxpageid}">
		   <li><a href = "HomeForward?pageid=${numberpage-1}">&laquo;</a></li>
		   <li><a href = "HomeForward?pageid=1">1</a></li>
		   <li><a href = "HomeForward?pageid=2">2</a></li>
		   <li><a href = "HomeForward?pageid=${numberpage+1}">&raquo;</a></li>
	   </c:if>
	</ul>
</body>
