<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 변수 선언과 초기화
	int x = 10;
	int y = 3;
	double z = 0.0;
	
	// 산술 연산자
	z = x / y;
	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>자바 복습</title>
	</head>
	<body>
		z : <%= z %>
		<%	
			System.out.println("z = " + z);
			System.out.println("콘솔에 출력합니다.");
			out.println("z = " + z + "<br>");
			out.println("out 객체를 이용한 프린트입니다.");
		%>
	</body>
</html>