<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String str = "1,000";
	int result = 0;
	try{
		// �õ��� �۾�
		result = Integer.parseInt(str);
	}catch(Exception e){
		// ������ ���� �� �� �۾�
		System.out.println(e);
		System.out.println(",�� _�� �����մϴ�.");
		str = str.replace(",", "");
		str = str.replace("_", "");
		result = Integer.parseInt(str);
	}finally{
		// �õ��� �۾� or ������ �۾��� ��� �Ϸ�Ǿ��� ���� ����
		System.out.println("��� �۾��� �Ϸ�Ǿ����ϴ�.");
		out.println(result);
	}
%>