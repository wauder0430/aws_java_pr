package ezen;

import java.util.ArrayList;

public class MemoDAO2 extends DBManager
{
	// CRUD�� SQL ������ �ۼ�
	// DB�� ����Ͽ� VO�� �����͸� �ְų�
	// VO�� �����͸� DB�� �ִ� �۾��� ����

	// vo�� �޾� Insert�� SQL ������ �ۼ��ϰ� DB�� vo�� �ִ� �޼ҵ�
	public boolean Insert( MemoVO vo )
	{
		try
		{	// DB ����
			//DBManager db = new DBManager();
			this.DBOpen();
			// SQL ���� ����
			String SQL = " insert into memo ";
			SQL += " ( mTitle, mNote ) ";
			SQL += " values ";
			SQL += " ( '" + this._R(vo.getmTitle()) + "', '" + this._R(vo.getmNote()) + "' ) ";
			
			System.out.println(SQL);
			
			if(this.RunSQL(SQL) != true)
			{
				System.out.println("�޸� �������� ���߽��ϴ�");
				this.DBClose();
				return false;
			}
			this.DBClose();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	// vo�� �޾� update�� SQL ������ �ۼ� ---
	public Boolean Update( MemoVO vo )
	{
		try
		{	// DB ����
			//DBManager db = new DBManager();
			this.DBOpen();
			// SQL ���� ����
			String SQL = " update memo ";
			SQL += " set ";
			SQL += " mTitle = '" + this._R(vo.getmTitle())	+ "'"	+ ","	+ " ";
			SQL += " mNote = '" + this._R(vo.getmNote())		+ "'"	+ ","	+ " ";
			SQL += " wDate = now() "										+ " ";
			SQL += " where mNo = " + vo.getmNo();
			
			if(this.RunSQL(SQL) != true)
			{
				System.out.println("�޸� �������� ���߽��ϴ�");
				this.DBClose();
				return false;
			}
			this.DBClose();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	// vo/�޸��ȣ �� �޾� delete SQL �ۼ� ---
	public boolean Delete(MemoVO vo)
	{	// vo���� �޸��ȣ�� ������, �޸��ȣ�� �����ϴ� �޼ҵ带 ȣ��
		return Delete(vo.getmNo());
	}
	
	public boolean Delete( int no )
	{
		try
		{	// DB ����
			//DBManager db = new DBManager();
			this.DBOpen();
			// SQL ���� ����
			String SQL = " delete from memo where mNo = " + no ;
			
			if(this.RunSQL(SQL) != true)
			{
				System.out.println("�޸� �������� ���߽��ϴ�");
				this.DBClose();
				return false;
			}
			this.DBClose();
			return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public MemoVO Read( String no )
	{
		try
		{	// ���ڷ� ���� �޸��ȣ�� ������ ��ȯ�Ͽ�, Read( int no ) ȣ�� 
			return Read( Integer.parseInt(no) );
		}catch( Exception e )
		{
			e.printStackTrace();
			return null;
		}
	}
	
	// �޸� ��ȣ�� �޾� vo�� �����ϴ� �޼ҵ�
	public MemoVO Read( int no )
	{
//		MemoVO vo = new MemoVO();
		//DBManager db = new DBManager();
		try
		{	// DB�� ����
			this.DBOpen();
			// SQL ���� �ۼ�
			String SQL = " select mNo, mTitle, mNote, wDate from memo where mNo = " + no;
			
			System.out.println("SQL : " +  SQL);
			// SQL ���� ����
			this.OpenQuery(SQL);
			
			// ��� Ȯ��
			if( this.GetNext() == false )
			{
				System.out.println( no + "���� �޸� �������� �ʽ��ϴ�.");
				this.CloseQuery();
				this.DBClose();
				return null;
			}
/*			vo.setmNo(this.GetValue("mNo"));
			vo.setmTitle(this.GetValue("mTitle"));
			vo.setmNote(this.GetValue("mNote"));
			vo.setwDate(this.GetValue("wDate"));	*/
			MemoVO vo = new MemoVO( this.GetValue("mNo"), this.GetValue("mTitle"), 
					this.GetValue("mNote"), this.GetValue("wDate"));
			return vo;
		}catch( Exception e )
		{
			e.printStackTrace();
			this.CloseQuery();
			this.DBClose();
			return null;
		}
	}
	
	// ��ü ����� vo�� ����Ʈ�� �����ϴ� �޼ҵ�
	public ArrayList<MemoVO> List()
	{	// ����� ������ ��̸���Ʈ�� �����Ѵ�
		ArrayList<MemoVO> list = new ArrayList<MemoVO>();
		
		// DB�� �����Ѵ�
		//DBManager db = new DBManager();
		if(this.DBOpen() == false)
		{	// DB ������ �ȵǴ� ���
			return null;
		}
		
//		String sql = " select * from memo ";
		String sql = " select mNo, mTitle, mNote, wDate from memo ";
		sql += " order by wDate desc ";
		this.OpenQuery(sql);
		while( this.GetNext() == true )
		{
			MemoVO vo = new MemoVO(
						this.GetValue("mNo"),
						this.GetValue("mTitle"),
						this.GetValue("mNote"),
						this.GetValue("wDate")
					);
			list.add(vo);
		}
		this.CloseQuery();
		this.DBClose();
		
		// ����Ʈ�� ��ȯ�Ѵ�
		return list;
	}
}
