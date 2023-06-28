// 계산기 클래스
public class Calculator {
	
	// 접근 제어자 public protected default private
	int x=0;
	int y=0;
	
	// 반환값이 있는 메소드 
	int add() { 
		return x + y;
	}
	int sub() { 
		return x - y;
	}
	int mul() { 
		return x * y;
	}
	double div() { 
		if(y==0) {
			return 0;
		} else {
			return (double)x / y;
		}
	}
	
}
