
public class ex09_array_selection_sort {

	public static void main(String[] args) {
		// 선택정렬
		
		int[] array = { 90,50,70,30,20,80,40,10 };
		
		// for문 array모든 원소에 대해서 반복 실행
		for(int i=0; i<array.length; i++) {
			// 내부for문은 외부 for문에서 선택된 원소의 오른쪽에 대해서 반복
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
