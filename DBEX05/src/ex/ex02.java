package ex;

public class ex02
{
	public static void main(String[] args)
	{	// ������ ������ �迭 (data)Ÿ���� ���Ҹ� 4��
		// [0] : ȫ�浿 / 20
		// [1] : ����ġ / 30
		// [2] : �Ӳ��� / 40
		// [3] : ������ / 16
		// ������ ����� ���ϼ���
		
		data[] list = new data[4];
		list[0] = new data("ȫ�浿",20);
		list[1] = new data("����ġ",30);
		list[2] = new data("�Ӳ���",40);
		list[3] = new data("������",16);
		int sum = 0;
		for( data item : list )
		{
			sum += item.age;
		}
		System.out.println("��ճ��� : " + sum/list.length );
	}
}