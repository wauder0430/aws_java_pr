<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
//파라메타로 조회할 메모의 번호를 받아온다
String mNo = request.getParameter("no");
if( mNo == null || mNo.equals("") )
{	// 올바르지 않은 접근이면, 인덱스로 보내버림
	response.sendRedirect("index.jsp");
	return;
}
/* int no = 0;
try
{
	no = Integer.parseInt(mNo);
}catch(Exception e)
{
	e.printStackTrace();
	return;
} */

// dao로부터 메모번호로 메모 객체 -> Read(메모번호)
// MemoVO vo = dao.Read( no );
MemoVO vo = dao.Read( mNo );
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>메모 내용 보기</title>
	</head>
	<body>
		제목 : <%= vo.getmTitle() %><br>
		내용 : <%= vo.getmNote() %><br>
		작성일 : <%= vo.getwDate() %><br>
		<a href="index.jsp"><button>목록으로</button></a>
		<a href="modify.jsp?no=<%= vo.getmNo() %>"><button>수정하기</button></a>
		<a href="delete.jsp?no=<%= vo.getmNo() %>"><button>메모삭제</button></a>
	</body>
</html>