package EZEN;

public class Circle {
	// ���� �ѷ��� ���̸� ����ϴ� Ŭ����
	// �������� ���� ������ �ʴ� ����� �������ּ���
	final double PI = 3.141592;	//������
	double radious;	//������
	
	public void setR(double radious) {
		this.radious = radious;
	}
	
	public double getR() {
		return this.radious;
	}
	// �ѷ��� ���ϴ� �޼ҵ�
	public double getRound() {
		double result = 0.0;
		if(getR() > 0) {
		result = 2 * PI * radious;
		} else {
			return -1;
		}
		return result;
	}
	// ���̸� ���ϴ� �޼ҵ�
	public double getArea() {
		double result = 0.0;
		if(getR() > 0) {
		result = PI * radious * radious;
		} else {
			return -1;
		}
		return result;
	}
	
}
