<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%
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
String sql = " select * from memo ";
ResultSet result = stmt.executeQuery(sql);
while(result.next() == true)
{	// ����κ��� '�÷� �̸�'���� '�÷���'�� �ҷ��´�
	int	   mNo	  = result.getInt("mNO");
	String mTitle = result.getString("mTitle");
	String mNote  = result.getString("mNote");
	String wDate  = result.getString("wDate");
	// ������ ����غ���
	out.println("mNo : "		+ mNo	 + "<br>");
	out.println("mTitle : "	+ mTitle + "<br>");
	out.println("mNote : "	+ mNote	 + "<br>");
	out.println("wDate : "	+ wDate	 + "<br>");
}
stmt.close();
conn.close();
%>