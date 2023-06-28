// 계산기 클래스
public class Calculator {
	// 인자값이 있는 메소드
	// 반환값의 변수타입 / 메소드명( 인자값의 변수타입 / 변수명 ) 
	/* { 
	 	인자값의 변수명으로 접근
	 	}
	 */
	int add(int i, int j) { 
		return i + j;
	}
	int sub(int i, int j) { 
		return i - j;
	}
	int mul(int i, int j) { 
		return i * j;
	}
	double div(int i, int j) { 
		//[0] 내부에서 사용할 변수의 선언과 초기화
		double result;
		//[1] 로직
		if(j==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("두번째 인자값은 0이외의 정수를 입력하세요");
			return 0;
		}
		else {
			result = (double)i / j;
		}
		//[2] 반환
		return result;
	}
	
	// 정수를 입력 받아서 0부터 입력받은 정수까지의 총 합계를 반환하는 메소드
	int SumAll(int max) {
		int result = 0;
		
		for(int i=0; i<=max; i++) {
			result += i;
		}
		
		return result;
	}
	
	// 정수를 입력 받아서 0부터 입력받은 정수까지의 홀수를 더하는 메소드
	int SumOdd(int max) {
		int result = 0;
		for(int i=1; i<=max; i+=2) {
			result += i;
		}
		return result;
	}
	// 정수를 입력 받아서 0부터 입력받은 정수까지의 짝수를 더하는 메소드
	int SumEven(int max) {
		int result = 0;
		for(int i=2; i<=max; i+=2) {
			result += i;
		}
		return result;
	}
}
