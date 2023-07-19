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
		<title>세션 조회</title>
	</head>
	<body>
		<%= name %><br>
		<%= age %><br>
		이름 : <%= login.getName() %><br>
		나이 : <%= login.getAge() %><br>
	</body>
</html>