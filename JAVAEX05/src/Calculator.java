// ���� Ŭ����
public class Calculator {
	
	// ���� ������ public protected default private
	int x=0;
	int y=0;
	
	// ��ȯ���� �ִ� �޼ҵ� 
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
