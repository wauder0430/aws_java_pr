public class ex08_if_else
{
	public static void main(String[] args)
	{
		// 정수형 x를 선언하고
		// 정수를 할당을 한 후
		// 짝수인지 홀수인지 판별하여
		// "짝수입니다" "홀수입니다"를 출력하세요
		int x;
		x = 10;
		if(x%2==0)
		{
			System.out.println("짝수입니다");
		}else
		{
			System.out.println("홀수입니다");
		}
		
		// 정수형 age 선언 후 정수 할당
		// age가 10 미만이면 "아동입니다"
		// 20 미만이면 "미성년자입니다"
		// 20 이상이면 "성인입니다"
		int age = 30;
		if( age < 10 )
		{
			System.out.println("아동입니다");
		}else if( age < 20 )
		{
			System.out.println("미성년입니다");
		}else
		{
			System.out.println("성인입니다");
		}
		
		// int형 score변수에 점수를 할당하고
		// 0 ~ 100 범위에서
		// score 90이상이면 A
		// 80이상 90미만이면 B
		// 70이상 80미만이면 C
		// 70미만이면 재수강
		// 조건식 + 논리식
		// &&
		int score = -10;
		if( score > 100)
		{
			System.out.println("ERROR");
		}else if( score >= 90 && score <= 100)
		{
			System.out.println("A");
		}else if( score >= 80 && score < 90 )
		{
			System.out.println("B");
		}else if( score >=70 && score < 80 )
		{
			System.out.println("C");
		}else if( score > 0 )
		{
			System.out.println("재수강");
		}else
		{
			System.out.println("ERROR");
		}
	}
}