package ezen;

public class Cal
{	// ������ �����ڸ� ������ �ʵ�
	int x;
	int y;
	String op = "";

	// �⺻ ������
	public Cal() {}
	
	// ���ڿ� ������ �޾� �ʵ忡 �����ϴ� ������ ������
	public Cal( String x, String y, String op)
	{	// ��ȿ�� �˻�
		if( x == null || x.equals("") ) { x = "0"; }
		if( y == null || y.equals("") ) { y = "0"; }
		if( op == null || op.equals("") ) { op = "+"; }
		// ������ ��ȯ�Ͽ� �ʵ忡 ����
		try	{ this.x = Integer.parseInt(x); this.y = Integer.parseInt(y); }catch(Exception e){ }
		this.op = op;
	}

	public int Docal()
	{ // �ʵ��� ������ ������ ��� ����� ��ȯ
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
