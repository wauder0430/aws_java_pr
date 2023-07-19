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
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
					<section>
		<!-- section ���� header ���� ���� --------------------------------------------------------------------- -->
						<header>
						</header>
		<!-- section ���� header ���� ���� --------------------------------------------------------------------- -->
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
						<section>
							�̸� : <%= uName %><br>
							���̵� : <%= uID %><br>
							<%
							if( gender.equals("M") )
							{
								out.println("���� : ����<br>");
							}else if(gender.equals("F"))
							{	%>
								���� : ����<br>
						<%	}
							String str_hobby = "";
							switch(hobby)
							{
							case "1" : str_hobby = "��ȭ"; break;
							case "2" : str_hobby = "����"; break;
							case "3" : str_hobby = "����"; break;
							case "4" : str_hobby = "����"; break;
							case "5" : str_hobby = "����"; break;
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
							<a href="index.jsp" class="btn btn-primary btn-sm">�������</a>
							<a href="login.jsp" class="btn btn-success btn-sm">�α����ϱ�</a>
						</section>
		<!-- section ���� section ���� ���� -------------------------------------------------------------------- -->
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
						<footer>
						</footer>
		<!-- section ���� footer ���� ���� --------------------------------------------------------------------- -->
		<!-- section ���� ���� --------------------------------------------------------------------------------- -->
<%@ include file="./include/footer.jsp" %>