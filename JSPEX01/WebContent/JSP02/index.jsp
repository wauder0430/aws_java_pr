<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%	
	String text = request.getParameter("string");
	String number = request.getParameter("number");
	String date = request.getParameter("date");
	if(text == null){ text = ""; }
	if(number == null){ number = ""; }
	if(date == null){ date = ""; } 
	System.out.println("text : " + text);
	System.out.println("number : " + number);
	System.out.println("date : " + date);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>form data ������</title>
</head>
<body>
	<!-- <form method="post" action="data.jsp"> -->
	<form method="get" action="index.jsp">
		���ڿ� : <input type="text" name="string" value="<%= text %>"><br>
		���� : <input type="number" name="number" value="<%= number %>"><br>
		��¥ : <input type="date" name="date" value="<%= date %>"><br>
		<input type="submit" value="������">
	</form>

</body>
</html>