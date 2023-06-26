
public class ex03_method {

	public static void main(String[] args) {
		String str = " Hello, JAVA! ";
		System.out.println(str.length());
		//앞 글자를 뒤글자로 변경 치환
		String result = str.replace(" ", "");
		System.out.println(result);
		System.out.println(result.length());
		
		result = result.replace(",", ":");
		System.out.println(result);
		System.out.println(result.length());
		//앞 뒤의 빈칸 제거
		result = str.trim();
		System.out.println(str);
		System.out.println(result);
		
		//대문자로 변환
		result = str.toUpperCase();
		System.out.println(result);
		//소문자로 변환
		result = str.toLowerCase();
		System.out.println(result);
		
		result = str.replace("Hello,", "Hi~~~~~");
		System.out.println(result);
		System.out.println(result.length());
		}

}
