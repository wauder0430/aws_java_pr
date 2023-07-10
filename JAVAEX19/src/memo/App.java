package memo;

import java.util.ArrayList;

public class App {
	// 메모를 저장하는 필드
	public ArrayList Memo_List = new ArrayList();
	// 메모를 저장하는 메소드
	public void addMemo(MyMemo item) {
		this.Memo_List.add(item);
	}
	// 메모를 출력하는 메소드
	public void PrintMemo(int index) {
		MyMemo tmp = (MyMemo)this.Memo_List.get(index);
		tmp.PrintMemo();
	}
	public static void main(String[] args) {
		
		/*
		 * ArrayList list = new ArrayList(); MyMemo m = new
		 * MyMemo("첫번째 메모","내일부터 방학입니다."); list.add(m);
		 * 
		 * MyMemo tmp = (MyMemo)list.get(0); tmp.PrintMemo();
		 */
		App a = new App();
		a.addMemo(new MyMemo("첫번째 메모", "내일부터 방학입니다."));
		
		a.PrintMemo(0);
		a.addMemo(new MyMemo("두번째 메모", "방학기간에 건강 유의해주세요."));
		a.addMemo(new MyMemo("세번째 메모", "복습은 해주시면 감사합니다."));
		a.addMemo(new MyMemo("네번째 메모", "다음 수업은 7월 17일입니다."));
		int MAX = a.Memo_List.size();
		for(int i=0; i<MAX; i++) {
			a.PrintMemo(i);
		}
	}

}
