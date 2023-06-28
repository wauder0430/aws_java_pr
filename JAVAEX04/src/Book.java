// 도서의 정보를 담는 클래스
public class Book {
	// 필드
	// 도서명 저자 가격 출판사
	String title;
	String author;
	int price;
	String publish;

	// 생성자
	// 기본값이 없는 생성자 -> 기본 생성자
	Book(){
		// 출판사와 가격을 일괄 설정(기본값 설정)
		System.out.println("생성자가 호출되었습니다.");
		publish = "이젠출판사";
		price = 20000;
	}
	
	// 메소드
	// 도서정보를 콘솔에 출력
	void PrintInfo() {
		// 도서정보를 출력
		System.out.println("===============");
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price + "원");
		System.out.println("출판사 : " + publish);
		System.out.println("===============");
	}
}
