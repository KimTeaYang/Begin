package my.day17;
/* ������(reference type)
 *  - Ŭ������
 *  - �������̽���
 *  - �迭
 *  - ������
 * */

interface Inter1{
	void sub(); // public abstract�� �ڵ����� �ٴ´�.
	int foo();
}

interface Inter2{
	String STR="Hi"; // public static final�� �ڵ����� �ٴ´�.
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
		System.out.println("���ϰ�= "+m.foo());
		m.sub();
		System.out.println("---------------------");
		
		// �������̽��� Ÿ�� ������ �� �� ������ ��ü ������ �Ұ����ϴ�.
		Inter1 in = new MyClass();
		System.out.println(in.foo());
		in.sub();
		System.out.println("---------------------");
		
		Inter2 in2 = new MyClass();
		((MyClass)in2).sub();
	}
}