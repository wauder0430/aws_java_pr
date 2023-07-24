<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>

<%
// �Ķ��Ÿ�� ��ȸ�� �޸��� ��ȣ�� �޾ƿ´�
String mNo = request.getParameter("no");
if( mNo == null || mNo.equals("") )
{	// �ùٸ��� ���� �����̸�, �ε����� ��������
	response.sendRedirect("index.jsp");
	return;
}

// JDBC ����̹��� �ε��Ѵ�
Class.forName("com.mysql.cj.jdbc.Driver");

// DBMS�� �����ϱ� ����, ������ �Ѵ�
String host = "";
host += "jdbc:mysql://127.0.0.1:3306/ezen";	//�ּ�/��Ʈ/DB�̸�
host += "?useUnicode=true";					// �����ڵ�
host += "&characterEncoding=utf-8";			// ���ڵ�
host += "&serverTimezone=UTC";				// �����ð���
String userID = "root";						// ����� ����
String userPW = "ezen";						// ����� ���

// DBMS�� �����Ѵ�
Connection conn = DriverManager.getConnection(host, userID, userPW);

// �۾� ó���� Ŭ���� ��ü�� �Ҵ�޴´�
Statement stmt = conn.createStatement();

// �޸� ��ȣ�� ��ȸ�ϴ� SQL������ �ۼ��Ѵ�
String sql = " select * from memo ";
sql += " where mNo = " + mNo ;

// SQL ������ ����
ResultSet result = stmt.executeQuery(sql);

// ��ȸ ����� �ִ��� Ȯ��
if( result.next() == false )
{
	stmt.close();
	conn.close();
	out.print("��ȸ����� �����ϴ�.");
	return;
}

// result ��ü�κ��� �÷��̸����� ���� �޾ƿ�
String title = result.getString("mTitle");
String note = result.getString("mNote");
String date = result.getString("wDate");

// DB������ ����
stmt.close();
conn.close();
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