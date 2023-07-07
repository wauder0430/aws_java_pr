package INTERFACE;

public interface Remocon {
	
	// 상수 필드
	int TYPE_TV = 1;
	int TYPE_RADIO = 2;
	int TYPE_AUDIO = 3;
	
	// 추상 메소드 선언
	void turnOn();
	void turnOff();
	
	// default
	default void makeRC() {
		System.out.println("리모콘의 생성이 확인되었습니다.");
	}
	
	// static
	static void Test() {
		System.out.println("리모콘 작동을 테스트 중입니다.");
		System.out.println("테스트를 완료했습니다.");
	}
}
