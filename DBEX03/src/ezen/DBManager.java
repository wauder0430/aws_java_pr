package ezen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	// 필드\// 접속하기 위한 정보
	private String host;	// 서버정보
	private String userID;	// 계정
	private String userPW;	// 비번
	
	// conn
	private Connection conn = null;
	// result 
	private ResultSet result = null;
	
	// 생성자
	public DBManager() {
		host = "jdbc:mysql://127.0.0.1:3306/ezen";	//주소/포트/DB이름
		host += "?useUnicode=true";					// 유니코드
		host += "&characterEncoding=utf-8";			// 인코딩
		host += "&serverTimezone=UTC";				// 서버시간대
		userID = "root";						// 사용자 계정
		userPW = "ezen";						// 사용자 비번
	}
	
	// DB 연결하는 메소드
	public boolean DBOpen() { 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(host, userID, userPW);
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	// DB 연결 종료하는 메소드
	public boolean DBClose() {
		try {
			conn.close();
		} catch(Exception e) {
			return false;
		}
		return true;
	}
	
	// SQL insert/delete/update 구문을 실행
	public boolean RunSql(String sql){
		System.out.println(sql);
		Statement stmt;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	// SQL select 구문을 실행
	public boolean RunQuery(String sql){
		System.out.println(sql);
		Statement stmt;
		try {
			stmt = conn.createStatement();
			result = stmt.executeQuery(sql);
		} catch(Exception e) {
			return false;
		}
		return true;
	}
	
	// result 필드에서, 컬럼이름을 입력받아 값을 반환하는 메소드
	public String GetValue(String colName) {
		try {
			return this.result.getString(colName);
		} catch(Exception e) {
			return null;
		}
	}
	
}
