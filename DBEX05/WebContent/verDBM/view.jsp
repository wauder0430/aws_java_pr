<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
// �Ķ��Ÿ�� ��ȸ�� �޸��� ��ȣ�� �޾ƿ´�
String mNo = request.getParameter("no");
if( mNo == null || mNo.equals("") )
{	// �ùٸ��� ���� �����̸�, �ε����� ��������
//	stmt.close();
//	conn.close();
	db.DBClose();

	response.sendRedirect("index.jsp");
	return;
}

// �޸� ��ȣ�� ��ȸ�ϴ� SQL������ �ۼ��Ѵ�
String sql = " select * from memo ";
sql += " where mNo = " + mNo ;

// SQL ������ ����
//ResultSet result = stmt.executeQuery(sql);
db.OpenQuery(sql);

// ��ȸ ����� �ִ��� Ȯ��
//if( result.next() == false )
if( db.GetNext() == false )
{
//	stmt.close();
//	conn.close();
	db.DBClose();
	out.print("��ȸ����� �����ϴ�.");
	return;
}

// result ��ü�κ��� �÷��̸����� ���� �޾ƿ�
//String title = result.getString("mTitle");
//String note = result.getString("mNote");
//String date = result.getString("wDate");
String title = db.GetValue("mTitle");
String note  = db.GetValue("mNote");
String date  = db.GetValue("wDate");

db.CloseQuery();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�޸� ���� ����</title>
	</head>
	<body>
		���� : <%= title %><br>
		���� : <%= note %><br>
		�ۼ��� : <%= date %><br>
		<a href="index.jsp"><button>�������</button></a>
		<a href="modify.jsp?no=<%= mNo %>"><button>�����ϱ�</button></a>
		<a href="delete.jsp?no=<%= mNo %>"><button>�޸����</button></a>
	</body>
</html>
<%@ include file="./include/tail.jsp" %>