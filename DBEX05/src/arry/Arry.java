package arry;
import ezen.MemoVO;
import ezen.DBManager;

public class Arry
{
	public static void main(String[] args)
	{
		// MemoVO의 배열 생성
		MemoVO arry[] = new MemoVO[10];
		// SQL 구문 작성
		String SQL = " select * from memo limit 10";
		// DB 연결
		DBManager db = new DBManager();
		db.DBOpen();
		// SQL 구문 실행
		db.OpenQuery(SQL);
		
		int count = 0;
		while(db.GetNext()==true)
		{
			MemoVO vo = new MemoVO( db.GetValue("mNO"), db.GetValue("mTitle"),
							db.GetValue("mNote"), db.GetValue("wDate") );
			arry[count] = vo;
			count++;
		}
		
		db.CloseQuery();
		db.DBClose();
		
		// 메모 목록에서 메모 출력
		for( MemoVO item : arry )
		{
			item.PrintInfo();
		}
	}
}