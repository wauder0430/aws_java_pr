<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
	// �Ķ��Ÿ�� ������ �޸� ��ȣ�� �޴´�
	String no = request.getParameter("no");
	// ��ȣ�� ������ index.jsp��
	if( no == null || no.equals("") )
	{
//		stmt.close();
//		conn.close();
		db.DBClose();
		response.sendRedirect("index.jsp");
		return;
	}

	// delete SQL ������ �ۼ�
	String sql = "";
	sql += " delete from memo where mNo = " + no ;
//	out.println(sql);
	// SQL ���� ����
//	stmt.executeUpdate(sql);
	db.RunSQL(sql);
	// DB���� ����
//	stmt.close();
//	conn.close();
	db.DBClose();
	// ������� �̵�
	response.sendRedirect("index.jsp");
%>