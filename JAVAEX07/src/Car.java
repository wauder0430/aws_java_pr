// �ڵ��� Ŭ����
public class Car {
	// �ְ� �ӵ�
	int speed;
	
	// ������ 
	public Car() {
		System.out.println("Car�� ��������ϴ�.");
		speed = 50;
	}
	
	public Car(int speed) {
		System.out.println("�ְ�ӵ��� " + speed + "�� Car�� ��������ϴ�.");
		this.speed = speed;
	}
	
	// ���� ��� �޼ҵ� 
	public void PrintInfo() {
		System.out.println("�ְ�ӵ� : " + speed);
	}
}
