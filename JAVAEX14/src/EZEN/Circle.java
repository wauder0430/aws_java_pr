package EZEN;

public class Circle {
	// ���� �ѷ��� ���̸� ����ϴ� Ŭ����
	// �������� ���� ������ �ʴ� ����� �������ּ���
	final double PI = 3.141592;	//������
	double radious;	//������
	
	public void setR(double radious) {
		this.radious = radious;
	}
	
	// �ѷ��� ���ϴ� �޼ҵ�
	public double getRound() {
		double result = 0.0;
		result = 2 * PI * radious;
		return result;
	}
	// ���̸� ���ϴ� �޼ҵ�
	public double getArea() {
		double result = 0.0;
		result = PI * radious * radious;
		return result;
	}
	
}
