<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
	// 파라메타로 삭제할 메모 번호를 받는다
	String mNo = request.getParameter("no");
	// 번호가 없으면 index.jsp로
	if( mNo == null || mNo.equals("") )
	{
		response.sendRedirect("index.jsp");
		return;
	}
	int no = 0;
	try
	{
		no = Integer.parseInt(mNo);
	}catch(Exception e)
	{
		e.printStackTrace();
		return;
	}
	// SQL 구문 실행
	dao.Delete(no);
	// 목록으로 이동
	response.sendRedirect("index.jsp");
%>