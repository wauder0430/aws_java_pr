<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>

<%
// 파라메타로 조회할 메모의 번호를 받아온다
// String mNo = "15";
String mNo = request.getParameter("no");
if( mNo == null || mNo.equals("") )
{	// 올바르지 않은 접근이면, 인덱스로 보내버림
	response.sendRedirect("index.jsp");
	return;
}

String title = "";
String note = "";
String date = "";

// JDBC 드라이버를 로딩한다
try{
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
String sql = " select * from memo ";
// 메모 번호로 조회하는 SQL구문을 작성한다
sql += " where mNo = " + mNo ;
// SQL 구문을 실행
ResultSet result = stmt.executeQuery(sql);
// 조회 결과가 있는지 확인
if( result.next() == false )
{
	stmt.close();
	conn.close();
	out.print("조회결과가 없습니다.");
	return;
}
// result 객체로부터 컬럼이름으로 값을 받아옴
title = result.getString("mTitle");
note = result.getString("mNote");
date = result.getString("wDate");
stmt.close();
conn.close();
} catch(Exception e){
	e.printStackTrace();
}
// DB연결을 끊음

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>메모 내용 보기</title>
</head>
<body>
	제목 : <%= title %><br>
	내용 : <%= note %><br>
	작성일 : <%= date %><br>
	
</body>
</html>