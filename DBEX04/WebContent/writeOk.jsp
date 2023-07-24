<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%
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
String sql = " select * from memo ";
ResultSet result = stmt.executeQuery(sql);
while(result.next() == true)
{	// 결과로부터 '컬럼 이름'으로 '컬럼값'을 불러온다
	int	   mNo	  = result.getInt("mNO");
	String mTitle = result.getString("mTitle");
	String mNote  = result.getString("mNote");
	String wDate  = result.getString("wDate");
	// 데이터 출력해보기
	out.println("mNo : "		+ mNo	 + "<br>");
	out.println("mTitle : "	+ mTitle + "<br>");
	out.println("mNote : "	+ mNote	 + "<br>");
	out.println("wDate : "	+ wDate	 + "<br>");
}
stmt.close();
conn.close();
%>