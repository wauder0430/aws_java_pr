package HYUNDAI;

public class Car {
	private String name;
	public Car(){
		this.name = "HYUNDAI의 자동차입니다.";
	}
	
	public void PrintInfo() {
		System.out.println(this.name);
	}
}
