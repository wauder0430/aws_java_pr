// setter getter 
public class EX01_setter_getter {
	// �ʵ�
	private int 	num;
	private String 	str;
	private double 	db;
	private boolean gender;
	private String	gender_value;
	
	// �޼ҵ带 ���ؼ�, �ʵ��� ���� �������ų� �Ҵ��� �Ѵ�.
	// -> ���ڰ��� ����� �� ����������
	// -> ���ڰ��� ������ �ʵ��� �������� �´���
	
	public void setNum(int num) {
		// 1~10 ������ �ް� ���� ���
		if(num < 1 || num > 10) {
			System.out.println("�Է°��� 1~10������ �����մϴ�.");
			return;
		}
		this.num = num;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public void setDb(double db) {
		this.db = db;
	}
	
	// �ʵ��� gender_value�� gender���� ���ӵȴ�.
	public void setGender(boolean gender) {
		this.gender = gender;
		if(gender == true) {	// gender�� ������ gender_value�� ���� ����
			setGender_value("����");
		} else {
			setGender_value("����");
		}
	}
	
	public void setGender_value(String gender_value) {
		this.gender_value = gender_value;
	}
	
	public int getNum() {
		if(this.num ==0) {
			System.out.println("���� �Էµ� ���� �����ϴ�.");
			return -1;
		}
		return this.num;
	}
	
	public String getStr() {
		return str;
	}
	
	public double getDb() {
		return db;
	}
	
	public boolean isGender() {
		return gender;
	}
	
	public String getGender_value() {
		return gender_value;
	}	
}
