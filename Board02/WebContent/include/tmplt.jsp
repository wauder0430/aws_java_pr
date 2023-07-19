<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>���� AWS Ǯ���� ������ �缺���� �н� �Խ���</title>
		<!-- CSS only -->
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
		<style>
			body	{ background-color: gray; }
			.main	{ width : 900px; margin : auto; }
			th		{ text-align : center; }
			.footer	{ height : 3rem; text-align : right; vertical-align : bottom; }
			ul		{ margin:0; }
		</style>
		<script>
			window.onload = function() {
				let num = 32;
				let list = document.querySelector(".list");
				for( let i = 0; i < 10; i++ )
				{
					let item = document.createElement("tr");
					item.innerHTML = `<td style="text-align:right">${num-i}</td>
					<td><a href="view.html">�ڹ� �н� �ڷ�</a>
					<span style="color:orangered;">(12)</span>
					</td>
					<td style="text-align:center">2023. 06. 30</td>
					<td style="text-align:center">ȫ�浿</td>
					<td style="text-align:right">10</td>`;
					list.appendChild(item);
				}
			}
		</script>
	</head>
	<body>
		<!-- header  ���� ���� --------------------------------------------------------------------------------- -->
		<header class="main">
			<table class="table table-borderless" style="margin:0;height: 3rem;">
				<tr>
					<td style="background-color:white;">
						<a href="index.html" style="font-size: 2rem;font-weight:bold;">���� AWS Ǯ���� �н� �Խ���</a>
					</td>
					<td style="text-align:right;background-color:white; vertical-align : bottom;">
						<a href="join.html" class="btn btn-primary btn-sm">ȸ������</a>&nbsp;
						<a href="login.html" class="btn btn-success btn-sm">�α���</a>&nbsp;
					</td>
				</tr>
			</table>
		</header>
		<!-- header  ���� ���� --------------------------------------------------------------------------------- -->
		<table class="main table table-bordered">
			<tr>
				<td valign="top" style="background-color:white;width:13rem;">
		<!-- nav     ���� ���� --------------------------------------------------------------------------------- -->
					<nav class="d-grid gap-2 col-10 mx-auto">
						<a href="index.html?type=JV" class="btn btn-dark">�ڹ��н��Խ���</a>
						<a href="index.html?type=H5" class="btn btn-light">HTML�н��Խ���</a>
						<a href="index.html?type=C3" class="btn btn-light">CSS�н��Խ���</a>
						<a href="index.html?type=JS" class="btn btn-light">JS�н��Խ���</a>
					</nav>
		<!-- nav     ���� ���� --------------------------------------------------------------------------------- -->
				</td>
				<td style="background-color:white;">
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
					<section>
		<!-- section ���� header ���� ���� --------------------------------------------------------------------- -->
						<header>
							<div style="font-size:1.2rem;font-weight:bold;">�ڹ� �н� �Խ���</div>
							<div style="width:100%; text-align:right;">
								<a href="write.html" class="btn btn-warning btn-sm">�۾���</a>
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
								<!-- �Խù� ��� �ڸ� -->
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
				</td>
			</tr>
		</table>
		<!-- footer ���� ���� ---------------------------------------------------------------------------------- -->
		<footer class="main footer" style="background-color:white;">
			<br>Copyright by EZEN IT All right reserved.
		</footer>
		<!-- footer ���� ���� ---------------------------------------------------------------------------------- -->
	</body>
</html>