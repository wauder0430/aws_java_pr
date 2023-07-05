// 입력폼에 입력된 아이디를 아이디 목록과 비교를 한다
const id_list = ["ezen", "admin", "test"];

function idcheck()
{
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
//	for( let index in id_list )
//	{	// 입력된 id와 배열에 있는 문자열들을 비교한다
//		console.log(id_list[index]);
//		if( id_list[index] == uID.value )
//		{
//			msg_area.innerHTML = "<span style='color:red;'>중복된 아이디입니다.</span>";
//			return;
//		}
//	}
	for( let item of id_list )
	{	// 입력된 id와 배열에 있는 문자열들을 비교한다
		console.log(item);
		if( item == uID.value )
		{
			msg_area.innerHTML = "<span style='color:red;'>중복된 아이디입니다.</span>";
			return;
		}
	}
	msg_area.innerHTML = "<span>사용가능한 아이디입니다.</span>";
	
	//배열은 배열 내부에 찾고자 하는 문자열이 있는지 확인하는 함수(메소드)를 제공
}