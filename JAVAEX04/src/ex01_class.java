public class ex01_class {
	
	// field 맴버
	// 접근제어자 변수타입 변수명 [ = 초기화 값 ];
	public int number = 0;
	
	// method
	// 접근제어자 반환값타입 메소드이름([입력받을 인자의 변수타입 변수명]){}
	public void add(int num) {
		// 지역 변수 
		int sum = 0;
		// 클래스의 필드는 this 키워드로 접근
		sum =this.number;
		System.out.println("sum : " + sum);
		// 클래스의 필드에 인자값을 넣음
		this.number = num;
	}
	
	public static void main(String[] args) {
		// 자기 자신의 맴버와, 메소드를 호출 가능
		// class(설계도)로부터 객체를 생성하고
		// 객체의 맴버와, 메소드 접근이 가능
		// public등의 접근제어자는 객체 혹은 클래스의 접근 권한을 설정하는 키워드
		// 클래스명 인스턴스이름(객체 이름) (참조변수명) = new 클래스의 생성자를 호출
		ex01_class test = new ex01_class();
		// ex01_class 클래스의 인스턴스 test가 갖고 있는 메소드 add()호출
		test.add(100);
		
		// ex01_class 클래스의 인스턴스 test가 갖고 있는 필드 number 호출
		System.out.println(test.number);
		test.add(50);
		System.out.println(test.number);
		
	}

}
