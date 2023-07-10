public class EX03_switch
{
	public static void main(String[] args)
	{
/*		switch case
		switch( 변수 )
		{
		// 변수의 값이 정수형일 경우
		case 0 :
		case 1 :
		
		// 변수의 값이 char형인 경우
		case 'A' :
		case 'B' :
		
		// 변수의 값이 문자열인 경우
		case "JAVA" :
		case "C++" :
		
		// 각각의 케이스 작성 예
		case "경우1" :
			실행할 내용
			break;			// 다른 경우를 실행하지 않고 switch 구역을 벗어남 
		case "경우2" :
			실행할 내용
			break;
			...
		case "경우n" :
			실행할 내용
			break;
		default :			// 변수의 값이 해당하는 case가 존재하지 않았을때
			실행할 내용
		}
*/
		char score = 'F';
		switch( score )
		{
		case 'A':
			System.out.println("A학점입니다.");
			break;
		case 'B':
			System.out.println("B학점입니다.");
			break;
		case 'C':
			System.out.println("C학점입니다.");
			break;
		case 'D':
			System.out.println("D학점입니다.");
			break;
		default:
			System.out.println("낙제입니다.");
		}
		
		int dice;
		dice = (int)(Math.random()*100) % 6 + 1;
		switch( dice )
		{
		case 1 :
			System.out.println("주사위의 눈은 1입니다.");
			break;
		case 2 :
			System.out.println("주사위의 눈은 2입니다.");
			break;
		case 3 :
			System.out.println("주사위의 눈은 3입니다.");
			break;
		case 4 :
			System.out.println("주사위의 눈은 4입니다.");
			break;
		case 5 :
			System.out.println("주사위의 눈은 5입니다.");
			break;
		case 6 :
			System.out.println("주사위의 눈은 6입니다.");
			break;
		}
	}
}