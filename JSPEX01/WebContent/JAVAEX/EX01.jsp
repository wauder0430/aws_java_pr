<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// ���� ����� �ʱ�ȭ
	int x = 10;
	int y = 3;
	double z = 0.0;
	
	// ��� ������
	z = x / y;
	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�ڹ� ����</title>
	</head>
	<body>
		z : <%= z %>
		<%	
			System.out.println("z = " + z);
			System.out.println("�ֿܼ� ����մϴ�.");
			out.println("z = " + z + "<br>");
			out.println("out ��ü�� �̿��� ����Ʈ�Դϴ�.");
		%>
	</body>
</html>