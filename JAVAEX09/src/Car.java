
public class Car {
	// 최고 속도
	private int MAX_speed = 100;
	// 현재 속도
	private int speed =0;
	
	// 메소드
	// 현재 속도를 출력
	void PrintSpeed() {
		System.out.println("현재 속도 : " + speed);
	}
	// 속도를 올린다
	void SpeedUp() {
		// 현재속도가 최고속도라면 
		// 더이상 올릴 수 없습니다.
		// speed 증가
		if(this.speed == this.MAX_speed) {
			System.out.println("더 이상 올릴 수 없습니다.");
			return;
		}
		this.speed += 10;
		PrintSpeed();
	}
	// 속도를 줄인다.
	void SpeedDown() {
		// 현재속도가 0이면
		// 더이상 줄일 수 없습니다.
		// speed 감소
		if(this.speed == 0) {
			System.out.println("더 이상 줄일 수 없습니다.");
			return;
		}
		this.speed -= 10;
		PrintSpeed();
	}
	
}
