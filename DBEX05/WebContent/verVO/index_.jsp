<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="./include/head.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="EUC-KR">
		<title>JDBC-JSP ���� ����</title>
		<style>
			td {
				text-align : center;
			}
			.note {
				text-align : left;
			}
		</style>
	</head>
	<body>
		<!-- �޸� ��� �����ֱ� -->
		<table border="1" align="center" style="width: 600px">
			<tr>
				<td width="50px">��ȣ</td>
				<td>�޸� ����</td>
				<td width="100px">�ۼ� ����</td>
				<td width="100px" style="text-align:center;"><a href="write.jsp"><button>����</button></a></td>
			</tr>
			<!-- �޸� ������ ���� �ݺ��� ����                           -->
			<%
			// SQL ������ �ۼ��Ѵ�
			String sql = " select mNo, mTitle, wDate from memo ";
			db.OpenQuery(sql);
			while(db.GetNext() == true)
			{	// ����κ��� '�÷� �̸�'���� '�÷���'�� �ҷ��´�
				MemoVO vo = new MemoVO();
				vo.setmNo(db.GetValue("mNO"));
				vo.setmTitle(db.GetValue("mTitle"));
				vo.setwDate(db.GetValue("wDate").split(" ")[0]);
				// ������ ����غ���
				System.out.println("mNo : "		+ vo.getmNo()	);
				System.out.println("mTitle : "	+ vo.getmTitle());
				System.out.println("wDate : "	+ vo.getwDate()	);
			%>
				<tr>
					<td><%= vo.getmNo() %></td>
					<td class="note"> &nbsp;<%= vo.getmTitle() %></td>
					<td><%= vo.getwDate() %></td>
					<td>
						<a href="view.jsp?no=<%= vo.getmNo() %>"><button>����</button></a>
						<a href="modify.jsp?no=<%= vo.getmNo() %>"><button>����</button></a>
					</td>
				</tr> <%
			}
			db.CloseQuery();
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
<%@ include file="./include/tail.jsp" %>