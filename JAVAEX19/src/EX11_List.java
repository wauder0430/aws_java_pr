import java.util.ArrayList;

public class EX11_List {

	public static void main(String[] args) {
		// 
		String[] student = new String[3];
		student[0] = "ȫ�浿";
		student[1] = "����ġ";
		student[2] = "������";

		for(String item : student) {
			System.out.println(item);
		}
		
		ArrayList list = new ArrayList();
		System.out.println(list.size());
		
		list.add("ȫ�浿");
		System.out.println(list.size());
		list.add("����ġ");
		System.out.println(list.size());
		list.add("������");
		System.out.println(list.size());
		list.add("�Ӳ���");
		System.out.println(list.size());
		list.remove("�Ӳ���");
		System.out.println(list.size());
		list.remove("����ġ");
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		
		for(Object item : list) {
			System.out.println(item);
		}
		System.out.println(list.indexOf(1));
		System.out.println(list.getClass());
		System.out.println(list.get(1).getClass());
	}

}
