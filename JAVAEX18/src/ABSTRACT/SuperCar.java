package ABSTRACT;

public class SuperCar extends Car {

	@Override
	public void Run() {
		System.out.println("����ī�� ����մϴ�.");
	}

	@Override
	public void Stop() {
		System.out.println("����ī�� �����մϴ�.");
	}
	
	public void Start() {
		System.out.println("���� ��带 �����մϴ�.");
	}
}
