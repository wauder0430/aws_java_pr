public class ex11_for
{
	public static void main(String[] args)
	{
		// 1에서 10까지 출력하는 반복문을 작성하세요
/*		for( int i = 1; i <=10; i++)
		{
			// 출력
		}
		int i = 1;
		while( i <= 10 )
		{ 
			// 출력
			i++;
		}
		i = 1;
		do
		{
			// 출력
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
