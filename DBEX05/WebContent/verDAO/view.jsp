<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<%
//�Ķ��Ÿ�� ��ȸ�� �޸��� ��ȣ�� �޾ƿ´�
String mNo = request.getParameter("no");
if( mNo == null || mNo.equals("") )
{	// �ùٸ��� ���� �����̸�, �ε����� ��������
	response.sendRedirect("index.jsp");
	return;
}
/* int no = 0;
try
{
	no = Integer.parseInt(mNo);
}catch(Exception e)
{
	e.printStackTrace();
	return;
} */

// dao�κ��� �޸��ȣ�� �޸� ��ü -> Read(�޸��ȣ)
// MemoVO vo = dao.Read( no );
MemoVO vo = dao.Read( mNo );
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>�޸� ���� ����</title>
	</head>
	<body>
		���� : <%= vo.getmTitle() %><br>
		���� : <%= vo.getmNote() %><br>
		�ۼ��� : <%= vo.getwDate() %><br>
		<a href="index.jsp"><button>�������</button></a>
		<a href="modify.jsp?no=<%= vo.getmNo() %>"><button>�����ϱ�</button></a>
		<a href="delete.jsp?no=<%= vo.getmNo() %>"><button>�޸����</button></a>
	</body>
</html>