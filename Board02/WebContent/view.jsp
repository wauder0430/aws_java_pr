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
						<section>
							<table class="table table-bordered">
								<tr>
									<td style="width: 120px;">
										����
									</td>
									<td>
										�ڹ� �н� �ڷ� �Դϴ�.
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										�Խ��� ����
									</td>
									<td>
										�ڹ� �н� �Խ���
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										�ۼ���
									</td>
									<td>
										ȫ�浿
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										�ۼ���
									</td>
									<td>
										2023. 06. 30
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										��ȸ��
									</td>
									<td>
										10ȸ
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										����
									</td>
									<td>
										÷�� ������ Ȯ���ϼ���
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										÷������
									</td>
									<td>
										java_1��.pdf
									</td>
								</tr>
							</table>
						</section>
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
						<footer>
							<div style="text-align:center;">
<!-- 								<input type="button" value="�۸��">
								<input type="button" value="�ۼ���">
								<input type="button" value="�ۻ���">
 -->
								<a href="index.jsp" class="btn btn-primary btn-sm">�۸��</a>
								<a href="modify.jsp" class="btn btn-success btn-sm">�ۼ���</a>
								<a href="delete.jsp" class="btn btn-danger btn-sm">�ۻ���</a>
							</div>
						</footer>
						<br>
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
		<!-- section ���� section_reply ���� ���� -------------------------------------------------------------------- -->
						<form action="replyOk.html" method="post" id="reply">
						<section>
							<table class="table table-bordered">
								<tr>
									<td style="width: 120px;">
										ȫ�浿
									</td>
									<td>
										<input type="text" size="35rem"><input type="button" value="�ۼ��Ϸ�">
									</td>
									<td>
										�ۼ���
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										ȫ�浿
									</td>
									<td>
										����Դϴ�.
									</td>
									<td>
										2023. 07. 04
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										ȫ�浿
									</td>
									<td>
										����Դϴ�.
									</td>
									<td>
										2023. 07. 04
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										ȫ�浿
									</td>
									<td>
										����Դϴ�.
									</td>
									<td>
										2023. 07. 04
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										ȫ�浿
									</td>
									<td>
										<div style="display:flex; justify-content: space-between;">
											<span>
												����Դϴ�.
											</span>
											<a href="deleteReply.jsp" class="btn btn-danger btn-sm">��ۻ���</a>
										</div>
									</td>
									<td>
										2023. 07. 04
									</td>
								</tr>
							</table>
						</section>
						</form>
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
					</section>
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
<%@ include file="./include/footer.jsp" %>