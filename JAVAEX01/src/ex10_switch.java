public class ex10_switch
{
	public static void main(String[] args)
	{
		// 6��ü �ֻ����� �����ϰ�
		int dice_six = ((int)(Math.random()*100) % 6) + 1;
		// switch case������
		// "�ֻ����� ���� ##�Դϴ�"
		/*	switch(����)
			{
			case ���ͷ� :
				������ �ڵ�;
				break;
			case ���ͷ� :
				������ �ڵ�;
				break;
			default :
				������ �ڵ�;
			} */
		switch(dice_six)
		{
		case 1 :
			System.out.println("�ֻ����� ���� 1�Դϴ�");
			break;
		case 2 :
			System.out.println("�ֻ����� ���� 2�Դϴ�");
			break;
		case 3 :
			System.out.println("�ֻ����� ���� 3�Դϴ�");
			break;
		case 4 :
			System.out.println("�ֻ����� ���� 4�Դϴ�");
			break;
		case 5 :
			System.out.println("�ֻ����� ���� 5�Դϴ�");
			break;
		case 6 :
			System.out.println("�ֻ����� ���� 6�Դϴ�");
			break;
		}
//		System.out.println("�ֻ����� ���� " + dice_six + "�Դϴ�");
		// M�̸� ���� F�� ����
		char gender = 'A';
		switch(gender)
		{
		case 'M' :
			System.out.println("�����Դϴ�");
			break;
		case 'F' :
			System.out.println("�����Դϴ�");
			break;
		default :
			System.out.println("ERROR");
		}
	}
}