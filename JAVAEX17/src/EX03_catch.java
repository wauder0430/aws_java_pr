import java.util.Scanner;

public class EX03_catch {
	public static void main(String[] args) {
		int x, y, z =0;
		int[] arry = {1,2,3};
		String str = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		str = scan.nextLine();
		try {
			x = 10; 
			y = 3;
			z = x/y;
			z = arry[0];
			z = Integer.parseInt(str);
			
		} catch(ArithmeticException e) {
			System.out.println("���� ���� �߻�");
			e.printStackTrace();
		} catch(IndexOutOfBoundsException e) {
			System.out.println("�ε��� ���� ���� �߻�");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("��Ÿ ���� �߻�");
		} finally {
			System.out.println("z : " + z);
			if(str != null) {
				System.out.println(str);
			}
			scan.close();
		}
		
	}
}
