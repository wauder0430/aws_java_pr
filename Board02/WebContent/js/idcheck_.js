// �Է����� �Էµ� ���̵� ���̵� ��ϰ� �񱳸� �Ѵ�
const id_list = ["ezen", "admin", "test"];

function idcheck()
{
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
//	for( let index in id_list )
//	{	// �Էµ� id�� �迭�� �ִ� ���ڿ����� ���Ѵ�
//		console.log(id_list[index]);
//		if( id_list[index] == uID.value )
//		{
//			msg_area.innerHTML = "<span style='color:red;'>�ߺ��� ���̵��Դϴ�.</span>";
//			return;
//		}
//	}
	for( let item of id_list )
	{	// �Էµ� id�� �迭�� �ִ� ���ڿ����� ���Ѵ�
		console.log(item);
		if( item == uID.value )
		{
			msg_area.innerHTML = "<span style='color:red;'>�ߺ��� ���̵��Դϴ�.</span>";
			return;
		}
	}
	msg_area.innerHTML = "<span>��밡���� ���̵��Դϴ�.</span>";
	
	//�迭�� �迭 ���ο� ã���� �ϴ� ���ڿ��� �ִ��� Ȯ���ϴ� �Լ�(�޼ҵ�)�� ����
}