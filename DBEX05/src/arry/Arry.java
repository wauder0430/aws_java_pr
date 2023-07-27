package arry;
import ezen.MemoVO;
import ezen.DBManager;

public class Arry
{
	public static void main(String[] args)
	{
		// MemoVO�� �迭 ����
		MemoVO arry[] = new MemoVO[10];
		// SQL ���� �ۼ�
		String SQL = " select * from memo limit 10";
		// DB ����
		DBManager db = new DBManager();
		db.DBOpen();
		// SQL ���� ����
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
		
		// �޸� ��Ͽ��� �޸� ���
		for( MemoVO item : arry )
		{
			item.PrintInfo();
		}
	}
}