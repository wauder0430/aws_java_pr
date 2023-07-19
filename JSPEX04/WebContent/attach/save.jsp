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
				// form���� ������ ������ multipart������, request ��ü�� ��ܼ� �Ѿ���⿡
				// request ��ü�� ���ڷ� �־ MultipartRequest ��ü�� ��ȯ�ؾ� �մϴ�
				request,
				uploadpath,		// ������ ������ ���
				size,			// ������ �ִ� ũ�� ����
				"EUC-KR",		// form���� �Ѿ�� �������� ���ڵ�
				new DefaultFileRenamePolicy()	// ���� �����, ���ϸ� ���濡 ���� �⺻ ��å
			);
	// multipart�� �Ѿ�� �Ķ��Ÿ�� �޴´�
	String title = multi.getParameter("title");
	// multipart�� ������ �Ѿ�Դٸ�, ������ �̸� ����� �޾ƿ´�
	Enumeration files = multi.getFileNames();
	
	if( files != null )
	{	// ���� �̸� ����� ������
		String fileID 	= (String)files.nextElement();
		String fileName = (String)multi.getFilesystemName("attach");
		if( fileName != null)
		{	// ���ο� ���ϸ����� ����� ���ڿ��� ����
			String newFileName = UUID.randomUUID().toString();
			// ���� ���ϸ��, ���ο� ���ϸ��� ��ο� �Բ� ����
			String orgName = uploadpath + "\\" + fileName;
			String newName = uploadpath + "\\" + newFileName;
			// File ��ü������, ���������� �����ϰ�,
			// ���ο� �̸��� ���� File ��ü�� �����Ѵ�
			File srcFile	= new File(orgName);
			File targetFile = new File(newName);
			// ���� ������ ���ο� �̸��� ���� File ��ü�� �̿��ؼ� rename�Ѵ�
			srcFile.renameTo(targetFile);
			// ���� ���ϸ�� �ٲ� ���ϸ��� DB�� �����Ѵ�
			// ����Ѵ�
			System.out.println( "���� ���ϸ� : " + orgName );
			System.out.println( "�ٲ� ���ϸ� : " + newName );
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>÷������ �ޱ�</title>
</head>
<body>
	<%= title %>
</body>
</html>