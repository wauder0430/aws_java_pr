<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	session.removeAttribute("loginUser");
	response.sendRedirect("index.jsp");
%>