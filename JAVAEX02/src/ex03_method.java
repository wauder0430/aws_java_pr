
public class ex03_method {

	public static void main(String[] args) {
		String str = " Hello, JAVA! ";
		System.out.println(str.length());
		//�� ���ڸ� �ڱ��ڷ� ���� ġȯ
		String result = str.replace(" ", "");
		System.out.println(result);
		System.out.println(result.length());
		
		result = result.replace(",", ":");
		System.out.println(result);
		System.out.println(result.length());
		//�� ���� ��ĭ ����
		result = str.trim();
		System.out.println(str);
		System.out.println(result);
		
		//�빮�ڷ� ��ȯ
		result = str.toUpperCase();
		System.out.println(result);
		//�ҹ��ڷ� ��ȯ
		result = str.toLowerCase();
		System.out.println(result);
		
		result = str.replace("Hello,", "Hi~~~~~");
		System.out.println(result);
		System.out.println(result.length());
		}

}
