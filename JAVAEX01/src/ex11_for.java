public class ex11_for
{
	public static void main(String[] args)
	{
		// 1���� 10���� ����ϴ� �ݺ����� �ۼ��ϼ���
/*		for( int i = 1; i <=10; i++)
		{
			// ���
		}
		int i = 1;
		while( i <= 10 )
		{ 
			// ���
			i++;
		}
		i = 1;
		do
		{
			// ���
			i++;
		}while( i <= 10) */
		int i = 1;
		while( i <= 10 )
		{
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("---------------------------");
		
		i = 1;
		do
		{
			System.out.println("i = " + i);
			i++;
		}while( i <= 10 );
		
		System.out.println("---------------------------");
		for(int j = 1; j <= 10; j++)
		{
			System.out.println("j = " + j);
		}
	}
}
