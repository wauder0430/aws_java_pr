package ex;
// ��̸���Ʈ ���̺귯�� ����Ʈ
import java.util.ArrayList;

public class arryList
{
	public static void main(String[] args)
	{	// ��� ����Ʈ�� ����
		ArrayList list = new ArrayList();
		// ����Ʈ�� ���� �߰�
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		// ����Ʈ�� ���� ����
		System.out.println(list.size());
		// �ε����� ���� ����
		System.out.println(list.get(0));
		System.out.println(list.get(0).getClass());
		// �ε����� ���� ����
		list.remove(2);
		// ��ü�� ���� ����
		list.remove("d");
		// ��� ����Ʈ ������ ���� �˻�
		System.out.println("list�� 'e'�� �ִ���? : " + list.contains("e"));
//		String str_tmp = "asdf";
//		System.out.println(str_tmp == "asdf");
		for( Object item : list )
		{
			System.out.println(item);
		}
		
		// ���׸� -> Ÿ��(���)�� �̸� �����ϴ°� �ƴ�
		// ������ ������, �Է¹��� ������ ġȯ�ϴ� ����
		
		// MyData Ŭ������ �ʵ� value�� Ÿ���� String���� ����
		MyData<String> str_data = new MyData<String>();
		// ���׸��� ���� �ʵ� value�� Ÿ���� String�� �Ǿ����Ƿ�,
		// ���ڿ� �����͸� �ְ�, String Ŭ������ �޼ҵ� ȣ�� ����
		str_data.value = "���ڿ� ������";
		System.out.println(str_data.value);
		System.out.println(str_data.value.equals("java"));
		
		// MyData Ŭ������ �ʵ� value�� Ÿ���� Integer�� ����
		MyData<Integer> int_data = new MyData<Integer>();
		// ���׸��� ���� �ʵ� value�� Ÿ���� �������� �Ǿ���
		int_data.value = 10;
		System.out.println(int_data.value);
		int_data.value += 20;		// ���� ���� ����
		System.out.println(int_data.value);
		
		// ArratList�� ���ҵ��� �������� String���� ����
		ArrayList<String> str_list = new ArrayList<String>();
		str_list.add("asdf");		// ���� �߰�
		str_list.add("wasd");		// ���� �߰�
		str_list.add("qwerty");
		String tmp = str_list.get(0);	// ������ ���Ҵ� Object���� �ƴ� StringŸ��
		System.out.println(tmp);
		
		for( String item : str_list )
		{
			System.out.println(item.getClass());
		}
	}
}