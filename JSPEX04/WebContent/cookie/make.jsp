<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// ��Ű ��ü ���� - > �����ڿ� "�̸�", "��"�� �־� ��ü�� ����
	Cookie ck1 = new Cookie("name", "HongGilDong");
	Cookie ck2 = new Cookie("age", "30");
	// ��Ű�� ������ ����/ ������ ��
	ck1.setMaxAge(30);
	ck2.setMaxAge(30);
	
	// ����(response)��ü�� ��Ű�� ���� -> �������� ��Ű�� ���޵�
	response.addCookie(ck1);
	response.addCookie(ck2);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>��Ű ����</title>
	</head>
	<body>
		<a href="view.jsp">��Ű���� ����</a>
	</body>
</html>