<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String str = "1,000";
	int result = 0;
	try{
		// 시도할 작업
		result = Integer.parseInt(str);
	}catch(Exception e){
		// 오류가 났을 때 할 작업
		System.out.println(e);
		System.out.println(",나 _를 제거합니다.");
		str = str.replace(",", "");
		str = str.replace("_", "");
		result = Integer.parseInt(str);
	}finally{
		// 시도한 작업 or 오류시 작업이 모두 완료되었을 때에 실행
		System.out.println("모든 작업이 완료되었습니다.");
		out.println(result);
	}
%>