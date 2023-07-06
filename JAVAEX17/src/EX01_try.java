
public class EX01_try {

	public static void main(String[] args) {
		/* try {오류가 일어날만한 내용} catch(예외클래스 객체변수명){객체 변수명 사용} 
 			try {실행코드} 
 			catch(예외클래스 객체변수명)
 			{예외 처리 내용} 
 			finally
 			{최종 실행 내용 }
		 * */
		
		int x = 10;
		int y = 0;
		int result = 0;
		
		try {
		result = x/y; //ArithmeticException
		System.out.println(result);
		} catch (Exception e){
			System.out.println(e);
			e.printStackTrace();
		} finally { // try에서 오류가 발생하든 안하든 최종적으로 실행된다.
			System.out.println("try catch 구간 종료되어 finally블럭으로 들어왔습니다.");
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}

}
