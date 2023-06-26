public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 : 같은 변수형을 갖는 변수들의 집합
		// 변수를 여러개 선언해서 사용한다.
		
		// 배열의 선언 
		int score[] = {90, 100, 70, 50, 80, 100};
		int[] student = new int[6];
		//int[] subject = null;
		for(int i=0; i<score.length; i++) {
			System.out.println("score" + (i+1) + "의 값 : " + score[i]);
		}
		for(int i=0; i<student.length; i++) {
			student[i]=score[i];
		}
		
		for(int i=0; i<score.length; i++) {
			System.out.println("student" + (i+1) + "의 값 : " + student[i]);
		}
	}

}
