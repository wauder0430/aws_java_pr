package ezen;

public class test
{
	public static void main(String[] args)
	{
		DBManager db = new DBManager();
		
		if(db.DBOpen() == false)
		{
			System.out.println("DB 연결에 실패했습니다.");
			return;
		}
		// insert SQl 구문 작성
		String title = "JAVA 코드에서 생성한 메모";
		String note  = "내용무";
		String sql = " insert into memo ";
		sql += " ( mTitle, mNote ) ";
		sql += " values ( ";
		sql += " '" + title + "', ";	// mTitle 
		sql += " '" + note + "' ";	// mNote 
		sql += " )";
		
		System.out.println(sql);
		// SQL 구문을 실행하는 메소드 호출
		if(db.RunSql(sql)== false)
		{	// RunSQL() fasle를 반환
			System.out.println("데이터 생성이 실패했습니다");
		}else
		{	// RunSQL() true를 반환
			System.out.println("메모 작성 성공");
		}
		// DB 연결 종료
		db.DBClose();
	}
}
