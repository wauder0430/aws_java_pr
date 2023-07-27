package ex;

public class data
{
	String name;	// 이름
	int age;		// 나이
	
	data(){}
	data( String name, int age )
	{	// 인자값으로 데이터를 받아 생성하는 생성자
		this.name = name;
		this.age = age;
	}
}