package school;

public class Person {
	// ��� Ŭ������ ���� �ʵ�
	private String name;
	private int age;
	private char gender;	//'f', 'F', 'm', 'M'
	private String addr;
	
	// ������ 
	Person() { }
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	Person(
			String name, 	//�̸�
			int age, 		//����
			char gender, 	//����
			String addr) 	//�ּ�
	{
		this.setName(name);
		this.setAge(age);
		this.setGender(gender);
		this.setAddr(addr);
	}
	
	// �޼ҵ�
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
			System.out.println("������ �Է°��� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	public void setAddr(String addr) 	{	this.addr = addr;		}
	
	public void PrintInfo() {
		System.out.println("Person�� PrintInfo�Դϴ�.");
		System.out.println("�̸� : " + this.getName());
		System.out.println("���� : " + this.getAge());
		System.out.println("���� : " + this.getGender());
		System.out.println("�ּ� : " + this.getAddr());
	}
}
