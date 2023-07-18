<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="ezen.Calculator" %>
<%	// 파라메타로부터 값을 받아온다
	String str_x = request.getParameter("x");
	String str_y = request.getParameter("y");
	String op    = request.getParameter("op");
	Calculator cal = new Calculator();
	
	// 유효성 검사
	if( str_x == null || str_x.equals("") ) { str_x = "0"; }
	if( str_y == null || str_y.equals("") ) { str_y = "0"; }
	if( op == null || op.equals("") ) { op = "+"; }
	// 정수를 넣은 변수를 선언 / 초기화
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
		<title>자신에게 데이터를 보내는 계산기</title>
	</head>
	<body>
		<form method="get" action="cal.jsp">
			<input type="text" size="4" name="x" value="<%= str_x %>">
			<select name="op">
				<!-- 3항 연산자를 이용하여, op의 값으로 option 태그중에 selected를 표시 -->
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