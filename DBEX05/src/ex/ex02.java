package ex;

public class ex02
{
	public static void main(String[] args)
	{	// 참조형 변수의 배열 (data)타입의 원소를 4개
		// [0] : 홍길동 / 20
		// [1] : 전우치 / 30
		// [2] : 임꺽정 / 40
		// [3] : 성춘향 / 16
		// 나이의 평균을 구하세요
		
		data[] list = new data[4];
		list[0] = new data("홍길동",20);
		list[1] = new data("전우치",30);
		list[2] = new data("임꺽정",40);
		list[3] = new data("성춘향",16);
		int sum = 0;
		for( data item : list )
		{
			sum += item.age;
		}
		System.out.println("평균나이 : " + sum/list.length );
	}
}