// 계산기 클래스를 사용하는 사람 클래스
public class Person {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		double result = 0;
		result = cal.add(50,50);
		System.out.println("더하기 : " + result);
		result = cal.sub(500,100);
		System.out.println("빼기 : " + result);
		result = cal.mul(24, 25);
		System.out.println("곱하기 : " + result);
		result = cal.div(25,0);
		System.out.println("나누기 : " + result);
		
		int sum = 0;
		sum = cal.SumAll(100);
		System.out.println("max까지 더하기: " + sum);
		sum = cal.SumOdd(5);
		System.out.println("max까지 홀수 더하기: " + sum);
		sum = cal.SumEven(999);
		System.out.println("max까지 짝수 더하기: " + sum);
	}

}
