
public class Calculator {
	// 정수 2개, 연산자 1개를 넣을 필드
	private int num_x;
	private int num_y;
	private String op = "";
	
	// 기본 생성자
	Calculator(){ }
	Calculator(int x, int y, String op){
		// 생성자로 필드에 넣을 값들을 모두 받아서 
		// setter를 이용해 필드에 넣습니다.
		this.setNum_x(x);
		this.setOp(op);
		this.setNum_y(y);
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
		} else {
		System.out.println("연산자는 + - * / 만 사용할 수 있습니다.");
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
	
	// 연산을 할 메소드
	public  void DoCal() {
		int result = 0; // 메소드 내부에서 사용할 변수 선언과 초기화
		// op에 따라서 연산을 수행
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
					System.out.println("0으로 나눌 수 없습니다.");
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
