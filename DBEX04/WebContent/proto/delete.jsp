<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%
	// 파라메타로 삭제할 메모 번호를 받는다
	String no = request.getParameter("no");
	// 번호가 없으면 index.jsp로
	if( no == null || no.equals("") )
	{
		response.sendRedirect("index.jsp");
		return;
	}

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