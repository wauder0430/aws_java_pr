<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%
// �Ķ��Ÿ ���ڵ� ����
request.setCharacterEncoding("EUC-KR");

// �Ķ��Ÿ�� �Ѿ�� ������ �ް� ��ȿ�� �˻縦 �Ѵ�
String title = request.getParameter("title");
String note  = request.getParameter("note");
if( title == null || title.equals("") || note == null || note.equals("") )
{	// ��ȿ���� ���� ������ �ε����� ����
	response.sendRedirect("index.jsp");
	return;
}
//System.out.println("title : " + title);
//System.out.println("note : " + note);

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
// SQL ������ �ۼ��Ѵ�
String sql = " insert into memo ( mTitle, mNote ) ";
sql += " values ( '" + title + "', '" + note + "' ) ";
// SQL ������ Ȯ���Ѵ�
System.out.println(sql);
// SQL ������ �����Ѵ�
stmt.executeUpdate(sql);
// DB�� ������ �����Ѵ�
stmt.close();
conn.close();

// ��� �ۼ��� �޸� ��ȸ�Ѵ� ->  select last_insert_id()
response.sendRedirect("index.jsp");
%>