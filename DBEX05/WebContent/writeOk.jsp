<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
// �Ķ��Ÿ ���ڵ� ����
request.setCharacterEncoding("EUC-KR");

// �Ķ��Ÿ�� �Ѿ�� ������ �ް� ��ȿ�� �˻縦 �Ѵ�
String title = request.getParameter("title");
String note  = request.getParameter("note");
if( title == null || title.equals("") || note == null || note.equals("") )
{	// ��ȿ���� ���� ������ �ε����� ����
	stmt.close();
	conn.close();
	response.sendRedirect("index.jsp");
	return;
}
//System.out.println("title : " + title);
//System.out.println("note : " + note);

// SQL ������ �ۼ��Ѵ�
String sql = " insert into memo ( mTitle, mNote ) ";
sql += " values ( '" + title + "', '" + note + "' ) ";
// SQL ������ Ȯ���Ѵ�
//System.out.println(sql);
// SQL ������ �����Ѵ�
stmt.executeUpdate(sql);
// DB�� ������ �����Ѵ�
stmt.close();
conn.close();

// ��� �ۼ��� �޸� ��ȸ�Ѵ� ->  select last_insert_id()
response.sendRedirect("index.jsp");
%>