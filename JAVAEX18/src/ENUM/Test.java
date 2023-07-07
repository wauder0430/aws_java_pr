package ENUM;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		// 열거형이름 참조변수명 = 열거형이름.열거형상수
		Gender g = Gender.MAN;
		if(g == Gender.WOMAN) {
			System.out.println("여성입니다.");
		} else {
			System.out.println("남성입니다.");
		}
				
		Calendar cal = Calendar.getInstance(); 	//Calendar를 객체를 생성하면서 오늘 날짜를 받아옴
		int week = cal.get(Calendar.DAY_OF_WEEK);	// 오늘 날짜의 요일을 숫자로 받아옴
		System.out.println(week);
		Week today = null;
		switch(week) {
			case 1:
				today=Week.SUNDAY;
				break;
			case 2:
				today=Week.MONDAY;
				break;
			case 3:
				today=Week.TUESDAY;
				break;
			case 4:
				today=Week.WEDNESDAY;
				break;
			case 5:
				today=Week.THURSDAY;
				break;
			case 6:
				today=Week.FRIDAY;
				break;
			case 7:
				today=Week.SATURDAY;
				break;
		}
		if(today == Week.FRIDAY) {
			System.out.println("오늘은 금요일입니다.");
		}
		
		MyDate day = new MyDate();
		day.PrintInfo();
		System.out.println(day.GetValue(DayType.YEAR));
		System.out.println(day.GetValue(DayType.MONTH));
		System.out.println(day.GetValue(DayType.DAY));
		
		Week[] days = Week.values();	// 열거형의 원소들을 배열로 반환하는 메소드
		for( Week item : days ) {
			System.out.println(item.name()); // 열거형 원소의 이름을 문자열로 반환하는 메소드
		}
	}

}
