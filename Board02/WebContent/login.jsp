<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
		<script>
			// �������� �ε�Ǹ�, ���̵� �Է� ������ Ŀ���� �̵��Ѵ�
			window.onload = function()
			{
/* 				document.querySelector("#userID").focus(); */
				document.login.userID.focus();
			}
			// Dosubmit() �Լ��� ȣ��Ǹ�, ���̵�� ��� �Է°��� �ִ��� Ȯ���ϰ�, ������ submit�� ��û�Ѵ�
			function DoSubmit()
			{	// ���̵� �Է��� ��ü�� ã��
				let uID = document.querySelector("#userID");
				// ��ü�� ���� �����ͼ� ""���� Ȯ��
				if( uID.value == "" )
				{	// ���� ""�̸� ���̵� �Է������� Ŀ�� �̵�
					alert("���̵� �Է��ϼ���");
					uID.focus();
					return false;
				} // 2. ���� �ԷµǾ������� ���Ȯ������ �Ѿ
				// ��� �Է����� ��ü�� ã��
				let uPW = document.querySelector("#userPW");
				if( uPW.value == "" )
				{	// 1. ���� ""�̸� ��� �Է������� Ŀ�� �̵�
					alert("����� �Է��ϼ���");
					uPW.focus();
					return false;
				}
				// 2. ���� ������ form�� submit��Ŵ
				return true;
			}
			
		</script>
<%@ include file="./include/header.jsp" %>
<%@ include file="./include/nav.jsp" %>
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
					<section>
		<!-- section ���� header ���� ���� --------------------------------------------------------------------- -->
						<header>
							<div style="font-size:1.2rem;font-weight:bold; color: red;">�� �α��� ��</div>
						</header>
		<!-- section ���� header ���� ���� --------------------------------------------------------------------- -->
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
						<form action="loginOk.jsp" method="get" id="login" name="login" onsubmit="return DoSubmit();">
						<section>
							<table class="table table-bordered">
								<tr>
									<td style="width: 120px;">
										ID
									</td>
									<td>
										<input type="text" name="userID" id="userID">
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
							</table>
						</section>
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
						<footer>
							<div style="text-align:center;">
								<input type="submit" value="�α����ϱ�">
								<input type="reset" value="���">
							</div>
						</footer>
						</form>
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
					</section>
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
<%@ include file="./include/footer.jsp" %>