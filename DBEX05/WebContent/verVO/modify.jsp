<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
	// �Ķ��Ÿ�� ������ �޸��� ��ȣ�� �޾ƿ� ========================================
	String no = request.getParameter("no");
	if( no == null || no.equals("") )
	{	// ��ȿ�� �˻�
		db.DBClose();
		response.sendRedirect("index.jsp");
		return;
	}

	// �޸� ��ȣ�� ��ȸ�ϴ� SQL������ �ۼ��Ѵ�
	String sql = " select * from memo ";
	sql += " where mNo = " + no ;
	
	// SQL ������ ����
	db.OpenQuery(sql);
	
	// ��ȸ ����� �ִ��� Ȯ��
	if( db.GetNext() == false )
	{
		db.CloseQuery();
		db.DBClose();
		response.sendRedirect("index.jsp");
		return;
	}
	
	// result ��ü�κ��� �÷��̸����� ���� �޾ƿ�
/*	String title = db.GetValue("mTitle");
	String note  = db.GetValue("mNote");
	String date  = db.GetValue("wDate");	*/
	MemoVO vo = new MemoVO(no, db.GetValue("mTitle"),db.GetValue("mNote"),db.GetValue("wDate"));
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
<%-- 			�޸��ȣ : <input type="text" name="no" value="<%= no %>" readonly><br> --%>
			�޸��ȣ : <input type="text" name="no" value="<%= vo.getmNo() %>" readonly><br>
<%-- 			�޸����� : <input type="text" name="title" value="<%= title %>"><br> --%>
			�޸����� : <input type="text" name="title" value="<%= vo.getmTitle() %>"><br>
<%-- 			�޸𳻿� : <input type="text" name="note" value="<%= note %>"><br> --%>
			�޸𳻿� : <input type="text" name="note" value="<%= vo.getmNote() %>"><br>
<%-- 			�ۼ����� : <input type="text" name="date" value="<%= date %>" readonly><br> --%>
			�ۼ����� : <input type="text" name="date" value="<%= vo.getwDate() %>" readonly><br>
			<a href="index.jsp">�������</a>
			<input type="submit" value="�޸����">
<%-- 			<a href="delete.jsp?no=<%= no %>">�޸����</a> --%>
			<a href="delete.jsp?no=<%= vo.getmNo() %>">�޸����</a>
		</form>
	</body>
</html>
<%@ include file="./include/tail.jsp" %>