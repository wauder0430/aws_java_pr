<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String str_x = request.getParameter("x");
	String str_y = request.getParameter("y");
	String op = request.getParameter("op");
	if(str_x == null || str_x.equals("")){ str_x = "0"; }
	if(str_y == null || str_y.equals("")){ str_y = "0"; }
	if(op == null || op.equals("")){ op = "+"; }
	
	int int_x, int_y, int_z;
	int_x = int_y = int_z = 0;
	
	try{
		int_x = Integer.parseInt(str_x);
		int_y = Integer.parseInt(str_y);

		switch(op){
		case "+" : int_z = int_x + int_y; break;
		case "-" : int_z = int_x - int_y; break;
		case "*" : int_z = int_x * int_y; break;
		case "/" :
			if(int_y==0) break;
			int_z = int_x / int_y; break;
		}
	} catch(Exception e) {
		
	}

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>자신에게 데이터를 보내는 계산기</title>
	</head>
	<body>
		<form method="get" action="cal.jsp">
			<input type="text" size="2" name="x" value="<%= int_x %>">
			<select name="op">
			<!--  3항 연산자를 이용하여, op 값으로 option태그중에 selectted표시-->
				<option value="+" <%= (op.equals("+")) ? "selected" : "" %>>+</option>
				<option value="-" <%= (op.equals("-")) ? "selected" : "" %>>-</option>
				<option value="*" <%= (op.equals("*")) ? "selected" : "" %>>*</option>
				<option value="/" <%= (op.equals("/")) ? "selected" : "" %>>/</option>
			</select>
			<input type="text" size="2" name="y" value="<%= int_y %>">
			<input type="submit" value="=">
			<input type="text" size="4" name="z" value="<%= int_z %>" readonly>
		</form>
	</body>
</html>