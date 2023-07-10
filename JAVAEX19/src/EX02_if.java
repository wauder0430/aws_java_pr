public class EX02_if
{
	public static void main(String[] args)
	{
		// 논리문 if-else switch-case
		// if-else if-else
		
		// if( 논리식 ){ 실행할 내용 }
		
		// 논리식 : 결과가 참, 거짓으로 나오는 연산
		// boolean : true, false, 1, 0
		
		boolean flag = true;
		if( flag ) { System.out.println("참입니다."); }
		
		// if( 논리식 ){ 논리식이 참일 경우 실행할 내용}else{ 논리식이 거짓일 경우 실행 }
		if( flag ) { System.out.println("참입니다."); }else { System.out.println("거짓입니다."); }
		
		// if( 논리식 ){ 내용 }else if( 논리식 ){ 내용 }else if( 논리식 ) ... }else{ 내용 }
		int age = 5;
		if( age < 19 )
		{	// age가 19미만일 경우에 실행할 내용
			System.out.println("청소년 요금입니다.");
			if( age > 30 ) {
				System.out.println("call 1");
				/* 실행 될 수 없음 */ }else { /* 언제나 실행됨  */ }
		}else if( age < 10 )
		{
			System.out.println("call 2");
			/* 실행 될 수 없음 */
		}else if( age > 65 )
		{
			System.out.println("우대 요금입니다.");
		}else
		{
			System.out.println("일반 요금입니다.");
		}
	
	}
}