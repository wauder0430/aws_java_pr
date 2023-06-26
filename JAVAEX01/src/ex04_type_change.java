public class ex04_type_change
{
	public static void main(String[] args)
	{
		//실수의 기본연산과 형변환
		//[0] 초기화
		double x;
		double y;
		double z;
		
		//[1] 입력
		
		x = 4;
		y = 3;
		z = x / y; //실수의 기본연산은 실수의 결과를 반환
		
		//[2] 출력
		System.out.println("z : " + z);
		
		//[3] 입력과 출력의 반복
		z = (int)(x/y); // 명시적 형변환 실수 -> 정수 						// 암묵적 형변환 정수 -> 실수
		System.out.println("z : " + z);
		
		z = (1.0/2.0) + (1.2/2.3);
		System.out.println("z : " + z);

		z = (int)(1.0/2.0) + (1.2/2.3);
		System.out.println("z : " + z);
		
		int a = 1;
		int b = 2;
		z = a/b + a/b;
		System.out.println("z : " + z);
		
		z = (double)(a/b) + (double)(a/b);
		System.out.println("z : " + z);
		
		z = a/(double)b + (double)a/(double)b;
		System.out.println("z : " + z);
		
	}
}