package ezen;

import java.util.ArrayList;

public class MemoDAO
{
	// CRUD�� SQL ������ �ۼ�
	// DB�� ����Ͽ� VO�� �����͸� �ְų�
	// VO�� �����͸� DB�� �ִ� �۾��� ����

	// vo�� �޾� Insert�� SQL ������ �ۼ��ϰ� DB�� vo�� �ִ� �޼ҵ�
	public boolean Insert( MemoVO vo )
	{
		try
		{	// DB ����
			DBManager db = new DBManager();
			db.DBOpen();
			// SQL ���� ����
			String SQL = " insert into memo ";
			SQL += " ( mTitle, mNote ) ";
			SQL += " values ";
			SQL += " ( '" + db._R(vo.getmTitle()) + "', '" + db._R(vo.getmNote()) + "' ) ";
			
			System.out.println(SQL);
			
			if(db.RunSQL(SQL) != true)
			{
				System.out.println("�޸� �������� ���߽��ϴ�");
				db.DBClose();
				return false;
			}
			db.DBClose();
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
			DBManager db = new DBManager();
			db.DBOpen();
			// SQL ���� ����
			String SQL = " update memo ";
			SQL += " set ";
			SQL += " mTitle = '" + db._R(vo.getmTitle())	+ "'"	+ ","	+ " ";
			SQL += " mNote = '" + db._R(vo.getmNote())		+ "'"	+ ","	+ " ";
			SQL += " wDate = now() "										+ " ";
			SQL += " where mNo = " + vo.getmNo();
			
			if(db.RunSQL(SQL) != true)
			{
				System.out.println("�޸� �������� ���߽��ϴ�");
				db.DBClose();
				return false;
			}
			db.DBClose();
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
			DBManager db = new DBManager();
			db.DBOpen();
			// SQL ���� ����
			String SQL = " delete from memo where mNo = " + no ;
			
			if(db.RunSQL(SQL) != true)
			{
				System.out.println("�޸� �������� ���߽��ϴ�");
				db.DBClose();
				return false;
			}
			db.DBClose();
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
		DBManager db = new DBManager();
		try
		{	// DB�� ����
			db.DBOpen();
			// SQL ���� �ۼ�
			String SQL = " select mNo, mTitle, mNote, wDate from memo where mNo = " + no;
			
			System.out.println("SQL : " +  SQL);
			// SQL ���� ����
			db.OpenQuery(SQL);
			
			// ��� Ȯ��
			if( db.GetNext() == false )
			{
				System.out.println( no + "���� �޸� �������� �ʽ��ϴ�.");
				db.CloseQuery();
				db.DBClose();
				return null;
			}
/*			vo.setmNo(db.GetValue("mNo"));
			vo.setmTitle(db.GetValue("mTitle"));
			vo.setmNote(db.GetValue("mNote"));
			vo.setwDate(db.GetValue("wDate"));	*/
			MemoVO vo = new MemoVO( db.GetValue("mNo"), db.GetValue("mTitle"), 
					db.GetValue("mNote"), db.GetValue("wDate"));
			return vo;
		}catch( Exception e )
		{
			e.printStackTrace();
			db.CloseQuery();
			db.DBClose();
			return null;
		}
	}
	
	// ��ü ����� vo�� ����Ʈ�� �����ϴ� �޼ҵ�
	public ArrayList<MemoVO> List()
	{	// ����� ������ ��̸���Ʈ�� �����Ѵ�
		ArrayList<MemoVO> list = new ArrayList<MemoVO>();
		
		// DB�� �����Ѵ�
		DBManager db = new DBManager();
		if(db.DBOpen() == false)
		{	// DB ������ �ȵǴ� ���
			return null;
		}
		
//		String sql = " select * from memo ";
		String sql = " select mNo, mTitle, mNote, wDate from memo ";
		sql += " order by wDate desc ";
		db.OpenQuery(sql);
		while( db.GetNext() == true )
		{
			MemoVO vo = new MemoVO(
						db.GetValue("mNo"),
						db.GetValue("mTitle"),
						db.GetValue("mNote"),
						db.GetValue("wDate")
					);
			list.add(vo);
		}
		db.CloseQuery();
		db.DBClose();
		
		// ����Ʈ�� ��ȯ�Ѵ�
		return list;
	}
}
