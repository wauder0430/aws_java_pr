package INTERFACE;

public class TVremote implements Remocon{
	@Override 
	public void turnOn() {
		System.out.println("TV power on");
	}
	@Override 
	public void turnOff() {
		System.out.println("TV power off");
	}
}
