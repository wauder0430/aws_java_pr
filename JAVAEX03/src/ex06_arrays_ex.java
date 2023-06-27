public class ex06_arrays_ex
{
	public static void main(String[] args)
	{
		// ����, ����, ������ ���� �����ͷκ���
		// �� ������ �������, �ְ������� ���Ͻÿ�
		
		//[0] �ʱ�ȭ
//		int sum = 0;
//		int max = 0;
		
		// score�� ù��° ���� -> ���� ������ �迭
		// �ι�° ���� -> ���� ������ �迭
		// ����° ���� -> ���� ������ �迭
		
		// ������ �迭
		// [��][��] [row][col]
		int[][] score = {
			{ 11, 22, 33 },			// (0,0), (0,1),(0,2)
			{ 44, 55, 66, 77, 88 },	// (1,0),(1,1),(1,2),(1,3),(1,4)
			{ 15, 25, 35, 45 }		// (2,0),(2,1),(2,2),(2,3)
		};
		System.out.println("������ ����° ���� : "+score[1][2]);
		
		for( int row = 0; row < score.length; row++ )
		{
//			System.out.println(score[row].length);
			for( int col = 0; col < score[row].length; col++)
			{
				System.out.println(score[row][col]);
			}
			System.out.println("-------------");
		}
		
		// ���� for������ �ۼ� ����
		// ������ 2���� �迭�� score�� ���� ������ �迭�� row�� ���ҷ� ����
		for( int[] row : score )
		{
			// ������ 1���� �迭�� row�� ���� ������ num������ ���Ҹ� ����
			for( int num : row)
			{
				// �������� ���Ҹ� ���
				System.out.println(num);
			}
			System.out.println("-----");
		}
	}
}