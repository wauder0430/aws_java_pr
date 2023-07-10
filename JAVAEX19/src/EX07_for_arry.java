
public class EX07_for_arry {

	public static void main(String[] args) {
		// 
		int[] int_arr;
		char char_arr[];
		
		int[] score = {1,2,3,4,5};
		int[] arry = new int[10];
		
		System.out.println(score.length);
		System.out.println(arry.length);
		
		System.out.println(score[3]);
		
		for(int data : score) {
			System.out.println(data);
		}
		
		int[] scores = {80,90,50,70,30};
		int sum=0;
		for(int item : scores) {
			sum += item;
		}
		int result = sum/scores.length;
		System.out.println(result);
	}

}
