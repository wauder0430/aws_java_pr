import java.util.Scanner;

// 객체를 이용한 bingo
public class BingoGame {
	// 필드 선언부
	private int life; // 게임 횟수
	private int answer; // 게임 정답
	private Scanner scn; // 입력을 받는 스캐너 개첵 참조변수
	
	private void start(int life) { // 게임을 시작하는 메소드
		this.life = life; // 게임 횟수를 생성
		this.scn = new Scanner(System.in); // 게임을 시작하기 위해서, 스캐너 객체를 생성
		this.answer = (int)(Math.random() * 100) %100 +1; // 1~100 사이의 정수를 생성
		System.out.println(this.life);
		System.out.println(this.answer);
	}
	
	// 게임을 플레이하는 메소드
	private void run() {
		// 정답관련 플래그
		boolean flag = false;
		// 게임을 life만큼 플레이를 시키는 내용
		for (int i=0; i<this.life; i++) {
			// 남은 기회 출력
			System.out.println("남은 기회 : " + (this.life-i));
			// 입력을 받고
			System.out.print("정답을 입력하세요 : ");
			int keyIn = this.scn.nextInt();
			// 정답과 입력값을 비교
			
			if(this.answer > keyIn) {
				System.out.println("Up");
			} else if(this.answer < keyIn) {
				System.out.println("Down");
			} else { // flag가 t이면 반복 종료
				System.out.println("Bingo");
				flag = true;
				break;
			}
		}
		// 정답을 못맞췄으면 정답을 보여줌
		if(flag == false) {
			System.out.println("정답은 " + this.answer + "입니다.");
		}
	}
	
	// 게임을 종료하는 메소드
	private boolean end() {
		boolean flag = false;
		// 사용자의 게임을 중단하고, 프로그램을 종료시킬것인지 확인하는 메소드
		System.out.print("새 게임을 다시 시작하시겠습니까? [예:1/아니오:0] ");
		int keyIn = scn.nextInt();
		if(keyIn == 1) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
	
	// 빙고 게임을 클래스를 작동시킬 메소드
	public void play( int life ) {
		do {
			start(life);
			run();
		} while(end());
		//true false의 여부에 따라 반복
		scn.close();
	}

}
