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
		
		Remocon.Test();// static �޼ҵ�
		rc.makeRC();	// default �޼ҵ�
		rc.turnOn();
		rc.turnOff();
		
		int rc_type = Remocon.TYPE_AUDIO;
		switch(rc_type) {
		case Remocon.TYPE_TV:
			rc = new TVremote();
			break;
		case Remocon.TYPE_RADIO:
			rc = new RadioRemote();
			break;
		case Remocon.TYPE_AUDIO:
			rc = new AudioRemote();
			break;
		}
		rc.turnOn();
		rc.turnOff();
	}

}
