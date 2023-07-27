<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
	// 파라메타로 삭제할 메모 번호를 받는다
	String no = request.getParameter("no");
	// 번호가 없으면 index.jsp로
	if( no == null || no.equals("") )
	{
		stmt.close();
		conn.close();
		response.sendRedirect("index.jsp");
		return;
	}

	// delete SQL 구문을 작성
	String sql = "";
	sql += " delete from memo where mNo = " + no ;
//	out.println(sql);
	// SQL 구문 실행
	stmt.executeUpdate(sql);
	// DB연결 종료
	stmt.close();
	conn.close();
	// 목록으로 이동
	response.sendRedirect("index.jsp");
%>