public class EX04_while
{
	public static void main(String[] args)
	{
/*		�ݺ��� while / do while
		
		while( ���ǽ� / boolean ) / ���ǽ��� true�̸� �ݺ��� ��� �� 
		{
			���ǽ��� ���� '����' �ݺ��� ����
			// !!!!!! ���ǽ��� ��ȭ, ������� ������ �� ���� ���� �ؾ� �մϴ�
		}
		
		do
		{
			�ϴ� ����
		}while( ���ǽ� ); / ���ǽ��� true�� ��� ���� �ݺ���
*/
		// 1 - 100���� ���ڸ� '���'�ϴ� �ݺ���
		int number = 1;
		while( number <= 100 )
		{
			System.out.println("number : " + number);
//			number = number + 1;
			number += 1;
//			number++;
		}
		
		// �������� ��������
		// 1 - 100���� ���ڸ� ���ϴ� �ݺ���
		number = 1;
		int sum = 0;
		while( number <= 100 )
		{
			System.out.println("number : " + number );
			int result = 0;	// ��������
			result += number;	// ����
			sum += result;	// ���������� ����
			number++;
			System.out.println("result : " + result );
			System.out.println("sum : " + sum );
		}
		System.out.println("���� : " + sum );
		
		// while( flag )
		// �ֻ����� 6�̸� ���ߴ� �ݺ���
		boolean flag = true;
		while( flag )
		{
			int dice = (int)(Math.random()*100) % 6 + 1;
			System.out.println("�ֻ��� : " + dice);
			if( dice == 6 )
			{
				flag = false;
			}
		}
		// while ( true )
		// �ֻ����� 6�̸� ���ߴ� �ݺ���
		while( true )
		{
			int dice = (int)(Math.random()*100) % 6 + 1;
			System.out.println("�ֻ��� : " + dice);
			if( dice == 6 )
			{	// �ݺ����� �����ϴ� break;
				break;
			}
		}
		
		// ������ ������ �������� �ʰ�, ���� �ݺ����� �ǳʶٴ� continue
		number = 1;
		while( number <= 10 )
		{
			if( number % 2 == 0 )
			{
				number++;
				continue;
			}
			System.out.println("number : " + number);
			number++;
		}
		
		int count = 0;
		do
		{
			if( count == 0)
			{
				System.out.println("ù��° �����Դϴ�");
			}
			System.out.println("count : " + count);
			count++;
		}while( count < 10 );
	}
}