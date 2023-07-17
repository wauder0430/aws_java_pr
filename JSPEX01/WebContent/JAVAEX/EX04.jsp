<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	for(int i=0; i<10; i++){
		out.println(i + "<br>");
		out.println(i + "<br>\n");
	}
%>
<hr>
<% 	// 자바 영역은 연속하지 않더라도, 자바 코드로서 완성이 된다면 
	// 실행하는데 문제가 없음
	for(int i=0; i<10; i++){
		%>
		i = <%= i %><br>
		<%
	}
	
%>
<hr>
<% 	// 구구단의 3단 출력
	for(int i=1; i<10; i++){
		%>
		3 * <%= i %> = <%= 3*i %> <br>
		<%
	}	
%> 