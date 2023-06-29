
public class test {

	public static void main(String[] args) {
		// 홍길동 20 전주
		// 성춘향 16 남원
		// 임꺽정 40 경기
		Person hong = new Person();
		hong.name = "홍길동";
		hong.age = 20;
		
		Person sung = new Person();
		sung.name = "성춘향";
		sung.age = 16;
		sung.addr = "남원";
		
		Person lim = new Person();
		lim.name = "임꺽정";
		lim.age = 40;
		lim.addr = "경기";
		hong.PrintInfo();
		sung.PrintInfo();
		lim.PrintInfo();
		
		// 참조형에선 p와 hong이 가리키는 객체가 같다
		Person p = hong;
		System.out.println(p.name);
		
		hong.age = 30;
		p.PrintInfo();
	}

}
