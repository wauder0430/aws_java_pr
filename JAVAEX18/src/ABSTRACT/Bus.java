package ABSTRACT;

public class Bus extends Car{
	// Car추상클래스로부터 Bus를 구현
	@Override
	public void Run() {
		System.out.println("버스를 출발합니다.");
	}
	
	@Override
	public void Stop() {
		System.out.println("버스를 정차합니다.");
	}
}
