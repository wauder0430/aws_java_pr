
public class ex08_array_for {

	public static void main(String[] args) {
		// 2���� �迭 
		int[][] score = {
				{10,20,30,40,50},
				{11,22,33,44,55},
				{15,25,35,45,55}
		};
		
		// �ݺ��� for (�Ϲ�/���)
		System.out.println("�Ϲ�for��");
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%d ", score[i][j]);
			}
			System.out.println();	
		}
		
		System.out.println("����for��");
		for(int row[] : score) {
			// ������ �迭 row���� �� ���Ҹ� ������ ������ num���� ����
			for(int num : row) {
				System.out.print(num +  " ");
			}
			System.out.println();
		}
	}

}
