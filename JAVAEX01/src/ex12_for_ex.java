
public class ex12_for_ex {

	public static void main(String[] args) {
		// 0에서 100까지 반복하면서 
		// 1. 홀수만 더하기 -> 홀짝체크 / 2씩 증가하는 버전
		// 2. 5의 배수 더하기 -> 원하는 버전으로 1개 
		// 3. 구구단 3단 출력
		// 1번01
		int result = 0;
		for (int i=0; i<=100; i++) {
			if(i%2!=0) {
				result += i;
			}
		}
		System.out.println("1-01 : " + result);
		result=0;
		// 1번02
		for(int i=1; i<=100; i+=2) {
			result += i;
		}
		System.out.println("1-02 : " + result);
		result=0;
		// 2번
		for(int i=5; i<=100; i+=5) {
			result += i;
		}
		System.out.println("2 : " + result);
		result=0;
		
		// 3번
		for(int i=1; i<10; i++) {
			System.out.println("3 * " + i + " = " + 3*i);
		}
	}

}
