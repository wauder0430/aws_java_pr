package EZEN;

public class Circle {
	// 원의 둘레와 넓이를 계산하는 클래스
	// 원주율은 값이 변하지 않는 상수로 선언해주세요
	final double PI = 3.141592;	//원주율
	double radious;	//반지름
	
	public void setR(double radious) {
		this.radious = radious;
	}
	
	// 둘레를 구하는 메소드
	public double getRound() {
		double result = 0.0;
		result = 2 * PI * radious;
		return result;
	}
	// 넓이를 구하는 메소드
	public double getArea() {
		double result = 0.0;
		result = PI * radious * radious;
		return result;
	}
	
}
