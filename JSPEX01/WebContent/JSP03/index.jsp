<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>form data 보내기</title>
	<script>
	
	
	
	function DoSubmit(){
		// 한글이 입력된 인풋폼의 value를 가져온다
		let kr_string = document.querySelector("#kr_str");
		// 가져온 데이터를 utf-8코드로 인코딩한다.
		kr_string.value = encodeURI(encodeURIComponent(kr_string.value));
		// 인코딩 된 값을 포함한 form의 데이터로 submit을 한다.
		document.querySelector("#form").submit();
	}
	
	</script>
</head>
<body>
	<!-- <form method="post" action="data.jsp"> -->
	<form method="get" action="data.jsp" id="form">
		문자열 : <input type="text" name="string" id="kr_str"><br>
		숫자 : <input type="number" name="number" ><br>
		날짜 : <input type="date" name="date" ><br>
		<input type="submit" value="보내기">
		<input type="button" value="보내기" onclick="DoSubmit();">
	</form>

</body>
</html>