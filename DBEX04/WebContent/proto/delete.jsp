<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%
	// �Ķ��Ÿ�� ������ �޸� ��ȣ�� �޴´�
	String no = request.getParameter("no");
	// ��ȣ�� ������ index.jsp��
	if( no == null || no.equals("") )
	{
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
	// delete SQL ������ �ۼ�
	String sql = "";
	sql += " delete from memo where mNo = " + no ;
//	out.println(sql);
	// SQL ���� ����
	stmt.executeUpdate(sql);
	// DB���� ����
	stmt.close();
	conn.close();
	// ������� �̵�
	response.sendRedirect("index.jsp");
%>