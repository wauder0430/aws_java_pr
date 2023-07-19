<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.User" %>
<%
	request.setCharacterEncoding("EUC-KR");
	
	String name = request.getParameter("uName");
	String ID = request.getParameter("uID");
	String msg = ""; // 유효성 검사
	if(name == null || ID == null || name.equals("") || ID.equals("")){
		// msg = "로그인 정보가 올바르지 않습니다.";
		response.sendRedirect("index.jsp");
		return;
	} else {
		User loginUser = new User();
		loginUser.setName(name);
		loginUser.setID(ID);
		session.setAttribute("loginUser", loginUser);
		//msg = "로그인 되었습니다.";
		response.sendRedirect("index.jsp");
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>Insert title here</title>
	</head>
	<body>
		<%= msg %>
		<a href="index.jsp">되돌아가기</a>
	</body>
</html>