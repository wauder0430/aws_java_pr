public class ex03 {

	public static void main(String[] args) {
		int[] score = { 60, 90, 80, 40, 70, 20, 100, 50}; 
		int sum = 0, max = score[0], min = score[0];
		float avg = 0;
		
		for(int i=0; i<score.length; i++) {
			// ÃÑÇÕ
			sum += score[i];
			// min
			if(min>score[i]) {
				min = score[i];
			}
			// max
			if(max<score[i]) {
				max = score[i];
			}
		}
		avg = (float)sum / score.length;
		System.out.println("ÃÑÇÕ : " + sum);
		System.out.println("Æò±Õ : " + avg);
		System.out.println("ÃÖ¼Ò°ª : " + min);
		System.out.println("ÃÖ´ë°ª : " + max);
	}

}
