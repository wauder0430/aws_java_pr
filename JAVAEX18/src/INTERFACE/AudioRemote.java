package INTERFACE;

public class AudioRemote implements Remocon {

	@Override
	public void turnOn() {
		WarmUp();
		System.out.println("Audio power on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio power off");
	}

	private void WarmUp() {
		System.out.println("예열을 시작합니다.");
	}
}
