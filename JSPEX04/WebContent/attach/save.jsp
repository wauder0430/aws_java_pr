<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>

<%
	String uploadpath = "C:\\Users\\PARK\\Desktop\\PARK\\JAVA\\JSPEX04\\WebContent\\upload";
	int size = 10 * 1024 * 1024 ;	// 10MB
	
	MultipartRequest multi =
		new MultipartRequest(
				// form에서 데이터 형식은 multipart이지만, request 객체에 담겨서 넘어오기에
				// request 객체를 인자로 넣어서 MultipartRequest 객체로 변환해야 합니다
				request,
				uploadpath,		// 파일을 저장할 경로
				size,			// 파일의 최대 크기 설정
				"EUC-KR",		// form에서 넘어온 데이터의 인코딩
				new DefaultFileRenamePolicy()	// 파일 저장시, 파일명 변경에 대한 기본 정책
			);
	// multipart로 넘어온 파라메타를 받는다
	String title = multi.getParameter("title");
	// multipart로 파일이 넘어왔다면, 파일의 이름 목록을 받아온다
	Enumeration files = multi.getFileNames();
	
	if( files != null )
	{	// 파일 이름 목록이 존재함
		String fileID 	= (String)files.nextElement();
		String fileName = (String)multi.getFilesystemName("attach");
		if( fileName != null)
		{	// 새로운 파일명으로 사용할 문자열을 생성
			String newFileName = UUID.randomUUID().toString();
			// 원본 파일명과, 새로운 파일명을 경로와 함께 저장
			String orgName = uploadpath + "\\" + fileName;
			String newName = uploadpath + "\\" + newFileName;
			// File 객체형으로, 원본파일을 지정하고,
			// 새로운 이름을 갖는 File 객체를 생성한다
			File srcFile	= new File(orgName);
			File targetFile = new File(newName);
			// 원본 파일을 새로운 이름을 넣은 File 객체를 이용해서 rename한다
			srcFile.renameTo(targetFile);
			// 원본 파일명과 바뀐 파일명을 DB에 저장한다
			// 출력한다
			System.out.println( "원본 파일명 : " + orgName );
			System.out.println( "바뀐 파일명 : " + newName );
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>첨부파일 받기</title>
</head>
<body>
	<%= title %>
</body>
</html>