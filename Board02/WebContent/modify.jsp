<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%@ include file="./include/header.jsp" %>
<%@ include file="./include/nav.jsp" %>
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
					<section>
		<!-- section ���� header ���� ���� --------------------------------------------------------------------- -->
						<header>
							<div style="font-size:1.2rem;font-weight:bold; color: red;">�� �� ���� ��</div>
						</header>
		<!-- section ���� header ���� ���� --------------------------------------------------------------------- -->
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
						<form action="modifyOk.jsp" method="post" id="join">
						<section>
							<table class="table table-bordered">
								<tr>
									<td style="width: 120px;">
										����
									</td>
									<td>
										<input type="text" name="title" value="�ڹ� �н� �ڷ� �Դϴ�.">
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										�Խ��� ����
									</td>
									<td>
										<label>�ڹ� �н� �Խ��� <input type="radio" name="boardType" value="JV" checked></label><br>
										<label>HTML�н��Խ��� <input type="radio" name="boardType" value="H5"></label><br>
										<label>CSS�н��Խ��� <input type="radio" name="boardType" value="C3"></label><br>
										<label>JS�н��Խ��� <input type="radio" name="boardType"  value="JS"></label>
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										����
									</td>
									<td>
										<textarea name="contents" rows="5" cols="60">÷�� ������ Ȯ���ϼ���</textarea>
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										÷������
									</td>
									<td>
										<input type="file" name="attach">
									</td>
								</tr>
							</table>
						</section>
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
						<footer>
							<div style="text-align:center;">
								<input type="submit" value="�۾��� �Ϸ�">
								<input type="reset" value="���">
							</div>
						</footer>
						</form>
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
					</section>
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
<%@ include file="./include/footer.jsp" %>