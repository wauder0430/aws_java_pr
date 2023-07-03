
public class Driver {
	public static void main(String[] args) {
		KIA.Car K8;
		HYUNDAI.Car sonata;
		BMW.Car m3;
		K8 = new KIA.Car();
		sonata = new HYUNDAI.Car();
		m3 = new BMW.Car();
		K8.PrintInfo();
		sonata.PrintInfo();
		m3.PrintInfo();
		
	}
}
