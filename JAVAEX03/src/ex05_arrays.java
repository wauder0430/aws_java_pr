
public class ex05_arrays {

	public static void main(String[] args) {
		// 수학 영어 국어의 정수 데이터로부터 
		// 각 과목의 평균 점수, 최고 점수를 구하시오
		
		// [0] 초기화
		int sum = 0;
		int max = 0;
		int[] math_score = { 11,22,33 };
		int[] eng_score = { 44,55,66,77,88 };
		int[] kor_score = { 15,25,35,45 };
		
		int[][] score = {
				{ 11,22,33 },		// {0,0} {0,1} {0,2}
				{ 44,55,66,77,88 },	// {1,0} {1,1} {1,2} {1,3} {1,4}
				{ 15,25,35,45 }		// {2,0} {2,1} {2,2} {2,3}
		};
		
		// 수학의 평균 점수와 최고 점수 구하기
		for(int i=0; i<math_score.length; i++) {
			sum += math_score[i];
			if(max<math_score[i])
				max = math_score[i];
		}
		System.out.printf("수학 평균 점수 : %d\n수학 최대 점수 : %d\n", (sum/math_score.length), max);
		sum = 0;
		max = 0;
		for(int num : eng_score) {
			sum += num;
			if(max<num)
				max = num;
		}
		System.out.printf("영어 평균 점수 : %d\n영어 최대 점수 : %d\n", (sum/eng_score.length), max);
		sum = 0;
		max = 0;
		for(int num : kor_score) {
			sum += num;
			if(max<num)
				max = num;
		}
		System.out.printf("국어 평균 점수 : %d\n국어 최대 점수 : %d\n", (sum/kor_score.length), max);
		
		for(int row=0; row<score.length; row++) {
			System.out.println(score[row].length);
			for(int col=0; col<score[row].length; col++) {
				System.out.print(score[row][col] + " ");
			}
			System.out.println();
		}
		// foreach 작성 예시
		// 2차원 배열인 score로부터 1차원 배열인 row 를 원소로 꺼냄
		for(int[] row : score) {
			// 1차원 배열인 row로부터 정수형 num변수로 원소를 꺼냄
			for(int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
	}

}
