
public class EX05_test {

	public static void main(String[] args) {
		// 
		String[] scores = {"1,000", "20,000", "3,000", "123,456.789"};
		
		double sum = 0;
		// scores �迭�� ���鼭 ���������� ���ڿ���
		// 1. ���� ��ȯ�� �õ��ϰ�
		// 1-1. ������ ��ȯ�� �Ǹ� sum�� ���ϰ�
		// 1-2. ���� ��ȯ�� ���� ������, �Ǽ� ��ȯ�� �õ��ϰ�
		// 2-1. �Ǽ��� ��ȯ�Ǹ� sum�� ���ϰ�
		// 2-2. ��ȯ���� ������ �� ���ڿ��� ����ϼ���
		
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
		// ������ ����ϼ���
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
					System.out.println("���ڰ� �ƴմϴ�.");
				}
			}
		}
		System.out.println("sum_d : " + sum_d);
	}

}
