
public class Person {

	public static void main(String[] args) {
		// 계산기 객체를 만들고 
		Calculator cal = new Calculator();
		// setter로 입력값을 넣고
//		cal.setNum_x(10);
//		cal.setOp("+");
//		cal.setNum_y(3);
//		
//		// 메소드를 통해 연산을 한다
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
