<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%	
	// �Ķ��Ÿ�� �Ѿ�� �����͸� ������ ���� ����
	// �Ķ��Ÿ�� �Ѿ�� �����͸� �޴� �޼ҵ� getParameter()��
	// String�� ��ȯ�ϱ⿡, ������ String ����
	// �Ķ���ͷ� �Ѿ���� �����Ͱ� post ����� ����̰� , �ѱ��� ������ ��쿡��
	// ���ڵ��� ��������� ��
	request.setCharacterEncoding("EUC-KR");
	String text = request.getParameter("string");
	String number = request.getParameter("number");
	String date = request.getParameter("date");
	
	// ���� ó��
	// �Ķ��Ÿ�� �����Ͱ� �Ѿ���� �ʾ��� ���, ���� ���� �ʱ�ȭ ���ش�.
	// ���������� data.jsp�� ������ ���� ����
	if(text == null || number == null || date == null){
		// �Ķ���Ͱ� ���� data.jsp�� �������� ���, 
		// index.jsp�� �̵���Ŵ
		response.sendRedirect("index.jsp");
	}
	
	/* if(text == null){ text = ""; }
	if(number == null){ number = ""; }
	if(date == null){ date = ""; } */
	
	// �ֿܼ� �Ķ��Ÿ�� �Ѿ�� ���� ����غ���.
	System.out.println("text : " + text);
	System.out.println("number : " + number);
	System.out.println("date : " + date);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Ķ���� ������ �ޱ�</title>
</head>
<body>
	text : <%= text %><br>
	number : <%= number %><br>
	date : <%= date %><br>
</body>
</html>