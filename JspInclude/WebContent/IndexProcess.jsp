<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import = "MyPack.Users" %>
<%@page import = "MyPack.DAO" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index Process Page</title>
</head>
<body>

	<!-- %
		
		request.setAttribute("listUsers", DAO.ExportUsers());
		
		RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
		rd.forward(request, response);
	
	%-->
	
	<%
		
		request.setAttribute("listStudent", DAO.ExportStudent());
		
		RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
		rd.forward(request, response);
	
	%>
	
	
</body>
</html>