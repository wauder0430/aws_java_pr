<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
	// ���ڵ� 
	request.setCharacterEncoding("euc-kr");
	// �Ķ��Ÿ�� �Ѿ�� �޸��� ���������� �޴´�
	String no    = request.getParameter("no");
	String title = request.getParameter("title");
	String note  = request.getParameter("note");
	if( no == null || no.equals("") || title == null || title.equals("") || note == null || note.equals("") )
	{
		db.DBClose();

		response.sendRedirect("index.jsp");
		return;
	}
	
	// update SQL ���� �ۼ�
	String sql = "";
	sql += " update memo set ";
	sql += " mTitle = '" + db._R(title) + "', ";	// mTitle = title,
	sql += " mNote = '" + db._R(note) + "', ";		// mNote  = note
	sql += " wDate = now() ";				// wDate  = now()
	sql += " where mNo = " + no ;
	System.out.println(sql);

	// SQL ���� ���� 
	db.RunSQL(sql);
	// �޸� ��ȣ�� view.jsp�� �̵�
	db.DBClose();
	response.sendRedirect("view.jsp?no=" + no);
%>