public class ex06_arrays_ex
{
	public static void main(String[] args)
	{
		// 수학, 영어, 국어의 점수 데이터로부터
		// 각 과목의 평균점수, 최고점수를 구하시오
		
		//[0] 초기화
//		int sum = 0;
//		int max = 0;
		
		// score의 첫번째 원소 -> 수학 점수의 배열
		// 두번째 원소 -> 영어 점수의 배열
		// 세번째 원소 -> 국어 점수의 배열
		
		// 이차원 배열
		// [행][열] [row][col]
		int[][] score = {
			{ 11, 22, 33 },			// (0,0), (0,1),(0,2)
			{ 44, 55, 66, 77, 88 },	// (1,0),(1,1),(1,2),(1,3),(1,4)
			{ 15, 25, 35, 45 }		// (2,0),(2,1),(2,2),(2,3)
		};
		System.out.println("영어의 세번째 점수 : "+score[1][2]);
		
		for( int row = 0; row < score.length; row++ )
		{
//			System.out.println(score[row].length);
			for( int col = 0; col < score[row].length; col++)
			{
				System.out.println(score[row][col]);
			}
			System.out.println("-------------");
		}
		
		// 향상된 for문으로 작성 예시
		// 정수형 2차원 배열인 score로 부터 정수형 배열인 row를 원소로 꺼냄
		for( int[] row : score )
		{
			// 정수형 1차원 배열인 row로 부터 정수형 num변수로 원소를 꺼냄
			for( int num : row)
			{
				// 꺼내어진 원소를 출력
				System.out.println(num);
			}
			System.out.println("-----");
		}
	}
}