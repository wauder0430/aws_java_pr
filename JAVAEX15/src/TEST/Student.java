package TEST;

import java.util.Arrays;

public class Student extends Person {
	// 시험 점수의 배열 int[] scores
	private int[] scores;
	// double avg 평균  점수
	private double avg;
	
	// 생성자에서 시험점수의 배열을 입력
	Student(){}
	Student(int[] scores){
		this.setScores(scores);
	}
	//setter getter에서
	//시험 점수들이 있는지 판별
	// 있으면 평균점수를 구하는 내용
	
	public int[] getScores() {
		return scores;
	}
	public double getAvg() {
		return avg;
	}
	public void setScores(int[] scores) {
		if(scores == null || scores.length ==0) {
			System.out.println("입력값이 올바르지 않습니다.");
		} else {
			this.scores = scores;
			this.setAvg();
		}
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	//setter메소드 오버로드
	public void setAvg() {
		//if(this.scores == null || this.scores.length ==0)
		if(this.getScores() == null || this.getScores().length ==0) {
			System.out.println("평균을 구할 시험 점수가 입력되지 않았습니다.");
		} else {
			int[] arry = this.getScores();
			double result = 0;
			for(int i=0; i<arry.length; i++) {
				result += arry[i]; 
			}
			result /= arry.length; 
			// 암묵적 형변환 가능 만약 result가 int라면 int->double 하지만 평균이라 굳이 그래야하나
			this.setAvg(result);
		}
	}
	
	// 정보를 출력하는 메소드에서
	// 시험점수들과 평균 점수를 출력
	@Override
	public void PrintInfo() {
		System.out.println("시험점수 : " + Arrays.toString(getScores()));
		System.out.println("평균점수 : " + getAvg());
	}
}
