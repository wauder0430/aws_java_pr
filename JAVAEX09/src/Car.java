
public class Car {
	// �ְ� �ӵ�
	private int MAX_speed = 100;
	// ���� �ӵ�
	private int speed =0;
	
	// �޼ҵ�
	// ���� �ӵ��� ���
	void PrintSpeed() {
		System.out.println("���� �ӵ� : " + speed);
	}
	// �ӵ��� �ø���
	void SpeedUp() {
		// ����ӵ��� �ְ�ӵ���� 
		// ���̻� �ø� �� �����ϴ�.
		// speed ����
		if(this.speed == this.MAX_speed) {
			System.out.println("�� �̻� �ø� �� �����ϴ�.");
			return;
		}
		this.speed += 10;
		PrintSpeed();
	}
	// �ӵ��� ���δ�.
	void SpeedDown() {
		// ����ӵ��� 0�̸�
		// ���̻� ���� �� �����ϴ�.
		// speed ����
		if(this.speed == 0) {
			System.out.println("�� �̻� ���� �� �����ϴ�.");
			return;
		}
		this.speed -= 10;
		PrintSpeed();
	}
	
}
