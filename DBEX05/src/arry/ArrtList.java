package arry;

import java.util.ArrayList;
import ezen.MemoVO;
import ezen.DBManager;

public class ArrtList {

	public static void main(String[] args)
	{
		ArrayList<MemoVO> list = new ArrayList<MemoVO>();
		
		DBManager db = new DBManager();
		db.DBOpen();
		
		String SQL = "";
		SQL += " select mNo, mTitle, mNote, wDate from memo ";
		db.OpenQuery(SQL);
		while( db.GetNext() == true )
		{
			MemoVO vo = new MemoVO();
			vo.setmNo(db.GetValue("mNo"));
			vo.setmTitle(db.GetValue("mTitle"));
			vo.setmNote(db.GetValue("mNote"));
			vo.setwDate(db.GetValue("wDate"));
			list.add(vo);
		}
		db.CloseQuery();
		db.DBClose();
		
		System.out.println("메모 목록의 메모 갯수 : " + list.size());
		
		for( MemoVO item : list )
		{
			item.PrintInfo();
		}
	}

}
