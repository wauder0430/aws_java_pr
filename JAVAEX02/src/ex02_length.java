public class ex02_length {

	public static void main(String[] args) {
		String str1 = " Hello? ";
		String str2 = " JAVA! ";
		//String str3 = "java!";
		// String ��ü�� �Ҵ�� ���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ�
		System.out.println("���� : " + str1.length());
		System.out.println("���� : " + str2.length());
		//System.out.println("���� : " + str3.length());
		String result = str1 + str2;
		System.out.println("���ϱ� : " + result);
		System.out.println("���� ���� : " + result.length());
		
	}

}
