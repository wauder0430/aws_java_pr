
public class EX02_index {
	public static void main(String[] args) {
		// 배열의 index 범위 넘기는 예외
		int[] arry = {1,2,3,4,5,6,7};
		
		try {
			for(int i=0; i<10; i++) {
				System.out.println(arry[i]);
			}
		}catch(Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
			System.out.println(e);
		}finally {
			System.out.println("마침 구간");
		}
		System.out.println("프로그램 종료");
	}
}
