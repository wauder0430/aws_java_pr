package ABSTRACT;

public abstract class Car {
	// �ڵ����� ���¸� ����� �߻� Ŭ����
	String name;	// ������
	int MAX;		// ������
	
	abstract public void Run();
	abstract public void Stop();
	
	public void PrintInfo() {
		System.out.println("������ : " + this.name);
		System.out.println("������ : " + this.MAX);
	}
}
