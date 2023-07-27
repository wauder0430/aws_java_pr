<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>JDBC-JSP 연동 연습</title>
		<style>
			td {
				text-align : center;
			}
			.note {
				text-align : left;
			}
		</style>
	</head>
	<body>
		<!-- 메모 목록 보여주기 -->
		<table border="1" align="center" style="width: 600px">
			<tr>
				<td width="50px">번호</td>
				<td>메모 제목</td>
				<td width="100px">작성 일자</td>
				<td width="100px" style="text-align:center;"><a href="write.jsp"><button>쓰기</button></a></td>
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
				wDate = wDate.split(" ")[0];
				// 데이터 출력해보기
				System.out.println("mNo : "		+ mNo		);
				System.out.println("mTitle : "	+ mTitle	);
				System.out.println("wDate : "	+ wDate		);
			%>
				<tr>
					<td><%= mNo %></td>
					<td class="note"> &nbsp;<%= mTitle %></td>
					<td><%= wDate %></td>
					<td>
						<a href="view.jsp?no=<%= mNo %>"><button>보기</button></a>
						<a href="modify.jsp?no=<%= mNo %>"><button>수정</button></a>
					</td>
				</tr> <%
			}
			%>
<!-- 		<tr>
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
<%@ include file="./include/tail.jsp" %>