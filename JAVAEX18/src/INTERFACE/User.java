package INTERFACE;

public class User {

	public static void main(String[] args) {
		// 리모트 인터페이스 형으로 참조변수 선언
		Remocon rc = null;
		// 리모트중에 TVremote 클래스로 객체 생성
		/*
		 * rc = new TVremote();
		 * 
		 * rc.turnOn(); rc.turnOff();
		 * 
		 * rc = new RadioRemote(); rc.turnOn(); rc.turnOff();
		 */
		
		int type = 1; // 0 : TV   1 : Radio
		if(type == 0) {
			rc = new TVremote();
		} else if(type == 1) {
			rc = new RadioRemote();
		}
		
		rc.turnOn();
		rc.turnOff();
		
	}

}
