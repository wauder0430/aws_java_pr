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
<!-- JSP의 표현식으로 파라메타 데이터 표시  -->
JSP 표현식으로 파라메타 데이터 표시<br> =========<br>
아이디 : <%= uID %><br>
비밀번호 : <%= uPW %><br>
이름 : <%= uName %><br>
성별 : <%= gender %><br>
취미 : <%= hobby %><br>
<%
	int i = 1;
	for(String item : favSkills){
		%>관심분야 : <%= item %> <br> <%  
		i++;
	}
%> 
<%-- <!-- EL -->
<br>JSP EL로 파라메타 데이터를 표시 <br> ========<br>
아이디 : ${param.uID}<br>
비밀번호 : ${param.uPW}<br>
이름 : ${param.uName}<br>
성별 : ${param.gender}<br>
취미 : ${param.hobby}<br>
관심분야 : ${paramValues.favskill[0]}<br>
관심분야 : ${paramValues.favskill[1]}<br>
관심분야 : ${paramValues.favskill[2]}<br>
관심분야 : ${paramValues.favskill[3]}<br>
관심분야 : ${paramValues.favskill[4]}<br>
관심분야 : ${paramValues.favskill[5]}<br> --%>
