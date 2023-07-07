
public class Test {

	public static void main(String[] args) {
		Data head;
		Data tail;
		Data tmp;
		
		// data 객체 하나 생성
		tmp = new Data("홍길동");
		// 리스트를 처음 세팅
		// head -> 홍길동 
		// tail -> tail
		head = tmp;
		tail = head;
		
		tmp = new Data("전우치");
		// 리스트에 객체를 더하는 과정
		
		tail.link = tmp;
		tail = tail.link;
		
		tmp = new Data("임꺽정");
		tail.link = tmp;
		tail = tail.link;
		
		tmp = new Data("성춘향");
		tail.link = tmp;
		tail = tail.link;
		
		head.PrintInfo();
		head.link.PrintInfo();
		head.link.link.PrintInfo();
		head.link.link.link.PrintInfo();
		
		System.out.println("---------------");
		// 새 참조 변수를 선언하고, head가 가리키고 있는 객체를  참조
		Data list = head;
		while(list != null) {
			list.PrintInfo();
			// list를 list가 link하고 있는 객체로 참조시킴
			list = list.link;
		}
	}

}
