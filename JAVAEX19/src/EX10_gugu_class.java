public class EX10_gugu_class {
	String str = null;
	// �޼ҵ�1
	// ������ �ܼ��� �������� ����ϱ� ���� ���ڿ��� ����� �޼ҵ�
	// format Ȱ��
	
	public String MakeStr(int dan) {
		String result = "";
		for(int i=1; i<10; i++) {
			result += String.format("%d * %d = %d\n", dan,i,dan*i);
		}
		return result;
	}
	
	// �޼ҵ� 2 
	// ���ڿ��� �Է¹޾� ����ϴ� �޼ҵ�
	public void printStr(String str) {
		System.out.println("--------------\n");
		System.out.println(str);
	}
	
	// �޼ҵ� 3
	// ����� �������� �ܼ� �ϳ��� �Է��� �޾� 
	// ���ڿ��� �����
	// ����ϴ� �޼ҵ�
	public void printDan(int dan) {
		this.printStr(this.MakeStr(dan));
	}
	
	// �޼ҵ� 4
	// �������� ���۴ܰ� ������ �Է¹޾� ����ϴ� �޼ҵ�
	public void printDan(int start_dan, int end_dan) {
		for(int i=start_dan; i<=end_dan; i++) {
			printDan(i);
		}
	}
	
	public static void main(String[] args) {
		// �޼ҵ� 4�� ���
		// 5, 8
		EX10_gugu_class gugu = new EX10_gugu_class();
		gugu.printDan(5,8);
	}
	
}
