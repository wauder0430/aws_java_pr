public class ex04_parse {

	public static void main(String[] args) {
		String str = "1,000";
		System.out.println(str);
		// ���ڿ��� ������ ����
		System.out.println(str + 120);
		// ���ڸ� ���ڷ� ��ȯ 
		// ��ü ���ڷ� ��ȯ���ִ� �޼ҵ�(����)
		
		int n = Integer.parseInt(str.replace(",",""));
		System.out.println(n);
		// ������ ������ ������ Ȯ��
		System.out.println(n+120);
		Float f = Float.parseFloat("12.345f");
		System.out.println(f);
		Float f2 = 10f;
		System.out.println(f+f2);
	}

}
