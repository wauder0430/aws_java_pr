import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.Statement;

public class DBEX01 {

	public static void main(String[] args) {
		try {
			// JDBC ����̹��� �ε��Ѵ�
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DBMS �����ϱ� ���� ������ �Ѵ�
			// �����ּ�, ��Ʈ , db�̸�, �����ڵ� ��� ����, ���ڵ�, �����ð��� ����
			String host = "";
			host += "jdbc:mysql://127.0.0.1:3306";	// �����ּ� ��Ʈ
			host += "/ezen";						// db�̸�
			host += "?useUnicode=true";				// �����ڵ�
			host += "&characterEncoding=utf-8";		// ���ڵ�
			host += "&serverTimezone=UTC";			// ���� �ð���
			// ����� ���� ����
			String userID = "root";
			String userPW = "ezen";
			// DBMS�� �����Ѵ�.
			Connection conn = DriverManager.getConnection(host, userID, userPW);
			// �۾� ó���� Ŭ���� ��ü�� �Ҵ�޴´�.
			Statement stmt = conn.createStatement();

			// sql ������ �ۼ��Ѵ�.
			String sql = "";
			sql += "select * from memo";
			ResultSet result = stmt.executeQuery(sql);
//			result = stmt.executeQuery(sql);	// select
//			result = stmt.executeUpdate(sql);	// insert update delete
			
			// ����κ��� '�÷� �̸�'���� '�÷���'�� �ҷ��´�
			while(result.next() == true) {
				int mNo = result.getInt("mNO");
				String mTitle = result.getString("mTitle");
				String mNote = result.getString("mNote");
				String wDate = result.getString("wDate");
				System.out.println("mNo : " + mNo);
				System.out.println("mTitle : " + mTitle);
				System.out.println("mNote : " + mNote);
				System.out.println("wDate : " + wDate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
