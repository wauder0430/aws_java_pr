// setter getter 
public class EX01_setter_getter {
	// 필드
	private int 	num;
	private String 	str;
	private double 	db;
	private boolean gender;
	private String	gender_value;
	
	// 메소드를 통해서, 필드의 값을 가져오거나 할당을 한다.
	// -> 인자값이 제대로 된 변수형인지
	// -> 인자값의 범위가 필드의 변수형에 맞는지
	
	public void setNum(int num) {
		// 1~10 까지만 받고 싶을 경우
		if(num < 1 || num > 10) {
			System.out.println("입력값은 1~10까지만 가능합니다.");
			return;
		}
		this.num = num;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public void setDb(double db) {
		this.db = db;
	}
	
	// 필드의 gender_value는 gender값에 종속된다.
	public void setGender(boolean gender) {
		this.gender = gender;
		if(gender == true) {	// gender의 값으로 gender_value의 값을 정함
			setGender_value("여성");
		} else {
			setGender_value("남성");
		}
	}
	
	public void setGender_value(String gender_value) {
		this.gender_value = gender_value;
	}
	
	public int getNum() {
		if(this.num ==0) {
			System.out.println("아직 입력된 값이 없습니다.");
			return -1;
		}
		return this.num;
	}
	
	public String getStr() {
		return str;
	}
	
	public double getDb() {
		return db;
	}
	
	public boolean isGender() {
		return gender;
	}
	
	public String getGender_value() {
		return gender_value;
	}	
}
