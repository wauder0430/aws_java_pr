public class ex07_oper_logic 
{
	public static void main(String[] args)
	{
		// �񱳿�����
		// �º� < �캯 -> true false
		// < > <= >=
		// �������� && ||
		// �º� && �캯 -> ������ T�϶��� T
		// �º� || ��� -> ���� �ϳ��� T�̸� T
		
		System.out.println( 1 < 2 );
		int i = 10;
		System.out.println( i < 2 );
		
		int age = 15;
		System.out.println( age >= 10 && age < 20);
		System.out.println( age >= 10 && age <= 20);
		
		// ����
		if( age >= 10 && age < 20 )
		{
			System.out.println("û�ҳ��Դϴ�");
		}
		if( age >= 20 && age < 30 )
		{
			System.out.println("20���Դϴ�.");
		}else if( age >=30 && age < 40 )
		{
			System.out.println("30���Դϴ�.");
		}
		// if(���ǽ�){ ���ǽ��� ���ϰ�� }
		// else{ ���ǽ��� ������ ��� }
		// else if(���ǽ�){}else{}
	}
}