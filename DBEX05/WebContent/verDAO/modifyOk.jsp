<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
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
	// �Ķ��Ÿ�� ���� ������ �޸� ��ü ����
	MemoVO vo = new MemoVO(no,title,note,"");
	// SQL ���� ���� 
	dao.Update(vo);
	// �޸� ��ȣ�� view.jsp�� �̵�
	response.sendRedirect("view.jsp?no=" + no);
%>