<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%
	// �Ķ��Ÿ�� ������ �޸��� ��ȣ�� �޾ƿ� ========================================
	String no = request.getParameter("no");
	if( no == null || no.equals("") )
	{	// ��ȿ�� �˻�
		response.sendRedirect("index.jsp");
		return;
	}
	// �޸� ��ȣ�� DB���� �޸��� ������ �޾ƿ� ======================================
	// JDBC ����̹��� �ε��Ѵ�
	Class.forName("com.mysql.cj.jdbc.Driver");

	// DBMS�� �����ϱ� ����, ������ �Ѵ�
	String host = "";
	host += "jdbc:mysql://127.0.0.1:3306/ezen";	//�ּ�/��Ʈ/DB�̸�
	host += "?useUnicode=true";					// �����ڵ�
	host += "&characterEncoding=utf-8";			// ���ڵ�
	host += "&serverTimezone=UTC";				// �����ð���
	String userID = "root";						// ����� ����
	String userPW = "ezen";						// ����� ���
	
	// DBMS�� �����Ѵ�
	Connection conn = DriverManager.getConnection(host, userID, userPW);
	
	// �۾� ó���� Ŭ���� ��ü�� �Ҵ�޴´�
	Statement stmt = conn.createStatement();
	
	// �޸� ��ȣ�� ��ȸ�ϴ� SQL������ �ۼ��Ѵ�
	String sql = " select * from memo ";
	sql += " where mNo = " + no ;
	
	// SQL ������ ����
	ResultSet result = stmt.executeQuery(sql);
	
	// ��ȸ ����� �ִ��� Ȯ��
	if( result.next() == false )
	{
		stmt.close();
		conn.close();
		response.sendRedirect("index.jsp");
		return;
	}
	
	// result ��ü�κ��� �÷��̸����� ���� �޾ƿ�
	String title = result.getString("mTitle");
	String note = result.getString("mNote");
	String date = result.getString("wDate");
	
	// DB������ ����
	stmt.close();
	conn.close();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�޸� ����</title>
	</head>
	<body>
		<!-- �޸� �ۼ��� ���� ���� / input �±��� value�� �����͸� ���� -->
		<form method="post" action="modifyOk.jsp" name="modify">
			�޸��ȣ : <input type="text" name="no" value="<%= no %>" readonly><br>
			�޸����� : <input type="text" name="title" value="<%= title %>"><br>
			�޸𳻿� : <input type="text" name="note" value="<%= note %>"><br>
			�ۼ����� : <input type="text" name="date" value="<%= date %>" readonly><br>
			<a href="index.jsp">�������</a>
			<input type="submit" value="�޸����">
			<a href="delete.jsp?no=<%= no %>">�޸����</a>
		</form>
	</body>
</html>