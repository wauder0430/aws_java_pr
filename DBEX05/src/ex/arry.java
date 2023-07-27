package ex;

import ezen.MemoVO;

public class arry
{
	public static void main(String[] args)
	{
		
		// 기본형 변수의 배열
		int[] int_arry = {1,2,3,4,5};
//		int[] int_num = new int[10];
//		System.out.println(int_num[3]);
		// 배열의 원소 접근 -> 인덱스를 통해
		int_arry[0] = 20;
		System.out.println( int_arry[0] );
		System.out.println( int_arry[1] );
		// 배열의 길이(원소의 갯수)
		System.out.println( int_arry.length );
		// 인덱스가 범위를 넘어가면 오류 발생
		try { System.out.println( int_arry[5] ); }catch( Exception e ) { e.printStackTrace(); }
		// 향상된 for으로 배열의 원소를 접근 할 수 있습니다
		for( int item : int_arry )
		{
			System.out.println(item);
		}
		System.out.println("-----------------------");
		
		// 참조형 변수의 배열
		String[] str_arry = {"a","b","c","d","e","f"};
		System.out.println(str_arry.length);
		// 갯수를 지정해서 배열 선언
		String[] str_arry1 = new String[5]; 
		
		// class로 선언한 객체의 배열도 만들 수 있습니다.
		MemoVO[] memo_arry = new MemoVO[5];
		memo_arry[0] = new MemoVO("1","1st","내용","2023-7-25");
		memo_arry[0].PrintInfo();
	}
}