<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
		<script>
			// 페이지가 로드되면, 아이디 입력 폼으로 커서를 이동한다
			window.onload = function()
			{
/* 				document.querySelector("#userID").focus(); */
				document.login.userID.focus();
			}
			// Dosubmit() 함수가 호출되면, 아이디와 비번 입력값이 있는지 확인하고, 있으면 submit을 요청한다
			function DoSubmit()
			{	// 아이디 입력폼 객체를 찾고
				let uID = document.querySelector("#userID");
				// 객체의 값을 가져와서 ""인지 확인
				if( uID.value == "" )
				{	// 값이 ""이면 아이디 입력폼으로 커서 이동
					alert("아이디를 입력하세요");
					uID.focus();
					return false;
				} // 2. 값이 입력되어있으면 비번확인으로 넘어감
				// 비번 입력폼의 객체를 찾고
				let uPW = document.querySelector("#userPW");
				if( uPW.value == "" )
				{	// 1. 값이 ""이면 비번 입력폼으로 커서 이동
					alert("비번을 입력하세요");
					uPW.focus();
					return false;
				}
				// 2. 값이 있으면 form을 submit시킴
				return true;
			}
			
		</script>
<%@ include file="./include/header.jsp" %>
<%@ include file="./include/nav.jsp" %>
		<!-- section 영역 시작 --------------------------------------------------------------------------------- -->
					<section>
		<!-- section 내부 header 영역 시작 --------------------------------------------------------------------- -->
						<header>
							<div style="font-size:1.2rem;font-weight:bold; color: red;">※ 로그인 ※</div>
						</header>
		<!-- section 내부 header 영역 종료 --------------------------------------------------------------------- -->
		<!-- section 내부 section 영역 시작 -------------------------------------------------------------------- -->
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
										비밀번호
									</td>
									<td>
										<input type="password" name="userPW" id="userPW">
									</td>
								</tr>
							</table>
						</section>
		<!-- section 내부 section 영역 종료 -------------------------------------------------------------------- -->
		<!-- section 내부 footer 영역 시작 --------------------------------------------------------------------- -->
						<footer>
							<div style="text-align:center;">
								<input type="submit" value="로그인하기">
								<input type="reset" value="취소">
							</div>
						</footer>
						</form>
		<!-- section 내부 footer 영역 종료 --------------------------------------------------------------------- -->
					</section>
		<!-- section 영역 종료 --------------------------------------------------------------------------------- -->
<%@ include file="./include/footer.jsp" %>