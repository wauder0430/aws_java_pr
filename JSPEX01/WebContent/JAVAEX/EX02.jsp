<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 조건문
	int age = 16;
	String msg = "";
	
	if(age < 0){
		msg = "잘못된 나이입니다.";
	} else if(age < 10 && age >= 0){
		msg = "아동입니다.";
	} else if(age <20){
		msg = "미성년입니다.";
	} else {
		msg = "성인입니다.";
	}
	
	out.println(msg);
	
	int[] score = {50, 60, 90};
	// 정수의 평균을 구하고  90점 이상이면 A
	// 80점 이상이면 B 70점 이상이면 C 70점 미만이면 재수강을 출력
	int sum = 0;
	double avg;
	
	for(int i=0; i<score.length; i++){
		sum += score[i];
	}
	avg = (double)sum/score.length;
	out.println("<br>");
	switch((int)avg/10){
		case 10 : 
			out.println("A입니다"); break;
		case 9 :
			out.println("A입니다"); break;
		case 8 :
			out.println("B입니다"); break;
		case 7 :
			out.println("C입니다"); break;
		default :
			out.println("재수강"); break;
	}
	out.println("<br>평균점수는 " + Math.round(avg*100)/100.0 + "점입니다.");
%>


