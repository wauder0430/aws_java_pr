public class ex02_length {

	public static void main(String[] args) {
		String str1 = " Hello? ";
		String str2 = " JAVA! ";
		//String str3 = "java!";
		// String 객체에 할당된 문자열의 길이를 반환하는 메소드
		System.out.println("길이 : " + str1.length());
		System.out.println("길이 : " + str2.length());
		//System.out.println("길이 : " + str3.length());
		String result = str1 + str2;
		System.out.println("더하기 : " + result);
		System.out.println("더한 길이 : " + result.length());
		
	}

}
