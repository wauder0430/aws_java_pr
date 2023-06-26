public class ex02
{
	public static void main(String[] args)
	{
		/*
		 * 기본변수, 참조형변수
		 * 기본형 변수
		 * 정수형
		 * 실수형
		 * 문자형
		 * boolean
		 * 문자열 -> 기본형처럼 사용되는 참조형
		 */
		int x = 10;	// 변수형은 int(정수)인 변수명 x의 선언과 할당
		int y = 3;
		int z = x + y;
		System.out.println("1 + 2 = " + z);
		z = x / y;
		System.out.println(" x / y = " + z);
//		y = 0;
//		z = x / y;
//		System.out.println(" x / y = " + z);
		
		byte	b = 100;
		short	s = 30000;
		int		n = 2110000000;
		long	l = 100;
		char	c = 115;
		c = '#';
		System.out.println("byte : "	+ b );
		System.out.println("short : "	+ s );
		System.out.println("int : "		+ n );
		System.out.println("long : "	+ l );
		System.out.println("char : "	+ c );
		
		n = 0b1001; // 이진수
		System.out.println("int : "		+ n );
		
		n = 013; // 8진수
		System.out.println("int : "		+ n );

		n = 13; // 10진수
		System.out.println("int : "		+ n );
		
		n = 0xa1f2; // 16진수
		System.out.println("int : "		+ n );
		
	}
}