
public class EX08_Stirng {

	public static void main(String[] args) {
		// ������ ����
		// ���ڿ�
		
		// ������ ������ ����� �ʱ�ȭ
		// Ŭ�����̸� ���������̸� = new Ŭ������ ������();
		
		// ��� Ŭ���ô� ObjectŬ������ ��ӹ޾� ������
		Object obj = new Object();
		System.out.println(obj.toString());
		obj = (Object)"Hello";
		System.out.println(obj.toString());
		String str = new String("hello");
		System.out.println(str);
		
		// ���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ�
		System.out.println(str.length());
		String result = str+" JAVA!"; //result�� ���ο� ��ü
		System.out.println(result); 
		
		// Ư�� ���ڸ� �ٲٴ� �޼ҵ�
		result = result.replace(" ", ", ");
		System.out.println(result);
		result = result.replace("AVA", "ava");
		System.out.println(result);
		
		// ���������� String ������ ����Ű�� �ִ� ���ڿ��� �ּҰ� �ƴ�, ���ڿ� ������ ���ϴ� �޼ҵ� equals
		System.out.println(str.equals("hello"));
		System.out.println(str == "hello");		// str = "hello"�� �����ߴٸ� true
		// JAVA���� == / �⺻�� ������ ���� ��/ ������ ������ �ּ� ��
		str = "hello, JAVA! apple, banana, orange.";
		// ���ڿ��� ���� Ȥ�� ���ڿ��� �����ϴ��� Ȯ���ϴ� �޼ҵ�
		System.out.println(str.indexOf("JAVA"));//str ��ü�� ���ڿ��� ���ڰ����� ���� JAVA���ڿ��� ������ �� �ε������� �ƴ϶�� -1�� ��ȯ
		System.out.println(str.contains("JAVA"));	// ���ڿ��� �ִ��� true�� false�� ��ȯ
		
		str = "10, 2 0, 30, 40, 50";
		String[] str_arry = str.split(",");
		for(String item : str_arry) {
			System.out.println(item);
			System.out.println(item.trim()); 	// �߰��� ���� ������ �������� ����
		}
		
		// subString()
		str = "012345678901234567890";
		System.out.println(str.substring(0, 15));
		System.out.println(str.substring(3,8));
		System.out.println(str.substring(15));
		
		// format()
		// ���������̸�.�޼ҵ�()������ format��
		// String.format(format, args) ���¸� ���� �� format�� format���ڿ�
		int age = 17;
		String name = "ȫ�浿";
		System.out.println(String.format("�̸��� %s �Դϴ�", name));
		System.out.println(name);
		System.out.println(String.format("�̸��� %s �Դϴ�.\n���̴� %d�� �Դϴ�.", name, age));
	}

}
