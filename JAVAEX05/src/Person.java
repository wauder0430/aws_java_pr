// 계산기 클래스를 사용하는 사람 클래스
public class Person {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.x = 10;
		cal.y = 10;
		
		double result = 0;
		result = cal.add();
		System.out.println("더하기 : " + result);
		result = cal.sub();
		System.out.println("빼기 : " + result);
		result = cal.mul();
		System.out.println("곱하기 : " + result);
		result = cal.div();
		System.out.println("나누기 : " + result);
		
	}

}
