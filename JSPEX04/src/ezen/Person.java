package ezen;

public class Person {
	private String name;
	private int age;
	
	public String getName() {	return name;	}
	public int getAge()	{	 return age;	}
	public void setName(String name) {	this.name = name;	}
	public void setAge(int age) {	this.age = age;	}
	
	public void PrintInfo() {
		System.out.println("============");
		System.out.println("�̸� : " + this.getName());
		System.out.println("���� : " + this.getAge());
		System.out.println("============");
	}
	
}
