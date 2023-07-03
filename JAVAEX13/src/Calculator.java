
public class Calculator {
	// 정수 2개, 연산자 1개를 넣을 필드	
	// 클래스의 모든 객체가 같은 필드를 사용하고자 할때에는 static으로 선언
	// 필드의 값을 변경할 수 없게 할때에는 final 키워드 사용
	final static double PI = 3.141592;
	private int num_x;
	private int num_y;
	private String op = "";
	
	// 기본 생성자
	Calculator(){ }
	Calculator(int x, int y, String op){
		// 생성자로 필드에 넣을 값들을 모두 받아서 
		// setter를 이용해 필드에 넣습니다.
		this.setNum_x(x);
		this.setNum_y(y);
		this.setOp(op);
	}
	
	// 정수 2개의 값을 초기화 할 setter
	// Person에서 setter를 호출할때 입력된 인자값이 유효한 범위인지 확인
	// 두번째 정수는 연산자가 나누기일때에 0을 입력받으면 안된다.
	public void setNum_x(int num) {
		// 정수이기만 하면 문제 없음
		this.num_x = num;
	}
	public void setNum_y(int num) {
		if(this.op.equals("/") && num == 0) {
			// 0으로 나누는 상황
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("다른 숫자를 입력하세요.");
			return;
		}
		this.num_y = num;
	}
	public void setOp(String op) {
		// op는 +-/* 4가지 입력값만 받음
		if(op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*")) {
			this.op = op;
		}else {
			System.out.println("연산자는 + - * / 만 사용할 수 있습니다.");
			return;
			}
		if(op.equals("/") && this.num_y == 0) {
			System.out.println("Y가 0일때에는 나누기 연산을 할 수 없습니다.");
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
	
	// 연산을 할 메소드
	public  void DoCal(int x, int y, String op) {
		int result = 0; // 메소드 내부에서 사용할 변수 선언과 초기화
		this.setNum_x(x);
		this.setNum_y(y);
		this.setOp(op);
		
		if(this.getOp().equals("ERROR")) {
			System.out.println("연산자가 입력되지 않았습니다.");
			return;
		}
		
		// op에 따라서 연산을 수행
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
					System.out.println("0으로 나눌 수 없습니다.");
					return;
				}
			default :
				System.out.println("연산자가 선택되지 않았거나 0으로 나누는 경우입니다.");
				return;
		}
		//return result;
		System.out.println(this.num_x + " " 
				+this.op + " " + this.num_y + " = " + result);
	}
	
	public static void main(String[] args) {
		// static으로 선언된 필드는, 클래스명으로 접근하여 호출한다.
		System.out.println(Calculator.PI);
		Calculator cal = new Calculator();
		cal.DoCal(13, 0, "/");	
	}
}
