package ex;

import ezen.MemoVO;

public class arry
{
	public static void main(String[] args)
	{
		
		// �⺻�� ������ �迭
		int[] int_arry = {1,2,3,4,5};
//		int[] int_num = new int[10];
//		System.out.println(int_num[3]);
		// �迭�� ���� ���� -> �ε����� ����
		int_arry[0] = 20;
		System.out.println( int_arry[0] );
		System.out.println( int_arry[1] );
		// �迭�� ����(������ ����)
		System.out.println( int_arry.length );
		// �ε����� ������ �Ѿ�� ���� �߻�
		try { System.out.println( int_arry[5] ); }catch( Exception e ) { e.printStackTrace(); }
		// ���� for���� �迭�� ���Ҹ� ���� �� �� �ֽ��ϴ�
		for( int item : int_arry )
		{
			System.out.println(item);
		}
		System.out.println("-----------------------");
		
		// ������ ������ �迭
		String[] str_arry = {"a","b","c","d","e","f"};
		System.out.println(str_arry.length);
		// ������ �����ؼ� �迭 ����
		String[] str_arry1 = new String[5]; 
		
		// class�� ������ ��ü�� �迭�� ���� �� �ֽ��ϴ�.
		MemoVO[] memo_arry = new MemoVO[5];
		memo_arry[0] = new MemoVO("1","1st","����","2023-7-25");
		memo_arry[0].PrintInfo();
	}
}