
public class EX04_String_parse {
	public static void main(String[] args) {
		String score_data = " 과학 : 90, 영어:80 ,  수학:A , 국어: 70 ";
		String[] scores = score_data.trim().split(",");
		int sum = 0;
		// scores의 원소를 순회하면서, 정수를 뽑아내서 총 합계를 구하고
		// 정수들의 평균을 구하세요
		int count = 0;
		for(String item : scores) {
			//System.out.println(item);
			for(String tmp : item.trim().split(":")) {
				System.out.println(tmp.trim());
				try {	//split으로 나눈 것들을 sum에 더하는데 그게 parseint를 통해 숫자라고 판명되면 try로 더하고 아니라면 예외처리 
					sum += Integer.parseInt(tmp.trim());
					count++;
					System.out.println("입력값이 숫자입니다." + tmp.trim());
				} catch(Exception e) { 
					System.out.println("입력값이 숫자가 아닙니다." + tmp);
				}
			}
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/count);
	}
}
