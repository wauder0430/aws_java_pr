<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>

<%
// �Ķ��Ÿ�� ��ȸ�� �޸��� ��ȣ�� �޾ƿ´�
// String mNo = "15";
String mNo = request.getParameter("no");
if( mNo == null || mNo.equals("") )
{	// �ùٸ��� ���� �����̸�, �ε����� ��������
	response.sendRedirect("index.jsp");
	return;
}

String title = "";
String note = "";
String date = "";

// JDBC ����̹��� �ε��Ѵ�
try{
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
// SQL ������ �ۼ��Ѵ�
String sql = " select * from memo ";
// �޸� ��ȣ�� ��ȸ�ϴ� SQL������ �ۼ��Ѵ�
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
title = result.getString("mTitle");
note = result.getString("mNote");
date = result.getString("wDate");
stmt.close();
conn.close();
} catch(Exception e){
	e.printStackTrace();
}
// DB������ ����

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
	
</body>
</html>