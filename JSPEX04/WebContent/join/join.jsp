<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>회원가입</title>
	</head>
	<body>
		<form method="post" name="join" action="joinOk.jsp">
			<table border="1">
				<tr>
					<td colspan="2">
						<span style="font-weight:bold; color:red;">※ 회원가입 ※</span>
					</td>
				</tr>
				<tr>
					<td style="width:25%">아이디</td>
					<td><input type="text" id="uID" name="uID"></td>
				</tr>
				<tr>
					<td>비 번</td>
					<td><input type="password" id="uPW" name="uPW"></td>
				</tr>
				<tr>
					<td>비번확인</td>
					<td><input type="password" id="PWC" name= "PWC"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" id="uName" name="uName"></td>
				</tr>
				<tr>
					<td>성별</td>
					<td>
						<label><input type="radio" name="gender" value="M">남성</label>
						&nbsp;<label><input type="radio" name="gender" value="F">여성</label>
					</td>
				</tr>
				<tr>
					<td>취미</td>
					<td>
						<select name="hobby">
							<option value="1">영화</option>
							<option value="2">여행</option>
							<option value="3">음악</option>
							<option value="4">독서</option>
							<option value="5">게임</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>관심분야</td>
					<td>
						<label><input type="checkbox" name="favSkill" value="1">C++</label>
						<label><input type="checkbox" name="favSkill" value="2">JAVA</label>
						<label><input type="checkbox" name="favSkill" value="3">Python</label><br>
						<label><input type="checkbox" name="favSkill" value="4">HTML</label>
						<label><input type="checkbox" name="favSkill" value="5">JavaScript</label>
						<label><input type="checkbox" name="favSkill" value="6">DBMS</label>
					</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center;">
						<input type="submit" value="가입하기">
						<input type="reset" value="취소">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>