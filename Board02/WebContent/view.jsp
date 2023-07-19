<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%@ include file="./include/header.jsp" %>
<%@ include file="./include/nav.jsp" %>
		<!-- section 영역 시작 --------------------------------------------------------------------------------- -->
					<section>
		<!-- section 내부 header 영역 시작 --------------------------------------------------------------------- -->
						<header>
							<div style="font-size:1.2rem;font-weight:bold; color: red;">※ 글 보기 ※</div>
						</header>
		<!-- section 내부 header 영역 종료 --------------------------------------------------------------------- -->
		<!-- section 내부 section 영역 시작 -------------------------------------------------------------------- -->
						<section>
							<table class="table table-bordered">
								<tr>
									<td style="width: 120px;">
										제목
									</td>
									<td>
										자바 학습 자료 입니다.
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										게시판 구분
									</td>
									<td>
										자바 학습 게시판
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										작성자
									</td>
									<td>
										홍길동
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										작성일
									</td>
									<td>
										2023. 06. 30
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										조회수
									</td>
									<td>
										10회
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										내용
									</td>
									<td>
										첨부 파일을 확인하세요
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										첨부파일
									</td>
									<td>
										java_1강.pdf
									</td>
								</tr>
							</table>
						</section>
		<!-- section 내부 section 영역 종료 -------------------------------------------------------------------- -->
		<!-- section 내부 footer 영역 시작 --------------------------------------------------------------------- -->
						<footer>
							<div style="text-align:center;">
<!-- 								<input type="button" value="글목록">
								<input type="button" value="글수정">
								<input type="button" value="글삭제">
 -->
								<a href="index.jsp" class="btn btn-primary btn-sm">글목록</a>
								<a href="modify.jsp" class="btn btn-success btn-sm">글수정</a>
								<a href="delete.jsp" class="btn btn-danger btn-sm">글삭제</a>
							</div>
						</footer>
						<br>
		<!-- section 내부 footer 영역 종료 --------------------------------------------------------------------- -->
		<!-- section 내부 section_reply 영역 시작 -------------------------------------------------------------------- -->
						<form action="replyOk.html" method="post" id="reply">
						<section>
							<table class="table table-bordered">
								<tr>
									<td style="width: 120px;">
										홍길동
									</td>
									<td>
										<input type="text" size="35rem"><input type="button" value="작성완료">
									</td>
									<td>
										작성일
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										홍길동
									</td>
									<td>
										댓글입니다.
									</td>
									<td>
										2023. 07. 04
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										홍길동
									</td>
									<td>
										댓글입니다.
									</td>
									<td>
										2023. 07. 04
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										홍길동
									</td>
									<td>
										댓글입니다.
									</td>
									<td>
										2023. 07. 04
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										홍길동
									</td>
									<td>
										<div style="display:flex; justify-content: space-between;">
											<span>
												댓글입니다.
											</span>
											<a href="deleteReply.jsp" class="btn btn-danger btn-sm">댓글삭제</a>
										</div>
									</td>
									<td>
										2023. 07. 04
									</td>
								</tr>
							</table>
						</section>
						</form>
		<!-- section 내부 section 영역 종료 -------------------------------------------------------------------- -->
					</section>
		<!-- section 영역 종료 --------------------------------------------------------------------------------- -->
<%@ include file="./include/footer.jsp" %>