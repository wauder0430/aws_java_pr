package ezen;

import java.util.ArrayList;

public class MemoDAO2 extends DBManager
{
	// CRUD의 SQL 구문을 작성
	// DB와 통신하여 VO에 데이터를 넣거나
	// VO의 데이터를 DB에 넣는 작업을 수행

	// vo를 받아 Insert용 SQL 구문을 작성하고 DB에 vo를 넣는 메소드
	public boolean Insert( MemoVO vo )
	{
		try
		{	// DB 연결
			//DBManager db = new DBManager();
			this.DBOpen();
			// SQL 구문 생성
			String SQL = " insert into memo ";
			SQL += " ( mTitle, mNote ) ";
			SQL += " values ";
			SQL += " ( '" + this._R(vo.getmTitle()) + "', '" + this._R(vo.getmNote()) + "' ) ";
			
			System.out.println(SQL);
			
			if(this.RunSQL(SQL) != true)
			{
				System.out.println("메모를 생성하지 못했습니다");
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
	
	// vo를 받아 update용 SQL 구문을 작성 ---
	public Boolean Update( MemoVO vo )
	{
		try
		{	// DB 연결
			//DBManager db = new DBManager();
			this.DBOpen();
			// SQL 구문 생성
			String SQL = " update memo ";
			SQL += " set ";
			SQL += " mTitle = '" + this._R(vo.getmTitle())	+ "'"	+ ","	+ " ";
			SQL += " mNote = '" + this._R(vo.getmNote())		+ "'"	+ ","	+ " ";
			SQL += " wDate = now() "										+ " ";
			SQL += " where mNo = " + vo.getmNo();
			
			if(this.RunSQL(SQL) != true)
			{
				System.out.println("메모를 수정하지 못했습니다");
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
	
	// vo/메모번호 를 받아 delete SQL 작성 ---
	public boolean Delete(MemoVO vo)
	{	// vo에서 메모번호를 가져와, 메모번호로 삭제하는 메소드를 호출
		return Delete(vo.getmNo());
	}
	
	public boolean Delete( int no )
	{
		try
		{	// DB 연결
			//DBManager db = new DBManager();
			this.DBOpen();
			// SQL 구문 생성
			String SQL = " delete from memo where mNo = " + no ;
			
			if(this.RunSQL(SQL) != true)
			{
				System.out.println("메모를 삭제하지 못했습니다");
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
		{	// 인자로 받은 메모번호를 정수로 변환하여, Read( int no ) 호출 
			return Read( Integer.parseInt(no) );
		}catch( Exception e )
		{
			e.printStackTrace();
			return null;
		}
	}
	
	// 메모 번호를 받아 vo를 생성하는 메소드
	public MemoVO Read( int no )
	{
//		MemoVO vo = new MemoVO();
		//DBManager db = new DBManager();
		try
		{	// DB에 연결
			this.DBOpen();
			// SQL 구문 작성
			String SQL = " select mNo, mTitle, mNote, wDate from memo where mNo = " + no;
			
			System.out.println("SQL : " +  SQL);
			// SQL 구문 실행
			this.OpenQuery(SQL);
			
			// 결과 확인
			if( this.GetNext() == false )
			{
				System.out.println( no + "번의 메모가 존재하지 않습니다.");
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
	
	// 전체 목록을 vo의 리스트로 생성하는 메소드
	public ArrayList<MemoVO> List()
	{	// 결과를 저장할 어레이리스트를 생성한다
		ArrayList<MemoVO> list = new ArrayList<MemoVO>();
		
		// DB와 연결한다
		//DBManager db = new DBManager();
		if(this.DBOpen() == false)
		{	// DB 연결이 안되는 경우
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
		
		// 리스트를 반환한다
		return list;
	}
}
