// ���� Ŭ������ ����ϴ� ��� Ŭ����
public class Person {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		double result = 0;
		result = cal.add(50,50);
		System.out.println("���ϱ� : " + result);
		result = cal.sub(500,100);
		System.out.println("���� : " + result);
		result = cal.mul(24, 25);
		System.out.println("���ϱ� : " + result);
		result = cal.div(25,0);
		System.out.println("������ : " + result);
		
		int sum = 0;
		sum = cal.SumAll(100);
		System.out.println("max���� ���ϱ�: " + sum);
		sum = cal.SumOdd(5);
		System.out.println("max���� Ȧ�� ���ϱ�: " + sum);
		sum = cal.SumEven(999);
		System.out.println("max���� ¦�� ���ϱ�: " + sum);
	}

}
