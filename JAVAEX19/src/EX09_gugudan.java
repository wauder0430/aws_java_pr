
public class EX09_gugudan {
	
	int selected_dan = 2;	//�������� 0�ܰ� 1���� �ǹ̰� ���⿡ �������� ������ 2���� �⺻������ �Ѵ�.
	public void printDan(int Dan) {
		
		// ���ڰ����� ����� �� ���� �Է¹���
		System.out.println("---------------------");
		for(int i = 1; i<10; i++) {
			System.out.printf("%d * %d = %d\n",Dan,i,Dan*i);
		}
	}
	public void printDan() {
		printDan(this.selected_dan);
	}
	
	public void printDan(int start_dan, int end_dan) {
		for(int i = start_dan; i<= end_dan; i++) {
			printDan(i);
		}
	}
	public static void main(String[] args) {
//		for(int i=2; i<10; i++) {
//			for(int j=1; j<10; j++) {
//				//System.out.println(i + " * " + j + " = " + i*j);
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//			}
//			
//		}
		
		EX09_gugudan gugu = new EX09_gugudan();
		for(int i=2; i<10; i++) {
			gugu.printDan(i);	
		}
		
		gugu.printDan();
		gugu.printDan(4);
		gugu.printDan(2,5);
			
	}
}
