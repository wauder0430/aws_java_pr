
public class EX08_Stirng {

	public static void main(String[] args) {
		// 참조형 변수
		// 문자열
		
		// 참조형 변수의 선언과 초기화
		// 클래스이름 참조변수이름 = new 클래스의 생성자();
		
		// 모든 클래시는 Object클래스를 상속받아 생성됨
		Object obj = new Object();
		System.out.println(obj.toString());
		obj = (Object)"Hello";
		System.out.println(obj.toString());
		String str = new String("hello");
		System.out.println(str);
		
		// 문자열이 길이를 반환하는 메소드
		System.out.println(str.length());
		String result = str+" JAVA!"; //result는 새로운 객체
		System.out.println(result); 
		
		// 특정 문자를 바꾸는 메소드
		result = result.replace(" ", ", ");
		System.out.println(result);
		result = result.replace("AVA", "ava");
		System.out.println(result);
		
		// 참조변수인 String 변수가 가리키고 있는 문자열의 주소가 아닌, 문자열 내용을 비교하는 메소드 equals
		System.out.println(str.equals("hello"));
		System.out.println(str == "hello");		// str = "hello"로 생성했다면 true
		// JAVA에서 == / 기본형 변수는 내용 비교/ 참조형 변수는 주소 비교
		str = "hello, JAVA! apple, banana, orange.";
		// 문자열에 문자 혹은 문자열이 존재하는지 확인하는 메소드
		System.out.println(str.indexOf("JAVA"));//str 객체의 문자열에 인자값으로 넣은 JAVA문자열이 있으면 그 인덱스값을 아니라면 -1을 반환
		System.out.println(str.contains("JAVA"));	// 문자열이 있는지 true와 false로 반환
		
		str = "10, 2 0, 30, 40, 50";
		String[] str_arry = str.split(",");
		for(String item : str_arry) {
			System.out.println(item);
			System.out.println(item.trim()); 	// 중간에 오는 공백은 제거하지 못함
		}
		
		// subString()
		str = "012345678901234567890";
		System.out.println(str.substring(0, 15));
		System.out.println(str.substring(3,8));
		System.out.println(str.substring(15));
		
		// format()
		// 참조변수이름.메소드()였으나 format은
		// String.format(format, args) 형태를 가짐 뒤 format은 format문자열
		int age = 17;
		String name = "홍길동";
		System.out.println(String.format("이름은 %s 입니다", name));
		System.out.println(name);
		System.out.println(String.format("이름은 %s 입니다.\n나이는 %d살 입니다.", name, age));
	}

}
