<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
// �Ķ��Ÿ�� ��ȸ�� �޸��� ��ȣ�� �޾ƿ´�
String mNo = request.getParameter("no");
if( mNo == null || mNo.equals("") )
{	// �ùٸ��� ���� �����̸�, �ε����� ��������
	db.DBClose();

	response.sendRedirect("index.jsp");
	return;
}

// �޸� ��ȣ�� ��ȸ�ϴ� SQL������ �ۼ��Ѵ�
String sql = " select * from memo ";
sql += " where mNo = " + mNo ;

// SQL ������ ����
db.OpenQuery(sql);

// ��ȸ ����� �ִ��� Ȯ��
if( db.GetNext() == false )
{
	db.DBClose();
	out.print("��ȸ����� �����ϴ�.");
	return;
}

// result ��ü�κ��� �÷��̸����� ���� �޾ƿ�
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
		<title>�޸� ���� ����</title>
	</head>
	<body>
<%-- 		���� : <%= title %><br> --%>
		���� : <%= vo.getmTitle() %><br>
<%-- 		���� : <%= note %><br> --%>
		���� : <%= vo.getmNote() %><br>
<%-- 		�ۼ��� : <%= date %><br> --%>
		�ۼ��� : <%= vo.getwDate() %><br>
		<a href="index.jsp"><button>�������</button></a>
<%-- 		<a href="modify.jsp?no=<%= mNo %>"><button>�����ϱ�</button></a> --%>
		<a href="modify.jsp?no=<%= vo.getmNo() %>"><button>�����ϱ�</button></a>
<%-- 		<a href="delete.jsp?no=<%= mNo %>"><button>�޸����</button></a> --%>
		<a href="delete.jsp?no=<%= vo.getmNo() %>"><button>�޸����</button></a>
	</body>
</html>
<%@ include file="./include/tail.jsp" %>