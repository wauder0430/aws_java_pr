
public class Data {
	// 필드에 데이터
	public String name;
	// 다른 객체의 주소를 담을 참조 변수
	public Data link = null;
	
	// 생성자
	public Data() {}
	public Data(String name) {
		this.name = name;
	}
	
	public void PrintInfo() {
		System.out.println("name : " + this.name);
	}
}
