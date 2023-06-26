public class ex07_oper_logic 
{
	public static void main(String[] args)
	{
		// 비교연산자
		// 좌변 < 우변 -> true false
		// < > <= >=
		// 논리연산자 && ||
		// 좌변 && 우변 -> 양측이 T일때만 T
		// 좌변 || 우번 -> 둘중 하나라도 T이면 T
		
		System.out.println( 1 < 2 );
		int i = 10;
		System.out.println( i < 2 );
		
		int age = 15;
		System.out.println( age >= 10 && age < 20);
		System.out.println( age >= 10 && age <= 20);
		
		// 논리문
		if( age >= 10 && age < 20 )
		{
			System.out.println("청소년입니다");
		}
		if( age >= 20 && age < 30 )
		{
			System.out.println("20대입니다.");
		}else if( age >=30 && age < 40 )
		{
			System.out.println("30대입니다.");
		}
		// if(조건식){ 조건식이 참일경우 }
		// else{ 조건식이 거짓일 경우 }
		// else if(조건식){}else{}
	}
}