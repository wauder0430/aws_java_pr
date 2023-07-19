<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>첨부파일 업로드 연습</title>
	</head>
	<body>
		<form method="post" action="save.jsp" enctype="multipart/form-data">
			<input type="text" name="title">
			<br>
			<input type="file" name="attach">
			<br>
			<input type="submit" value="전송">
		</form>
	</body>
</html>