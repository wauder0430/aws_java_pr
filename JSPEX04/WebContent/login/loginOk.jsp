<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ezen.User" %>
<%
	request.setCharacterEncoding("EUC-KR");
	
	String name = request.getParameter("uName");
	String ID = request.getParameter("uID");
	String msg = ""; // ��ȿ�� �˻�
	if(name == null || ID == null || name.equals("") || ID.equals("")){
		// msg = "�α��� ������ �ùٸ��� �ʽ��ϴ�.";
		response.sendRedirect("index.jsp");
		return;
	} else {
		User loginUser = new User();
		loginUser.setName(name);
		loginUser.setID(ID);
		session.setAttribute("loginUser", loginUser);
		//msg = "�α��� �Ǿ����ϴ�.";
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
		<a href="index.jsp">�ǵ��ư���</a>
	</body>
</html>