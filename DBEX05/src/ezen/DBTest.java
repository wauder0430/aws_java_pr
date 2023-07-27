package ezen;

public class DBTest
{
	public static void main(String[] args)
	{
		DBManager db = new DBManager();
		MemoVO vo = new MemoVO();
//		db.DBOpen();
		if( db.DBOpen() != true )
		{
			System.out.println("DB�� �������� ���߽��ϴ�");
			return;
		}
		
		int mode = 2; // 0:insert / 1:update / 2:delete / 3:select
		
		if( mode == 0 )	// insert
		{
//			String title = " '��������ǥ' ";
//			String note = " '����' ";
			vo.setmTitle("vo��ü");
			vo.setmNote("vo�� �̿��� ������ ����");
			
			String SQL = "";
			SQL += " insert into memo ";
			SQL += " ( mTitle, mNote ) ";
			SQL += " values ";
//			SQL += " ( '" + db._R(title) + "', '" + db._R(note) + "' ) ";
			SQL += " ( '" + db._R(vo.getmTitle()) + "', '" + db._R(vo.getmNote()) + "' ) ";
			
			System.out.println(SQL);
			
			if(db.RunSQL(SQL) != true)
			{
				System.out.println("�޸� �������� ���߽��ϴ�");
			}
		}
		
		if( mode == 1 )	// update
		{
//			String title = " '����' ";
//			String note = " '������Ʈ' ";
			vo.setmNo(28);
			vo.setmTitle("vo update");
			vo.setmNote("vo�� �̿��� ������ ������Ʈ");
			
			String SQL = "";
			SQL += " update memo ";
			SQL += " set ";
//			SQL += " mTitle = '" + db._R(title)	+ "'"	+ ","	+ " ";
			SQL += " mTitle = '" + db._R(vo.getmTitle())	+ "'"	+ ","	+ " ";
//			SQL += " mNote = '" + db._R(note)	+ "'"	+ ","	+ " ";
			SQL += " mNote = '" + db._R(vo.getmNote())	+ "'"	+ ","	+ " ";
			SQL += " wDate = now()"								+ " ";
//			SQL += " where mNo = 28 ";
			SQL += " where mNo = " + vo.getmNo();
			
			System.out.println(SQL);
			
			if(db.RunSQL(SQL) != true)
			{
				System.out.println("�޸� �������� ���߽��ϴ�");
			}
		}
		
		if( mode == 2 )	// delete
		{
//			String no = "26";
			vo.setmNo(26);
			
			String SQL = "";
			SQL += " delete from memo ";
//			SQL += " where mNo = " + no ;
			SQL += " where mNo = " + vo.getmNo();
			System.out.println(SQL);
			
			if(db.RunSQL(SQL) != true)
			{
				System.out.println("�޸� �������� ���߽��ϴ�");
			}
		}
		
		if( mode == 3 )	// select
		{
			// SQL ���� ����
			String SQL = " select * from memo ";
			if( db.OpenQuery(SQL) != true )	// SQL ���� ����
			{
				System.out.println("ERROR�� �߻��߽��ϴ�.");
				return;
			}
			// vo�� �迭/����Ʈ/��̸���Ʈ ����
			while( db.GetNext() == true )
			{
//				String mNo = db.GetValue("mNo");
/*				System.out.println("�޸��ȣ : " + mNo);
				System.out.println("�޸����� : " + db.GetValue("mTitle"));
				System.out.println("�޸𳻿� : " + db.GetValue("mNote"));
				System.out.println("�ۼ����� : " + db.GetValue("wDate")); */
				// �� vo�� �����
				
				// vo�� ������ �ְ�
				vo.setmNo(db.GetValue("mNo"));
				vo.setmTitle(db.GetValue("mTitle"));
				vo.setmNote(db.GetValue("mNote"));
				vo.setwDate(db.GetValue("wDate"));
				
				// �迭/����Ʈ/��̸���Ʈ�� vo�� �ִ´�
			}
			db.CloseQuery();
			// �迭/����Ʈ/��̸���Ʈ �� ���� �޸� ����� ����Ѵ�
		}
		db.DBClose();
	}
}