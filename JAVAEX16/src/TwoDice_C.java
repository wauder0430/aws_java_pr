
public class TwoDice_C {

	private int dice1;
	private int dice2;
	private int sum = 0;
	
	// �ֻ����� ������ �޼ҵ�
	public int getDice(){
		int result = (int)(Math.random()*100) %6 + 1;
		return result;
	}
	
	// �� �ֻ����� ���� 5�϶����� �ֻ����� ������ �޼ҵ� ->game
	public void game() {
		this.dice1 = this.getDice();
		this.dice2 = this.getDice();
		this.sum = this.dice1 + this.dice2;
		System.out.println("1�� �ֻ��� : " + this.dice1 +"\n2�� �ֻ��� : " + this.dice2);
		System.out.println("�ֻ����� �� : " + this.sum);
		System.out.println("=======================");
		if(this.sum != 5) {
			this.game();
		}
	}
	
	public static void main(String[] args) {
		// Ŭ�����κ��� ��ü��  ����
		//
		TwoDice_C game = new TwoDice_C();
		game.game();
		
	}

}
