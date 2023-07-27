package ezen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManager
{
	// DB ���ӿ� ������
	private String host;	// ���� �ּ�/��Ʈ/DB�̸�/���õ�
	private String uID;		// DB ����
	private String uPW;		// DB ���� ���
	
	// DB ���� ��ü��
	private Connection	conn	= null;		// DB ���� ��ü
	private Statement	stmt	= null;		// SQL ���� ��ü
	private ResultSet	result	= null;		// SQL ��� ��ü
	
	// ������
	public DBManager()
	{
		this.host = "jdbc:mysql://127.0.0.1:3306/ezen";
		host += "?useUnicode=true";
		host += "&characterEncoding=utf-8";
		host += "&serverTimezone=UTC";
//		host += "&useSSL=false";	// SSL �ɼ� ����
		
		this.uID = "root";
		this.uPW = "ezen";
	}
	
	// ID, PW ���� / host ���� ���� ���͸� Ȱ���Ͽ� ������ �� ����
	public void setUID(String userID) { this.uID = userID; }
	public void setUPW(String userPW) { this.uPW = userPW; }
	
	// DB ���� �޼ҵ�
	public boolean DBOpen()
	{
		try
		{	// JDBC ����̹��� �ε��Ѵ�
			Class.forName("com.mysql.cj.jdbc.Driver");
			// �����ͺ��̽��� �����Ѵ�
			this.conn = DriverManager.getConnection(this.host, this.uID, this.uPW);
			return true;
		}catch( Exception e )
		{
			e.printStackTrace();
			return false;
		}
	}
	
	// DB ���� �޼ҵ�
	public boolean DBClose()
	{
		try
		{	// DB ���� ���� �õ�
			this.conn.close();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	// SQL ���� �޼ҵ� / Insert Update Delete SQl ���� ó��
	public boolean RunSQL( String SQL )
	{
		try
		{	// ���� ��ü�� �Ҵ����
			this.stmt = this.conn.createStatement();
			// ���ڷ� ���� SQL ������ �����Ѵ�
			this.stmt.executeUpdate(SQL);
			// ���� ��ü�� ����
			this.stmt.close();
			
			return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	// ���� ���� �޼ҵ� - result / stmt -> open
	public boolean OpenQuery( String SQL )
	{
		try
		{	// ���� ��ü �Ҵ�
			this.stmt = this.conn.createStatement();
			// SQL ������ �����Ͽ� ����� �޴´�
			this.result = stmt.executeQuery(SQL);
			
			return true;
		}catch( Exception e )
		{
			e.printStackTrace();
			return false;
		}
	}
	
	// ���� ���� �޼ҵ�	- result / stmt	-> close
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
		{	// �÷� �̸����� �÷��� ���� ������
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
		{	// �÷� �̸����� �÷��� ���� ������
			return this.result.getInt(colName);
		}catch( Exception e )
		{
			e.printStackTrace();
			return 0;
		}
	}
	
	// ��������ǥ ó��	�ڹٿ��� ���ڿ��� ""�� ���ΰ� ���ڿ� ���ο� ���� SQL ��������
	// ���ڿ��� ''�� ���ΰ� �Ǵµ�, �� ������(���ڿ�)�� '�� ���Ե� ��쿡�� '�� ó������� ��
	// SQL ������ �� �ش��ϴ� ������ �߰� �� �� ����
	public String _R( String value )
	{
		return value.replace("'", "''");
	}
}
