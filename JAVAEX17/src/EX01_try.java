
public class EX01_try {

	public static void main(String[] args) {
		/* try {������ �Ͼ���� ����} catch(����Ŭ���� ��ü������){��ü ������ ���} 
 			try {�����ڵ�} 
 			catch(����Ŭ���� ��ü������)
 			{���� ó�� ����} 
 			finally
 			{���� ���� ���� }
		 * */
		
		int x = 10;
		int y = 0;
		int result = 0;
		
		try {
		result = x/y; //ArithmeticException
		System.out.println(result);
		} catch (Exception e){
			System.out.println(e);
			e.printStackTrace();
		} finally { // try���� ������ �߻��ϵ� ���ϵ� ���������� ����ȴ�.
			System.out.println("try catch ���� ����Ǿ� finally������ ���Խ��ϴ�.");
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
