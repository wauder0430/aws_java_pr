
public class ex07_array_quest {

	public static void main(String[] args) {
		// ���޹��� �����ʹ� ���� ���ڿ��� ��찡 �����ϴ�.
		
		// ȫ�浿/20/����
		// ��浿/30/����
		// �̱浿/10/����
		// "ȫ�浿/20/����, ��浿/30/����, �̱浿/10/����";
		// �̸�, ����, ������ ����ϰ�
		// ��� ���̸� ���ϼ���
		
		// ,�� ���ڿ��� ������ 3���� ������ �迭�� �и���
		// [0] ->�̸�
		// [1] ->����
		// [2] ->����
		/*String data = "ȫ�浿/20/����,��浿/30/����,�̱浿/10/����";
		data = data.trim();
		int sum=0;
		String[] members = data.split(",");
		for(String member : members) {
			System.out.println(member);
			String[] item = member.trim().split("/");
			System.out.println("�̸� : " + item[0]);
			System.out.println("���� : " + item[1]);
			sum += Integer.parseInt(item[1].trim());
			System.out.println("���� : " + item[2]);
		}
		System.out.println("��� ���� : " + sum/members.length);
		*/
		// �̸�:��������/��������/��������,����,����
		// "ȫ�浿:11/22/33,��浿:44/55/66,�̱浿:77,88,99";
		
		/*
		int sum_kor=0, sum_eng=0, sum_math=0;
		
		String stu_data = "ȫ�浿:11/22/33,��浿:44/55/66,�̱浿:77/88/99";
		stu_data = stu_data.trim();
		String[] student = stu_data.split(",");
		String[][] item = new String[student.length][];
		
		int index=0; // ���� for�� �ε��������� ���� ����
		for(String member : student) {		
			System.out.println(member);
			item[index] = member.trim().split(":|/");
			//member = member.replace(":", "/"); // ó���� replace�� :��/�� ��ȯ�������� split�� ���� ���ڰ��� ���� �� ����
			//String[] item = member.trim().split("/");
			sum_kor += Integer.parseInt(item[index][1].trim());
			sum_eng += Integer.parseInt(item[index][2].trim());
			sum_math += Integer.parseInt(item[index][3].trim());
			index++;
		}
		
		System.out.printf("���� ��� : %d\n���� ��� : %d\n���� ��� : %d\n", sum_kor/student.length, 
				sum_eng/student.length, sum_math/student.length); 
		*/
		
		String input_data = "ȫ�浿:11/22/33,��浿:44/55/66,�̱浿:77/88/99";
		String[] datas = null; 
		// datas.length => �ο���
		
		// �� ������ �����Ͱ� �� ���� ���� -> �̸� : ������
		String[] student = null;
		
		// ������ ��� ���� 2���� �迭
		int[][] score_arry = null;
		// score_arry[�ο���][�����]
		
		// �հ� ������ ���� �迭 ����
		int[] sum_arry = null;
		// sum_arry[�����]
		
		// �����͸�,�� �߶� dats �迭�� ����
		datas = input_data.trim().split(",");
		
		// ������ ���� �迭�� row�� �ο����� �ʱ�ȭ
		score_arry = new int[datas.length][];
		
		for(int i=0; i<datas.length; i++) {
			//  �� �����͸� ó��
			student = datas[i].trim().split(":");
			System.out.println("�л��̸� : " + student[0]);
			System.out.println("�л����� : " + student[1]);
			String[] tmp = student[1].trim().split("/");
			// ����� : tmp.length
			sum_arry = new int[tmp.length];
			score_arry[i] = new int[tmp.length];
			for(int col=0; col<tmp.length; col++) {
				score_arry[i][col] = Integer.parseInt(tmp[col].trim());
			}
		}
		
		for(int[] row : score_arry) {
			for(int col=0; col<row.length; col++) {
				sum_arry[col] += row[col];
			}
		}
		
		for(int sum : sum_arry) {
			System.out.println( sum/datas.length);
		}
		
		
	}

}
