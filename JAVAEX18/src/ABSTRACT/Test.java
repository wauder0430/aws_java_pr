package ABSTRACT;

public class Test {

	public static void main(String[] args) {
		// 
		Car car = new Bus();
		car.name = "�������";
		car.MAX = 45;
		car.Run();
		car.Stop();
		car.PrintInfo();
		
		car = new SuperCar();
		car.name = "���";
		car.MAX = 2;
		car.Run();
		car.Stop();
		car.PrintInfo();
		
		SuperCar s_car = new SuperCar();
		s_car.name = "������";
		s_car.MAX = 4;
		s_car.PrintInfo();
		s_car.Start();
		s_car.Run();
		s_car.Stop();
	}

}
