<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="ezen.Cal" %>
<%	// �Ķ��Ÿ�κ��� ���� �޾ƿ´�
	String str_x = request.getParameter("x");
	String str_y = request.getParameter("y");
	String op    = request.getParameter("op");
	if( op == null || op.equals("") ) { op = "+"; }
	Cal cal = new Cal(str_x,str_y,op);
	int int_z = cal.Docal();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�ڽſ��� �����͸� ������ ����</title>
	</head>
	<body>
		<form method="get" action="cal_class.jsp">
			<input type="text" size="4" name="x" value="<%= (str_x != null) ? str_x : "" %>">
			<select name="op">
				<!-- 3�� �����ڸ� �̿��Ͽ�, op�� ������ option �±��߿� selected�� ǥ�� -->
				<option value="+" <%= (op.equals("+")) ? "selected" : "" %>>+</option>
				<option value="-" <%= (op.equals("-")) ? "selected" : "" %>>-</option>
				<option value="*" <%= (op.equals("*")) ? "selected" : "" %>>*</option>
				<option value="/" <%= (op.equals("/")) ? "selected" : "" %>>/</option>
			</select>
			<input type="text" size="4" name="y" value="<%= (str_y == null) ? "" : str_y %>">
			<input type="submit" value="=">
			<input type="text" size="4" name="z" value="<%= int_z %>" readonly>
		</form>
	
	</body>
</html>