package INTERFACE;

public class User {

	public static void main(String[] args) {
		// ����Ʈ �������̽� ������ �������� ����
		Remocon rc = null;
		// ����Ʈ�߿� TVremote Ŭ������ ��ü ����
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
