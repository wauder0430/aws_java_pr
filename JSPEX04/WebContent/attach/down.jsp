<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.io.*" %>
<%
	// �Ķ��Ÿ��, �ٿ�ε��� �����̸���
	// ������ ���ϸ��� �޴´�
	request.setCharacterEncoding("EUC-KR");
	String UUID		 = request.getParameter("UUID");
	String fileName  = request.getParameter("fileName");
	// ������ ����Ǿ��ִ� ���
	String uploadpath = "C:\\Users\\PARK\\Desktop\\PARK\\JAVA\\JSPEX04\\WebContent\\upload";
	String fullPath = uploadpath + "\\" + UUID;
	
	// �����ϴ� ������ ���¸� ����
	response.setContentType("application/octet-stream; charset=euc-kr");
	// ������ ���� �̸����� ������ �ְ�, ���� ���ϸ��� ����
	response.setHeader("Content-Disposition","attachment; filename=" + fileName);
	
	// �ٿ�ε� ��ų rename�� ���� ����
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