package ex;
// 어레이리스트 라이브러리 임포트
import java.util.ArrayList;

public class arryList
{
	public static void main(String[] args)
	{	// 어레이 리스트의 선언
		ArrayList list = new ArrayList();
		// 리스트에 원소 추가
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		// 리스트의 원소 갯수
		System.out.println(list.size());
		// 인덱스로 원소 접근
		System.out.println(list.get(0));
		System.out.println(list.get(0).getClass());
		// 인덱스로 원소 삭제
		list.remove(2);
		// 객체로 원소 삭제
		list.remove("d");
		// 어레이 리스트 내부의 원소 검색
		System.out.println("list에 'e'가 있느냐? : " + list.contains("e"));
//		String str_tmp = "asdf";
//		System.out.println(str_tmp == "asdf");
		for( Object item : list )
		{
			System.out.println(item);
		}
		
		// 제네릭 -> 타입(등등)을 미리 선언하는게 아닌
		// 컴파일 시점에, 입력받은 값으로 치환하는 개념
		
		// MyData 클래스의 필드 value의 타입을 String으로 선언
		MyData<String> str_data = new MyData<String>();
		// 제네릭을 통해 필드 value의 타입이 String이 되었으므로,
		// 문자열 데이터를 넣고, String 클래스의 메소드 호출 가능
		str_data.value = "문자열 데이터";
		System.out.println(str_data.value);
		System.out.println(str_data.value.equals("java"));
		
		// MyData 클래스의 필드 value의 타입을 Integer로 선언
		MyData<Integer> int_data = new MyData<Integer>();
		// 제네릭을 통해 필드 value의 타입이 정수형이 되었음
		int_data.value = 10;
		System.out.println(int_data.value);
		int_data.value += 20;		// 정수 연산 가능
		System.out.println(int_data.value);
		
		// ArratList의 원소들의 변수형을 String으로 선언
		ArrayList<String> str_list = new ArrayList<String>();
		str_list.add("asdf");		// 원소 추가
		str_list.add("wasd");		// 원소 추가
		str_list.add("qwerty");
		String tmp = str_list.get(0);	// 가져온 원소는 Object형이 아닌 String타입
		System.out.println(tmp);
		
		for( String item : str_list )
		{
			System.out.println(item.getClass());
		}
	}
}