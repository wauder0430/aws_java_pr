package ezen;

public class Calculator
{
	// 정수 2개, 문자열 1개를 받아 계산 결과를 반환하는 메소드
	public int Docal( int x, int y, String op)
	{
		// 계산값을 저장할 변수 선언
		int result = 0;
		
		switch(op)
		{
		case "+" : result = x + y; break; 
		case "-" : result = x - y; break; 
		case "*" : result = x * y; break; 
		case "/" :
//			if( y == 0 ) { break; }
//			result = x / y; break; 
			if( y != 0 ) { result = x / y; break; }
			break;
		}

		// 계산값을 반환
		return result;
	}
}
