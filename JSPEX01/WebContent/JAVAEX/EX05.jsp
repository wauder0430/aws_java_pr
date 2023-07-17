<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
//String
	String str = "hello?";
	out.println("문자열 " + str + 1 + 2+"<br>");
	out.println("길이 : " + str.length()+"<br>");
	
	str = str.toUpperCase();
	out.println("대문자로 변환 : " + str + "<br>");
	
	str = str.toLowerCase();
	out.println("소문자로 변환 : " + str + "<br>");
	
	// 문자/문자열 치환
	str = "hello java!!";
	str = str.replace("java", "JSP");
	out.println("문자열 치환 : " + str + "<br>");
	
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
