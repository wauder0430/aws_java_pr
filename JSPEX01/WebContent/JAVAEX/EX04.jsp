<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	for(int i=0; i<10; i++){
		out.println(i + "<br>");
		out.println(i + "<br>\n");
	}
%>
<hr>
<% 	// �ڹ� ������ �������� �ʴ���, �ڹ� �ڵ�μ� �ϼ��� �ȴٸ� 
	// �����ϴµ� ������ ����
	for(int i=0; i<10; i++){
		%>
		i = <%= i %><br>
		<%
	}
	
%>
<hr>
<% 	// �������� 3�� ���
	for(int i=1; i<10; i++){
		%>
		3 * <%= i %> = <%= 3*i %> <br>
		<%
	}	
%> 