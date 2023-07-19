<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%@ include file="./include/header.jsp" %>
<%@ include file="./include/nav.jsp" %>
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
					<section>
		<!-- section ���� header ���� ���� --------------------------------------------------------------------- -->
						<header>
							<div style="font-size:1.2rem;font-weight:bold;">�ڹ� �н� �Խ���</div>
							<div style="width:100%; text-align:right;">
								<a href="write.jsp" class="btn btn-warning btn-sm">�۾���</a>
							</div>
						</header>
		<!-- section ���� header ���� ���� --------------------------------------------------------------------- -->
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
						<section>
							<table class="table table-striped">
								<thead>
									<tr>
										<th>��ȣ</th>
										<th>����</th>
										<th>�ۼ���</th>
										<th>�ۼ���</th>
										<th>��ȸ��</th>
									</tr>
								</thead>
								<tbody class="list">
								<%
								for(int i = 32; i > 22; i--)
								{
									%>
									<tr>
										<td style="text-align:right"><%= i %></td>
										<td>
											<a href="view.jsp">�ڹ� �н� �ڷ�</a>
											<span style="color:orangered;">(12)</span>
										</td>
										<td style="text-align:center">2023. 06. 30</td>
										<td style="text-align:center">ȫ�浿</td>
										<td style="text-align:right">10</td>
									</tr>
									<%
								}
								%>
								</tbody>
							</table>
						</section>
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
						<footer>
							<ul class="pagination justify-content-center">
								<li class="page-item"><a class="page-link" href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
								<li class="page-item"><a class="page-link" href="#">1</a></li>
								<li class="page-item"><a class="page-link" href="#">2</a></li>
								<li class="page-item"><a class="page-link" href="#">3</a></li>
								<li class="page-item"><a class="page-link" href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
							</ul>
						</footer>
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
					</section>
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
<%@ include file="./include/footer.jsp" %>