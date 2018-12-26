package my.day17;
/* final : modifier
 *  [1] final + class : ��ӹ��� ����
 *  [2] final + �޼ҵ� : �������̵� ���� ����
 *  [3] final + ���� : ���� �Ҵ����� ����
 * */

final class Super{
	void foo() {
		System.out.println("Super's foo()");
	}
}

class Sub { //extends Super{
	
	protected void foo() {
		System.out.println("Sub's foo()");
	}
	
	final void bar() {
		System.out.println("bar()");
	}
}

class SubSub extends Sub{
	int x = 10;
	final int y = 20;
	public static final int z = 30;
	
	@Override
	public void foo() {
		System.out.println("fou()###");
	}
	
//	public void bar() {	} [x] fianl �޼ҵ�� ������ �Ұ�
}

public class TestFinal {

	public static void main(String[] args) {
		Super s = new Super();
		s.foo();
		
		Sub s1 = new Sub();
		s1.bar();
		
		SubSub s2 = new SubSub();
		System.out.printf("s2.x = %d\n",s2.x=100);
		System.out.printf("s2.y = %d\n",s2.y);
		System.out.printf("SubSub.z = %d\n",SubSub.z);
		// final ������ �� �Ҵ� �Ұ�
	}
}