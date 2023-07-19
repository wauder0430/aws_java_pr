<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.User" %>
<%
	User loginUser = (User)session.getAttribute("loginUser");
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<!-- 세션에 loginUser 라는 객체가 있으면 
		이름 + 님 반갑습니다.
		없으면, 로그인 폼을 출력하세요
		form에는 아이디와 이름을 입력받고
		loginOk.jsp로 데이터를 보냄
		loginOk.jsp은 파라메타로 받은 데이터를 session에 저장-->
		<%
			if(loginUser != null){
				%> 
				<%= loginUser.getName() %> 님 반갑습니다.<br>
				<a href="logout.jsp">로그아웃하기 </a>
				<%
			} else {
				%>
				<form method="post" action="loginOk.jsp">
					아이디 : <input type="text" name="uID" id="uID"><br>
					이름 : <input type="text" name="uName" id="uName"><br>
					<input type="submit" value="로그인">
				</form>
				<%
			}
		%>
	</body>
</html>