<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	// 6면체 주사위를 만들고
	// switch case를 사용해서 
	// ①②③④⑤⑥ 을 출력하세요
	
	// 자바의 기본객체, 기본 라이브러리를 사용할 수 있습니다.
	int dice = ((int)Math.random() *100) % 6 + 1;
	switch(dice){
		case 1: out.println("①"); break;
		case 2: out.println("②"); break;
		case 3: out.println("③"); break;
		case 4: out.println("④"); break;
		case 5: out.println("⑤"); break;
		case 6: out.println("⑥"); break;
		default: out.println("에러 발생"); break;
	}

%>
