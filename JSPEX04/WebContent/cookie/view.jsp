<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// request에서 쿠키를 받아옴
	Cookie ck_list[] = request.getCookies();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>쿠키 조회</title>
	</head>
	<body>
		<%
			// request.getCookies()의 반환값이 null인가 체크
			if( ck_list != null){
				for(int i=0; i<ck_list.length; i++){
					
					%>
					쿠키의 이름 : <%= ck_list[i].getName() %><br>
					쿠키의 내용 : <%= ck_list[i].getValue() %><br>
					<%
				}
			}
			// 쿠키의 배열에서 각각의 원소에 접근하여
			// 쿠키의 이름과, 값을 가져옴
			
		%>
		<%
			if(ck_list != null){
				for( Cookie item : ck_list){
					if(item.getName().equals("name") || item.getName().equals("age")){
						%>
						쿠키의 이름 : <%= item.getName() %><br>
						쿠키의 내용 : <%= item.getValue() %><br>
						<%
					}
				}
			}
		%>
	</body>
</html>