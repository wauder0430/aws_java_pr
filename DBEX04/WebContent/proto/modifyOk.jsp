<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%
	// ���ڵ� 
	request.setCharacterEncoding("euc-kr");
	// �Ķ��Ÿ�� �Ѿ�� �޸��� ���������� �޴´�
	String no    = request.getParameter("no");
	String title = request.getParameter("title");
	String note  = request.getParameter("note");
	if( no == null || no.equals("") || title == null || title.equals("") || note == null || note.equals("") )
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
	
	// update SQL ���� �ۼ�
	String sql = "";
	sql += " update memo set ";
	sql += " mTitle = '" + title + "', ";	// mTitle = title,
	sql += " mNote = '" + note + "', ";		// mNote  = note
	sql += " wDate = now() ";				// wDate  = now()
	sql += " where mNo = " + no ;
	System.out.println(sql);

	// SQL ���� ���� 
	stmt.executeUpdate(sql);
	// �޸� ��ȣ�� view.jsp�� �̵�
	response.sendRedirect("view.jsp?no=" + no);
%>