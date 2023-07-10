public class EX04_while
{
	public static void main(String[] args)
	{
/*		반복문 while / do while
		
		while( 조건식 / boolean ) / 조건식이 true이면 반복을 계속 함 
		{
			조건식이 참일 '동안' 반복할 내용
			// !!!!!! 조건식의 변화, 변경등의 내용이 블럭 내에 존재 해야 합니다
		}
		
		do
		{
			일단 실행
		}while( 조건식 ); / 조건식이 true일 경우 블럭을 반복함
*/
		// 1 - 100까지 숫자를 '출력'하는 반복문
		int number = 1;
		while( number <= 100 )
		{
			System.out.println("number : " + number);
//			number = number + 1;
			number += 1;
//			number++;
		}
		
		// 전역변수 지역변수
		// 1 - 100까지 숫자를 더하는 반복문
		number = 1;
		int sum = 0;
		while( number <= 100 )
		{
			System.out.println("number : " + number );
			int result = 0;	// 지역변수
			result += number;	// 연산
			sum += result;	// 전역변수에 전달
			number++;
			System.out.println("result : " + result );
			System.out.println("sum : " + sum );
		}
		System.out.println("총합 : " + sum );
		
		// while( flag )
		// 주사위가 6이면 멈추는 반복문
		boolean flag = true;
		while( flag )
		{
			int dice = (int)(Math.random()*100) % 6 + 1;
			System.out.println("주사위 : " + dice);
			if( dice == 6 )
			{
				flag = false;
			}
		}
		// while ( true )
		// 주사위가 6이면 멈추는 반복문
		while( true )
		{
			int dice = (int)(Math.random()*100) % 6 + 1;
			System.out.println("주사위 : " + dice);
			if( dice == 6 )
			{	// 반복문을 종료하는 break;
				break;
			}
		}
		
		// 이후의 내용을 실행하지 않고, 다음 반복으로 건너뛰는 continue
		number = 1;
		while( number <= 10 )
		{
			if( number % 2 == 0 )
			{
				number++;
				continue;
			}
			System.out.println("number : " + number);
			number++;
		}
		
		int count = 0;
		do
		{
			if( count == 0)
			{
				System.out.println("첫번째 실행입니다");
			}
			System.out.println("count : " + count);
			count++;
		}while( count < 10 );
	}
}