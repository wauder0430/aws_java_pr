
public class ex09_array_quick_sort {

	public static void main(String[] args) {
		// �� ����
		
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
		// start�� end���� ũ�ų� ���ٸ� ������ ���Ұ� 1�������̹Ƿ� ������ �ʿ䰡 ����
		if(start >= end) {
			return;
		}
		
		// ���� ������ ���� pivot���� ����, ���� �� �˻�� start+1���� ����
		int pivot = start;
		int lo = start+1; // ����
		int hi = end; //������
		
		// ���� ������ ��� while���� ����
		while(lo<=hi) {
			// pivot���� ū ���� ���� ������
			while(lo<=end && arr[lo] <= arr[pivot]) {
				lo++;
			}
			// pivot���� ���� ���� ����������
			while(hi > start && arr[hi] >= arr[pivot]) {
				hi--;
			}
			// �������� �ǹ��� ��ü
			if(lo>hi) { 
				swap(arr, hi, pivot);	
			}else { // �������� ������ lo, hi �� ��ü
				swap(arr, lo, hi);
			}
		}
		// �������� ��� 
		// �ǹ����� hi���� ��ü�� �� �ش� �ǹ��� �������� �� �ڷ� �迭�� �����Ͽ� ��������
		quickSort(arr, start, hi-1);
		quickSort(arr, hi+1, end);
	}
	
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}
