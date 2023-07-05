package EX;

public class test
{
	public static void main(String[] args)
	{
		int[] kor_scores = { 55, 66, 77, 88 };
		int[] eng_scores = { 10, 20, 30, 40, 50 };
		int[] mat_scores = { 70, 40, 60 };

		Student2 hong = new Student2( "ȫ�浿", kor_scores, eng_scores, mat_scores);
		
		hong.PrintInfo();
	}
}