public class ex04_type_change
{
	public static void main(String[] args)
	{
		//�Ǽ��� �⺻����� ����ȯ
		//[0] �ʱ�ȭ
		double x;
		double y;
		double z;
		
		//[1] �Է�
		
		x = 4;
		y = 3;
		z = x / y; //�Ǽ��� �⺻������ �Ǽ��� ����� ��ȯ
		
		//[2] ���
		System.out.println("z : " + z);
		
		//[3] �Է°� ����� �ݺ�
		z = (int)(x/y); // ����� ����ȯ �Ǽ� -> ���� 						// �Ϲ��� ����ȯ ���� -> �Ǽ�
		System.out.println("z : " + z);
		
		z = (1.0/2.0) + (1.2/2.3);
		System.out.println("z : " + z);

		z = (int)(1.0/2.0) + (1.2/2.3);
		System.out.println("z : " + z);
		
		int a = 1;
		int b = 2;
		z = a/b + a/b;
		System.out.println("z : " + z);
		
		z = (double)(a/b) + (double)(a/b);
		System.out.println("z : " + z);
		
		z = a/(double)b + (double)a/(double)b;
		System.out.println("z : " + z);
		
	}
}