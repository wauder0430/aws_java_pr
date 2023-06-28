
public class ex08_array_for {

	public static void main(String[] args) {
		// 2차원 배열 
		int[][] score = {
				{10,20,30,40,50},
				{11,22,33,44,55},
				{15,25,35,45,55}
		};
		
		// 반복문 for (일반/향상)
		System.out.println("일반for문");
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%d ", score[i][j]);
			}
			System.out.println();	
		}
		
		System.out.println("향상된for문");
		for(int row[] : score) {
			// 정수형 배열 row에서 각 원소를 정수형 변수인 num으로 꺼냄
			for(int num : row) {
				System.out.print(num +  " ");
			}
			System.out.println();
		}
	}

}
