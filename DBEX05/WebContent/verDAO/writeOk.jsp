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
	response.sendRedirect("index.jsp");
	return;
}
// �޸� ��ü ����
MemoVO vo = new MemoVO();
// �Ķ��Ÿ�� �Ѿ�� �����͸� �޸� ��ü�� �ִ´�
vo.setmTitle(title);
vo.setmNote(note);
// �޸� ��ü�� insert �޼ҵ� ȣ��
dao.Insert(vo);
// ��� �ۼ��� �޸� ��ȸ�Ѵ� ->  select last_insert_id()
response.sendRedirect("index.jsp");
%>