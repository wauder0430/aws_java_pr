// �Է����� �Էµ� ���̵� ���̵� ��ϰ� �񱳸� �Ѵ�
const id_list = ["ezen", "admin", "test"];
let str = "Ȯ�ο�";
function idcheck()
{
	console.log(flag);
	// ���̵� �Է��� ��ü
	let uID = document.querySelector("#userID");
	// �޼��� ��� ���� ��ü
	let msg_area = document.querySelector(".msg_area");

	if( uID.value == "" )
	{	// id�Է����� �Է��� �Ǿ��ִ��� Ȯ���� �Ѵ�
		alert("���̵� �Է����ּ���");
		uID.focus();
		return;
	}

	if( id_list.includes(uID.value) )
	{	// �迭�� �Է°��� ����
		msg_area.innerHTML = "<span style='color:red;'>�ߺ��� ���̵��Դϴ�.</span>";
		uID.value = "";		// �ߺ��� ���̵�� ����
		uID.focus();		// ���̵� �Է������� Ŀ�� �̵�
		return;
	}
	msg_area.innerHTML = "<span>��밡���� ���̵��Դϴ�.</span>";
	check_flag=true;
	
}