// Ÿ�̾� Ŭ���� �ڵ��� Ŭ������ �ʵ�� ����
public class Tire {
	// Ÿ�̾� �� ũ��
	int inch;
	// Ÿ�̾� ������
	String company;
	
	// ������	15��ġ �ѱ�Ÿ�̾�
	Tire(){
		System.out.println("Ÿ�̾� �⺻ �����ڰ� ȣ��Ǿ����ϴ�.");
		inch = 15;
		company = "�ѱ�Ÿ�̾�";
	}
	// ���ڰ����� �� ũ�⸸ ���� �� ������ �ѱ�Ÿ�̾�
	Tire(int inch){
		System.out.println("Ÿ�̾� ���� �����ڰ� ȣ��Ǿ����ϴ�.");
		this.inch = inch;
		company = "�ѱ�Ÿ�̾�";
	}
	// ���ڰ� �ΰ��� ���� ������ ���� ���ڰ����� �����մϴ�.
	Tire(int inch, String company){
		System.out.println("Ÿ�̾� �ι�° ���� �����ڰ� ȣ��Ǿ����ϴ�.");
		this.inch = inch;
		this.company = company;
	}
	
	// Ÿ�̾� Ŭ������ ��ü ������ ����մϴ�
	public void PrintInfo() {
		System.out.println("��ũ�� : " + inch);
		System.out.println("������ : " + company);
	}
}
