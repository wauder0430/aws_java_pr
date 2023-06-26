public class ex10_switch
{
	public static void main(String[] args)
	{
		// 6면체 주사위를 생성하고
		int dice_six = ((int)(Math.random()*100) % 6) + 1;
		// switch case문으로
		// "주사위의 눈은 ##입니다"
		/*	switch(변수)
			{
			case 리터럴 :
				실행할 코드;
				break;
			case 리터럴 :
				실행할 코드;
				break;
			default :
				실행할 코드;
			} */
		switch(dice_six)
		{
		case 1 :
			System.out.println("주사위의 눈은 1입니다");
			break;
		case 2 :
			System.out.println("주사위의 눈은 2입니다");
			break;
		case 3 :
			System.out.println("주사위의 눈은 3입니다");
			break;
		case 4 :
			System.out.println("주사위의 눈은 4입니다");
			break;
		case 5 :
			System.out.println("주사위의 눈은 5입니다");
			break;
		case 6 :
			System.out.println("주사위의 눈은 6입니다");
			break;
		}
//		System.out.println("주사위의 눈은 " + dice_six + "입니다");
		// M이면 남성 F면 여성
		char gender = 'A';
		switch(gender)
		{
		case 'M' :
			System.out.println("남성입니다");
			break;
		case 'F' :
			System.out.println("여성입니다");
			break;
		default :
			System.out.println("ERROR");
		}
	}
}