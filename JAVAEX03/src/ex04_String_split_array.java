
public class ex04_String_split_array {

	public static void main(String[] args) {
		// ������ ������[] = {}; �迭 ��ü
		// ������ ������[] = new ������[] {};
		// ������ ������[] = new ������[����];
		// ������ = �迭��ü; -> ���̰� ���ƾ���
		/* int arr[] = null;	�ʱ�ȭ �ܰ迡���� ������ ���
		arr = { 1,2,3,4,5 } �Ұ��� */ 
		
		String math = "100,80,90,50,70";
		int score[] = null;
		// Math�� �����Ͽ�, ������ �迭�� ����� score�� �ִ´�.
		// score�κ��� ��� ������ ���Ѵ�.
		int sum = 0;
		float avg = 0;
		// ���ڿ��� ��ǥ�� �������� �߶� ���ڿ� �迭�� �����.
		String tmp[] = math.split(",");
		for(int i=0; i<tmp.length; i++) {
			System.out.println(tmp[i]);
		}
		
		// �迭�� ���̸� �����ͼ� 
		// ������ �迭 score�� ���ڿ� �迭�� ���̷� �����Ѵ�.
		score = new int[tmp.length];
		// �� �迭�� ���� index�� ���ҵ��� parseInt�� ���ڿ��� ������ ��ȯ
		for(int i=0; i<tmp.length; i++) {
			score[i] = Integer.parseInt(tmp[i].trim());
			System.out.println("score"+ (i+1) + " : " + score[i]);
			sum += score[i];
		}
		avg = (float)sum / score.length;
		System.out.println("��� : " + avg);
		
		// ���� for
		sum = 0;
		for(int num : score) {
			System.out.println(num);
			sum += num;
		}
		System.out.println(sum); 
	}

}
