
public class ex07_array_quest {

	public static void main(String[] args) {
		// 전달받은 데이터는 보통 문자열인 경우가 많습니다.
		
		// 홍길동/20/전주
		// 김길동/30/김제
		// 이길동/10/남원
		// "홍길동/20/전주, 김길동/30/김제, 이길동/10/남원";
		// 이름, 나이, 지역을 출력하고
		// 평균 나이를 구하세요
		
		// ,로 문자열을 나눠서 3인의 데이터 배열로 분리함
		// [0] ->이름
		// [1] ->나이
		// [2] ->지역
		/*String data = "홍길동/20/전주,김길동/30/김제,이길동/10/남원";
		data = data.trim();
		int sum=0;
		String[] members = data.split(",");
		for(String member : members) {
			System.out.println(member);
			String[] item = member.trim().split("/");
			System.out.println("이름 : " + item[0]);
			System.out.println("나이 : " + item[1]);
			sum += Integer.parseInt(item[1].trim());
			System.out.println("지역 : " + item[2]);
		}
		System.out.println("평균 나이 : " + sum/members.length);
		*/
		// 이름:국어점수/영어점수/수학점수,개인,개인
		// "홍길동:11/22/33,김길동:44/55/66,이길동:77,88,99";
		
		/*
		int sum_kor=0, sum_eng=0, sum_math=0;
		
		String stu_data = "홍길동:11/22/33,김길동:44/55/66,이길동:77/88/99";
		stu_data = stu_data.trim();
		String[] student = stu_data.split(",");
		String[][] item = new String[student.length][];
		
		int index=0; // 향상된 for문 인데스참조를 위한 변수
		for(String member : student) {		
			System.out.println(member);
			item[index] = member.trim().split(":|/");
			//member = member.replace(":", "/"); // 처음에 replace로 :를/로 변환해줬으나 split은 여러 인자값을 받을 수 있음
			//String[] item = member.trim().split("/");
			sum_kor += Integer.parseInt(item[index][1].trim());
			sum_eng += Integer.parseInt(item[index][2].trim());
			sum_math += Integer.parseInt(item[index][3].trim());
			index++;
		}
		
		System.out.printf("국어 평균 : %d\n영어 평균 : %d\n수학 평균 : %d\n", sum_kor/student.length, 
				sum_eng/student.length, sum_math/student.length); 
		*/
		
		String input_data = "홍길동:11/22/33,김길동:44/55/66,이길동:77/88/99";
		String[] datas = null; 
		// datas.length => 인원수
		
		// 각 개인의 데이터가 들어갈 변수 선언 -> 이름 : 점수들
		String[] student = null;
		
		// 점수를 모두 담을 2차원 배열
		int[][] score_arry = null;
		// score_arry[인원수][과목수]
		
		// 합계 점수를 넣을 배열 선언
		int[] sum_arry = null;
		// sum_arry[과목수]
		
		// 데이터를,로 잘라 dats 배열에 넣음
		datas = input_data.trim().split(",");
		
		// 점수를 넣을 배열의 row를 인원수로 초기화
		score_arry = new int[datas.length][];
		
		for(int i=0; i<datas.length; i++) {
			//  각 데이터를 처리
			student = datas[i].trim().split(":");
			System.out.println("학생이름 : " + student[0]);
			System.out.println("학생성적 : " + student[1]);
			String[] tmp = student[1].trim().split("/");
			// 과목수 : tmp.length
			sum_arry = new int[tmp.length];
			score_arry[i] = new int[tmp.length];
			for(int col=0; col<tmp.length; col++) {
				score_arry[i][col] = Integer.parseInt(tmp[col].trim());
			}
		}
		
		for(int[] row : score_arry) {
			for(int col=0; col<row.length; col++) {
				sum_arry[col] += row[col];
			}
		}
		
		for(int sum : sum_arry) {
			System.out.println( sum/datas.length);
		}
		
		
	}

}
