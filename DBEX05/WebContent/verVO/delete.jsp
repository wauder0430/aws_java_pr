<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
	// �Ķ��Ÿ�� ������ �޸� ��ȣ�� �޴´�
	String no = request.getParameter("no");
	// ��ȣ�� ������ index.jsp��
	if( no == null || no.equals("") )
	{
		db.DBClose();
		response.sendRedirect("index.jsp");
		return;
	}

	// delete SQL ������ �ۼ�
	String sql = "";
	sql += " delete from memo where mNo = " + no ;
	// SQL ���� ����
	db.RunSQL(sql);
	// DB���� ����
	db.DBClose();
	// ������� �̵�
	response.sendRedirect("index.jsp");
%>