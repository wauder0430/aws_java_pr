<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>form data ������</title>
	<script>
	
	
	
	function DoSubmit(){
		// �ѱ��� �Էµ� ��ǲ���� value�� �����´�
		let kr_string = document.querySelector("#kr_str");
		// ������ �����͸� utf-8�ڵ�� ���ڵ��Ѵ�.
		kr_string.value = encodeURI(encodeURIComponent(kr_string.value));
		// ���ڵ� �� ���� ������ form�� �����ͷ� submit�� �Ѵ�.
		document.querySelector("#form").submit();
	}
	
	</script>
</head>
<body>
	<!-- <form method="post" action="data.jsp"> -->
	<form method="get" action="data.jsp" id="form">
		���ڿ� : <input type="text" name="string" id="kr_str"><br>
		���� : <input type="number" name="number" ><br>
		��¥ : <input type="date" name="date" ><br>
		<input type="submit" value="������">
		<input type="button" value="������" onclick="DoSubmit();">
	</form>

</body>
</html>