package ezen;

public class test
{
	public static void main(String[] args)
	{
		// �� vo ��ü ����
		MemoVO vo = new MemoVO();
		vo.setmTitle("DTO");
		vo.setmNote("DTO�� �̿��� �޸� �ֱ�");
		
		MemoDAO dao = new MemoDAO();
		// vo��ü�� �޾� DB�� �ֱ�
		dao.Insert(vo);
		
		// �޸� ��ȣ�� �޾� DB���� ����
		dao.Delete(5);
		
		// �޸��ȣ�� �޸� �����͸� �޾� MemoVo�� ����
		vo = dao.Read(24);
		vo.PrintInfo();
		
		// vo ���� ����
		vo.setmNote("DTO,VO,JAVA�� �̿��� ����");
		// dao�� ���� DB�� ���� ����
		dao.Update(vo);
		
		// 27�� �޸� �޾ƿ�
		vo = dao.Read(27);
		// vo�� ���ڷ� �޾� �����ϱ�
		dao.Delete(vo);
	}
}