<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC-KR");
	String uID = request.getParameter("uID");
	String uPW = request.getParameter("uPW");
	String uName = request.getParameter("uName");
	String gender = request.getParameter("gender");
	String hobby = request.getParameter("hobby");
	String[] favSkills = request.getParameterValues("favSkill"); 
%>
<!-- JSP�� ǥ�������� �Ķ��Ÿ ������ ǥ��  -->
JSP ǥ�������� �Ķ��Ÿ ������ ǥ��<br> =========<br>
���̵� : <%= uID %><br>
��й�ȣ : <%= uPW %><br>
�̸� : <%= uName %><br>
���� : <%= gender %><br>
��� : <%= hobby %><br>
<%
	int i = 1;
	for(String item : favSkills){
		%>���ɺо� : <%= item %> <br> <%  
		i++;
	}
%> 
<%-- <!-- EL -->
<br>JSP EL�� �Ķ��Ÿ �����͸� ǥ�� <br> ========<br>
���̵� : ${param.uID}<br>
��й�ȣ : ${param.uPW}<br>
�̸� : ${param.uName}<br>
���� : ${param.gender}<br>
��� : ${param.hobby}<br>
���ɺо� : ${paramValues.favskill[0]}<br>
���ɺо� : ${paramValues.favskill[1]}<br>
���ɺо� : ${paramValues.favskill[2]}<br>
���ɺо� : ${paramValues.favskill[3]}<br>
���ɺо� : ${paramValues.favskill[4]}<br>
���ɺо� : ${paramValues.favskill[5]}<br> --%>
