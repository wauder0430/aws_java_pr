
public class EX02_index {
	public static void main(String[] args) {
		// �迭�� index ���� �ѱ�� ����
		int[] arry = {1,2,3,4,5,6,7};
		
		try {
			for(int i=0; i<10; i++) {
				System.out.println(arry[i]);
			}
		}catch(Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
			System.out.println(e);
		}finally {
			System.out.println("��ħ ����");
		}
		System.out.println("���α׷� ����");
	}
}
