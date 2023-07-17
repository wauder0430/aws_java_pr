<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href="cal.do">계산</a><br>
	<a href="cal.do?x=10&y=20&op=%2B">계산</a>
	
	<form method="get" action="cal.do">
		<input type="text" name="x"><br>
		<input type="text" name="y"><br>
		<select name="op">
			<option value="+">더하기</option>
			<option value="-">빼기</option>
			<option value="*">곱하기</option>
			<option value="/">나누기</option>
		</select>
		<input type="submit" value="계산요청">
	</form>
</body>
</html>