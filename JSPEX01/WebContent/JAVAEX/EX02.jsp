<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// ���ǹ�
	int age = 16;
	String msg = "";
	
	if(age < 0){
		msg = "�߸��� �����Դϴ�.";
	} else if(age < 10 && age >= 0){
		msg = "�Ƶ��Դϴ�.";
	} else if(age <20){
		msg = "�̼����Դϴ�.";
	} else {
		msg = "�����Դϴ�.";
	}
	
	out.println(msg);
	
	int[] score = {50, 60, 90};
	// ������ ����� ���ϰ�  90�� �̻��̸� A
	// 80�� �̻��̸� B 70�� �̻��̸� C 70�� �̸��̸� ������� ���
	int sum = 0;
	double avg;
	
	for(int i=0; i<score.length; i++){
		sum += score[i];
	}
	avg = (double)sum/score.length;
	out.println("<br>");
	switch((int)avg/10){
		case 10 : 
			out.println("A�Դϴ�"); break;
		case 9 :
			out.println("A�Դϴ�"); break;
		case 8 :
			out.println("B�Դϴ�"); break;
		case 7 :
			out.println("C�Դϴ�"); break;
		default :
			out.println("�����"); break;
	}
	out.println("<br>��������� " + Math.round(avg*100)/100.0 + "���Դϴ�.");
%>


