// 절차지향 빙고
import java.util.Scanner;

public class Bingo_for {
	public static void main(String[] args) {
		//[0] 사용할 변수를 선언한다
		int Answer = 0; // 게임 정답
		int Max = 5; // 게임 최대회수
		int Life = 0; //남은 회수
		int UserKey = 0; //사용자에게 입력받은 값을 정수로 넣은 변수
		boolean flag =  false; //정답을 맞췄는지 체크하는 플래그
		
		//[1] 변수들을 초기화한다 / 입력값을 받는다
		Scanner keyIn = new Scanner(System.in);
		// 게임을 세팅한다
		Answer = (int)(Math.random() * 100) % 100 + 1;
		System.out.println("정답 : " + Answer);
		
		//[2] 지정된 횟수만큼 게임을 반복한다
		for(int i=0; i<Max; i++) {
			// 남은 기회 계산
			Life = Max - i;
			System.out.println("[남은 기회 " + Life + "번]");
			System.out.print("정답을 입력하세요 : ");
			// 사용자에게 입력받는다.
			UserKey = keyIn.nextInt();
			
			// 입력받은 정수와 정답을 비교한다
			if(Answer < UserKey) {
				if(Life!=1) {
					System.out.println("Down");
				}
			} else if(Answer > UserKey) {
				if(Life!=1) {
					System.out.println("Up");
				}
			} else {
				System.out.println("정답입니다.");
				flag = true;
				break;
			}
		}
		
		//[3] 정답을 맞췄는지 체크한다
		if(flag == false) {
			System.out.println("바보");
		}
		//[4] 정답과 게임 결과를 출력한다
		System.out.println("정답 : " + Answer + "입니다.");
		
		//[5] 입력용 스캐너 객체를 닫아준다. 
		keyIn.close();
	}
}
