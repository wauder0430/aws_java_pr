<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.Person" %>
<%
	String name = (String)session.getAttribute("name");
	String age = (String)session.getAttribute("age");
	Person login = (Person)session.getAttribute("loginUser");
	if(login != null){
		login.PrintInfo();
	} else {
		login = new Person();
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>���� ��ȸ</title>
	</head>
	<body>
		<%= name %><br>
		<%= age %><br>
		�̸� : <%= login.getName() %><br>
		���� : <%= login.getAge() %><br>
	</body>
</html>