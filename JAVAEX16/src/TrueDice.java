
public class TrueDice {
	public static void main(String[] args) {
		// ������
		// [0] ���� ���� �� �ʱ�ȭ
		// �ֻ��� 1��
		// �ֻ��� 2��
		// �հ踦 ������ ����
		
		// [1] �ֻ����� ����
		// 1�� �ֻ����� ���� -random ���
		// 2�� �ֻ����� ����
		// �� �ֻ����� ���� ���� ����
		// �� �ֻ����� ���� �����
		// ���� 5�� �ƴϸ� �ݺ�
		int dice1;
		int dice2;
		int sum = 0;
		System.out.println("whiletrue===========");
		while(true) {
			if(sum==5) {
				break;
			}
			dice1 = (int)(Math.random()*120) %6 +1;
			dice2 = (int)(Math.random()*120) %6 +1;
			System.out.println("1�� �ֻ��� : " + dice1 +"\n2�� �ֻ��� : " + dice2);
			sum = dice1+ dice2;
			System.out.println("�ֻ����� �� : " + sum);
			System.out.println("--------------------");	
		}
		System.out.println("====================");
		sum=0;
		System.out.println("while===============");
		while(sum!=5) {
			dice1 = (int)(Math.random()*120) %6 +1;
			dice2 = (int)(Math.random()*120) %6 +1;
			System.out.println("1�� �ֻ��� : " + dice1 +"\n2�� �ֻ��� : " + dice2);
			sum = dice1+ dice2;
			System.out.println("�ֻ����� �� : " + sum);
			System.out.println("--------------------");
		}
		System.out.println("====================");
		System.out.println("flag================");
		boolean flag = true;
		while(flag) {
			
			dice1 = (int)(Math.random()*120) %6 +1;
			dice2 = (int)(Math.random()*120) %6 +1;
			System.out.println("1�� �ֻ��� : " + dice1 +"\n2�� �ֻ��� : " + dice2);
			sum = dice1+ dice2;
			System.out.println("�ֻ����� �� : " + sum);
			System.out.println("--------------------");
			if(sum==5) {
				flag=false;
			}
		}
		System.out.println("====================");
		System.out.println("dowhile=============");
		do {
			dice1 = (int)(Math.random()*120) %6 +1;
			dice2 = (int)(Math.random()*120) %6 +1;
			System.out.println("1�� �ֻ��� : " + dice1 +"\n2�� �ֻ��� : " + dice2);
			sum = dice1+ dice2;
			System.out.println("�ֻ����� �� : " + sum);
			System.out.println("--------------------");
		} while(sum!=5);
		System.out.println("====================");
	}
}
