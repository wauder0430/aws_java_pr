<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
	// �Ķ��Ÿ�� ������ �޸� ��ȣ�� �޴´�
	String mNo = request.getParameter("no");
	// ��ȣ�� ������ index.jsp��
	if( mNo == null || mNo.equals("") )
	{
		response.sendRedirect("index.jsp");
		return;
	}
	int no = 0;
	try
	{
		no = Integer.parseInt(mNo);
	}catch(Exception e)
	{
		e.printStackTrace();
		return;
	}
	// SQL ���� ����
	dao.Delete(no);
	// ������� �̵�
	response.sendRedirect("index.jsp");
%>