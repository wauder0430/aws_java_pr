
public class Driver {
	public static void main(String[] args) {
		Car K5 = new Car();
		for(int i=0; i<=11; i++) {
			K5.SpeedUp();
			System.out.println("=========");
		}
		for(int i=0; i<=10; i++) {
			K5.SpeedDown();
			System.out.println("=========");
		}
	}
}
