
public class test {

	public static void main(String[] args) {
		// ȫ�浿 20 ����
		// ������ 16 ����
		// �Ӳ��� 40 ���
		Person hong = new Person();
		hong.name = "ȫ�浿";
		hong.age = 20;
		
		Person sung = new Person();
		sung.name = "������";
		sung.age = 16;
		sung.addr = "����";
		
		Person lim = new Person();
		lim.name = "�Ӳ���";
		lim.age = 40;
		lim.addr = "���";
		hong.PrintInfo();
		sung.PrintInfo();
		lim.PrintInfo();
		
		// ���������� p�� hong�� ����Ű�� ��ü�� ����
		Person p = hong;
		System.out.println(p.name);
		
		hong.age = 30;
		p.PrintInfo();
	}

}
