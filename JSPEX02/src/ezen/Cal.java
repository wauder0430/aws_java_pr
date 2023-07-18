package ezen;

public class Cal
{	// 정수와 연산자를 저장할 필드
	int x;
	int y;
	String op = "";

	// 기본 생성자
	public Cal() {}
	
	// 문자열 세개를 받아 필드에 저장하는 변형된 생성자
	public Cal( String x, String y, String op)
	{	// 유효성 검사
		if( x == null || x.equals("") ) { x = "0"; }
		if( y == null || y.equals("") ) { y = "0"; }
		if( op == null || op.equals("") ) { op = "+"; }
		// 정수로 변환하여 필드에 저장
		try	{ this.x = Integer.parseInt(x); this.y = Integer.parseInt(y); }catch(Exception e){ }
		this.op = op;
	}

	public int Docal()
	{ // 필드의 정수를 가져와 계산 결과를 반환
		int result = 0;
		switch(this.op)
		{
		case "+" : result = x + y; break; 
		case "-" : result = x - y; break; 
		case "*" : result = x * y; break;
		case "/" :
			if( y != 0 ) { result = x / y; break;}
			break;
		}
		return result ;
	}
}
