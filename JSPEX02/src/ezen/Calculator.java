package ezen;

public class Calculator
{
	// ���� 2��, ���ڿ� 1���� �޾� ��� ����� ��ȯ�ϴ� �޼ҵ�
	public int Docal( int x, int y, String op)
	{
		// ��갪�� ������ ���� ����
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

		// ��갪�� ��ȯ
		return result;
	}
}
