public class Library {
	public static void main(String[] args) {
		// Book Ŭ�����κ��� ��ü�� �����Ѵ�.
		Book java = new Book();
		
		java.PrintInfo();
		// ��ü�� ���� �Է�
		java.title = "�̰��� �ڹٴ�";
		java.author = "�ſ��";
		java.price = 36000;
		java.publish = "�Ѻ��̵��";
		
		// ��ü�� ���� ���
		//System.out.println(java.title);
		
		// ��ü �޼ҵ� ȣ��
		java.PrintInfo();
		
		// Book Ŭ�����κ��� ���ο� ��ü�� ����
		Book html = new Book();
		html.title = "��ǰ html5+CSS3+JS �����α׷���";
		html.author = "Ȳ����";
		
		html.PrintInfo();
	}
}
