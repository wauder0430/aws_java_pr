<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="cal.do">���</a><br>
	<a href="cal.do?x=10&y=20&op=%2B">���</a>
	
	<form method="get" action="cal.do">
		<input type="text" name="x"><br>
		<input type="text" name="y"><br>
		<select name="op">
			<option value="+">���ϱ�</option>
			<option value="-">����</option>
			<option value="*">���ϱ�</option>
			<option value="/">������</option>
		</select>
		<input type="submit" value="����û">
	</form>
</body>
</html>