
public class ex09_array_quick_sort {

	public static void main(String[] args) {
		// 퀵 정렬
		
		int[] array = { 90,50,70,30,20,80,40,10 };
		
		quickSort(array);
		
		for(int num : array) {
			System.out.println(num);
		}
	}
	
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] arr, int start, int end) {
		// start가 end보다 크거나 같다면 정렬한 원소가 1개이하이므로 정렬할 필요가 없음
		if(start >= end) {
			return;
		}
		
		// 가장 왼쪽의 값을 pivot으로 지정, 실제 비교 검사는 start+1부터 시작
		int pivot = start;
		int lo = start+1; // 왼쪽
		int hi = end; //오른쪽
		
		// 서로 엇갈릴 경우 while문을 종료
		while(lo<=hi) {
			// pivot보다 큰 값을 만날 때까지
			while(lo<=end && arr[lo] <= arr[pivot]) {
				lo++;
			}
			// pivot보다 작은 값을 만날때까지
			while(hi > start && arr[hi] >= arr[pivot]) {
				hi--;
			}
			// 엇갈리면 피벗과 교체
			if(lo>hi) { 
				swap(arr, hi, pivot);	
			}else { // 엇갈리지 않으면 lo, hi 값 교체
				swap(arr, lo, hi);
			}
		}
		// 엇갈렸을 경우 
		// 피벗값과 hi값을 교체한 후 해당 피벗을 기준으로 앞 뒤로 배열을 분할하여 정렬진행
		quickSort(arr, start, hi-1);
		quickSort(arr, hi+1, end);
	}
	
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
