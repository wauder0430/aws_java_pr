
public class EX05_test {

	public static void main(String[] args) {
		// 
		String[] scores = {"1,000", "20,000", "3,000", "123,456.789"};
		
		double sum = 0;
		// scores 배열을 돌면서 숫자형식인 문자열을
		// 1. 정수 변환을 시도하고
		// 1-1. 정수로 변환이 되면 sum에 더하고
		// 1-2. 정수 변환이 되지 않으면, 실수 변환을 시도하고
		// 2-1. 실수로 변환되면 sum에 더하고
		// 2-2. 변환되지 않으면 그 문자열을 출력하세요
		
		for(int i=0; i<scores.length; i++) {
			scores[i] = scores[i].replace(",", "");
			try {
				sum += Integer.parseInt(scores[i]);
			} catch(NumberFormatException e) {
				sum += Double.parseDouble(scores[i]);
			} catch(Exception e) {
				
				System.out.println(scores[i]);
			} 
		} 
		// 총합을 출력하세요
		System.out.println("sum : " + sum);	
		
		String[] score_arry = { "1,000", "20,000", "3,000", "123,456.789", "1_000" };
		double sum_d = 0.0;
		for(String item : score_arry) {
			item = item.replace(",", "");
			try {
				sum_d = Integer.parseInt(item);
			} catch (Exception e_i) {
				try {
					sum_d = Double.parseDouble(item);
				} catch(Exception e_d){
					System.out.println("숫자가 아닙니다.");
				}
			}
		}
		System.out.println("sum_d : " + sum_d);
	}

}
