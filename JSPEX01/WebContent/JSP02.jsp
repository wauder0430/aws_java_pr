<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<% 	/*�ڹٿ���
	JSP scriptlet	������ �ڹ� �ڵ带 �ۼ��ϰ� ������ �� ����
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
	<%= /* �ڹٽ� ���� JSP Expession */ hello %>
	<%= hello %>
</body>
</html>