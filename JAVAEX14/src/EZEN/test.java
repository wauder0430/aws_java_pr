package EZEN;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		// Circle�κ��� ��ü�� ����,
		// �������� �Է��ϰ� �ѷ��� ���̸� ���Ѵ�.
		Circle c = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է����ּ���. : ");
		c.setR(sc.nextDouble());
		
		System.out.println("�ѷ� : " + c.getRound());
		System.out.println("���� : " + c.getArea());
		
		sc.close();
	}
}
