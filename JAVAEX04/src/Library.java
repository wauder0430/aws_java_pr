public class Library {
	public static void main(String[] args) {
		// Book 클래스로부터 객체를 생성한다.
		Book java = new Book();
		
		java.PrintInfo();
		// 객체의 값을 입력
		java.title = "이것이 자바다";
		java.author = "신용권";
		java.price = 36000;
		java.publish = "한빛미디어";
		
		// 객체의 값을 출력
		//System.out.println(java.title);
		
		// 객체 메소드 호출
		java.PrintInfo();
		
		// Book 클래스로부터 새로운 객체를 생성
		Book html = new Book();
		html.title = "명품 html5+CSS3+JS 웹프로그래밍";
		html.author = "황기태";
		
		html.PrintInfo();
	}
}
