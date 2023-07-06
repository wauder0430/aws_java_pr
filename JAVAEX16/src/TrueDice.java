
public class TrueDice {
	public static void main(String[] args) {
		// 절차형
		// [0] 변수 선언 및 초기화
		// 주사위 1번
		// 주사위 2번
		// 합계를 저장할 변수
		
		// [1] 주사위를 돌림
		// 1번 주사위를 생성 -random 사용
		// 2번 주사위를 생성
		// 두 주사위의 눈의 함을 구함
		// 두 주사위의 눈을 출력함
		// 합이 5가 아니면 반복
		int dice1;
		int dice2;
		int sum = 0;
		System.out.println("whiletrue===========");
		while(true) {
			if(sum==5) {
				break;
			}
			dice1 = (int)(Math.random()*120) %6 +1;
			dice2 = (int)(Math.random()*120) %6 +1;
			System.out.println("1번 주사위 : " + dice1 +"\n2번 주사위 : " + dice2);
			sum = dice1+ dice2;
			System.out.println("주사위의 합 : " + sum);
			System.out.println("--------------------");	
		}
		System.out.println("====================");
		sum=0;
		System.out.println("while===============");
		while(sum!=5) {
			dice1 = (int)(Math.random()*120) %6 +1;
			dice2 = (int)(Math.random()*120) %6 +1;
			System.out.println("1번 주사위 : " + dice1 +"\n2번 주사위 : " + dice2);
			sum = dice1+ dice2;
			System.out.println("주사위의 합 : " + sum);
			System.out.println("--------------------");
		}
		System.out.println("====================");
		System.out.println("flag================");
		boolean flag = true;
		while(flag) {
			
			dice1 = (int)(Math.random()*120) %6 +1;
			dice2 = (int)(Math.random()*120) %6 +1;
			System.out.println("1번 주사위 : " + dice1 +"\n2번 주사위 : " + dice2);
			sum = dice1+ dice2;
			System.out.println("주사위의 합 : " + sum);
			System.out.println("--------------------");
			if(sum==5) {
				flag=false;
			}
		}
		System.out.println("====================");
		System.out.println("dowhile=============");
		do {
			dice1 = (int)(Math.random()*120) %6 +1;
			dice2 = (int)(Math.random()*120) %6 +1;
			System.out.println("1번 주사위 : " + dice1 +"\n2번 주사위 : " + dice2);
			sum = dice1+ dice2;
			System.out.println("주사위의 합 : " + sum);
			System.out.println("--------------------");
		} while(sum!=5);
		System.out.println("====================");
	}
}
