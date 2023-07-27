<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
// dao를 통해 메모의 리스트를 생성한다
//ArrayList<MemoVO> list = new ArrayList<MemoVO>();
ArrayList<MemoVO> list = dao.List();
%>
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
			for( MemoVO item : list )
			{
			%>
				<tr>
					<td><%= item.getmNo() %></td>
					<td class="note"> &nbsp;<%= item.getmTitle() %></td>
					<td><%= item.getwDate().split(" ")[0] %></td>
					<td>
						<a href="view.jsp?no=<%= item.getmNo() %>"><button>보기</button></a>
						<a href="modify.jsp?no=<%= item.getmNo() %>"><button>수정</button></a>
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