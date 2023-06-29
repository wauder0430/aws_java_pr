// 자동차 클래스
public class Car {
	// 최고 속도
	int speed;
	
	// 생성자 
	public Car() {
		System.out.println("Car가 만들어집니다.");
		speed = 50;
	}
	
	public Car(int speed) {
		System.out.println("최고속도가 " + speed + "인 Car가 만들어집니다.");
		this.speed = speed;
	}
	
	// 정보 출력 메소드 
	public void PrintInfo() {
		System.out.println("최고속도 : " + speed);
	}
}
