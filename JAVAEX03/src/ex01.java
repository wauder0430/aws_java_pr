public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 : ���� �������� ���� �������� ����
		// ������ ������ �����ؼ� ����Ѵ�.
		
		// �迭�� ���� 
		int score[] = {90, 100, 70, 50, 80, 100};
		int[] student = new int[6];
		//int[] subject = null;
		for(int i=0; i<score.length; i++) {
			System.out.println("score" + (i+1) + "�� �� : " + score[i]);
		}
		for(int i=0; i<student.length; i++) {
			student[i]=score[i];
		}
		
		for(int i=0; i<score.length; i++) {
			System.out.println("student" + (i+1) + "�� �� : " + student[i]);
		}
	}

}
