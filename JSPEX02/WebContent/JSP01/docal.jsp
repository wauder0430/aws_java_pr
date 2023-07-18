<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 파라메터 값을 받고, 계산을 수행하는 로직
	String str_x = request.getParameter("x");
	String str_y = request.getParameter("y");
	// 유효성 검사
	if(str_x==null || str_x.equals("")){ str_x = "0"; }
	if(str_y==null || str_y.equals("")){ str_x = "0"; }
	int int_x = 0;
	int int_y = 0;
	String msg = "";
	try{
		int_x = Integer.parseInt(str_x);
		int_y = Integer.parseInt(str_y);
	} catch(Exception e){
		msg = "숫자가 아닌 데이터가 넘어왔습니다.";
	}
	System.out.println(msg);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>계산 결과 출력</title>
	</head>
	<body>
		<!-- 숫자 + 숫자 = 결과 -->
		<%= int_x %> + <%= int_y %> = <%= int_x + int_y %><br>
		<%= msg %>
	</body>
</html>