public class ex09_dice
{
	public static void main(String[] args)
	{
		// 6��ü �ֻ���
		// �Ҽ����� ������ ���ڰ��� ���� * 100
		// 0���� 100�̸��� �Ǽ���
		double rnd = Math.random() * 100;
		System.out.println("�������� : " + rnd);
		// ���������� ��ȯ
		int dice = (int)rnd;
		System.out.println("������ȯ : " + dice);
		// 0 ~ 99 ������ ����
		// 6���� ���� �������� 1�� ���Ѵ�
		// 0 ~ 5 0 -> 1 ~ 6
		dice = dice%6 +1;
		System.out.println("6��ü �ֻ��� : " + dice);
		
		int dice_six = ((int)(Math.random()*100) % 6) + 1;
		System.out.println("6��ü �ֻ��� : " + dice_six);
	}
}