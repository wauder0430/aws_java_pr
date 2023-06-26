public class ex04_parse {

	public static void main(String[] args) {
		String str = "1,000";
		System.out.println(str);
		// 문자열과 숫자의 연산
		System.out.println(str + 120);
		// 문자를 숫자로 변환 
		// 객체 숫자로 변환해주는 메소드(문자)
		
		int n = Integer.parseInt(str.replace(",",""));
		System.out.println(n);
		// 정수와 정수의 연산을 확인
		System.out.println(n+120);
		Float f = Float.parseFloat("12.345f");
		System.out.println(f);
		Float f2 = 10f;
		System.out.println(f+f2);
	}

}
