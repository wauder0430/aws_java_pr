// ���� Ŭ������ ����ϴ� ��� Ŭ����
public class Person {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.x = 10;
		cal.y = 10;
		
		double result = 0;
		result = cal.add();
		System.out.println("���ϱ� : " + result);
		result = cal.sub();
		System.out.println("���� : " + result);
		result = cal.mul();
		System.out.println("���ϱ� : " + result);
		result = cal.div();
		System.out.println("������ : " + result);
		
	}

}
