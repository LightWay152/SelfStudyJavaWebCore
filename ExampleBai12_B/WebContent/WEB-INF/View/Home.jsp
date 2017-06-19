<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	
	<table border='1'>
	
		<tr>
			<th>
				User name
			</th>
			<th>
				Password
			</th>
		</tr>
		
		<c:forEach items="${listaccount}" var="l">
			<tr>
				<td>
					${l.uname}
				</td>
				<td>
					${l.pass}
				</td>
			</tr>
		</c:forEach>
		
	</table>
	
</body>
</html>
