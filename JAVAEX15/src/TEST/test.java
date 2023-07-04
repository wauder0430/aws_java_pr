package TEST;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person park = new Person("박지명", 1996, "남자");
		park.PrintInfo();
		
		// age를 바꿔 입력했을 때 birth를 바꿔주는지 확인
		park.setAge(30);
		park.PrintInfo();
		
		// birth를 입력했을 때 age를 바꿔주는지 확인
		park.setBirth(2000);
		park.PrintInfo();
	}

}
