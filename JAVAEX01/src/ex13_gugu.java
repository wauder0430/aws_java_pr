
public class ex13_gugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2단부터 9단가지 구구단을 출력하세요
		// for문 / while문
		int i = 0;
		int j = 0;
		for(i = 2; i<=9; i++) {
			for(j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		// while
		i = 2;
		while(i<10) {
			j=1;
			while(j<10) {
				String str = "";
				str = String.format("%d * %d = %d", i, j, i*j);
				System.out.println(str);
//				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
