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
		response.sendRedirect("index.jsp");
		return;
	}
	// 파라메타로 받은 정보로 메모 객체 생성
	MemoVO vo = new MemoVO(no,title,note,"");
	// SQL 구문 실행 
	dao.Update(vo);
	// 메모 번호로 view.jsp로 이동
	response.sendRedirect("view.jsp?no=" + no);
%>