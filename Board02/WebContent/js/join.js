let flag = false;

function DoSubmit()
{
	if( flag == true) { return; }
/*
	// js���� form ������ ��ü���� name���� ����
	console.log("form name : " + document.join.userID.value);
	// js�� querySelector() �Լ��� �̿�
	console.log("querySelector : " + document.querySelector("#userID").value);
	// js�� getElementById() �Լ��� �̿�
	console.log("getElementById : " + document.getElementById("userID").value);
	// jquery �̿�
	console.log("jquery : " + $("#userID").val());
*/
	// 1. ���̵� �ԷµǾ��°�
	let uID = document.querySelector("#userID");
	if( uID.value == "" )
	{
		alert("���̵� �Է��ϼ���");
		uID.focus();
		return false;
	}
	// 2. ����� �ԷµǾ��°�
	let uPW  = document.getElementById("userPW");
	let uPWC = $("#pwc"); 
	if( uPW.value == "" )
	{
		alert("��й�ȣ�� �Է��ϼ���");
		uPW.focus();
		return false;
	}
	// 2-1. ����� �ԷµǾ��ִٸ�, ���Ȯ���� �ԷµǾ��ִ°�
	if( uPWC.val() == "" )
	{
		alert("��й�ȣ Ȯ���� �Է��ϼ���");
		uPWC.focus();
		return false;
	}
	if( uPW.value != uPWC.val() )
	{
		alert("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
		uPW.value = "";
		uPWC.val("");
		uPW.focus();
	/* 					uPWC.focus(); */
		return false;
	}
	// 3. �̸��� �ԷµǾ��ִ°�
	let uName = $("#userName");
	if( uName.val() == "" )
	{
		alert("�̸��� �Է��ϼ���");
		uName.focus();
		return false;
	}
	console.log("�ʼ� �׸��� ��� �ԷµǾ����ϴ�");
	alert("�ʼ� �׸� �Է��� ��� Ȯ�εǾ����ϴ�.")

	// submit�� �����Ϸ��� �ϴ� form ��ü�� ã�Ƽ�
	// ��ü.submit();
	/* 				document.join.submit(); */
	/* 				document.querySelector("#join").submit(); */
	flag = true;
	$("#join").submit();
	// 4. ���̵� �ߺ�üũ�� �ߴ°� -> ���߿�
	// 5. �ڵ����Թ��� �ڵ带 �Է��ߴ°� ->
	return true;
}