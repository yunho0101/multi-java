<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.setAttribute("view", 0);
%>
<hr>서버에 세션 속성등록함. 
<a href="page04.jsp">session속성가지고오기</a>
</body>
</html>