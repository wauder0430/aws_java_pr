
public class ex09_array_selection_sort {

	public static void main(String[] args) {
		// ��������
		
		int[] array = { 90,50,70,30,20,80,40,10 };
		
		// for�� array��� ���ҿ� ���ؼ� �ݺ� ����
		for(int i=0; i<array.length; i++) {
			// ����for���� �ܺ� for������ ���õ� ������ �����ʿ� ���ؼ� �ݺ�
			for(int j=i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		for(int num : array) {
			System.out.println(num);
		}
		
		/*
		int score[] = { 20,50,55,22,45 };
		for(int i=0; i<score.length; i++) {
			for(int j=i+1; j<score.length; j++) {				
				if(score[i] > score[j]) {
					int tmp=0;
					tmp = score[i];
					score[i] = score[j];
					score[j] = tmp;
				}
			}
		}
		for(int num : score) {
			System.out.println(num);
		}
		*/
	}

}
