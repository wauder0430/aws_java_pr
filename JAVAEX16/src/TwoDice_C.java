
public class TwoDice_C {

	private int dice1;
	private int dice2;
	private int sum = 0;
	
	// 주사위를 굴리는 메소드
	public int getDice(){
		int result = (int)(Math.random()*100) %6 + 1;
		return result;
	}
	
	// 두 주사위의 합이 5일때까지 주사위를 굴리는 메소드 ->game
	public void game() {
		this.dice1 = this.getDice();
		this.dice2 = this.getDice();
		this.sum = this.dice1 + this.dice2;
		System.out.println("1번 주사위 : " + this.dice1 +"\n2번 주사위 : " + this.dice2);
		System.out.println("주사위의 합 : " + this.sum);
		System.out.println("=======================");
		if(this.sum != 5) {
			this.game();
		}
	}
	
	public static void main(String[] args) {
		// 클래스로부터 객체를  생성
		//
		TwoDice_C game = new TwoDice_C();
		game.game();
		
	}

}
