<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
	// 인코딩 
	request.setCharacterEncoding("euc-kr");
	// 파라메타로 넘어온 메모의 수정내용을 받는다
	String no    = request.getParameter("no");
	String title = request.getParameter("title");
	String note  = request.getParameter("note");
	if( no == null || no.equals("") || title == null || title.equals("") || note == null || note.equals("") )
	{
//		stmt.close();
//		conn.close();
		db.DBClose();

		response.sendRedirect("index.jsp");
		return;
	}
	
	// update SQL 구문 작성
	String sql = "";
	sql += " update memo set ";
	sql += " mTitle = '" + db._R(title) + "', ";	// mTitle = title,
	sql += " mNote = '" + db._R(note) + "', ";		// mNote  = note
	sql += " wDate = now() ";				// wDate  = now()
	sql += " where mNo = " + no ;
	System.out.println(sql);

	// SQL 구문 실행 
//	stmt.executeUpdate(sql);
	db.RunSQL(sql);
	// 메모 번호로 view.jsp로 이동
//	stmt.close();
//	conn.close();
	db.DBClose();
	response.sendRedirect("view.jsp?no=" + no);
%>