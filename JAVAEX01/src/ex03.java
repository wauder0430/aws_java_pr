public class ex03
{
	public static void main(String[] args)
	{
		// 실수형 기본변수
		// float double
		float	f = 1.1f;
		double	d = 1.1;
		d = 1.2f;
		f = (float)d;
		System.out.println("float : " + f);
		System.out.println("double : " + d);
	}
}