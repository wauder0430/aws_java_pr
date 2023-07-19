<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 쿠키 객체 생성 - > 생성자에 "이름", "값"을 넣어 객체를 만듬
	Cookie ck1 = new Cookie("name", "HongGilDong");
	Cookie ck2 = new Cookie("age", "30");
	// 쿠키의 수명을 설정/ 단위는 초
	ck1.setMaxAge(30);
	ck2.setMaxAge(30);
	
	// 응답(response)객체에 쿠키를 넣음 -> 브라우저로 쿠키가 전달됨
	response.addCookie(ck1);
	response.addCookie(ck2);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>쿠키 생성</title>
	</head>
	<body>
		<a href="view.jsp">쿠키보러 가기</a>
	</body>
</html>