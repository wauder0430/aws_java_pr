<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.io.*" %>
<%
	// 파라메타로, 다운로드할 파일이름과
	// 원래의 파일명을 받는다
	request.setCharacterEncoding("EUC-KR");
	String UUID		 = request.getParameter("UUID");
	String fileName  = request.getParameter("fileName");
	// 파일이 저장되어있는 경로
	String uploadpath = "C:\\Users\\PARK\\Desktop\\PARK\\JAVA\\JSPEX04\\WebContent\\upload";
	String fullPath = uploadpath + "\\" + UUID;
	
	// 응답하는 내용의 형태를 선언
	response.setContentType("application/octet-stream; charset=euc-kr");
	// 파일의 원래 이름으로 받을수 있게, 원본 파일명을 셋팅
	response.setHeader("Content-Disposition","attachment; filename=" + fileName);
	
	// 다운로드 시킬 rename된 원본 파일
	File file = new File(fullPath);
	FileInputStream fileIn = new FileInputStream(file);
	ServletOutputStream ostream = response.getOutputStream();
	byte[] outputByte = new byte[4096];
	while( fileIn.read(outputByte, 0, 4096 ) != -1 )
	{
		ostream.write(outputByte, 0, 4096);
	}
	fileIn.close();
	ostream.flush();
	ostream.close();
%>