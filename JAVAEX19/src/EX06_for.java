public class EX06_for
{
	public static void main(String[] args)
	{
/*
 		for( �ʱⰪ ����; �ݺ������� ���� ; �������� )
 		{
 			�ݺ��� ����
 			break;		// ������ ������ �������� �ʰ�, �ݺ����� ����
 			continue;	// ������ ������ �������� �ʰ�, ���� �ݺ��� ����
 		}
*/		
//		for(;;)
//		{
//			System.out.println("for���� ����˴ϴ�");
//		}
		
		// 0���� 9���� 10�� �ݺ��ϸ� ���ڸ� ����ϴ� for
		for( int i = 0; i < 10; i++ )
		{
			System.out.println("i : " + i);
		}
		
		// 1-100���� ��� ���� �հ踦 ���ϴ� FOR
		System.out.println("------------------");
		int sum = 0;
		for( int i = 1; i <= 100; i++ )
		{
			System.out.println("i : " + i);
			sum += i;
			System.out.println("sum : " + sum);
		}
		System.out.println("���� : " + sum);
		System.out.println("------------------");
		
		// continue, break�� Ȱ���ϴ� for
		for( int i = 0; i < 100; i++ )
		{
			if( i == 80) { break; }
			if( i % 3 != 0) { continue; }
			System.out.println("i : " + i);
		}
	}
}