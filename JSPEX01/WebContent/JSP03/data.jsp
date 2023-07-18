<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.net.URLDecoder" %>
<%	

	request.setCharacterEncoding("UTF-8");
	String text = request.getParameter("string");
	String number = request.getParameter("number");
	String date = request.getParameter("date");
	
	if(text == null || number == null || date == null){
		response.sendRedirect("index.jsp");
	}
	if(text == null) { text = ""; }
	if(number == null) { number = ""; }
	if(date == null) { date = ""; }
	
	text = URLDecoder.decode(text, "UTF-8");
	text = URLDecoder.decode(text, "UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>파라메터 데이터 받기</title>
</head>
<body>
	text : <%= text %><br>
	number : <%= number %><br>
	date : <%= date %><br>
</body>
</html>