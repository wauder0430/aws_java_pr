<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
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
//System.out.println("title : " + title);
//System.out.println("note : " + note);

// JDBC 드라이버를 로딩한다
Class.forName("com.mysql.cj.jdbc.Driver");
// DBMS에 접속하기 위한, 셋팅을 한다
String host = "";
host += "jdbc:mysql://127.0.0.1:3306/ezen";	//주소/포트/DB이름
host += "?useUnicode=true";					// 유니코드
host += "&characterEncoding=utf-8";			// 인코딩
host += "&serverTimezone=UTC";				// 서버시간대
String userID = "root";						// 사용자 계정
String userPW = "ezen";						// 사용자 비번
// DBMS에 연결한다
Connection conn = DriverManager.getConnection(host, userID, userPW);
// 작업 처리용 클래스 객체를 할당받는다
Statement stmt = conn.createStatement();
// SQL 구문을 작성한다
String sql = " insert into memo ( mTitle, mNote ) ";
sql += " values ( '" + title + "', '" + note + "' ) ";
// SQL 구문을 확인한다
System.out.println(sql);
// SQL 구문을 실행한다
stmt.executeUpdate(sql);
// DB와 연결을 종료한다
stmt.close();
conn.close();

// 방금 작성한 메모를 조회한다 ->  select last_insert_id()
response.sendRedirect("index.jsp");
%>