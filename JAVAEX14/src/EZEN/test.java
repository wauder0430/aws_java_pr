package EZEN;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// Circle로부터 객체를 만들어서,
		// 반지름을 입력하고 둘레와 넓이를 구한다.
		Circle c = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력해주세요. : ");
		c.setR(sc.nextDouble());
		
		System.out.println("둘레 : " + c.getRound());
		System.out.println("넓이 : " + c.getArea());
		
		sc.close();
	}
}
