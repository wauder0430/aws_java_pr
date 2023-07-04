package school;
// 사람 클래스를 상속받은 학생 클래스
public class Student extends Person{
	// 학생 클래스가 갖는 필드 학번 학점 전공
	private String stu_ID;
	private int credit;
	private String major;
	
	// 생성자
	Student(){	}
	Student(String name, int age, char gender, String addr,	// 부모클래스의 필드
			String stu_ID, int credit, String major){ 	// 자기 필드
		super(name, age, gender, addr);	// super를 이용해 Person의 생성자를 호출
		this.setStu_ID(stu_ID);
		this.setCredit(credit);
		this.setMajor(major);
	}
	
	// 메소드
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
		System.out.println("Student의 PrintInfo입니다.");
		System.out.println("학번 : " + this.getStu_ID());
		System.out.println("학점 : " + this.getCredit());
		System.out.println("전공 : " + this.getMajor());
	}
}
