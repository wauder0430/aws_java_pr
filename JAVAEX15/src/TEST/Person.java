package TEST;
import java.time.LocalDate;

public class Person {
	// 필드와 메소드에는 주석을 작성
	// 이름 생년 나이 성별 필드로 갖고
	// 필드
	private String name;
	private int birth;
	private int age;
	private String gender;
	LocalDate now = LocalDate.now();	// 올해를 구하기 위함
	private int year = now.getYear();	// 올해
	
	// 생성자
	Person(){}
	Person(String name, int birth, String gender){
		setName(name);
		setGender(gender);
		setBirth(birth);
	}
	
	// 메소드
	// setter에서
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {	
		// "남자" 또는 "여자"으로만 입력받기 위함
		if(gender.equals("남자") ||gender.equals("여자")) {
			this.gender = gender;
		} else {
			System.out.println("성별의 입력값이 올바르지 않습니다.");
		}
	}
	
	// 생년을 입력하면 ->올해 - 생년  = 나이->나이를 입력
	public void setBirth(int birth) {
		// 입력되어 있는 age가 없거나 생년에 따른 계산에 의한 결과가 age와 다를 경우 새롭게 setAge
		if(getAge()==0 || getAge() != this.year-birth) {	 
			this.setAge(this.year-birth);	// 올해-생년=나이
		} 
		this.birth = birth;	// birth 저장
	}
	// 나이를 입력하면
	public void setAge(int age) {
		// 1.생년이 입력되어 있지 않으면, 나이로부터 생년을 계산해서 생년입력
		if(getBirth()==0) {
			this.age = age;
			this.setBirth(this.year-age);
		} else { // 2.생년이 입력되어 있는데, 나이와 생년 계산이 맞지 않으면 생년 갱신
			if(getBirth() != this.year-age) {
				this.age = age;
				this.setBirth(this.year-age);
			}
			this.age = age;	// 위의 경우가 아니여도 this.age=age는 실행되어야한다.
		}
		
	}
	
	// getter
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getBirth() {
		return birth;
	}
	public int getAge() {
		return age;
	}
	// Person의 정보를 출력하는 PrintInfo() 메소드 
	public void PrintInfo() {
		System.out.println("Person의 PrintInfo입니다.");
		System.out.println("이름 : " + this.getName());
		System.out.println("생년 : " + this.getBirth());
		System.out.println("나이 : " + this.getAge());
		System.out.println("성별 : " + this.getGender());
	}
}
