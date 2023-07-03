
public class Calculator {
	// ���� 2��, ������ 1���� ���� �ʵ�
	private int num_x;
	private int num_y;
	private String op = "";
	
	// �⺻ ������
	Calculator(){ }
	Calculator(int x, int y, String op){
		// �����ڷ� �ʵ忡 ���� ������ ��� �޾Ƽ� 
		// setter�� �̿��� �ʵ忡 �ֽ��ϴ�.
		this.setNum_x(x);
		this.setOp(op);
		this.setNum_y(y);
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
		} else {
		System.out.println("�����ڴ� + - * / �� ����� �� �ֽ��ϴ�.");
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
		return op;
	}
	
	// ������ �� �޼ҵ�
	public  void DoCal() {
		int result = 0; // �޼ҵ� ���ο��� ����� ���� ����� �ʱ�ȭ
		// op�� ���� ������ ����
		switch (this.op) {
			case "+" :
				result = this.num_x + this.num_y;
				break;
			case "-" :
				result = this.num_x - this.num_y;
				break;
			case "*" :
				result = this.num_x * this.num_y;
				break;
			case "/" :
				if(this.num_y != 0 ) {
				result = this.num_x / this.num_y;
				break;
				} else {
					System.out.println("0���� ���� �� �����ϴ�.");
					return;
				}
		}
		//return result;
		PrintCal();
		System.out.println(" = " + result);
	}
	
	public void PrintCal() {
		System.out.print(this.num_x + " " 
	+this.op + " " + this.num_y);
	}
}
