public class ex06
{
	public static void main(String[] args)
	{
		// 증감연산자
		int x;
		x = 0;
		x = x + 1;
		System.out.println("x = x + 1 : " + x);
		x += 1;
		System.out.println("x += 1 : " + x);
		x++;
		System.out.println("x++ : " + x);
		++x;
		System.out.println("++x : " + x);
		
		System.out.println("x : " + x);
		System.out.println("x++ : " + x++);
		System.out.println("x : " + x);
		System.out.println("++x : " + ++x);
		System.out.println("x : " + x);
	}
}