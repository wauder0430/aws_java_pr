package ezen;

public class MemoVO
{	// DB�� memo table�� �ش��ϴ� �ڷḦ ����ϴ� Ŭ����

/*		VO Value Object 
		���� : �� ��ü�� ǥ��
		ó�� : �ʵ��� ���� ������ ���� ��ü�� ����ؾ� �Ѵ�
		�Ӽ� : �Һ��Ӽ�
		-> �����ڷ� ������ �ʵ忡 ���� �ְ�
		-> setter�� ������ �Һ�
		-> g/s �̿��� �޼ҵ� ������ ������ ����
		
		DTO -> Data Transfer Object
		���� : ���� ������ ���۸� ���
		ó�� : �ʵ��� ���� ���Ƶ� �ٸ� ��ü�� -> �ٸ� �����ͷ� ���
		�Ӽ� : s/g�� ���ο� ���� ���� �Һ�
		-> s/g �̿��� ������ �ʿ����� ����
		
	// Java bean -> ������ �����̳ʿ� ���� �����Ǵ� ��ü
	
 */
/*	DB�� memo ���̺�
	mNo int auto_increment primary key comment '�޸��ȣ',
	mTitle varchar(200) NOT NULL comment '����',
	mNote text comment '����',
	wDate DATETIME default now() comment '�ۼ�����'
*/
	
	// �ʵ忡 �÷����� �����մϴ�
	private	int		mNo;		// �޸��ȣ
	private	String	mTitle;		// �޸�����
	private	String	mNote;		// �޸𳻿�
	private	String	wDate;		// �ۼ�����
	
	// ������
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
	
	// getters setters ����
	public int	  getmNo()	  { return mNo;	   }
	public String getmTitle() { return mTitle; }
	public String getmNote()  { return mNote;  }
	public String getwDate()  { return wDate;  }
	
	public void setmNo(	  int	 mNo	) { this.mNo	= mNo;	  }
	public void setmTitle(String mTitle	) { this.mTitle	= mTitle; }
	public void setmNote( String mNote	) { this.mNote	= mNote;  }
	public void setwDate( String wDate	) { this.wDate	= wDate;  }

	public void setmNo( String mNo )
	{	// ���ڿ��� ��ȣ�� �޾����� ó��
		try
		{
			this.mNo = Integer.parseInt(mNo);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// ���� ��¿� �޼ҵ� ����
	public void PrintInfo()
	{
		System.out.println("=======================");
		System.out.println("�޸��ȣ : " + this.getmNo()	);
		System.out.println("�޸����� : " + this.getmTitle()	);
		System.out.println("�޸𳻿� : " + this.getmNote()	);
		System.out.println("�ۼ����� : " + this.getwDate()	);
		System.out.println("=======================");
	}
}
