<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<% 	/*자바영역
	JSP scriptlet	온전한 자바 코드를 작성하고 실행할 수 있음
*/
	String hello = "hello, ezen!";

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%= /* 자바식 영역 JSP Expession */ hello %>
	<%= hello %>
</body>
</html>