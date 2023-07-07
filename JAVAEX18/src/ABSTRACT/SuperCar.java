package ABSTRACT;

public class SuperCar extends Car {

	@Override
	public void Run() {
		System.out.println("슈퍼카를 출발합니다.");
	}

	@Override
	public void Stop() {
		System.out.println("슈퍼카를 정지합니다.");
	}
	
	public void Start() {
		System.out.println("고성능 모드를 시작합니다.");
	}
}
