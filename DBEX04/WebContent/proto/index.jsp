<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<%
/*	DB���� / �޸� ��ȸ / ���/�迭/����Ʈ */
	// JDBC ����̹��� �ε��Ѵ�
	Class.forName("com.mysql.cj.jdbc.Driver");

	// DBMS�� �����ϱ� ����, ������ �Ѵ�
	String host = "";
	host += "jdbc:mysql://127.0.0.1:3306/ezen";	//�ּ�/��Ʈ/DB�̸�
	host += "?useUnicode=true";					// �����ڵ�
	host += "&characterEncoding=utf-8";			// ���ڵ�
	host += "&serverTimezone=UTC";				// �����ð���
	String userID = "root";						// ����� ����
	String userPW = "ezen";						// ����� ���
	
	// DBMS�� �����Ѵ�
	Connection conn = DriverManager.getConnection(host, userID, userPW);
	
	// �۾� ó���� Ŭ���� ��ü�� �Ҵ�޴´�
	Statement stmt = conn.createStatement();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>JDBC-JSP ���� ����</title>
	</head>
	<body>
		<!-- �޸� ��� �����ֱ� -->
		<table border="1" align="center" style="width: 700px">
			<tr>
				<td>�޸� ��ȣ</td>
				<td>�޸� ����</td>
				<td>�ۼ� ����</td>
				<td><a href="write.jsp"><button>����</button></a></td>
			</tr>
			<!-- �޸� ������ ���� �ݺ��� ����                           -->
			<%
			// SQL ������ �ۼ��Ѵ�
			String sql = " select mNo, mTitle, wDate from memo ";
			ResultSet result = stmt.executeQuery(sql);
			while(result.next() == true)
			{	// ����κ��� '�÷� �̸�'���� '�÷���'�� �ҷ��´�
				String mNo	  = result.getString("mNO");
				String mTitle  = result.getString("mTitle");
				String wDate  = result.getString("wDate");
				// ������ ����غ���
				System.out.println("mNo : "		+ mNo	);
				System.out.println("mTitle : "	+ mTitle	);
				System.out.println("wDate : "	+ wDate	);
			%>
				<tr>
					<td><%= mNo %></td>
					<td><%= mTitle %></td>
					<td><%= wDate %></td>
					<td>
						<a href="view.jsp?no=<%= mNo %>"><button>����</button></a>
						<a href="modify.jsp?no=<%= mNo %>"><button>����</button></a>
					</td>
				</tr> <%
			}
			%>
<!-- 			<tr>
				<td>2��</td>
				<td>2023. 7. 24</td>
				<td><a href="view.jsp?no=5"><button>����</button></a></td>
			</tr>
			<tr>
				<td>3��</td>
				<td>2023. 7. 24</td>
				<td><a href="view.jsp?no=6"><button>����</button></a></td>
			</tr>
			<tr>
				<td>4��</td>
				<td>2023. 7. 24</td>
				<td><a href="view.jsp?no=7"><button>����</button></a></td>
			</tr>
			<tr>
				<td>5��</td>
				<td>2023. 7. 24</td>
				<td><a href="view.jsp?no=8"><button>����</button></a></td>
			</tr> -->
			<!--                                                        -->
		</table>
	</body>
</html>