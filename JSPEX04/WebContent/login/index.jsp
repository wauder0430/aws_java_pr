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
		<!-- ���ǿ� loginUser ��� ��ü�� ������ 
		�̸� + �� �ݰ����ϴ�.
		������, �α��� ���� ����ϼ���
		form���� ���̵�� �̸��� �Է¹ް�
		loginOk.jsp�� �����͸� ����
		loginOk.jsp�� �Ķ��Ÿ�� ���� �����͸� session�� ����-->
		<%
			if(loginUser != null){
				%> 
				<%= loginUser.getName() %> �� �ݰ����ϴ�.<br>
				<a href="logout.jsp">�α׾ƿ��ϱ� </a>
				<%
			} else {
				%>
				<form method="post" action="loginOk.jsp">
					���̵� : <input type="text" name="uID" id="uID"><br>
					�̸� : <input type="text" name="uName" id="uName"><br>
					<input type="submit" value="�α���">
				</form>
				<%
			}
		%>
	</body>
</html>