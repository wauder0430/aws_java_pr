public class ex01_String
{
	public static void main(String[] args)
	{
		// String 참조형변수 
		// 용례는 기본형과 거의 같음
		
		// msg 변수에 "hello, JAVA" 문자열 객체의 주소를 할당한다
		String msg = "hello, JAVA";
		System.out.println(msg);
		
		// 새로운 String객체를 생성하고, 내용은 "hello, JAVA"로 넣는다
		// str 변수에 새로 생성된 String객체의 주소를 할당한다
		String str = new String("hello, JAVA");
		System.out.println(str); 
		
		if( msg == str )
		{
			System.out.println("같음");
		}else
		{
			System.out.println("다름");
		}

		// String 객체에 저장된 문자열을 비교하는 equals메소드
		if( msg.equals(str) )
		{
			System.out.println("같음");
		}else
		{
			System.out.println("다름");
		}
		String str2 = null;
		System.out.println(str2);
		// 클라이언트로부터 넘어온 파라메타를
		// 서버에서 변수에 할당을 할때에
		// 파라메타가 안넘어오면 null이 할당됨
		// 파라메타의 값으로 "" 넘어오는 경우도 있음
		// 유효성 체크를 할때의 예시
//		if( str2 == null || str2 == "" )
		if( str2 == null || str2.equals("") )
		{
			// 예외처리를 진행
			str2 = "새로운 문자열";
			System.out.println(str2);
		}
	}
}