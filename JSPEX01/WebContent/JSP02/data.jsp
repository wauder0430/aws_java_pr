<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%	
	// 파라메타로 넘어온 데이터를 저장할 변수 선언
	// 파라메타로 넘어온 데이터를 받는 메소드 getParameter()는
	// String을 반환하기에, 변수는 String 선언
	// 파라메터로 넘어오는 데이터가 post 방식일 경우이고 , 한글을 보내는 경우에는
	// 인코딩을 지정해줘야 됨
	request.setCharacterEncoding("EUC-KR");
	String text = request.getParameter("string");
	String number = request.getParameter("number");
	String date = request.getParameter("date");
	
	// 예외 처리
	// 파라메타로 데이터가 넘어오지 않았을 경우, 변수 값을 초기화 해준다.
	// 직접적으로 data.jsp의 접근을 막기 위함
	if(text == null || number == null || date == null){
		// 파라메터가 없이 data.jsp를 접속했을 경우, 
		// index.jsp로 이동시킴
		response.sendRedirect("index.jsp");
	}
	
	/* if(text == null){ text = ""; }
	if(number == null){ number = ""; }
	if(date == null){ date = ""; } */
	
	// 콘솔에 파라메타로 넘어온 값을 출력해본다.
	System.out.println("text : " + text);
	System.out.println("number : " + number);
	System.out.println("date : " + date);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>파라메터 데이터 받기</title>
</head>
<body>
	text : <%= text %><br>
	number : <%= number %><br>
	date : <%= date %><br>
</body>
</html>