public class Car {
	
	// 차종명, 차색상
	String name;
	String color;
	// 현재 상태 속성 : 남은 연료량, 현재 속도, 최고 속도
	int gas;
	int speed;
	int MAX_speed;
	
	// 부품들 (타이어만)
	Tire f_L;
	Tire f_R;
	Tire r_L;
	Tire r_R;
	
	Car(){
		System.out.println("Car의 기본생성자가 호출되었습니다.");
		name = "캐스퍼";
		color = "white";
		gas = 100;
		speed = 0;
		MAX_speed = 100;
		f_L = new Tire();
		f_R = new Tire();
		r_L = new Tire();
		r_R = new Tire();
	}
	Car(String name, String color){
		System.out.println("Car의 변형생성자가 호출되었습니다.");
		this.name = name;
		this.color = color;
		gas = 100;
		speed = 0;
		MAX_speed = 100;
		f_L = new Tire();
		f_R = new Tire();
		r_L = new Tire();
		r_R = new Tire();
	}
	Car(String name, String color, int MAX_speed, int inch, String company){
		System.out.println("Car의 변형2생성자가 호출되었습니다.");
		this.name = name;
		this.color = color;
		this.MAX_speed = MAX_speed;
		f_L = new Tire( inch, company);
		f_R = new Tire( inch, company);
		r_L = new Tire( inch, company);
		r_R = new Tire( inch, company);
	}
	Car(String name, String color, int MAX_speed, Tire tire){
		System.out.println("Tire 객체를 입력받는 Car생성자");
		this.name = name;
		this.color = color;
		this.MAX_speed = MAX_speed;
		f_L = tire;
		f_R = tire;
		r_L = tire;
		r_R = tire;
	}
	
	// 자동차의 정보를 출력
	void PrintInfo() {
		System.out.println("=============");
		System.out.println("차종 : " + name);
		System.out.println("색상 : " + color);
		System.out.println("최고 속도 : " + MAX_speed);
		System.out.println("남은 연료량 : " + gas);
		System.out.println("현재 속도 : " + speed);
		System.out.print("왼쪽 앞바퀴 정보 : ");
		f_L.PrintInfo();
		System.out.print("오른쪽 앞바퀴 정보 : ");
		f_R.PrintInfo();
		System.out.print("왼쪽 뒷바퀴 정보 : ");
		r_L.PrintInfo();
		System.out.print("오른쪽 뒷바퀴 정보 : ");
		r_R.PrintInfo();
		System.out.println("=============");
	}
}
