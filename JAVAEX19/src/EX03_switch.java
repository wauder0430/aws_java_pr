public class EX03_switch
{
	public static void main(String[] args)
	{
/*		switch case
		switch( ���� )
		{
		// ������ ���� �������� ���
		case 0 :
		case 1 :
		
		// ������ ���� char���� ���
		case 'A' :
		case 'B' :
		
		// ������ ���� ���ڿ��� ���
		case "JAVA" :
		case "C++" :
		
		// ������ ���̽� �ۼ� ��
		case "���1" :
			������ ����
			break;			// �ٸ� ��츦 �������� �ʰ� switch ������ ��� 
		case "���2" :
			������ ����
			break;
			...
		case "���n" :
			������ ����
			break;
		default :			// ������ ���� �ش��ϴ� case�� �������� �ʾ�����
			������ ����
		}
*/
		char score = 'F';
		switch( score )
		{
		case 'A':
			System.out.println("A�����Դϴ�.");
			break;
		case 'B':
			System.out.println("B�����Դϴ�.");
			break;
		case 'C':
			System.out.println("C�����Դϴ�.");
			break;
		case 'D':
			System.out.println("D�����Դϴ�.");
			break;
		default:
			System.out.println("�����Դϴ�.");
		}
		
		int dice;
		dice = (int)(Math.random()*100) % 6 + 1;
		switch( dice )
		{
		case 1 :
			System.out.println("�ֻ����� ���� 1�Դϴ�.");
			break;
		case 2 :
			System.out.println("�ֻ����� ���� 2�Դϴ�.");
			break;
		case 3 :
			System.out.println("�ֻ����� ���� 3�Դϴ�.");
			break;
		case 4 :
			System.out.println("�ֻ����� ���� 4�Դϴ�.");
			break;
		case 5 :
			System.out.println("�ֻ����� ���� 5�Դϴ�.");
			break;
		case 6 :
			System.out.println("�ֻ����� ���� 6�Դϴ�.");
			break;
		}
	}
}