
public class Data {
	// �ʵ忡 ������
	public String name;
	// �ٸ� ��ü�� �ּҸ� ���� ���� ����
	public Data link = null;
	
	// ������
	public Data() {}
	public Data(String name) {
		this.name = name;
	}
	
	public void PrintInfo() {
		System.out.println("name : " + this.name);
	}
}
