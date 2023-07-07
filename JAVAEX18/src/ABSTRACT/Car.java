package ABSTRACT;

public abstract class Car {
	// 자동차의 형태를 명시한 추상 클래스
	String name;	// 차종명
	int MAX;		// 정원수
	
	abstract public void Run();
	abstract public void Stop();
	
	public void PrintInfo() {
		System.out.println("차종명 : " + this.name);
		System.out.println("정원수 : " + this.MAX);
	}
}
