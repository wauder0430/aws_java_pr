public class EX10_gugu_class {
	String str = null;
	// 메소드1
	// 선택한 단수의 구구단을 출력하기 위한 문자열을 만드는 메소드
	// format 활용
	
	public String MakeStr(int dan) {
		String result = "";
		for(int i=1; i<10; i++) {
			result += String.format("%d * %d = %d\n", dan,i,dan*i);
		}
		return result;
	}
	
	// 메소드 2 
	// 문자열을 입력받아 출력하는 메소드
	public void printStr(String str) {
		System.out.println("--------------\n");
		System.out.println(str);
	}
	
	// 메소드 3
	// 출력할 구구단의 단수 하나를 입력을 받아 
	// 문자열을 만들고
	// 출력하는 메소드
	public void printDan(int dan) {
		this.printStr(this.MakeStr(dan));
	}
	
	// 메소드 4
	// 구구단의 시작단과 끝단을 입력받아 출력하는 메소드
	public void printDan(int start_dan, int end_dan) {
		for(int i=start_dan; i<=end_dan; i++) {
			printDan(i);
		}
	}
	
	public static void main(String[] args) {
		// 메소드 4을 출력
		// 5, 8
		EX10_gugu_class gugu = new EX10_gugu_class();
		gugu.printDan(5,8);
	}
	
}
