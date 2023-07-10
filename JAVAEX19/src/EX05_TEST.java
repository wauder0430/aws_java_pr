public class EX05_TEST
{
	public static void main(String[] args)
	{
		// 1.  1 - 100까지 100번 반복을 하면서
		// 3의 배수일때만 출력하는 while문을 작성하세요
		
		int index = 1;
		
		while( index <= 100 )
		{
//			System.out.println(index);
			if( index % 3 == 0 )
			{
				System.out.println(index);
//				System.out.println("3의 배수입니다.");
			}
			index++;
		}
		
		System.out.println("------------------------");
		
		// 2. while구문으로 1 - 100까지 반복을 하는데, 3씩 증가하며 숫자를 출력하세요
		index = 1;
		while( index <= 100 )
		{
			System.out.println(index);
			index += 3;
		}
	}
}