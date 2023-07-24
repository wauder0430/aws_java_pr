<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%
/*	DB연결 / 메모를 조회 / 목록/배열/리스트 */
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
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>JDBC-JSP 연동 연습</title>
	</head>
	<body>
		<!-- 메모 목록 보여주기 -->
		<table border="1" align="center" style="width: 700px">
			<tr>
				<td>메모 번호</td>
				<td>메모 제목</td>
				<td>작성 일자</td>
				<td><a href="write.jsp"><button>쓰기</button></a></td>
			</tr>
			<!-- 메모 갯수에 맞춰 반복할 구간                           -->
			<%
			// SQL 구문을 작성한다
			String sql = " select mNo, mTitle, wDate from memo ";
			ResultSet result = stmt.executeQuery(sql);
			while(result.next() == true)
			{	// 결과로부터 '컬럼 이름'으로 '컬럼값'을 불러온다
				String mNo	  = result.getString("mNO");
				String mTitle  = result.getString("mTitle");
				String wDate  = result.getString("wDate");
				// 데이터 출력해보기
				System.out.println("mNo : "		+ mNo	);
				System.out.println("mTitle : "	+ mTitle	);
				System.out.println("wDate : "	+ wDate	);
			%>
				<tr>
					<td><%= mNo %></td>
					<td><%= mTitle %></td>
					<td><%= wDate %></td>
					<td>
						<a href="view.jsp?no=<%= mNo %>"><button>보기</button></a>
						<a href="modify.jsp?no=<%= mNo %>"><button>수정</button></a>
					</td>
				</tr> <%
			}
			%>
<!-- 			<tr>
				<td>2번</td>
				<td>2023. 7. 24</td>
				<td><a href="view.jsp?no=5"><button>보기</button></a></td>
			</tr>
			<tr>
				<td>3번</td>
				<td>2023. 7. 24</td>
				<td><a href="view.jsp?no=6"><button>보기</button></a></td>
			</tr>
			<tr>
				<td>4번</td>
				<td>2023. 7. 24</td>
				<td><a href="view.jsp?no=7"><button>보기</button></a></td>
			</tr>
			<tr>
				<td>5번</td>
				<td>2023. 7. 24</td>
				<td><a href="view.jsp?no=8"><button>보기</button></a></td>
			</tr> -->
			<!--                                                        -->
		</table>
	</body>
</html>