package TEST;

import java.util.Arrays;

public class Student extends Person {
	// ���� ������ �迭 int[] scores
	private int[] scores;
	// double avg ���  ����
	private double avg;
	
	// �����ڿ��� ���������� �迭�� �Է�
	Student(){}
	Student(int[] scores){
		this.setScores(scores);
	}
	//setter getter����
	//���� �������� �ִ��� �Ǻ�
	// ������ ��������� ���ϴ� ����
	
	public int[] getScores() {
		return scores;
	}
	public double getAvg() {
		return avg;
	}
	public void setScores(int[] scores) {
		if(scores == null || scores.length ==0) {
			System.out.println("�Է°��� �ùٸ��� �ʽ��ϴ�.");
		} else {
			this.scores = scores;
			this.setAvg();
		}
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	//setter�޼ҵ� �����ε�
	public void setAvg() {
		//if(this.scores == null || this.scores.length ==0)
		if(this.getScores() == null || this.getScores().length ==0) {
			System.out.println("����� ���� ���� ������ �Էµ��� �ʾҽ��ϴ�.");
		} else {
			int[] arry = this.getScores();
			double result = 0;
			for(int i=0; i<arry.length; i++) {
				result += arry[i]; 
			}
			result /= arry.length; 
			// �Ϲ��� ����ȯ ���� ���� result�� int��� int->double ������ ����̶� ���� �׷����ϳ�
			this.setAvg(result);
		}
	}
	
	// ������ ����ϴ� �޼ҵ忡��
	// ����������� ��� ������ ���
	@Override
	public void PrintInfo() {
		System.out.println("�������� : " + Arrays.toString(getScores()));
		System.out.println("������� : " + getAvg());
	}
}
