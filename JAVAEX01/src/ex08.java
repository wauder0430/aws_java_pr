import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// 정수형 x를 선언하고
		// 정수를 할당한 후
		// 짝수인지 홀수인지 판별하여 
		// "짝수입니다." "홀수입니다."를 출력
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		x = sc.nextInt();
		if(x%2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		//sc.close();
		
		// 정수형 age 선언 후 정수 할당
		// age가 10미만이면 "아동입니다."
		// 20미만이면 "미성년자입니다."
		// 20이상이면 "성인입니다."
		int age;
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		if(age < 10) {
			System.out.println("아동입니다.");
		} else if(age < 20) {
			System.out.println("미성년자입니다.");
		} else {
			System.out.println("성인입니다.");
		}
		
		// int형 score 변수에 점수를 할당하고
		// 0~100 범위에서
		// score 90이상이면 A
		// 80이상 90미만이면 B
		// 70이상 80미만이면 C
		// 70미만이면 D
		int score;
		System.out.print("점수를 입력하세요 : ");
		score=sc.nextInt();
		while(!(score >= 0 && score <= 100)) {
			System.out.print("범위를 벗어났습니다. \n다시 입력하세요 : ");
			score=sc.nextInt();
		}
		sc.close();
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		} else if(score >= 70 && score < 80) {
			System.out.println("C");
		} else {
			System.out.println("재수강");
		}
		
	}

}
