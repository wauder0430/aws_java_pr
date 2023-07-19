<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>이젠 AWS 풀스택 개발자 양성과정 학습 게시판</title>
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
					<td><a href="view.html">자바 학습 자료</a>
					<span style="color:orangered;">(12)</span>
					</td>
					<td style="text-align:center">2023. 06. 30</td>
					<td style="text-align:center">홍길동</td>
					<td style="text-align:right">10</td>`;
					list.appendChild(item);
				}
			}
		</script>
	</head>
	<body>
		<!-- header  영역 시작 --------------------------------------------------------------------------------- -->
		<header class="main">
			<table class="table table-borderless" style="margin:0;height: 3rem;">
				<tr>
					<td style="background-color:white;">
						<a href="index.html" style="font-size: 2rem;font-weight:bold;">이젠 AWS 풀스택 학습 게시판</a>
					</td>
					<td style="text-align:right;background-color:white; vertical-align : bottom;">
						<a href="join.html" class="btn btn-primary btn-sm">회원가입</a>&nbsp;
						<a href="login.html" class="btn btn-success btn-sm">로그인</a>&nbsp;
					</td>
				</tr>
			</table>
		</header>
		<!-- header  영역 종료 --------------------------------------------------------------------------------- -->
		<table class="main table table-bordered">
			<tr>
				<td valign="top" style="background-color:white;width:13rem;">
		<!-- nav     영역 시작 --------------------------------------------------------------------------------- -->
					<nav class="d-grid gap-2 col-10 mx-auto">
						<a href="index.html?type=JV" class="btn btn-dark">자바학습게시판</a>
						<a href="index.html?type=H5" class="btn btn-light">HTML학습게시판</a>
						<a href="index.html?type=C3" class="btn btn-light">CSS학습게시판</a>
						<a href="index.html?type=JS" class="btn btn-light">JS학습게시판</a>
					</nav>
		<!-- nav     영역 시작 --------------------------------------------------------------------------------- -->
				</td>
				<td style="background-color:white;">
		<!-- section 영역 시작 --------------------------------------------------------------------------------- -->
					<section>
		<!-- section 내부 header 영역 시작 --------------------------------------------------------------------- -->
						<header>
							<div style="font-size:1.2rem;font-weight:bold;">자바 학습 게시판</div>
							<div style="width:100%; text-align:right;">
								<a href="write.html" class="btn btn-warning btn-sm">글쓰기</a>
							</div>
						</header>
		<!-- section 내부 header 영역 종료 --------------------------------------------------------------------- -->
		<!-- section 내부 section 영역 시작 -------------------------------------------------------------------- -->
						<section>
							<table class="table table-striped">
								<thead>
									<tr>
										<th>번호</th>
										<th>제목</th>
										<th>작성일</th>
										<th>작성자</th>
										<th>조회수</th>
									</tr>
								</thead>
								<tbody class="list">
								<!-- 게시물 목록 자리 -->
								</tbody>
							</table>
						</section>
		<!-- section 내부 section 영역 종료 -------------------------------------------------------------------- -->
		<!-- section 내부 footer 영역 시작 --------------------------------------------------------------------- -->
						<footer>
							<ul class="pagination justify-content-center">
								<li class="page-item"><a class="page-link" href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
								<li class="page-item"><a class="page-link" href="#">1</a></li>
								<li class="page-item"><a class="page-link" href="#">2</a></li>
								<li class="page-item"><a class="page-link" href="#">3</a></li>
								<li class="page-item"><a class="page-link" href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
							</ul>
						</footer>
		<!-- section 내부 footer 영역 종료 --------------------------------------------------------------------- -->
					</section>
		<!-- section 영역 종료 --------------------------------------------------------------------------------- -->
				</td>
			</tr>
		</table>
		<!-- footer 영역 시작 ---------------------------------------------------------------------------------- -->
		<footer class="main footer" style="background-color:white;">
			<br>Copyright by EZEN IT All right reserved.
		</footer>
		<!-- footer 영역 종료 ---------------------------------------------------------------------------------- -->
	</body>
</html>