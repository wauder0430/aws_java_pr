package memo;

public class MyMemo {
	private String title; 	// �޸� ����
	private String note; 	// �޸� ����
	
	public MyMemo() {}
	public MyMemo(String title, String note) {
		setTitle(title);
		setNote(note);
	}
	public String getTitle() {
		return title;
	}
	public String getNote() {
		return note;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public void PrintMemo() {
		System.out.println("-------------------");
		System.out.println("���� : " + getTitle());
		System.out.println("���� : " + getNote());
		System.out.println("-------------------");
	}
}
