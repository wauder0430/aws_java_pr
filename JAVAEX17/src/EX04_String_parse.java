
public class EX04_String_parse {
	public static void main(String[] args) {
		String score_data = " ���� : 90, ����:80 ,  ����:A , ����: 70 ";
		String[] scores = score_data.trim().split(",");
		int sum = 0;
		// scores�� ���Ҹ� ��ȸ�ϸ鼭, ������ �̾Ƴ��� �� �հ踦 ���ϰ�
		// �������� ����� ���ϼ���
		int count = 0;
		for(String item : scores) {
			//System.out.println(item);
			for(String tmp : item.trim().split(":")) {
				System.out.println(tmp.trim());
				try {	//split���� ���� �͵��� sum�� ���ϴµ� �װ� parseint�� ���� ���ڶ�� �Ǹ�Ǹ� try�� ���ϰ� �ƴ϶�� ����ó�� 
					sum += Integer.parseInt(tmp.trim());
					count++;
					System.out.println("�Է°��� �����Դϴ�." + tmp.trim());
				} catch(Exception e) { 
					System.out.println("�Է°��� ���ڰ� �ƴմϴ�." + tmp);
				}
			}
		}
		System.out.println("���� : " + sum);
		System.out.println("��� : " + sum/count);
	}
}
