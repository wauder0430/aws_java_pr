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
		<!-- section 영역 시작 --------------------------------------------------------------------------------- -->
					<section>
		<!-- section 내부 header 영역 시작 --------------------------------------------------------------------- -->
						<header>
							<div style="font-size:1.2rem;font-weight:bold; color: red;">※ 회원 가입 ※</div>
						</header>
		<!-- section 내부 header 영역 종료 --------------------------------------------------------------------- -->
		<!-- section 내부 section 영역 시작 -------------------------------------------------------------------- -->
<!-- 						<form action="joinOk.jsp" method="get" id="join" name="join" onsubmit="return DoSubmit();"> -->
						<form action="joinOk.jsp" method="post" id="join" name="join" onsubmit="return DoSubmit();">
						<section>
							<table class="table table-bordered">
								<tr>
									<td style="width: 120px;">
										ID
									</td>
									<td>
										<!-- <input type="text" name="userID" id="userID"> &nbsp;<a href="idcheck.html" class="btn btn-warning  btn-sm">중복체크</a> -->
										<input type="text" name="userID" id="userID">
										 &nbsp;
										 <input type="button" class="btn btn-warning  btn-sm" onclick="idcheck();" value="중복체크">
										 &nbsp;
										<span class="msg_area">메세지 출력 영역입니다.</span>
									</td>
								</tr>
								<tr>
									<td>
										비밀번호
									</td>
									<td>
										<input type="password" name="userPW" id="userPW">
									</td>
								</tr>
								<tr>
									<td>
										비밀번호 확인
									</td>
									<td>
										<input type="password" id="pwc">
									</td>
								</tr>
								<tr>
									<td>
										이름
									</td>
									<td>
										<input type="text" name="userName" id="userName">
									</td>
								</tr>
								<tr>
									<td>
										성별
									</td>
									<td>
										<label>남성 
										<input type="radio" name="gender" value="M">
										</label>
										<label>여성 
										<input type="radio" name="gender" value="F">
										</label>
									</td>
								</tr>
								<tr>
									<td>
										취미
									</td>
									<td>
										<select name="hobby">
											<option value="1">영화</option>
											<option value="2">여행</option>
											<option value="3">음악</option>
											<option value="4">독서</option>
											<option value="5">게임</option>
										</select>
									</td>
								</tr>
								<tr>
									<td>
										관심분야
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
										자동가입방지
									</td>
									<td style="text-align:center;">
										<img src="Captcha.jpg"><br>
										<input type="text">
									</td>
								</tr>
							</table>
						</section>
		<!-- section 내부 section 영역 종료 -------------------------------------------------------------------- -->
		<!-- section 내부 footer 영역 시작 --------------------------------------------------------------------- -->
						<footer>
							<div style="text-align:center;">
								<input type="button" value="가입하기" onclick="DoSubmit();">
								<input type="submit" value="가입하기">
								<input type="reset" value="취소">
							</div>
						</footer>
						</form>
		<!-- section 내부 footer 영역 종료 --------------------------------------------------------------------- -->
					</section>
		<!-- section 영역 종료 --------------------------------------------------------------------------------- -->
<%@ include file="./include/footer.jsp" %>