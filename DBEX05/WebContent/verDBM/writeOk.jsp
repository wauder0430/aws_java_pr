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
//	stmt.close();
//	conn.close();
	db.DBClose();
	response.sendRedirect("index.jsp");
	return;
}
//System.out.println("title : " + title);
//System.out.println("note : " + note);

// SQL 구문을 작성한다
String sql = " insert into memo ( mTitle, mNote ) ";
sql += " values ( '" + db._R(title) + "', '" + db._R(note) + "' ) ";
// SQL 구문을 확인한다
System.out.println(sql);
// SQL 구문을 실행한다
//stmt.executeUpdate(sql);
db.RunSQL(sql);
// DB와 연결을 종료한다
//stmt.close();
//conn.close();
db.DBClose();

// 방금 작성한 메모를 조회한다 ->  select last_insert_id()
response.sendRedirect("index.jsp");
%>