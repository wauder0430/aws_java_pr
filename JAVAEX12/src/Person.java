
public class Person {

	public static void main(String[] args) {
		// ���� ��ü�� ����� 
		Calculator cal = new Calculator();
		// setter�� �Է°��� �ְ�
//		cal.setNum_x(10);
//		cal.setOp("+");
//		cal.setNum_y(3);
//		
//		// �޼ҵ带 ���� ������ �Ѵ�
//		cal.DoCal();
//		cal.setOp("-");
//		cal.DoCal();
//		cal.setOp("*");
//		cal.DoCal();
//		cal.setOp("/");
//		cal.DoCal();
		
		cal = new Calculator(10,0,"/");
		cal.DoCal();
	}

}
