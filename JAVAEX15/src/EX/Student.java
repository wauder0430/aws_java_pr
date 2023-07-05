package EX;

public class Student {
	// 학생 이름
	private String name;
	// 국어 점수들 
	private int[] kor_scores;
	// 영어 점수들
	private int[] eng_scores;
	// 수학 점수들
	private int[] math_scores;
	// 평균 점수들을 저장
	private double kor_avg;
	private double eng_avg;
	private double math_avg;
	
	Student(){}
	Student(String name, int[] kor, int[] eng, int[] math){
		this.setName(name);
		this.setKor_scores(kor);
		this.setEng_scores(eng);
		this.setMath_scores(math);
	}
	
	// setters getters 
	public String getName() {	return name;	}
	public int[] getKor_scores() {	return kor_scores;	}
	public int[] getEng_scores() {	return eng_scores;	}
	public int[] getMath_scores() {		return math_scores;	}
	public double getKor_avg() { return kor_avg; }
	public double getEng_avg() { return eng_avg; }
	public double getMath_avg() { return math_avg; }
	
	public void setName(String name) {
		this.name = name;
	}
	public void setKor_scores(int[] kor_scores) {
		if(kor_scores == null || kor_scores.length ==0) { //들어온 값이 있는지 확인
			System.out.println("국어점수의 입력이 올바르지 않습니다.");
		}
		this.kor_scores = kor_scores;
		setKor_avg();
	}
	public void setEng_scores(int[] eng_scores) {
		if(eng_scores == null || eng_scores.length ==0) {
			System.out.println("영어점수의 입력이 올바르지 않습니다.");
		}
		this.eng_scores = eng_scores;
		setEng_avg();
	}
	public void setMath_scores(int[] math_scores) {
		if(math_scores == null || math_scores.length ==0) {
			System.out.println("수학점수의 입력이 올바르지 않습니다.");
		}
		this.math_scores = math_scores;
		setMath_avg();
	}
	// 각 과목의 평균 점수를 출력하는 메소드를 작성
	public void setKor_avg(double kor_avg) {
		this.kor_avg = kor_avg;
	}
	public void setKor_avg() {
		if(this.getKor_scores() == null || this.getKor_scores().length ==0) {
			System.out.println("저장된 국어 점수가 없습니다.");
		}
		int[] temp = getKor_scores();
		double result = 0;
		for(int i=0; i<temp.length; i++) {
			result += temp[i];
		}
		setKor_avg(result/temp.length);
	}
	public void setEng_avg(double eng_avg) {
		this.eng_avg = eng_avg;
	}
	public void setEng_avg() {
		if(this.getEng_scores() == null || this.getEng_scores().length ==0) {
			System.out.println("저장된 영어 점수가 없습니다.");
		}
		int[] temp = getEng_scores();
		double result = 0;
		for(int i=0; i<temp.length; i++) {
			result += temp[i];
		}
		setEng_avg(result/temp.length);
	}
	public void setMath_avg(double math_avg) {
		this.math_avg = math_avg;
	}
	public void setMath_avg() {
		if(this.getMath_scores() == null || this.getMath_scores().length ==0) {
			System.out.println("저장된 국어 점수가 없습니다.");
		}
		int[] temp = getMath_scores();
		double result = 0;
		for(int i=0; i<temp.length; i++) {
			result += temp[i];
		}
		setMath_avg(result/temp.length);
	}
	
	// arrays.toString(배열)
	public void PrintInfo() {
		System.out.println(getName()+ " 학생의 점수");
		System.out.println("국어 평균 점수 : " + getKor_avg());
		System.out.println("영어 평균 점수 : " + getEng_avg());
		System.out.println("수학 평균 점수 : " + getMath_avg());
	}
}
