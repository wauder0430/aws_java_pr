
public class Person {
	// �̸�, ����, ������
	String name;
	int age;
	String addr;
	// ������ 
	Person(){
		addr = "����";
	}
	
	// ������� 
	public void PrintInfo() {
		System.out.println("================");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("������ : " + addr);
		System.out.println("================");
	}
}
