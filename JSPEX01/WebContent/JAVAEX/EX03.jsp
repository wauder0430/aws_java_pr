<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 6��ü �ֻ����� �����
	// switch case�� ����ؼ� 
	// ������� �� ����ϼ���
	
	// �ڹ��� �⺻��ü, �⺻ ���̺귯���� ����� �� �ֽ��ϴ�.
	int dice = ((int)Math.random() *100) % 6 + 1;
	switch(dice){
		case 1: out.println("��"); break;
		case 2: out.println("��"); break;
		case 3: out.println("��"); break;
		case 4: out.println("��"); break;
		case 5: out.println("��"); break;
		case 6: out.println("��"); break;
		default: out.println("���� �߻�"); break;
	}

%>
