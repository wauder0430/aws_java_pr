
public class ex12_for_ex {

	public static void main(String[] args) {
		// 0���� 100���� �ݺ��ϸ鼭 
		// 1. Ȧ���� ���ϱ� -> Ȧ¦üũ / 2�� �����ϴ� ����
		// 2. 5�� ��� ���ϱ� -> ���ϴ� �������� 1�� 
		// 3. ������ 3�� ���
		// 1��01
		int result = 0;
		for (int i=0; i<=100; i++) {
			if(i%2!=0) {
				result += i;
			}
		}
		System.out.println("1-01 : " + result);
		result=0;
		// 1��02
		for(int i=1; i<=100; i+=2) {
			result += i;
		}
		System.out.println("1-02 : " + result);
		result=0;
		// 2��
		for(int i=5; i<=100; i+=5) {
			result += i;
		}
		System.out.println("2 : " + result);
		result=0;
		
		// 3��
		for(int i=1; i<10; i++) {
			System.out.println("3 * " + i + " = " + 3*i);
		}
	}

}
