<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="ezen.Calculator" %>
<%	// �Ķ��Ÿ�κ��� ���� �޾ƿ´�
	String str_x = request.getParameter("x");
	String str_y = request.getParameter("y");
	String op    = request.getParameter("op");
	Calculator cal = new Calculator();
	
	// ��ȿ�� �˻�
	if( str_x == null || str_x.equals("") ) { str_x = "0"; }
	if( str_y == null || str_y.equals("") ) { str_y = "0"; }
	if( op == null || op.equals("") ) { op = "+"; }
	// ������ ���� ������ ���� / �ʱ�ȭ
/* 	int int_x, int_y, int_z;
	int_x = int_y = int_z = 0;	*/
	int int_z = 0;
	try	{
/* 		int_x = Integer.parseInt(str_x);
		int_y = Integer.parseInt(str_y);
		int_z = cal.Docal(int_x, int_y, op); */
		
		int_z = cal.Docal(Integer.parseInt(str_x), Integer.parseInt(str_y), op);
	}catch(Exception e) { }
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�ڽſ��� �����͸� ������ ����</title>
	</head>
	<body>
		<form method="get" action="cal.jsp">
			<input type="text" size="4" name="x" value="<%= str_x %>">
			<select name="op">
				<!-- 3�� �����ڸ� �̿��Ͽ�, op�� ������ option �±��߿� selected�� ǥ�� -->
				<option value="+" <%= (op.equals("+")) ? "selected" : "" %>>+</option>
				<option value="-" <%= (op.equals("-")) ? "selected" : "" %>>-</option>
				<option value="*" <%= (op.equals("*")) ? "selected" : "" %>>*</option>
				<option value="/" <%= (op.equals("/")) ? "selected" : "" %>>/</option>
			</select>
			<input type="text" size="4" name="y" value="<%= str_y %>">
			<input type="submit" value="=">
			<input type="text" size="4" name="z" value="<%= int_z %>" readonly>
		</form>
	
	</body>
</html>