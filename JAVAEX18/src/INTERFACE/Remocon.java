package INTERFACE;

public interface Remocon {
	
	// ��� �ʵ�
	int TYPE_TV = 1;
	int TYPE_RADIO = 2;
	int TYPE_AUDIO = 3;
	
	// �߻� �޼ҵ� ����
	void turnOn();
	void turnOff();
	
	// default
	default void makeRC() {
		System.out.println("�������� ������ Ȯ�εǾ����ϴ�.");
	}
	
	// static
	static void Test() {
		System.out.println("������ �۵��� �׽�Ʈ ���Դϴ�.");
		System.out.println("�׽�Ʈ�� �Ϸ��߽��ϴ�.");
	}
}
