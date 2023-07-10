public class EX06_for
{
	public static void main(String[] args)
	{
/*
 		for( 초기값 설정; 반복지속할 조건 ; 증감조건 )
 		{
 			반복할 내용
 			break;		// 이후의 내용을 실행하지 않고, 반복문을 종료
 			continue;	// 이후의 내용을 실행하지 않고, 다음 반복을 실행
 		}
*/		
//		for(;;)
//		{
//			System.out.println("for문이 실행됩니다");
//		}
		
		// 0부터 9까지 10번 반복하며 숫자를 출력하는 for
		for( int i = 0; i < 10; i++ )
		{
			System.out.println("i : " + i);
		}
		
		// 1-100까지 모든 수의 합계를 구하는 FOR
		System.out.println("------------------");
		int sum = 0;
		for( int i = 1; i <= 100; i++ )
		{
			System.out.println("i : " + i);
			sum += i;
			System.out.println("sum : " + sum);
		}
		System.out.println("총합 : " + sum);
		System.out.println("------------------");
		
		// continue, break를 활용하는 for
		for( int i = 0; i < 100; i++ )
		{
			if( i == 80) { break; }
			if( i % 3 != 0) { continue; }
			System.out.println("i : " + i);
		}
	}
}