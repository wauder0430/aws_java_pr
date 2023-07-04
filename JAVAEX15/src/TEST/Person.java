package TEST;
import java.time.LocalDate;

public class Person {
	// �ʵ�� �޼ҵ忡�� �ּ��� �ۼ�
	// �̸� ���� ���� ���� �ʵ�� ����
	// �ʵ�
	private String name;
	private int birth;
	private int age;
	private String gender;
	LocalDate now = LocalDate.now();	// ���ظ� ���ϱ� ����
	private int year = now.getYear();	// ����
	
	// ������
	Person(){}
	Person(String name, int birth, String gender){
		setName(name);
		setGender(gender);
		setBirth(birth);
	}
	
	// �޼ҵ�
	// setter����
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {	
		// "����" �Ǵ� "����"���θ� �Է¹ޱ� ����
		if(gender.equals("����") ||gender.equals("����")) {
			this.gender = gender;
		} else {
			System.out.println("������ �Է°��� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	
	// ������ �Է��ϸ� ->���� - ����  = ����->���̸� �Է�
	public void setBirth(int birth) {
		// �ԷµǾ� �ִ� age�� ���ų� ���⿡ ���� ��꿡 ���� ����� age�� �ٸ� ��� ���Ӱ� setAge
		if(getAge()==0 || getAge() != this.year-birth) {	 
			this.setAge(this.year-birth);	// ����-����=����
		} 
		this.birth = birth;	// birth ����
	}
	// ���̸� �Է��ϸ�
	public void setAge(int age) {
		// 1.������ �ԷµǾ� ���� ������, ���̷κ��� ������ ����ؼ� �����Է�
		if(getBirth()==0) {
			this.age = age;
			this.setBirth(this.year-age);
		} else { // 2.������ �ԷµǾ� �ִµ�, ���̿� ���� ����� ���� ������ ���� ����
			if(getBirth() != this.year-age) {
				this.age = age;
				this.setBirth(this.year-age);
			}
			this.age = age;	// ���� ��찡 �ƴϿ��� this.age=age�� ����Ǿ���Ѵ�.
		}
		
	}
	
	// getter
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getBirth() {
		return birth;
	}
	public int getAge() {
		return age;
	}
	// Person�� ������ ����ϴ� PrintInfo() �޼ҵ� 
	public void PrintInfo() {
		System.out.println("Person�� PrintInfo�Դϴ�.");
		System.out.println("�̸� : " + this.getName());
		System.out.println("���� : " + this.getBirth());
		System.out.println("���� : " + this.getAge());
		System.out.println("���� : " + this.getGender());
	}
}
