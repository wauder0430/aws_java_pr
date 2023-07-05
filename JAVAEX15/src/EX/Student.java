package EX;

public class Student {
	// �л� �̸�
	private String name;
	// ���� ������ 
	private int[] kor_scores;
	// ���� ������
	private int[] eng_scores;
	// ���� ������
	private int[] math_scores;
	// ��� �������� ����
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
		if(kor_scores == null || kor_scores.length ==0) { //���� ���� �ִ��� Ȯ��
			System.out.println("���������� �Է��� �ùٸ��� �ʽ��ϴ�.");
		}
		this.kor_scores = kor_scores;
		setKor_avg();
	}
	public void setEng_scores(int[] eng_scores) {
		if(eng_scores == null || eng_scores.length ==0) {
			System.out.println("���������� �Է��� �ùٸ��� �ʽ��ϴ�.");
		}
		this.eng_scores = eng_scores;
		setEng_avg();
	}
	public void setMath_scores(int[] math_scores) {
		if(math_scores == null || math_scores.length ==0) {
			System.out.println("���������� �Է��� �ùٸ��� �ʽ��ϴ�.");
		}
		this.math_scores = math_scores;
		setMath_avg();
	}
	// �� ������ ��� ������ ����ϴ� �޼ҵ带 �ۼ�
	public void setKor_avg(double kor_avg) {
		this.kor_avg = kor_avg;
	}
	public void setKor_avg() {
		if(this.getKor_scores() == null || this.getKor_scores().length ==0) {
			System.out.println("����� ���� ������ �����ϴ�.");
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
			System.out.println("����� ���� ������ �����ϴ�.");
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
			System.out.println("����� ���� ������ �����ϴ�.");
		}
		int[] temp = getMath_scores();
		double result = 0;
		for(int i=0; i<temp.length; i++) {
			result += temp[i];
		}
		setMath_avg(result/temp.length);
	}
	
	// arrays.toString(�迭)
	public void PrintInfo() {
		System.out.println(getName()+ " �л��� ����");
		System.out.println("���� ��� ���� : " + getKor_avg());
		System.out.println("���� ��� ���� : " + getEng_avg());
		System.out.println("���� ��� ���� : " + getMath_avg());
	}
}
