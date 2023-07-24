<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%
	// 파라메타로 수정할 메모의 번호를 받아옴 ========================================
	String no = request.getParameter("no");
	if( no == null || no.equals("") )
	{	// 유효성 검사
		response.sendRedirect("index.jsp");
		return;
	}
	// 메모 번호로 DB에서 메모의 정보를 받아옴 ======================================
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
	
	// 메모 번호로 조회하는 SQL구문을 작성한다
	String sql = " select * from memo ";
	sql += " where mNo = " + no ;
	
	// SQL 구문을 실행
	ResultSet result = stmt.executeQuery(sql);
	
	// 조회 결과가 있는지 확인
	if( result.next() == false )
	{
		stmt.close();
		conn.close();
		response.sendRedirect("index.jsp");
		return;
	}
	
	// result 객체로부터 컬럼이름으로 값을 받아옴
	String title = result.getString("mTitle");
	String note = result.getString("mNote");
	String date = result.getString("wDate");
	
	// DB연결을 끊음
	stmt.close();
	conn.close();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>메모 수정</title>
	</head>
	<body>
		<!-- 메모 작성과 같은 내용 / input 태그의 value에 데이터를 넣음 -->
		<form method="post" action="modifyOk.jsp" name="modify">
			메모번호 : <input type="text" name="no" value="<%= no %>" readonly><br>
			메모제목 : <input type="text" name="title" value="<%= title %>"><br>
			메모내용 : <input type="text" name="note" value="<%= note %>"><br>
			작성일자 : <input type="text" name="date" value="<%= date %>" readonly><br>
			<a href="index.jsp">목록으로</a>
			<input type="submit" value="메모수정">
			<a href="delete.jsp?no=<%= no %>">메모삭제</a>
		</form>
	</body>
</html>