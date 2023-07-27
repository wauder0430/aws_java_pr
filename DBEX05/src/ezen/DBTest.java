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
			System.out.println("DB에 연결하지 못했습니다");
			return;
		}
		
		int mode = 2; // 0:insert / 1:update / 2:delete / 3:select
		
		if( mode == 0 )	// insert
		{
//			String title = " '작은따옴표' ";
//			String note = " '내용' ";
			vo.setmTitle("vo객체");
			vo.setmNote("vo를 이용한 데이터 전달");
			
			String SQL = "";
			SQL += " insert into memo ";
			SQL += " ( mTitle, mNote ) ";
			SQL += " values ";
//			SQL += " ( '" + db._R(title) + "', '" + db._R(note) + "' ) ";
			SQL += " ( '" + db._R(vo.getmTitle()) + "', '" + db._R(vo.getmNote()) + "' ) ";
			
			System.out.println(SQL);
			
			if(db.RunSQL(SQL) != true)
			{
				System.out.println("메모를 생성하지 못했습니다");
			}
		}
		
		if( mode == 1 )	// update
		{
//			String title = " '제목' ";
//			String note = " '업데이트' ";
			vo.setmNo(28);
			vo.setmTitle("vo update");
			vo.setmNote("vo를 이용한 데이터 업데이트");
			
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
				System.out.println("메모를 수정하지 못했습니다");
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
				System.out.println("메모를 삭제하지 못했습니다");
			}
		}
		
		if( mode == 3 )	// select
		{
			// SQL 구문 생성
			String SQL = " select * from memo ";
			if( db.OpenQuery(SQL) != true )	// SQL 구문 실행
			{
				System.out.println("ERROR가 발생했습니다.");
				return;
			}
			// vo의 배열/리스트/어레이리스트 생성
			while( db.GetNext() == true )
			{
//				String mNo = db.GetValue("mNo");
/*				System.out.println("메모번호 : " + mNo);
				System.out.println("메모제목 : " + db.GetValue("mTitle"));
				System.out.println("메모내용 : " + db.GetValue("mNote"));
				System.out.println("작성일자 : " + db.GetValue("wDate")); */
				// 새 vo를 만들고
				
				// vo에 값들을 넣고
				vo.setmNo(db.GetValue("mNo"));
				vo.setmTitle(db.GetValue("mTitle"));
				vo.setmNote(db.GetValue("mNote"));
				vo.setwDate(db.GetValue("wDate"));
				
				// 배열/리스트/어레이리스트에 vo를 넣는다
			}
			db.CloseQuery();
			// 배열/리스트/어레이리스트 를 통해 메모 목록을 사용한다
		}
		db.DBClose();
	}
}