<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.Person" %>
<%
	// session에 원하는 정보를 넣을때에는 
	// 이름, 값(리터럴,객체)
	session.setAttribute("name", "홍길동");
	session.setAttribute("age", "30");
	
	Person jeon = new Person();
	jeon.setName("전우치");
	jeon.setAge(20);
	session.setAttribute("loginUser", jeon);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>세션 연습</title>
	</head>
	<body>
		<a href="view.jsp">session 조회</a>
	</body>
</html>