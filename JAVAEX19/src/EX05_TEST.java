public class EX05_TEST
{
	public static void main(String[] args)
	{
		// 1.  1 - 100���� 100�� �ݺ��� �ϸ鼭
		// 3�� ����϶��� ����ϴ� while���� �ۼ��ϼ���
		
		int index = 1;
		
		while( index <= 100 )
		{
//			System.out.println(index);
			if( index % 3 == 0 )
			{
				System.out.println(index);
//				System.out.println("3�� ����Դϴ�.");
			}
			index++;
		}
		
		System.out.println("------------------------");
		
		// 2. while�������� 1 - 100���� �ݺ��� �ϴµ�, 3�� �����ϸ� ���ڸ� ����ϼ���
		index = 1;
		while( index <= 100 )
		{
			System.out.println(index);
			index += 3;
		}
	}
}