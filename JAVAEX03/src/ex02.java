import java.util.Scanner;

public class ex02 {
	
	public static int Sum(int a[]) {
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// �� ������ ��� ������ ���� ������ ���ϼ���
		int score[] = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<score.length; i++) {
			System.out.print("������ �Է��ϼ��� : ");
			score[i] = sc.nextInt();
		}
		int sum = Sum(score);
		float avg = (float)sum / score.length;
		System.out.println("���� �հ� : " + sum);
		System.out.println("���� ��� : " + avg);
		
		// �迭�� ���Ҵ� �ε����� �����Ͽ� ȣ�� �� �� ������ ����
		score[0] = 50;
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		sc.close();
	}

}
