public class ex01_class {
	
	// field �ɹ�
	// ���������� ����Ÿ�� ������ [ = �ʱ�ȭ �� ];
	public int number = 0;
	
	// method
	// ���������� ��ȯ��Ÿ�� �޼ҵ��̸�([�Է¹��� ������ ����Ÿ�� ������]){}
	public void add(int num) {
		// ���� ���� 
		int sum = 0;
		// Ŭ������ �ʵ�� this Ű����� ����
		sum =this.number;
		System.out.println("sum : " + sum);
		// Ŭ������ �ʵ忡 ���ڰ��� ����
		this.number = num;
	}
	
	public static void main(String[] args) {
		// �ڱ� �ڽ��� �ɹ���, �޼ҵ带 ȣ�� ����
		// class(���赵)�κ��� ��ü�� �����ϰ�
		// ��ü�� �ɹ���, �޼ҵ� ������ ����
		// public���� ���������ڴ� ��ü Ȥ�� Ŭ������ ���� ������ �����ϴ� Ű����
		// Ŭ������ �ν��Ͻ��̸�(��ü �̸�) (����������) = new Ŭ������ �����ڸ� ȣ��
		ex01_class test = new ex01_class();
		// ex01_class Ŭ������ �ν��Ͻ� test�� ���� �ִ� �޼ҵ� add()ȣ��
		test.add(100);
		
		// ex01_class Ŭ������ �ν��Ͻ� test�� ���� �ִ� �ʵ� number ȣ��
		System.out.println(test.number);
		test.add(50);
		System.out.println(test.number);
		
	}

}
