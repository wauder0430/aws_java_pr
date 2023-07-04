package school;
// ��� Ŭ������ ��ӹ��� �л� Ŭ����
public class Student extends Person{
	// �л� Ŭ������ ���� �ʵ� �й� ���� ����
	private String stu_ID;
	private int credit;
	private String major;
	
	// ������
	Student(){	}
	Student(String name, int age, char gender, String addr,	// �θ�Ŭ������ �ʵ�
			String stu_ID, int credit, String major){ 	// �ڱ� �ʵ�
		super(name, age, gender, addr);	// super�� �̿��� Person�� �����ڸ� ȣ��
		this.setStu_ID(stu_ID);
		this.setCredit(credit);
		this.setMajor(major);
	}
	
	// �޼ҵ�
	public String getStu_ID() {
		return stu_ID;
	}
	public int getCredit() {
		return credit;
	}
	public String getMajor() {
		return major;
	}
	
	public void setStu_ID(String stu_ID) {
		this.stu_ID = stu_ID;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public void PrintInfo() {
		super.PrintInfo();
		System.out.println("Student�� PrintInfo�Դϴ�.");
		System.out.println("�й� : " + this.getStu_ID());
		System.out.println("���� : " + this.getCredit());
		System.out.println("���� : " + this.getMajor());
	}
}
