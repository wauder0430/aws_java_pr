<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>ȸ������</title>
	</head>
	<body>
		<form method="post" name="join" action="joinOk.jsp">
			<table border="1">
				<tr>
					<td colspan="2">
						<span style="font-weight:bold; color:red;">�� ȸ������ ��</span>
					</td>
				</tr>
				<tr>
					<td style="width:25%">���̵�</td>
					<td><input type="text" id="uID" name="uID"></td>
				</tr>
				<tr>
					<td>�� ��</td>
					<td><input type="password" id="uPW" name="uPW"></td>
				</tr>
				<tr>
					<td>���Ȯ��</td>
					<td><input type="password" id="PWC" name= "PWC"></td>
				</tr>
				<tr>
					<td>�̸�</td>
					<td><input type="text" id="uName" name="uName"></td>
				</tr>
				<tr>
					<td>����</td>
					<td>
						<label><input type="radio" name="gender" value="M">����</label>
						&nbsp;<label><input type="radio" name="gender" value="F">����</label>
					</td>
				</tr>
				<tr>
					<td>���</td>
					<td>
						<select name="hobby">
							<option value="1">��ȭ</option>
							<option value="2">����</option>
							<option value="3">����</option>
							<option value="4">����</option>
							<option value="5">����</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>���ɺо�</td>
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
						<input type="submit" value="�����ϱ�">
						<input type="reset" value="���">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>