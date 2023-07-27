<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
	// �Ķ��Ÿ�� ������ �޸��� ��ȣ�� �޾ƿ� ========================================
	String no = request.getParameter("no");
	if( no == null || no.equals("") )
	{	// ��ȿ�� �˻�
//		stmt.close();
//		conn.close();
		db.DBClose();
		response.sendRedirect("index.jsp");
		return;
	}

	// �޸� ��ȣ�� ��ȸ�ϴ� SQL������ �ۼ��Ѵ�
	String sql = " select * from memo ";
	sql += " where mNo = " + no ;
	
	// SQL ������ ����
//	ResultSet result = stmt.executeQuery(sql);
	db.OpenQuery(sql);
	
	// ��ȸ ����� �ִ��� Ȯ��
//	if( result.next() == false )
	if( db.GetNext() == false )
	{
//		stmt.close();
//		conn.close();
		db.CloseQuery();
		db.DBClose();
		response.sendRedirect("index.jsp");
		return;
	}
	
	// result ��ü�κ��� �÷��̸����� ���� �޾ƿ�
//	String title = result.getString("mTitle");
//	String note  = result.getString("mNote");
//	String date  = result.getString("wDate");
	String title = db.GetValue("mTitle");
	String note  = db.GetValue("mNote");
	String date  = db.GetValue("wDate");
	db.CloseQuery();
	
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
<%@ include file="./include/tail.jsp" %>