// ���� Ŭ����
public class Calculator {
	// ���ڰ��� �ִ� �޼ҵ�
	// ��ȯ���� ����Ÿ�� / �޼ҵ��( ���ڰ��� ����Ÿ�� / ������ ) 
	/* { 
	 	���ڰ��� ���������� ����
	 	}
	 */
	int add(int i, int j) { 
		return i + j;
	}
	int sub(int i, int j) { 
		return i - j;
	}
	int mul(int i, int j) { 
		return i * j;
	}
	double div(int i, int j) { 
		//[0] ���ο��� ����� ������ ����� �ʱ�ȭ
		double result;
		//[1] ����
		if(j==0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println("�ι�° ���ڰ��� 0�̿��� ������ �Է��ϼ���");
			return 0;
		}
		else {
			result = (double)i / j;
		}
		//[2] ��ȯ
		return result;
	}
	
	// ������ �Է� �޾Ƽ� 0���� �Է¹��� ���������� �� �հ踦 ��ȯ�ϴ� �޼ҵ�
	int SumAll(int max) {
		int result = 0;
		
		for(int i=0; i<=max; i++) {
			result += i;
		}
		
		return result;
	}
	
	// ������ �Է� �޾Ƽ� 0���� �Է¹��� ���������� Ȧ���� ���ϴ� �޼ҵ�
	int SumOdd(int max) {
		int result = 0;
		for(int i=1; i<=max; i+=2) {
			result += i;
		}
		return result;
	}
	// ������ �Է� �޾Ƽ� 0���� �Է¹��� ���������� ¦���� ���ϴ� �޼ҵ�
	int SumEven(int max) {
		int result = 0;
		for(int i=2; i<=max; i+=2) {
			result += i;
		}
		return result;
	}
}
