// �������� ����
import java.util.Scanner;

public class Bingo_for {
	public static void main(String[] args) {
		//[0] ����� ������ �����Ѵ�
		int Answer = 0; // ���� ����
		int Max = 5; // ���� �ִ�ȸ��
		int Life = 0; //���� ȸ��
		int UserKey = 0; //����ڿ��� �Է¹��� ���� ������ ���� ����
		boolean flag =  false; //������ ������� üũ�ϴ� �÷���
		
		//[1] �������� �ʱ�ȭ�Ѵ� / �Է°��� �޴´�
		Scanner keyIn = new Scanner(System.in);
		// ������ �����Ѵ�
		Answer = (int)(Math.random() * 100) % 100 + 1;
		System.out.println("���� : " + Answer);
		
		//[2] ������ Ƚ����ŭ ������ �ݺ��Ѵ�
		for(int i=0; i<Max; i++) {
			// ���� ��ȸ ���
			Life = Max - i;
			System.out.println("[���� ��ȸ " + Life + "��]");
			System.out.print("������ �Է��ϼ��� : ");
			// ����ڿ��� �Է¹޴´�.
			UserKey = keyIn.nextInt();
			
			// �Է¹��� ������ ������ ���Ѵ�
			if(Answer < UserKey) {
				if(Life!=1) {
					System.out.println("Down");
				}
			} else if(Answer > UserKey) {
				if(Life!=1) {
					System.out.println("Up");
				}
			} else {
				System.out.println("�����Դϴ�.");
				flag = true;
				break;
			}
		}
		
		//[3] ������ ������� üũ�Ѵ�
		if(flag == false) {
			System.out.println("�ٺ�");
		}
		//[4] ����� ���� ����� ����Ѵ�
		System.out.println("���� : " + Answer + "�Դϴ�.");
		
		//[5] �Է¿� ��ĳ�� ��ü�� �ݾ��ش�. 
		keyIn.close();
	}
}
