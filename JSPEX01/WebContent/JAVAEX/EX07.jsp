<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.Person" %>
<%
	Person hong = new Person();
	hong.setName("홍길동");
	hong.setAge(20);
	
	hong.PrintInfo();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>JAVA 객체 생성과 호출</title>
	</head>
	<body>
		이름 : <%= hong.getName() %>
		<br>
		나이 : <%= hong.getAge() %>
	</body>
</html>