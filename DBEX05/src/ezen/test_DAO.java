package ezen;

import java.util.ArrayList;

public class test_DAO
{
	public static void main(String[] args)
	{
		MemoDAO dao = new MemoDAO();
		ArrayList<MemoVO> list = dao.List();
		for( MemoVO item : list )
		{
			item.PrintInfo();
		}
	}
}