package ex;

public class ex01
{
	public static void main(String[] args)
	{	// ������ �迭 { 90, 60, 70, 50 }
		// ���հ�� ����� ���ϼ���
		int[] list = { 90, 60, 70, 50 };
		int sum = 0;
		int avg = 0;
		for( int item : list )
		{
			sum += item;
		}
		avg = sum/list.length;
		System.out.println("���հ� : " + sum );
		System.out.println("��� : " + avg );
	}
}