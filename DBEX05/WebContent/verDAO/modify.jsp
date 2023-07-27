<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
	// 파라메타로 수정할 메모의 번호를 받아옴 ========================================
	String mNo = request.getParameter("no");
	if( mNo == null || mNo.equals("") )
	{	// 유효성 검사
		response.sendRedirect("index.jsp");
		return;
	}
/* 	int no = 0;
	try
	{
		no = Integer.parseInt(mNo);
	}catch(Exception e)
	{
		e.printStackTrace();
		return;
	} */
//	MemoVO vo = dao.Read(no);
	MemoVO vo = dao.Read(mNo);
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
			메모번호 : <input type="text" name="no" value="<%= vo.getmNo() %>" readonly><br>
			메모제목 : <input type="text" name="title" value="<%= vo.getmTitle() %>"><br>
			메모내용 : <input type="text" name="note" value="<%= vo.getmNote() %>"><br>
			작성일자 : <input type="text" name="date" value="<%= vo.getwDate() %>" readonly><br>
			<a href="index.jsp">목록으로</a>
			<input type="submit" value="메모수정">
			<a href="delete.jsp?no=<%= vo.getmNo() %>">메모삭제</a>
		</form>
	</body>
</html>
