<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String name = (String)session.getAttribute("name");
	String age = (String)session.getAttribute("age");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>���� ��ȸ</title>
	</head>
	<body>
		<%= name %><br>
		<%= age %>
	</body>
</html>