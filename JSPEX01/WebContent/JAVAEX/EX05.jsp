<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
//String
	String str = "hello?";
	out.println("���ڿ� " + str + 1 + 2+"<br>");
	out.println("���� : " + str.length()+"<br>");
	
	str = str.toUpperCase();
	out.println("�빮�ڷ� ��ȯ : " + str + "<br>");
	
	str = str.toLowerCase();
	out.println("�ҹ��ڷ� ��ȯ : " + str + "<br>");
	
	// ����/���ڿ� ġȯ
	str = "hello java!!";
	str = str.replace("java", "JSP");
	out.println("���ڿ� ġȯ : " + str + "<br>");
	
	//split 
	str = "100, 200, 300, 400";
	String[] scores;
	int sum = 0;
	scores = str.split(",");
	for(String item : scores){
		out.println(item.trim()+"<br>");
		sum += Integer.parseInt(item.trim());
	}
	out.println(sum);
%>
