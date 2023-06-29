public class Car {
	
	// ������, ������
	String name;
	String color;
	// ���� ���� �Ӽ� : ���� ���ᷮ, ���� �ӵ�, �ְ� �ӵ�
	int gas;
	int speed;
	int MAX_speed;
	
	// ��ǰ�� (Ÿ�̾)
	Tire f_L;
	Tire f_R;
	Tire r_L;
	Tire r_R;
	
	Car(){
		System.out.println("Car�� �⺻�����ڰ� ȣ��Ǿ����ϴ�.");
		name = "ĳ����";
		color = "white";
		gas = 100;
		speed = 0;
		MAX_speed = 100;
		f_L = new Tire();
		f_R = new Tire();
		r_L = new Tire();
		r_R = new Tire();
	}
	Car(String name, String color){
		System.out.println("Car�� ���������ڰ� ȣ��Ǿ����ϴ�.");
		this.name = name;
		this.color = color;
		gas = 100;
		speed = 0;
		MAX_speed = 100;
		f_L = new Tire();
		f_R = new Tire();
		r_L = new Tire();
		r_R = new Tire();
	}
	Car(String name, String color, int MAX_speed, int inch, String company){
		System.out.println("Car�� ����2�����ڰ� ȣ��Ǿ����ϴ�.");
		this.name = name;
		this.color = color;
		this.MAX_speed = MAX_speed;
		f_L = new Tire( inch, company);
		f_R = new Tire( inch, company);
		r_L = new Tire( inch, company);
		r_R = new Tire( inch, company);
	}
	Car(String name, String color, int MAX_speed, Tire tire){
		System.out.println("Tire ��ü�� �Է¹޴� Car������");
		this.name = name;
		this.color = color;
		this.MAX_speed = MAX_speed;
		f_L = tire;
		f_R = tire;
		r_L = tire;
		r_R = tire;
	}
	
	// �ڵ����� ������ ���
	void PrintInfo() {
		System.out.println("=============");
		System.out.println("���� : " + name);
		System.out.println("���� : " + color);
		System.out.println("�ְ� �ӵ� : " + MAX_speed);
		System.out.println("���� ���ᷮ : " + gas);
		System.out.println("���� �ӵ� : " + speed);
		System.out.print("���� �չ��� ���� : ");
		f_L.PrintInfo();
		System.out.print("������ �չ��� ���� : ");
		f_R.PrintInfo();
		System.out.print("���� �޹��� ���� : ");
		r_L.PrintInfo();
		System.out.print("������ �޹��� ���� : ");
		r_R.PrintInfo();
		System.out.println("=============");
	}
}
