let flag = false;

function DoSubmit()
{
	if( flag == true) { return; }
/*
	// js에서 form 영역의 객체들의 name으로 접근
	console.log("form name : " + document.join.userID.value);
	// js의 querySelector() 함수를 이용
	console.log("querySelector : " + document.querySelector("#userID").value);
	// js의 getElementById() 함수를 이용
	console.log("getElementById : " + document.getElementById("userID").value);
	// jquery 이용
	console.log("jquery : " + $("#userID").val());
*/
	// 1. 아이디가 입력되었는가
	let uID = document.querySelector("#userID");
	if( uID.value == "" )
	{
		alert("아이디를 입력하세요");
		uID.focus();
		return false;
	}
	// 2. 비번이 입력되었는가
	let uPW  = document.getElementById("userPW");
	let uPWC = $("#pwc"); 
	if( uPW.value == "" )
	{
		alert("비밀번호를 입력하세요");
		uPW.focus();
		return false;
	}
	// 2-1. 비번이 입력되어있다면, 비번확인이 입력되어있는가
	if( uPWC.val() == "" )
	{
		alert("비밀번호 확인을 입력하세요");
		uPWC.focus();
		return false;
	}
	if( uPW.value != uPWC.val() )
	{
		alert("비밀번호가 일치하지 않습니다");
		uPW.value = "";
		uPWC.val("");
		uPW.focus();
	/* 					uPWC.focus(); */
		return false;
	}
	// 3. 이름이 입력되어있는가
	let uName = $("#userName");
	if( uName.val() == "" )
	{
		alert("이름을 입력하세요");
		uName.focus();
		return false;
	}
	console.log("필수 항목은 모두 입력되었습니다");
	alert("필수 항목 입력이 모두 확인되었습니다.")

	// submit를 시행하려고 하는 form 객체를 찾아서
	// 객체.submit();
	/* 				document.join.submit(); */
	/* 				document.querySelector("#join").submit(); */
	flag = true;
	$("#join").submit();
	// 4. 아이디 중복체크를 했는가 -> 나중에
	// 5. 자동가입방지 코드를 입력했는가 ->
	return true;
}