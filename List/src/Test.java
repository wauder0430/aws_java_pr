
public class Test {

	public static void main(String[] args) {
		Data head;
		Data tail;
		Data tmp;
		
		// data ��ü �ϳ� ����
		tmp = new Data("ȫ�浿");
		// ����Ʈ�� ó�� ����
		// head -> ȫ�浿 
		// tail -> tail
		head = tmp;
		tail = head;
		
		tmp = new Data("����ġ");
		// ����Ʈ�� ��ü�� ���ϴ� ����
		
		tail.link = tmp;
		tail = tail.link;
		
		tmp = new Data("�Ӳ���");
		tail.link = tmp;
		tail = tail.link;
		
		tmp = new Data("������");
		tail.link = tmp;
		tail = tail.link;
		
		head.PrintInfo();
		head.link.PrintInfo();
		head.link.link.PrintInfo();
		head.link.link.link.PrintInfo();
		
		System.out.println("---------------");
		// �� ���� ������ �����ϰ�, head�� ����Ű�� �ִ� ��ü��  ����
		Data list = head;
		while(list != null) {
			list.PrintInfo();
			// list�� list�� link�ϰ� �ִ� ��ü�� ������Ŵ
			list = list.link;
		}
	}

}
