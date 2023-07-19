<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
		<script src="https://code.jquery.com/jquery-latest.min.js"></script>
		<script src="./js/join.js"></script>
		<script src="./js/idcheck.js"></script>
		<script>
/* 			window.onload = function()
			{
				document.querySelector("#userID").focus();
			}
 */
			$(document).ready(function(){
				$("#userID").focus();
			});
		</script>
<%@ include file="./include/header.jsp" %>
<%@ include file="./include/nav.jsp" %>
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
					<section>
		<!-- section ���� header ���� ���� --------------------------------------------------------------------- -->
						<header>
							<div style="font-size:1.2rem;font-weight:bold; color: red;">�� ȸ�� ���� ��</div>
						</header>
		<!-- section ���� header ���� ���� --------------------------------------------------------------------- -->
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
<!-- 						<form action="joinOk.jsp" method="get" id="join" name="join" onsubmit="return DoSubmit();"> -->
						<form action="joinOk.jsp" method="post" id="join" name="join" onsubmit="return DoSubmit();">
						<section>
							<table class="table table-bordered">
								<tr>
									<td style="width: 120px;">
										ID
									</td>
									<td>
										<!-- <input type="text" name="userID" id="userID"> &nbsp;<a href="idcheck.html" class="btn btn-warning  btn-sm">�ߺ�üũ</a> -->
										<input type="text" name="userID" id="userID">
										 &nbsp;
										 <input type="button" class="btn btn-warning  btn-sm" onclick="idcheck();" value="�ߺ�üũ">
										 &nbsp;
										<span class="msg_area">�޼��� ��� �����Դϴ�.</span>
									</td>
								</tr>
								<tr>
									<td>
										��й�ȣ
									</td>
									<td>
										<input type="password" name="userPW" id="userPW">
									</td>
								</tr>
								<tr>
									<td>
										��й�ȣ Ȯ��
									</td>
									<td>
										<input type="password" id="pwc">
									</td>
								</tr>
								<tr>
									<td>
										�̸�
									</td>
									<td>
										<input type="text" name="userName" id="userName">
									</td>
								</tr>
								<tr>
									<td>
										����
									</td>
									<td>
										<label>���� 
										<input type="radio" name="gender" value="M">
										</label>
										<label>���� 
										<input type="radio" name="gender" value="F">
										</label>
									</td>
								</tr>
								<tr>
									<td>
										���
									</td>
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
									<td>
										���ɺо�
									</td>
									<td>
										<label>C++ <input	type="checkbox" name="favSkill" value="1"></label>
										<label>JAVA <input	type="checkbox" name="favSkill" value="2"></label>
										<label>HTML <input	type="checkbox" name="favSkill" value="3"></label>
										<label>JS <input	type="checkbox" name="favSkill" value="4"></label>
										<label>DB <input	type="checkbox" name="favSkill" value="5"></label>
									</td>
								</tr>
								<tr>
									<td>
										�ڵ����Թ���
									</td>
									<td style="text-align:center;">
										<img src="Captcha.jpg"><br>
										<input type="text">
									</td>
								</tr>
							</table>
						</section>
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
						<footer>
							<div style="text-align:center;">
								<input type="button" value="�����ϱ�" onclick="DoSubmit();">
								<input type="submit" value="�����ϱ�">
								<input type="reset" value="���">
							</div>
						</footer>
						</form>
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
					</section>
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
<%@ include file="./include/footer.jsp" %>