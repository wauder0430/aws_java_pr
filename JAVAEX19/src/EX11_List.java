import java.util.ArrayList;

public class EX11_List {

	public static void main(String[] args) {
		// 
		String[] student = new String[3];
		student[0] = "È«±æµ¿";
		student[1] = "Àü¿ìÄ¡";
		student[2] = "¼ºÃáÇâ";

		for(String item : student) {
			System.out.println(item);
		}
		
		ArrayList list = new ArrayList();
		System.out.println(list.size());
		
		list.add("È«±æµ¿");
		System.out.println(list.size());
		list.add("Àü¿ìÄ¡");
		System.out.println(list.size());
		list.add("¼ºÃáÇâ");
		System.out.println(list.size());
		list.add("ÀÓ²©Á¤");
		System.out.println(list.size());
		list.remove("ÀÓ²©Á¤");
		System.out.println(list.size());
		list.remove("Àü¿ìÄ¡");
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
