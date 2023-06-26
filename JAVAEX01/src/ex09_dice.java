public class ex09_dice
{
	public static void main(String[] args)
	{
		// 6면체 주사위
		// 소수점의 랜덤한 숫자값을 생성 * 100
		// 0부터 100미만의 실수값
		double rnd = Math.random() * 100;
		System.out.println("랜덤숫자 : " + rnd);
		// 정수형으로 변환
		int dice = (int)rnd;
		System.out.println("정수변환 : " + dice);
		// 0 ~ 99 범위의 정수
		// 6으로 나눈 나머지에 1을 더한다
		// 0 ~ 5 0 -> 1 ~ 6
		dice = dice%6 +1;
		System.out.println("6면체 주사위 : " + dice);
		
		int dice_six = ((int)(Math.random()*100) % 6) + 1;
		System.out.println("6면체 주사위 : " + dice_six);
	}
}