// 입력폼에 입력된 아이디를 아이디 목록과 비교를 한다
const id_list = ["ezen", "admin", "test"];
let str = "확인용";
function idcheck()
{
	console.log(flag);
	// 아이디 입력폼 객체
	let uID = document.querySelector("#userID");
	// 메세지 출력 영역 객체
	let msg_area = document.querySelector(".msg_area");

	if( uID.value == "" )
	{	// id입력폼에 입력이 되어있는지 확인을 한다
		alert("아이디를 입력해주세요");
		uID.focus();
		return;
	}

	if( id_list.includes(uID.value) )
	{	// 배열에 입력값이 있음
		msg_area.innerHTML = "<span style='color:red;'>중복된 아이디입니다.</span>";
		uID.value = "";		// 중복된 아이디는 삭제
		uID.focus();		// 아이디 입력폼으로 커서 이동
		return;
	}
	msg_area.innerHTML = "<span>사용가능한 아이디입니다.</span>";
	check_flag=true;
	
}