package ENUM;

public class MyDate {
	private String name; // ���� �̸�
	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		name = "���ػ���";
		year = 2023;
		month = 7;
		day =10;
	}
	
	public int GetValue(DayType mode) {
		if(mode== DayType.YEAR) return this.year;
		else if(mode== DayType.MONTH) return this.month;
		else return this.day;
	}
	
	public void PrintInfo() {
		System.out.println(
				this.name + "\n"+
				this.year + "�� "+
				this.month + "�� "+
				this.day + "�� ");
	}
}
