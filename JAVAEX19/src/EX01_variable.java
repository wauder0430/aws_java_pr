public class EX01_variable
{
	public static void main(String[] args)
	{
		// ������ Ÿ�� Ű����(����) ������ �̸�
		// �⺻�� ����
		// ������ / byte short int long / char ������ ���� ���� : ���� �ڵ�ǥ�� ��ȣ
		
		// ����  == -> �񱳿����� = -> ���Կ�����
		int int_num;
		// ���� �� ������ �ʱ�ȭ���� �ʾ�, ȣ���� �Ҽ� �����ϴ�.
//		System.out.println(int_num);
		
		// ������ ����� �ʱ�ȭ
		long long_num = 10l;
		
		// �ʱ�ȭ �Ǿ����� �ʴ� ������ ���� �Ҵ��ϴ� ������ ����� �� �ְ� �˴ϴ�.
		
		int_num = 10;	// �������� ���� ������ ������ �־��
		
		// ������ ����� ���� �ҷ��ö����� �����̸����� ȣ��
		System.out.println(int_num);
		
		// ������ �⺻�������� ����
		int x = 10;
		int y = 3;
		int z = 0;
		
		z = x + y;
		z = x - y;
		z = x * y;
		z = x / y;	// ������ ������ ������ ���� ���� ��ȯ��
		z = x % y;	// x�� y�� ���� �������� ��ȯ
		
		// ������ ���ڿ��� + ���� -> ������ ���ڿ��� ������ ��, �ٸ� ���ڿ��� �̾� ����
		System.out.println("x�� y�� ���� ����� " + ( x + y ) + "�Դϴ�.");
		System.out.println("x�� y�� ���� ����� " + x + y + "�Դϴ�.");
		
		// char ������ : ���ڴ� 1����, ''�� ���
		char c1 = 'A';
		char c2 = 'a';
		System.out.println(c1);
		System.out.println(c1 < c1);

		// �Ǽ���,
		// float double �ڹ��� �Ǽ��� ������ double�� �⺻���� �մϴ�.
		double	d_num = 1.123;
		float	f_num = 1.123f;
		// ���� true / false :
		// 0 = false 1�� ������ ������ �� true
		boolean flag;
		flag = true;
		System.out.println(flag);
	}
}
