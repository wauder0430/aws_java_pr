
public class Calculator {
	// ���� 2��, ������ 1���� ���� �ʵ�	
	// Ŭ������ ��� ��ü�� ���� �ʵ带 ����ϰ��� �Ҷ����� static���� ����
	// �ʵ��� ���� ������ �� ���� �Ҷ����� final Ű���� ���
	final static double PI = 3.141592;
	private int num_x;
	private int num_y;
	private String op = "";
	
	// �⺻ ������
	Calculator(){ }
	Calculator(int x, int y, String op){
		// �����ڷ� �ʵ忡 ���� ������ ��� �޾Ƽ� 
		// setter�� �̿��� �ʵ忡 �ֽ��ϴ�.
		this.setNum_x(x);
		this.setNum_y(y);
		this.setOp(op);
	}
	
	// ���� 2���� ���� �ʱ�ȭ �� setter
	// Person���� setter�� ȣ���Ҷ� �Էµ� ���ڰ��� ��ȿ�� �������� Ȯ��
	// �ι�° ������ �����ڰ� �������϶��� 0�� �Է¹����� �ȵȴ�.
	public void setNum_x(int num) {
		// �����̱⸸ �ϸ� ���� ����
		this.num_x = num;
	}
	public void setNum_y(int num) {
		if(this.op.equals("/") && num == 0) {
			// 0���� ������ ��Ȳ
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println("�ٸ� ���ڸ� �Է��ϼ���.");
			return;
		}
		this.num_y = num;
	}
	public void setOp(String op) {
		// op�� +-/* 4���� �Է°��� ����
		if(op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*")) {
			this.op = op;
		}else {
			System.out.println("�����ڴ� + - * / �� ����� �� �ֽ��ϴ�.");
			return;
			}
		if(op.equals("/") && this.num_y == 0) {
			System.out.println("Y�� 0�϶����� ������ ������ �� �� �����ϴ�.");
			this.op = "";
			return;
		}	
	}
	
	// getters
	public int getNum_x() {
		return num_x;
	}
	public int getNum_y() {
		return num_y;
	}
	public String getOp() {
		if(this.op.equals("")) {
			return "ERROR";
		}
		return op;
	}
	
	// ������ �� �޼ҵ�
	public  void DoCal(int x, int y, String op) {
		int result = 0; // �޼ҵ� ���ο��� ����� ���� ����� �ʱ�ȭ
		this.setNum_x(x);
		this.setNum_y(y);
		this.setOp(op);
		
		if(this.getOp().equals("ERROR")) {
			System.out.println("�����ڰ� �Էµ��� �ʾҽ��ϴ�.");
			return;
		}
		
		// op�� ���� ������ ����
		switch (this.op) {
			case "+" :
				result = this.getNum_x() + this.getNum_y();
				break;
			case "-" :
				result = this.getNum_x() - this.getNum_y();
				break;
			case "*" :
				result = this.getNum_x() * this.getNum_y();
				break;
			case "/" :
				if(this.num_y != 0 ) {
				result = this.getNum_x() / this.getNum_y();
				break;
				} else {
					System.out.println("0���� ���� �� �����ϴ�.");
					return;
				}
			default :
				System.out.println("�����ڰ� ���õ��� �ʾҰų� 0���� ������ ����Դϴ�.");
				return;
		}
		//return result;
		System.out.println(this.num_x + " " 
				+this.op + " " + this.num_y + " = " + result);
	}
	
	public static void main(String[] args) {
		// static���� ����� �ʵ��, Ŭ���������� �����Ͽ� ȣ���Ѵ�.
		System.out.println(Calculator.PI);
		Calculator cal = new Calculator();
		cal.DoCal(13, 0, "/");	
	}
}
