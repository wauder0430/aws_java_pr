
public class ex09_array_bubble_sort {

	public static void main(String[] args) {
		// ���� ����
		int[] array = { 90,50,70,30,20,80,40,10 };
		
		// array��ü�� ���� ����
		for(int i=0; i<array.length; i++) {
			// ���ο����� j index�� j+1 index�� ���� ���� �ٲٸ鼭 
			// ������� ������ ���� ū���� �����
			// ���� i�� ���� Ŀ���鼭 ���� �������ڸ��� ���ܽ�Ű�� ������� ����
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
