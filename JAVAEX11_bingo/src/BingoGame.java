import java.util.Scanner;

// ��ü�� �̿��� bingo
public class BingoGame {
	// �ʵ� �����
	private int life; // ���� Ƚ��
	private int answer; // ���� ����
	private Scanner scn; // �Է��� �޴� ��ĳ�� ��ý ��������
	
	private void start(int life) { // ������ �����ϴ� �޼ҵ�
		this.life = life; // ���� Ƚ���� ����
		this.scn = new Scanner(System.in); // ������ �����ϱ� ���ؼ�, ��ĳ�� ��ü�� ����
		this.answer = (int)(Math.random() * 100) %100 +1; // 1~100 ������ ������ ����
		System.out.println(this.life);
		System.out.println(this.answer);
	}
	
	// ������ �÷����ϴ� �޼ҵ�
	private void run() {
		// ������� �÷���
		boolean flag = false;
		// ������ life��ŭ �÷��̸� ��Ű�� ����
		for (int i=0; i<this.life; i++) {
			// ���� ��ȸ ���
			System.out.println("���� ��ȸ : " + (this.life-i));
			// �Է��� �ް�
			System.out.print("������ �Է��ϼ��� : ");
			int keyIn = this.scn.nextInt();
			// ����� �Է°��� ��
			
			if(this.answer > keyIn) {
				System.out.println("Up");
			} else if(this.answer < keyIn) {
				System.out.println("Down");
			} else { // flag�� t�̸� �ݺ� ����
				System.out.println("Bingo");
				flag = true;
				break;
			}
		}
		// ������ ���������� ������ ������
		if(flag == false) {
			System.out.println("������ " + this.answer + "�Դϴ�.");
		}
	}
	
	// ������ �����ϴ� �޼ҵ�
	private boolean end() {
		boolean flag = false;
		// ������� ������ �ߴ��ϰ�, ���α׷��� �����ų������ Ȯ���ϴ� �޼ҵ�
		System.out.print("�� ������ �ٽ� �����Ͻðڽ��ϱ�? [��:1/�ƴϿ�:0] ");
		int keyIn = scn.nextInt();
		if(keyIn == 1) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
	
	// ���� ������ Ŭ������ �۵���ų �޼ҵ�
	public void play( int life ) {
		do {
			start(life);
			run();
		} while(end());
		//true false�� ���ο� ���� �ݺ�
		scn.close();
	}

}
