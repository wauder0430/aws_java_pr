<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// �Ķ���� ���� �ް�, ����� �����ϴ� ����
	String str_x = request.getParameter("x");
	String str_y = request.getParameter("y");
	// ��ȿ�� �˻�
	if(str_x==null || str_x.equals("")){ str_x = "0"; }
	if(str_y==null || str_y.equals("")){ str_x = "0"; }
	int int_x = 0;
	int int_y = 0;
	String msg = "";
	try{
		int_x = Integer.parseInt(str_x);
		int_y = Integer.parseInt(str_y);
	} catch(Exception e){
		msg = "���ڰ� �ƴ� �����Ͱ� �Ѿ�Խ��ϴ�.";
	}
	System.out.println(msg);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>��� ��� ���</title>
	</head>
	<body>
		<!-- ���� + ���� = ��� -->
		<%= int_x %> + <%= int_y %> = <%= int_x + int_y %><br>
		<%= msg %>
	</body>
</html>