package memo;

public class MyMemo {
	private String title; 	// 메모 제목
	private String note; 	// 메모 내용
	
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
		System.out.println("제목 : " + getTitle());
		System.out.println("내용 : " + getNote());
		System.out.println("-------------------");
	}
}
