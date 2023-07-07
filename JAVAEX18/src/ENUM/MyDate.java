package ENUM;

public class MyDate {
	private String name; // 일정 이름
	private int year;
	private int month;
	private int day;
	
	public MyDate() {
		name = "올해생일";
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
				this.year + "년 "+
				this.month + "월 "+
				this.day + "일 ");
	}
}
