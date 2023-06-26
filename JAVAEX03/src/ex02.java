import java.util.Scanner;

public class ex02 {
	
	public static int Sum(int a[]) {
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// 세 과목의 평균 점수와 총합 점수를 구하세요
		int score[] = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<score.length; i++) {
			System.out.print("점수를 입력하세요 : ");
			score[i] = sc.nextInt();
		}
		int sum = Sum(score);
		float avg = (float)sum / score.length;
		System.out.println("점수 합계 : " + sum);
		System.out.println("점수 평균 : " + avg);
		
		// 배열의 원소는 인덱스를 참조하여 호출 및 값 변경이 가능
		score[0] = 50;
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		sc.close();
	}

}
