
public class ex04_String_split_array {

	public static void main(String[] args) {
		// 변수형 변수명[] = {}; 배열 객체
		// 변수형 변수명[] = new 변수형[] {};
		// 변수형 변수명[] = new 변수형[길이];
		// 변수명 = 배열객체; -> 길이가 같아야함
		/* int arr[] = null;	초기화 단계에서만 가능한 방법
		arr = { 1,2,3,4,5 } 불가능 */ 
		
		String math = "100,80,90,50,70";
		int score[] = null;
		// Math를 분해하여, 정수의 배열로 만들어 score에 넣는다.
		// score로부터 평균 점수를 구한다.
		int sum = 0;
		float avg = 0;
		// 문자열을 쉼표를 기준으로 잘라서 문자열 배열로 만든다.
		String tmp[] = math.split(",");
		for(int i=0; i<tmp.length; i++) {
			System.out.println(tmp[i]);
		}
		
		// 배열의 길이를 가져와서 
		// 정수형 배열 score를 문자열 배열의 길이로 생성한다.
		score = new int[tmp.length];
		// 두 배열의 같은 index의 원소들을 parseInt로 문자에서 정수로 변환
		for(int i=0; i<tmp.length; i++) {
			score[i] = Integer.parseInt(tmp[i].trim());
			System.out.println("score"+ (i+1) + " : " + score[i]);
			sum += score[i];
		}
		avg = (float)sum / score.length;
		System.out.println("평균 : " + avg);
		
		// 향상된 for
		sum = 0;
		for(int num : score) {
			System.out.println(num);
			sum += num;
		}
		System.out.println(sum); 
	}

}
