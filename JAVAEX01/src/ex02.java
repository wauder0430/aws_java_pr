public class ex02
{
	public static void main(String[] args)
	{
		/*
		 * �⺻����, ����������
		 * �⺻�� ����
		 * ������
		 * �Ǽ���
		 * ������
		 * boolean
		 * ���ڿ� -> �⺻��ó�� ���Ǵ� ������
		 */
		int x = 10;	// �������� int(����)�� ������ x�� ����� �Ҵ�
		int y = 3;
		int z = x + y;
		System.out.println("1 + 2 = " + z);
		z = x / y;
		System.out.println(" x / y = " + z);
//		y = 0;
//		z = x / y;
//		System.out.println(" x / y = " + z);
		
		byte	b = 100;
		short	s = 30000;
		int		n = 2110000000;
		long	l = 100;
		char	c = 115;
		c = '#';
		System.out.println("byte : "	+ b );
		System.out.println("short : "	+ s );
		System.out.println("int : "		+ n );
		System.out.println("long : "	+ l );
		System.out.println("char : "	+ c );
		
		n = 0b1001; // ������
		System.out.println("int : "		+ n );
		
		n = 013; // 8����
		System.out.println("int : "		+ n );

		n = 13; // 10����
		System.out.println("int : "		+ n );
		
		n = 0xa1f2; // 16����
		System.out.println("int : "		+ n );
		
	}
}