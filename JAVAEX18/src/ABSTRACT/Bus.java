package ABSTRACT;

public class Bus extends Car{
	// Car�߻�Ŭ�����κ��� Bus�� ����
	@Override
	public void Run() {
		System.out.println("������ ����մϴ�.");
	}
	
	@Override
	public void Stop() {
		System.out.println("������ �����մϴ�.");
	}
}
