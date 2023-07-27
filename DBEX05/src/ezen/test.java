package ezen;

public class test
{
	public static void main(String[] args)
	{
		// 새 vo 객체 생성
		MemoVO vo = new MemoVO();
		vo.setmTitle("DTO");
		vo.setmNote("DTO를 이용한 메모 넣기");
		
		MemoDAO dao = new MemoDAO();
		// vo객체를 받아 DB에 넣기
		dao.Insert(vo);
		
		// 메모 번호를 받아 DB에서 삭제
		dao.Delete(5);
		
		// 메모번호로 메모 데이터를 받아 MemoVo를 생성
		vo = dao.Read(24);
		vo.PrintInfo();
		
		// vo 내용 수정
		vo.setmNote("DTO,VO,JAVA를 이용한 수정");
		// dao를 통해 DB의 정보 수정
		dao.Update(vo);
		
		// 27번 메모를 받아옴
		vo = dao.Read(27);
		// vo를 인자로 받아 삭제하기
		dao.Delete(vo);
	}
}