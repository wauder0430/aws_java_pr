package ezen;

public class Person {
	public String name;
	public int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void PrintInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
	}
}
