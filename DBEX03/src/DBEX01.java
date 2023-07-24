import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.Statement;

public class DBEX01 {

	public static void main(String[] args) {
		try {
			// JDBC 드라이버를 로딩한다
			Class.forName("com.mysql.cj.jdbc.Driver");
			// DBMS 접속하기 위한 세팅을 한다
			// 서버주소, 포트 , db이름, 유니코드 사용 여부, 인코딩, 서버시간대 설정
			String host = "";
			host += "jdbc:mysql://127.0.0.1:3306";	// 서버주소 포트
			host += "/ezen";						// db이름
			host += "?useUnicode=true";				// 유니코드
			host += "&characterEncoding=utf-8";		// 인코딩
			host += "&serverTimezone=UTC";			// 서버 시간대
			// 사용자 계정 정보
			String userID = "root";
			String userPW = "ezen";
			// DBMS에 연결한다.
			Connection conn = DriverManager.getConnection(host, userID, userPW);
			// 작업 처리용 클래스 객체를 할당받는다.
			Statement stmt = conn.createStatement();

			// sql 구문을 작성한다.
			String sql = "";
			sql += "select * from memo";
			ResultSet result = stmt.executeQuery(sql);
//			result = stmt.executeQuery(sql);	// select
//			result = stmt.executeUpdate(sql);	// insert update delete
			
			// 결과로부터 '컬럼 이름'으로 '컬럼값'을 불러온다
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
