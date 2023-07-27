package ex;
// 제네릭을 사용한 클래스 선언
public class MyData <Type>
{
	public Type value;
	// 클래스 설계 시 필드의 타입을 확정하지 않음
	// MyData 클래스의 객체가 생성될 시점에
	// 제네릭을 통해 선언된 타입으로
	// Type이 치환됨
}
