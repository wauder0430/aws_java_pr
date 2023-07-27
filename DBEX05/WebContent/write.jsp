<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>메모 작성</title>
	</head>
	<body>
		<form method="post" action="writeOk.jsp" name="write">
			제목 : <input type="text" name="title"><br>
			내용 : <input type="text" name="note"><br>
			<input type="submit" value="메모작성">
		</form>
	</body>
</html>