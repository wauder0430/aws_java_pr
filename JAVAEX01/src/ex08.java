import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// ������ x�� �����ϰ�
		// ������ �Ҵ��� ��
		// ¦������ Ȧ������ �Ǻ��Ͽ� 
		// "¦���Դϴ�." "Ȧ���Դϴ�."�� ���
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		x = sc.nextInt();
		if(x%2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		//sc.close();
		
		// ������ age ���� �� ���� �Ҵ�
		// age�� 10�̸��̸� "�Ƶ��Դϴ�."
		// 20�̸��̸� "�̼������Դϴ�."
		// 20�̻��̸� "�����Դϴ�."
		int age;
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		if(age < 10) {
			System.out.println("�Ƶ��Դϴ�.");
		} else if(age < 20) {
			System.out.println("�̼������Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		// int�� score ������ ������ �Ҵ��ϰ�
		// 0~100 ��������
		// score 90�̻��̸� A
		// 80�̻� 90�̸��̸� B
		// 70�̻� 80�̸��̸� C
		// 70�̸��̸� D
		int score;
		System.out.print("������ �Է��ϼ��� : ");
		score=sc.nextInt();
		while(!(score >= 0 && score <= 100)) {
			System.out.print("������ ������ϴ�. \n�ٽ� �Է��ϼ��� : ");
			score=sc.nextInt();
		}
		sc.close();
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80 && score < 90) {
			System.out.println("B");
		} else if(score >= 70 && score < 80) {
			System.out.println("C");
		} else {
			System.out.println("�����");
		}
		
	}

}