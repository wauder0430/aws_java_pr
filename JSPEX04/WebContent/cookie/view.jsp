<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// request���� ��Ű�� �޾ƿ�
	Cookie ck_list[] = request.getCookies();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>��Ű ��ȸ</title>
	</head>
	<body>
		<%
			// request.getCookies()�� ��ȯ���� null�ΰ� üũ
			if( ck_list != null){
				for(int i=0; i<ck_list.length; i++){
					
					%>
					��Ű�� �̸� : <%= ck_list[i].getName() %><br>
					��Ű�� ���� : <%= ck_list[i].getValue() %><br>
					<%
				}
			}
			// ��Ű�� �迭���� ������ ���ҿ� �����Ͽ�
			// ��Ű�� �̸���, ���� ������
			
		%>
		<%
			if(ck_list != null){
				for( Cookie item : ck_list){
					if(item.getName().equals("name") || item.getName().equals("age")){
						%>
						��Ű�� �̸� : <%= item.getName() %><br>
						��Ű�� ���� : <%= item.getValue() %><br>
						<%
					}
				}
			}
		%>
	</body>
</html>