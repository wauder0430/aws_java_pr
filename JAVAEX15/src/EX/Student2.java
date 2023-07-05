package EX;

import java.util.Arrays;

public class Student2
{
	// �л� �̸�
	// ���� ������ int[] kor_scores;
	// ���� ������ int[] eng_scores;
	// ���� ������ int[] mat_scores;
	
	// ����������� �����ϴ� �迭 int[] avgs;
	
	// setters getters
	
	// �� ������ ��� ������ ����ϴ� �޼ҵ�
	// Arrays.toString(�迭)
	public String arry_to_string(int[] arry)
	{
		String result ="";
		for( int item : arry )
		{
			result = ""+ item + ",";
		}
		// �� ������ ,�� ����
		result = result.substring(0, result.length() -1);
		return result;
	}
	

	private String	name;		// �л� �̸�
	
	private int[]	kor_scores;	// ���� ����
	private int[]	eng_scores;	// ���� ����
	private int[]	mat_scores;	// ���� ����
	
	private double[] score_avg;	// ��� ������
	
	// ������
	Student2(){}
	// �̸� :name / �������� : k_arry / �������� : e_arry / �������� : m_arry
	Student2(String name, int[] k_arry, int[] e_arry, int[] m_arry)
	{
		this.name = name;
		// ������ �迭�� ��ȿ�� Ȯ��
		this.setKor_scores(k_arry);	// ���� ������ ����
		this.setEng_scores(e_arry);	// ���� ������ ����
		this.setMat_scores(m_arry);	// ���� ������ ����
		this.setScore_avg();		// �� ������ ��� ������ ���ؼ� ����
	}
	
	public void setKor_scores(int[] kor_scores)
	{
		if( kor_scores == null || kor_scores.length == 0 )
		{
			System.out.println("���� ������ �ùٸ��� �ʽ��ϴ�.");
		}else
		{
			System.out.println("���� ������ �Է��մϴ�.");
			this.kor_scores = kor_scores;
		}
	}
	public void setEng_scores(int[] eng_scores)
	{
		if( eng_scores == null || eng_scores.length == 0 )
		{
			System.out.println("���� ������ �ùٸ��� �ʽ��ϴ�.");
		}else
		{
			System.out.println("���� ������ �Է��մϴ�.");
			this.eng_scores = eng_scores;
		}
	}
	public void setMat_scores(int[] mat_scores)
	{
		if( mat_scores == null || mat_scores.length == 0 )
		{
			System.out.println("���� ������ �ùٸ��� �ʽ��ϴ�.");
		}else
		{
			System.out.println("���� ������ �Է��մϴ�.");
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
		// ��ȯ�� ���ڿ� ������ ����
		String result = "";
		// score_avg�ʵ��� �迭�� �ӽ� �迭�� �ִ´�
		double[] tmp = this.getScore_avg();
		result += "���� ��� : "+ tmp[0] + "\n";
		result += "���� ��� : "+ tmp[1] + "\n";
		result += "���� ��� : "+ tmp[2] + "\n";
		return result;
	}

	public void setScore_avg()
	{
		// ����� ���� �迭�� �����Ѵ�
		double[] result = new double[3];
		
		result[0] = this.cal_avg(this.getKor_scores()); // 
		result[1] = this.cal_avg(this.getEng_scores());
		result[2] = this.cal_avg(this.getMat_scores());
		this.score_avg = result;
	}

	// �迭�� �Է¹޾� �迭 ������ ��հ��� ��ȯ�ϴ� �޼ҵ�
	public double cal_avg( int[] arry )
	{
		double result = 0;
		if( arry == null || arry.length == 0 )
		{
			System.out.println("�Է°��� �ùٸ��� �ʽ��ϴ�.");
			return -1;
		}else
		{
			for( int item : arry)
			{
				result += item;	// �迭�� ������ �� �հ踦 ����
			}
			result /= arry.length;	// ���հ踦 �迭�� ���� ������ ����
		}
		return result;
	}

	public void PrintInfo()
	{
		System.out.println("--------------------");
		System.out.println("���� ���� ���� : " + this.getK_score_str());
		System.out.println("���� ���� ���� : " + this.getE_score_str());
		System.out.println("���� ���� ���� : " + this.getM_score_str());
		System.out.println("�� ������ ��� ���� \n" + this.getS_avg_str());
	}
}