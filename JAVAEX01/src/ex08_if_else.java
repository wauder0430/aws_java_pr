public class ex08_if_else
{
	public static void main(String[] args)
	{
		// ������ x�� �����ϰ�
		// ������ �Ҵ��� �� ��
		// ¦������ Ȧ������ �Ǻ��Ͽ�
		// "¦���Դϴ�" "Ȧ���Դϴ�"�� ����ϼ���
		int x;
		x = 10;
		if(x%2==0)
		{
			System.out.println("¦���Դϴ�");
		}else
		{
			System.out.println("Ȧ���Դϴ�");
		}
		
		// ������ age ���� �� ���� �Ҵ�
		// age�� 10 �̸��̸� "�Ƶ��Դϴ�"
		// 20 �̸��̸� "�̼������Դϴ�"
		// 20 �̻��̸� "�����Դϴ�"
		int age = 30;
		if( age < 10 )
		{
			System.out.println("�Ƶ��Դϴ�");
		}else if( age < 20 )
		{
			System.out.println("�̼����Դϴ�");
		}else
		{
			System.out.println("�����Դϴ�");
		}
		
		// int�� score������ ������ �Ҵ��ϰ�
		// 0 ~ 100 ��������
		// score 90�̻��̸� A
		// 80�̻� 90�̸��̸� B
		// 70�̻� 80�̸��̸� C
		// 70�̸��̸� �����
		// ���ǽ� + ����
		// &&
		int score = -10;
		if( score > 100)
		{
			System.out.println("ERROR");
		}else if( score >= 90 && score <= 100)
		{
			System.out.println("A");
		}else if( score >= 80 && score < 90 )
		{
			System.out.println("B");
		}else if( score >=70 && score < 80 )
		{
			System.out.println("C");
		}else if( score > 0 )
		{
			System.out.println("�����");
		}else
		{
			System.out.println("ERROR");
		}
	}
}