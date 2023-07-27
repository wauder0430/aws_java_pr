<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
// 파라메타로 조회할 메모의 번호를 받아온다
String mNo = request.getParameter("no");
if( mNo == null || mNo.equals("") )
{	// 올바르지 않은 접근이면, 인덱스로 보내버림
	db.DBClose();

	response.sendRedirect("index.jsp");
	return;
}

// 메모 번호로 조회하는 SQL구문을 작성한다
String sql = " select * from memo ";
sql += " where mNo = " + mNo ;

// SQL 구문을 실행
db.OpenQuery(sql);

// 조회 결과가 있는지 확인
if( db.GetNext() == false )
{
	db.DBClose();
	out.print("조회결과가 없습니다.");
	return;
}

// result 객체로부터 컬럼이름으로 값을 받아옴
//String title = db.GetValue("mTitle");
//String note  = db.GetValue("mNote");
//String date  = db.GetValue("wDate");
/*
MemoVO vo = new MemoVO();
vo.setmNo(mNo);
vo.setmTitle(db.GetValue("mTitle"));
vo.setmNote(db.GetValue("mNote"));
vo.setwDate(db.GetValue("wDate"));
*/
MemoVO vo = new MemoVO(mNo,db.GetValue("mTitle"),db.GetValue("mNote"),db.GetValue("wDate"));
db.CloseQuery();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>메모 내용 보기</title>
	</head>
	<body>
<%-- 		제목 : <%= title %><br> --%>
		제목 : <%= vo.getmTitle() %><br>
<%-- 		내용 : <%= note %><br> --%>
		내용 : <%= vo.getmNote() %><br>
<%-- 		작성일 : <%= date %><br> --%>
		작성일 : <%= vo.getwDate() %><br>
		<a href="index.jsp"><button>목록으로</button></a>
<%-- 		<a href="modify.jsp?no=<%= mNo %>"><button>수정하기</button></a> --%>
		<a href="modify.jsp?no=<%= vo.getmNo() %>"><button>수정하기</button></a>
<%-- 		<a href="delete.jsp?no=<%= mNo %>"><button>메모삭제</button></a> --%>
		<a href="delete.jsp?no=<%= vo.getmNo() %>"><button>메모삭제</button></a>
	</body>
</html>
<%@ include file="./include/tail.jsp" %>