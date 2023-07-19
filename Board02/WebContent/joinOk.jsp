<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%@ include file="./include/header.jsp" %>
<%@ include file="./include/nav.jsp" %>
<%
	request.setCharacterEncoding("EUC-KR");
	String uName  = request.getParameter("userName");
	String uID    = request.getParameter("userID");
	String uPW    = request.getParameter("userPW");
	String gender = request.getParameter("gender");
	String hobby  = request.getParameter("hobby");
	String favSkill[] = request.getParameterValues("favSkill");
	if( uID == null || uID.equals("") || uName == null || uName.equals("") )
	{
		response.sendRedirect("join.jsp");
		return;
	}
%>
		<!-- section 영역 시작 --------------------------------------------------------------------------------- -->
					<section>
		<!-- section 내부 header 영역 시작 --------------------------------------------------------------------- -->
						<header>
						</header>
		<!-- section 내부 header 영역 종료 --------------------------------------------------------------------- -->
		<!-- section 내부 section 영역 시작 -------------------------------------------------------------------- -->
						<section>
							이름 : <%= uName %><br>
							아이디 : <%= uID %><br>
							<%
							if( gender.equals("M") )
							{
								out.println("성별 : 남성<br>");
							}else if(gender.equals("F"))
							{	%>
								성별 : 여성<br>
						<%	}
							String str_hobby = "";
							switch(hobby)
							{
							case "1" : str_hobby = "영화"; break;
							case "2" : str_hobby = "여행"; break;
							case "3" : str_hobby = "음악"; break;
							case "4" : str_hobby = "독서"; break;
							case "5" : str_hobby = "게임"; break;
							}
							%>
							<%= str_hobby %><br>
							
							<%
							for( String item : favSkill )
							{
								switch(item)
								{
								case "1" : out.println("C++"); break;
								case "2" : out.println("JAVA"); break;
								case "3" : out.println("HTML"); break;
								case "4" : out.println("JS"); break;
								case "5" : out.println("DB"); break;
								}
							}
							%>
							
							<br>
							<a href="index.jsp" class="btn btn-primary btn-sm">목록으로</a>
							<a href="login.jsp" class="btn btn-success btn-sm">로그인하기</a>
						</section>
		<!-- section 내부 section 영역 종료 -------------------------------------------------------------------- -->
		<!-- section 내부 footer 영역 시작 --------------------------------------------------------------------- -->
						<footer>
						</footer>
		<!-- section 내부 footer 영역 종료 --------------------------------------------------------------------- -->
		<!-- section 영역 종료 --------------------------------------------------------------------------------- -->
<%@ include file="./include/footer.jsp" %>