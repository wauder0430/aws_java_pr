package ezen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	// �ʵ�\// �����ϱ� ���� ����
	private String host;	// ��������
	private String userID;	// ����
	private String userPW;	// ���
	
	// conn
	private Connection conn = null;
	// result 
	private ResultSet result = null;
	
	// ������
	public DBManager() {
		host = "jdbc:mysql://127.0.0.1:3306/ezen";	//�ּ�/��Ʈ/DB�̸�
		host += "?useUnicode=true";					// �����ڵ�
		host += "&characterEncoding=utf-8";			// ���ڵ�
		host += "&serverTimezone=UTC";				// �����ð���
		userID = "root";						// ����� ����
		userPW = "ezen";						// ����� ���
	}
	
	// DB �����ϴ� �޼ҵ�
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
	// DB ���� �����ϴ� �޼ҵ�
	public boolean DBClose() {
		try {
			conn.close();
		} catch(Exception e) {
			return false;
		}
		return true;
	}
	
	// SQL insert/delete/update ������ ����
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
	
	// SQL select ������ ����
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
	
	// result �ʵ忡��, �÷��̸��� �Է¹޾� ���� ��ȯ�ϴ� �޼ҵ�
	public String GetValue(String colName) {
		try {
			return this.result.getString(colName);
		} catch(Exception e) {
			return null;
		}
	}
	
}
