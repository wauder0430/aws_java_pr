
public class ex09_array_bubble_sort {

	public static void main(String[] args) {
		// 버블 정렬
		int[] array = { 90,50,70,30,20,80,40,10 };
		
		// array전체에 대한 실행
		for(int i=0; i<array.length; i++) {
			// 내부에서는 j index와 j+1 index의 값을 비교후 바꾸면서 
			// 계속진행 끝에는 가장 큰수가 저장됨
			// 그후 i의 값이 커지면서 가장 마지막자리는 제외시키는 방식으로 진행
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j]>array[j+1]) {
					int tmp = array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
			}
		}
		
		for(int num : array) {
			System.out.println(num);
		}
	}

}
