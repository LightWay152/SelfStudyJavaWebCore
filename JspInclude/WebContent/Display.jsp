<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Page</title>
</head>
<body>
	<!--table border="1">	
		<c:forEach items="${listUsers}" var="list">	
			<tr>
				<td>
					${list.name1}
				</td>
				<td>
					${list.name2}
				</td>
			</tr>	
		</c:forEach>
	</table-->
	
	<table border="1">	
		<c:forEach items="${listStudent}" var="lstStudent">	
			<c:if test="${(lstStudent.num > 3) && (lstStudent.num < 6)}">
				<tr>
					<td>
						${lstStudent.num}
					</td>
					<td>
						${lstStudent.username}
					</td>
				</tr>	
			</c:if>		
		</c:forEach>
	</table>
	
	
</body>
</html>