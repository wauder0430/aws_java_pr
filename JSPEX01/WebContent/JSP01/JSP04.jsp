<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
		<title>Insert title here</title>
		</head>
	<body>
		<!-- 자바 영역과, table tag를 이용하여 구구단 출력 -->
		
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