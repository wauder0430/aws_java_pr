// ������ ������ ��� Ŭ����
public class Book {
	// �ʵ�
	// ������ ���� ���� ���ǻ�
	String title;
	String author;
	int price;
	String publish;

	// ������
	// �⺻���� ���� ������ -> �⺻ ������
	Book(){
		// ���ǻ�� ������ �ϰ� ����(�⺻�� ����)
		System.out.println("�����ڰ� ȣ��Ǿ����ϴ�.");
		publish = "�������ǻ�";
		price = 20000;
	}
	
	// �޼ҵ�
	// ���������� �ֿܼ� ���
	void PrintInfo() {
		// ���������� ���
		System.out.println("===============");
		System.out.println("���� : " + title);
		System.out.println("���� : " + author);
		System.out.println("���� : " + price + "��");
		System.out.println("���ǻ� : " + publish);
		System.out.println("===============");
	}
}
