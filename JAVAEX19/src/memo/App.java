package memo;

import java.util.ArrayList;

public class App {
	// �޸� �����ϴ� �ʵ�
	public ArrayList Memo_List = new ArrayList();
	// �޸� �����ϴ� �޼ҵ�
	public void addMemo(MyMemo item) {
		this.Memo_List.add(item);
	}
	// �޸� ����ϴ� �޼ҵ�
	public void PrintMemo(int index) {
		MyMemo tmp = (MyMemo)this.Memo_List.get(index);
		tmp.PrintMemo();
	}
	public static void main(String[] args) {
		
		/*
		 * ArrayList list = new ArrayList(); MyMemo m = new
		 * MyMemo("ù��° �޸�","���Ϻ��� �����Դϴ�."); list.add(m);
		 * 
		 * MyMemo tmp = (MyMemo)list.get(0); tmp.PrintMemo();
		 */
		App a = new App();
		a.addMemo(new MyMemo("ù��° �޸�", "���Ϻ��� �����Դϴ�."));
		
		a.PrintMemo(0);
		a.addMemo(new MyMemo("�ι�° �޸�", "���бⰣ�� �ǰ� �������ּ���."));
		a.addMemo(new MyMemo("����° �޸�", "������ ���ֽø� �����մϴ�."));
		a.addMemo(new MyMemo("�׹�° �޸�", "���� ������ 7�� 17���Դϴ�."));
		int MAX = a.Memo_List.size();
		for(int i=0; i<MAX; i++) {
			a.PrintMemo(i);
		}
	}

}
