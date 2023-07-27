<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
	// �Ķ��Ÿ�� ������ �޸��� ��ȣ�� �޾ƿ� ========================================
	String mNo = request.getParameter("no");
	if( mNo == null || mNo.equals("") )
	{	// ��ȿ�� �˻�
		response.sendRedirect("index.jsp");
		return;
	}
/* 	int no = 0;
	try
	{
		no = Integer.parseInt(mNo);
	}catch(Exception e)
	{
		e.printStackTrace();
		return;
	} */
//	MemoVO vo = dao.Read(no);
	MemoVO vo = dao.Read(mNo);
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
			�޸��ȣ : <input type="text" name="no" value="<%= vo.getmNo() %>" readonly><br>
			�޸����� : <input type="text" name="title" value="<%= vo.getmTitle() %>"><br>
			�޸𳻿� : <input type="text" name="note" value="<%= vo.getmNote() %>"><br>
			�ۼ����� : <input type="text" name="date" value="<%= vo.getwDate() %>" readonly><br>
			<a href="index.jsp">�������</a>
			<input type="submit" value="�޸����">
			<a href="delete.jsp?no=<%= vo.getmNo() %>">�޸����</a>
		</form>
	</body>
</html>
