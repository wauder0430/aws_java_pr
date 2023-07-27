<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
// 파라메타 인코딩 설정
request.setCharacterEncoding("EUC-KR");

// 파라메타로 넘어온 정보를 받고 유효성 검사를 한다
String title = request.getParameter("title");
String note  = request.getParameter("note");
if( title == null || title.equals("") || note == null || note.equals("") )
{	// 유효하지 않은 접근은 인덱스로 보냄
	response.sendRedirect("index.jsp");
	return;
}
// 메모 객체 생성
MemoVO vo = new MemoVO();
// 파라메타로 넘어온 데이터를 메모 객체에 넣는다
vo.setmTitle(title);
vo.setmNote(note);
// 메모 객체로 insert 메소드 호출
dao.Insert(vo);
// 방금 작성한 메모를 조회한다 ->  select last_insert_id()
response.sendRedirect("index.jsp");
%>