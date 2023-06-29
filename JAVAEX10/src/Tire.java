// 타이어 클래스 자동차 클래스의 필드로 사용됨
public class Tire {
	// 타이어 휠 크기
	int inch;
	// 타이어 제조사
	String company;
	
	// 생성자	15인치 한국타이어
	Tire(){
		System.out.println("타이어 기본 생성자가 호출되었습니다.");
		inch = 15;
		company = "한국타이어";
	}
	// 인자값으로 휠 크기만 받을 때 제조사 한국타이어
	Tire(int inch){
		System.out.println("타이어 변형 생성자가 호출되었습니다.");
		this.inch = inch;
		company = "한국타이어";
	}
	// 인자값 두개를 받을 때에는 받은 인자값으로 생성합니다.
	Tire(int inch, String company){
		System.out.println("타이어 두번째 변형 생성자가 호출되었습니다.");
		this.inch = inch;
		this.company = company;
	}
	
	// 타이어 클래스의 객체 정보를 출력합니다
	public void PrintInfo() {
		System.out.println("휠크기 : " + inch);
		System.out.println("제조사 : " + company);
	}
}
