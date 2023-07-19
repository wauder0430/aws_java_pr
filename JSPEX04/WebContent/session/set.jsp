<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// session에 원하는 정보를 넣을때에는 
	// 이름, 값(리터럴,객체)
	session.setAttribute("name", "홍길동");
	session.setAttribute("age", "30");
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