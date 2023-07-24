import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.Statement;

public class DBEX02 {

	public static void main(String[] args) {
		// 1. JDBC 드라이버를 로딩한다
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception e) {
			e.printStackTrace();
		}
		// 2. DBMS 접속하기 위한 세팅을 한다
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
		
		// 3. DBMS에 연결한다.
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(host, userID, userPW);
			// 작업 처리용 클래스 객체를 할당받는다.
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 4. sql 구문을 작성한다.
		Statement stmt = null; 
		String sql = "";
		try {
			stmt = conn.createStatement();
			sql += "select * from memo";
			ResultSet result = stmt.executeQuery(sql);
//			result = stmt.executeQuery(sql);	// select
//			result = stmt.executeUpdate(sql);	// insert update delete
			
		// 5. 결과로부터 '컬럼 이름'으로 '컬럼값'을 불러온다
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
		
//		// 6. insert 구문
//		sql  = " insert into memo(mTitle, mNote)";
//		sql += " values('제목입니다.', '내용입니다.')";
//		System.out.println(sql);
//		try {
//			stmt.executeUpdate(sql);
//			System.out.println("데이터를 넣었습니다.");
//		} catch (Exception e) {
//			System.out.println("데이터를 넣는데 실패했습니다.");
//			e.printStackTrace();
//		} finally {
//			System.out.println("insert 구문 실행을 수행했습니다.");
//		}
		
		// 7. for문을 이용해서 데이터를 10개 생성
		// "i번째 메모입니다.","i번째 메모의 내용입니다."
		for(int i=1; i<=10; i++) {
			sql  = " insert into memo(mTitle, mNote)";
			sql += " values('" + i + "번째 메모입니다.', '" + i + "번째 내용입니다.')";
			try {
				stmt.executeUpdate(sql);
				System.out.println("데이터를 넣었습니다.");
			} catch (Exception e) {
				System.out.println("데이터를 넣는데 실패했습니다.");
				e.printStackTrace();
			} finally {
				System.out.println("insert 구문 실행을 수행했습니다.");
			}
		}
		
		// 8. delete
		sql = " delete from memo ";
		sql+= " where mNo = 13 ";
		try {
			stmt.executeUpdate(sql);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 9. update
		sql = " update memo ";
		sql+= " set ";
		sql+= " mNote = 'like를 이용해바뀐내용입니다.' ";
		sql+= " where mTitle like '%6번째%' ";
		try {
			stmt.executeUpdate(sql);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// DBMS로부터 연결을 종료한다
		try {
			stmt.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
