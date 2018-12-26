package my.day17;
/* 참조형(reference type)
 *  - 클래스형
 *  - 인터페이스형
 *  - 배열
 *  - 열거형
 * */

interface Inter1{
	void sub(); // public abstract가 자동으로 붙는다.
	int foo();
}

interface Inter2{
	String STR="Hi"; // public static final이 자동으로 붙는다.
}

class MyClass implements Inter1, Inter2{
	public void sub() {
		System.out.println(STR);
	}
	public int foo() {
		return 0;
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		System.out.println(Inter2.STR.toUpperCase());
		System.out.println("---------------------");
		
		MyClass m = new MyClass();
		System.out.println("리턴값= "+m.foo());
		m.sub();
		System.out.println("---------------------");
		
		// 인터페이스도 타입 선언은 할 수 있으나 객체 생성은 불가능하다.
		Inter1 in = new MyClass();
		System.out.println(in.foo());
		in.sub();
		System.out.println("---------------------");
		
		Inter2 in2 = new MyClass();
		((MyClass)in2).sub();
	}
}