package TEST;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person park = new Person("������", 1996, "����");
		park.PrintInfo();
		
		// age�� �ٲ� �Է����� �� birth�� �ٲ��ִ��� Ȯ��
		park.setAge(30);
		park.PrintInfo();
		
		// birth�� �Է����� �� age�� �ٲ��ִ��� Ȯ��
		park.setBirth(2000);
		park.PrintInfo();
	}

}
