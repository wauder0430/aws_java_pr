<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.Person" %>
<%
	Person hong = new Person();
	hong.setName("ȫ�浿");
	hong.setAge(20);
	
	hong.PrintInfo();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>JAVA ��ü ������ ȣ��</title>
	</head>
	<body>
		�̸� : <%= hong.getName() %>
		<br>
		���� : <%= hong.getAge() %>
	</body>
</html>