public class EX01_variable
{
	public static void main(String[] args)
	{
		// 변수의 타입 키워드(선언) 변수의 이름
		// 기본형 변수
		// 정수형 / byte short int long / char 저장은 양의 정수 : 문자 코드표의 번호
		
		// 선언  == -> 비교연산자 = -> 대입연산자
		int int_num;
		// 선언만 한 변수는 초기화되지 않아, 호출을 할수 없습니다.
//		System.out.println(int_num);
		
		// 변수의 선언과 초기화
		long long_num = 10l;
		
		// 초기화 되어있지 않는 변수는 값을 할당하는 것으로 사용할 수 있게 됩니다.
		
		int_num = 10;	// 오른쪽의 값을 왼쪽의 변수에 넣어라
		
		// 변수에 저장된 값을 불러올때에는 변수이름으로 호출
		System.out.println(int_num);
		
		// 변수와 기본연산자의 연산
		int x = 10;
		int y = 3;
		int z = 0;
		
		z = x + y;
		z = x - y;
		z = x * y;
		z = x / y;	// 정수의 나누기 연산은 나눈 몫을 반환함
		z = x % y;	// x를 y로 나눈 나머지를 반환
		
		// 정수와 문자열의 + 연산 -> 정수를 문자열로 변경한 후, 다른 문자열과 이어 붙임
		System.out.println("x와 y를 더한 결과는 " + ( x + y ) + "입니다.");
		System.out.println("x와 y를 더한 결과는 " + x + y + "입니다.");
		
		// char 문자형 : 문자는 1글자, ''를 사용
		char c1 = 'A';
		char c2 = 'a';
		System.out.println(c1);
		System.out.println(c1 < c1);

		// 실수형,
		// float double 자바의 실수형 변수는 double을 기본으로 합니다.
		double	d_num = 1.123;
		float	f_num = 1.123f;
		// 논리형 true / false :
		// 0 = false 1을 포함한 나머지 값 true
		boolean flag;
		flag = true;
		System.out.println(flag);
	}
}
