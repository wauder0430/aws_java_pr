
public class Person {
	// 이름, 나이, 거주지
	String name;
	int age;
	String addr;
	// 생성자 
	Person(){
		addr = "전주";
	}
	
	// 정보출력 
	public void PrintInfo() {
		System.out.println("================");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("거주지 : " + addr);
		System.out.println("================");
	}
}
