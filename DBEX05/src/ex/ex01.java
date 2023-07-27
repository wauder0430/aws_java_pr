package ex;

public class ex01
{
	public static void main(String[] args)
	{	// 정수형 배열 { 90, 60, 70, 50 }
		// 총합계와 평균을 구하세요
		int[] list = { 90, 60, 70, 50 };
		int sum = 0;
		int avg = 0;
		for( int item : list )
		{
			sum += item;
		}
		avg = sum/list.length;
		System.out.println("총합계 : " + sum );
		System.out.println("평균 : " + avg );
	}
}