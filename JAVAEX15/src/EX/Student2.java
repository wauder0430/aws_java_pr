package EX;

import java.util.Arrays;

public class Student2
{
	// 학생 이름
	// 국어 점수들 int[] kor_scores;
	// 영어 점수들 int[] eng_scores;
	// 수학 점수들 int[] mat_scores;
	
	// 평균점수들을 저장하는 배열 int[] avgs;
	
	// setters getters
	
	// 각 과목의 평균 점수를 출력하는 메소드
	// Arrays.toString(배열)
	public String arry_to_string(int[] arry)
	{
		String result ="";
		for( int item : arry )
		{
			result = ""+ item + ",";
		}
		// 맨 마지막 ,를 제거
		result = result.substring(0, result.length() -1);
		return result;
	}
	

	private String	name;		// 학생 이름
	
	private int[]	kor_scores;	// 국어 점수
	private int[]	eng_scores;	// 영어 점수
	private int[]	mat_scores;	// 수학 점수
	
	private double[] score_avg;	// 평균 점수들
	
	// 생성자
	Student2(){}
	// 이름 :name / 국어점수 : k_arry / 영어점수 : e_arry / 수학점수 : m_arry
	Student2(String name, int[] k_arry, int[] e_arry, int[] m_arry)
	{
		this.name = name;
		// 각각의 배열의 유효성 확인
		this.setKor_scores(k_arry);	// 국어 점수를 셋팅
		this.setEng_scores(e_arry);	// 영어 점수를 셋팅
		this.setMat_scores(m_arry);	// 수학 점수를 셋팅
		this.setScore_avg();		// 각 과목의 평균 점수를 구해서 셋팅
	}
	
	public void setKor_scores(int[] kor_scores)
	{
		if( kor_scores == null || kor_scores.length == 0 )
		{
			System.out.println("국어 점수가 올바르지 않습니다.");
		}else
		{
			System.out.println("국어 점수를 입력합니다.");
			this.kor_scores = kor_scores;
		}
	}
	public void setEng_scores(int[] eng_scores)
	{
		if( eng_scores == null || eng_scores.length == 0 )
		{
			System.out.println("영어 점수가 올바르지 않습니다.");
		}else
		{
			System.out.println("영어 점수를 입력합니다.");
			this.eng_scores = eng_scores;
		}
	}
	public void setMat_scores(int[] mat_scores)
	{
		if( mat_scores == null || mat_scores.length == 0 )
		{
			System.out.println("수학 점수가 올바르지 않습니다.");
		}else
		{
			System.out.println("수학 점수를 입력합니다.");
			this.mat_scores = mat_scores;
		}
	}
	public String	getName()		 { return name;		  }
	public int[]	getKor_scores()	 { return kor_scores; }
	public int[]	getEng_scores()	 { return eng_scores; }
	public int[]	getMat_scores()	 { return mat_scores; }
	public double[]	getScore_avg()	 { return score_avg;  }
	
	public String	getK_score_str() { return Arrays.toString(this.getKor_scores()); }
	public String	getE_score_str() { return Arrays.toString(this.getEng_scores()); }
	public String	getM_score_str() { return Arrays.toString(this.getMat_scores()); }
	
	public String	getS_avg_str()
	{
		// 반환할 문자열 변수를 선언
		String result = "";
		// score_avg필드의 배열을 임시 배열에 넣는다
		double[] tmp = this.getScore_avg();
		result += "국어 평균 : "+ tmp[0] + "\n";
		result += "영어 평균 : "+ tmp[1] + "\n";
		result += "수학 평균 : "+ tmp[2] + "\n";
		return result;
	}

	public void setScore_avg()
	{
		// 결과를 담을 배열을 선언한다
		double[] result = new double[3];
		
		result[0] = this.cal_avg(this.getKor_scores()); // 
		result[1] = this.cal_avg(this.getEng_scores());
		result[2] = this.cal_avg(this.getMat_scores());
		this.score_avg = result;
	}

	// 배열을 입력받아 배열 원소의 평균값을 반환하는 메소드
	public double cal_avg( int[] arry )
	{
		double result = 0;
		if( arry == null || arry.length == 0 )
		{
			System.out.println("입력값이 올바르지 않습니다.");
			return -1;
		}else
		{
			for( int item : arry)
			{
				result += item;	// 배열의 원소의 총 합계를 구함
			}
			result /= arry.length;	// 총합계를 배열의 원소 갯수로 나눔
		}
		return result;
	}

	public void PrintInfo()
	{
		System.out.println("--------------------");
		System.out.println("국어 시험 점수 : " + this.getK_score_str());
		System.out.println("영어 시험 점수 : " + this.getE_score_str());
		System.out.println("수학 시험 점수 : " + this.getM_score_str());
		System.out.println("각 과목의 평균 점수 \n" + this.getS_avg_str());
	}
}