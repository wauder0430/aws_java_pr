<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// session�� ���ϴ� ������ ���������� 
	// �̸�, ��(���ͷ�,��ü)
	session.setAttribute("name", "ȫ�浿");
	session.setAttribute("age", "30");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>���� ����</title>
	</head>
	<body>
		<a href="view.jsp">session ��ȸ</a>
	</body>
</html>