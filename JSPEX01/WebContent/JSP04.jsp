<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
		<title>Insert title here</title>
		</head>
	<body>
		<!-- �ڹ� ������, table tag�� �̿��Ͽ� ������ ��� -->
		
		<% 
		for(int i=2; i<10; i++){
			%>
			<table border=1 width=250px>
			<%
			for(int j=1; j<10; j++){
				%>
				<tr>
					<td><%= i%></td>
					<td>x</td>
					<td><%= j%></td>
					<td>=</td>
					<td><%= i*j%></td>
				</tr>
				<%
			}
			%>
			</table>
			<br>
			<%
		}
		%>
		
	</body>
</html>