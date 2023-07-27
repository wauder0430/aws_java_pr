package ezen;

public class MemoVO
{	// DB의 memo table에 해당하는 자료를 담당하는 클래스

/*		VO Value Object 
		목적 : 값 자체를 표현
		처리 : 필드의 값이 같으면 같은 객체로 취급해야 한다
		속성 : 불변속성
		-> 생성자로 생성시 필드에 값을 넣고
		-> setter가 없으면 불변
		-> g/s 이외의 메소드 로직을 갖을수 있음
		
		DTO -> Data Transfer Object
		목적 : 오직 데이터 전송만 담당
		처리 : 필드의 값이 같아도 다른 객체면 -> 다른 데이터로 취급
		속성 : s/g의 여부에 따라 가변 불변
		-> s/g 이외의 로직이 필요하지 않음
		
	// Java bean -> 스프링 컨테이너에 의해 관리되는 객체
	
 */
/*	DB의 memo 테이블
	mNo int auto_increment primary key comment '메모번호',
	mTitle varchar(200) NOT NULL comment '제목',
	mNote text comment '내용',
	wDate DATETIME default now() comment '작성일자'
*/
	
	// 필드에 컬럼들을 나열합니다
	private	int		mNo;		// 메모번호
	private	String	mTitle;		// 메모제목
	private	String	mNote;		// 메모내용
	private	String	wDate;		// 작성일자
	
	// 생성자
	public MemoVO() {}
	public MemoVO( int no, String title, String note, String date)
	{
		this.mNo	= no;
		this.mTitle	= title;
		this.mNote	= note;
		this.wDate	= date;
	}
	public MemoVO( String no, String title, String note, String date)
	{
		this.setmNo(no);
		this.setmTitle(title);
		this.setmNote(note);
		this.setwDate(date);
	}
	
	// getters setters 생성
	public int	  getmNo()	  { return mNo;	   }
	public String getmTitle() { return mTitle; }
	public String getmNote()  { return mNote;  }
	public String getwDate()  { return wDate;  }
	
	public void setmNo(	  int	 mNo	) { this.mNo	= mNo;	  }
	public void setmTitle(String mTitle	) { this.mTitle	= mTitle; }
	public void setmNote( String mNote	) { this.mNote	= mNote;  }
	public void setwDate( String wDate	) { this.wDate	= wDate;  }

	public void setmNo( String mNo )
	{	// 문자열로 번호를 받았을때 처리
		try
		{
			this.mNo = Integer.parseInt(mNo);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// 정보 출력용 메소드 생성
	public void PrintInfo()
	{
		System.out.println("=======================");
		System.out.println("메모번호 : " + this.getmNo()	);
		System.out.println("메모제목 : " + this.getmTitle()	);
		System.out.println("메모내용 : " + this.getmNote()	);
		System.out.println("작성일자 : " + this.getwDate()	);
		System.out.println("=======================");
	}
}
