package ezen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager
{
	// DB 접속용 데이터
	private String host;	// 서버 주소/포트/DB이름/셋팅들
	private String uID;		// DB 계정
	private String uPW;		// DB 계정 비번
	
	// DB 연결 객체들
	private Connection	conn	= null;		// DB 연결 객체
	private Statement	stmt	= null;		// SQL 문맥 객체
	private ResultSet	result	= null;		// SQL 결과 객체
	
	// 생성자
	public DBManager()
	{
		this.host = "jdbc:mysql://127.0.0.1:3306/ezen";
		host += "?useUnicode=true";
		host += "&characterEncoding=utf-8";
		host += "&serverTimezone=UTC";
//		host += "&useSSL=false";	// SSL 옵션 해제
		
		this.uID = "root";
		this.uPW = "ezen";
	}
	
	// ID, PW 셋터 / host 정보 역시 셋터를 활용하여 수정할 수 있음
	public void setUID(String userID) { this.uID = userID; }
	public void setUPW(String userPW) { this.uPW = userPW; }
	
	// DB 연결 메소드
	public boolean DBOpen()
	{
		try
		{	// JDBC 드라이버를 로딩한다
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 데이터베이스에 연결한다
			this.conn = DriverManager.getConnection(this.host, this.uID, this.uPW);
			return true;
		}catch( Exception e )
		{
			e.printStackTrace();
			return false;
		}
	}
	
	// DB 종료 메소드
	public boolean DBClose()
	{
		try
		{	// DB 연결 종료 시도
			this.conn.close();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	// SQL 실행 메소드 / Insert Update Delete SQl 구문 처리
	public boolean RunSQL( String SQL )
	{
		try
		{	// 문맥 객체를 할당받음
			this.stmt = this.conn.createStatement();
			// 인자로 받은 SQL 구문을 실행한다
			this.stmt.executeUpdate(SQL);
			// 문맥 객체를 닫음
			this.stmt.close();
			
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	// 쿼리 실행 메소드 - result / stmt -> open
	public boolean OpenQuery( String SQL )
	{
		try
		{	// 문맥 객체 할당
			this.stmt = this.conn.createStatement();
			// SQL 구문을 실행하여 결과를 받는다
			this.result = stmt.executeQuery(SQL);
			
			return true;
		}catch( Exception e )
		{
			e.printStackTrace();
			return false;
		}
	}
	
	// 쿼리 종료 메소드	- result / stmt	-> close
	public boolean CloseQuery()
	{
		try
		{
			this.result.close();
			this.stmt.close();
			return true;
		}catch( Exception e )
		{
			e.printStackTrace();
			return false;
		}
	}
	
	// getNext
	public boolean GetNext()
	{
		try
		{
			return this.result.next();
		}catch( Exception e )
		{
			e.printStackTrace();
			return false;
		}
	}
	
	// getValue
	public String GetValue( String colName )
	{
		try
		{	// 컬럼 이름으로 컬럼의 값을 가져옴
			return this.result.getString(colName);
		}catch( Exception e )
		{
			e.printStackTrace();
			return null;
		}
	}
	
	// getValue
	public int GetInt( String colName )
	{
		try
		{	// 컬럼 이름으로 컬럼의 값을 가져옴
			return this.result.getInt(colName);
		}catch( Exception e )
		{
			e.printStackTrace();
			return 0;
		}
	}
	
	// 작은따옴표 처리	자바에서 문자열은 ""로 감싸고 문자열 내부에 들어가는 SQL 구문에서
	// 문자열은 ''로 감싸게 되는데, 그 데이터(문자열)에 '가 포함된 경우에는 '를 처리해줘야 함
	// SQL 인젝션 방어에 해당하는 내용을 추가 할 수 있음
	public String _R( String value )
	{
		return value.replace("'", "''");
	}
}
