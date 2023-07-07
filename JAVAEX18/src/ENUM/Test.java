package ENUM;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		// �������̸� ���������� = �������̸�.���������
		Gender g = Gender.MAN;
		if(g == Gender.WOMAN) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
				
		Calendar cal = Calendar.getInstance(); 	//Calendar�� ��ü�� �����ϸ鼭 ���� ��¥�� �޾ƿ�
		int week = cal.get(Calendar.DAY_OF_WEEK);	// ���� ��¥�� ������ ���ڷ� �޾ƿ�
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
			System.out.println("������ �ݿ����Դϴ�.");
		}
		
		MyDate day = new MyDate();
		day.PrintInfo();
		System.out.println(day.GetValue(DayType.YEAR));
		System.out.println(day.GetValue(DayType.MONTH));
		System.out.println(day.GetValue(DayType.DAY));
		
		Week[] days = Week.values();	// �������� ���ҵ��� �迭�� ��ȯ�ϴ� �޼ҵ�
		for( Week item : days ) {
			System.out.println(item.name()); // ������ ������ �̸��� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		}
	}

}
