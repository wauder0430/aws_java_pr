public class EX02_if
{
	public static void main(String[] args)
	{
		// ���� if-else switch-case
		// if-else if-else
		
		// if( ���� ){ ������ ���� }
		
		// ���� : ����� ��, �������� ������ ����
		// boolean : true, false, 1, 0
		
		boolean flag = true;
		if( flag ) { System.out.println("���Դϴ�."); }
		
		// if( ���� ){ ������ ���� ��� ������ ����}else{ ������ ������ ��� ���� }
		if( flag ) { System.out.println("���Դϴ�."); }else { System.out.println("�����Դϴ�."); }
		
		// if( ���� ){ ���� }else if( ���� ){ ���� }else if( ���� ) ... }else{ ���� }
		int age = 5;
		if( age < 19 )
		{	// age�� 19�̸��� ��쿡 ������ ����
			System.out.println("û�ҳ� ����Դϴ�.");
			if( age > 30 ) {
				System.out.println("call 1");
				/* ���� �� �� ���� */ }else { /* ������ �����  */ }
		}else if( age < 10 )
		{
			System.out.println("call 2");
			/* ���� �� �� ���� */
		}else if( age > 65 )
		{
			System.out.println("��� ����Դϴ�.");
		}else
		{
			System.out.println("�Ϲ� ����Դϴ�.");
		}
	
	}
}