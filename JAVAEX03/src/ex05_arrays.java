
public class ex05_arrays {

	public static void main(String[] args) {
		// ���� ���� ������ ���� �����ͷκ��� 
		// �� ������ ��� ����, �ְ� ������ ���Ͻÿ�
		
		// [0] �ʱ�ȭ
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
		
		// ������ ��� ������ �ְ� ���� ���ϱ�
		for(int i=0; i<math_score.length; i++) {
			sum += math_score[i];
			if(max<math_score[i])
				max = math_score[i];
		}
		System.out.printf("���� ��� ���� : %d\n���� �ִ� ���� : %d\n", (sum/math_score.length), max);
		sum = 0;
		max = 0;
		for(int num : eng_score) {
			sum += num;
			if(max<num)
				max = num;
		}
		System.out.printf("���� ��� ���� : %d\n���� �ִ� ���� : %d\n", (sum/eng_score.length), max);
		sum = 0;
		max = 0;
		for(int num : kor_score) {
			sum += num;
			if(max<num)
				max = num;
		}
		System.out.printf("���� ��� ���� : %d\n���� �ִ� ���� : %d\n", (sum/kor_score.length), max);
		
		for(int row=0; row<score.length; row++) {
			System.out.println(score[row].length);
			for(int col=0; col<score[row].length; col++) {
				System.out.print(score[row][col] + " ");
			}
			System.out.println();
		}
		// foreach �ۼ� ����
		// 2���� �迭�� score�κ��� 1���� �迭�� row �� ���ҷ� ����
		for(int[] row : score) {
			// 1���� �迭�� row�κ��� ������ num������ ���Ҹ� ����
			for(int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
	}

}
