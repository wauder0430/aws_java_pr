<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/header1.jsp" %>
<%@ include file="./include/header2.jsp" %>
<%@ include file="./include/nav.jsp" %>
		<!-- section 영역 시작 --------------------------------------------------------------------------------- -->
					<section>
		<!-- section 내부 header 영역 시작 --------------------------------------------------------------------- -->
						<header>
							<div style="font-size:1.2rem;font-weight:bold; color: red;">※ 글 쓰기 ※</div>
						</header>
		<!-- section 내부 header 영역 종료 --------------------------------------------------------------------- -->
		<!-- section 내부 section 영역 시작 -------------------------------------------------------------------- -->
						<form action="view.jsp" method="post" id="join">
						<section>
							<table class="table table-bordered">
								<tr>
									<td style="width: 120px;">
										제목
									</td>
									<td>
										<input type="text" name="title">
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										게시판 구분
									</td>
									<td>
										<label>자바 학습 게시판 <input type="radio" name="boardType" value="JV"></label><br>
										<label>HTML학습게시판 <input type="radio" name="boardType" value="H5"></label><br>
										<label>CSS학습게시판 <input type="radio" name="boardType" value="C3"></label><br>
										<label>JS학습게시판 <input type="radio" name="boardType"  value="JS"></label>
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										내용
									</td>
									<td>
										<textarea name="contents" rows="5" cols="60"></textarea>
									</td>
								</tr>
								<tr>
									<td style="width: 120px;">
										첨부파일
									</td>
									<td>
										<input type="file" name="attach">
									</td>
								</tr>
							</table>
						</section>
		<!-- section 내부 section 영역 종료 -------------------------------------------------------------------- -->
		<!-- section 내부 footer 영역 시작 --------------------------------------------------------------------- -->
						<footer>
							<div style="text-align:center;">
								<input type="submit" value="글쓰기 완료">
								<input type="reset" value="취소">
							</div>
						</footer>
						</form>
		<!-- section 내부 footer 영역 종료 --------------------------------------------------------------------- -->
					</section>
		<!-- section 영역 종료 --------------------------------------------------------------------------------- -->
<%@ include file="./include/footer.jsp" %>