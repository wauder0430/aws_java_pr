package school;

public class Person {
	// 사람 클래스가 갖는 필드
	private String name;
	private int age;
	private char gender;	//'f', 'F', 'm', 'M'
	private String addr;
	
	// 생성자 
	Person() { }
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Person(
			String name, 	//이름
			int age, 		//나이
			char gender, 	//성별
			String addr) 	//주소
	{
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
		this.setAddr(addr);
	}
	
	// 메소드
	public String 	getName() 	{	return name; 	}
	public int 		getAge() 	{	return age;		}
	public char 	getGender() {	return gender;	}
	public String 	getAddr() 	{	return addr;	}
	public void setName(String name) 	{	this.name = name;		}
	public void setAge(int age) 		{	this.age = age;			}
	public void setGender(char gender) 	{	
		if(gender == 'f' || gender == 'F' || gender == 'm' ||gender == 'M') {
		this.gender = gender;
		} else {
			System.out.println("성별의 입력값이 올바르지 않습니다.");
		}
	}
	public void setAddr(String addr) 	{	this.addr = addr;		}
	
	public void PrintInfo() {
		System.out.println("Person의 PrintInfo입니다.");
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
		System.out.println("성별 : " + this.getGender());
		System.out.println("주소 : " + this.getAddr());
	}
}
