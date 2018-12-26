package my.day17;

interface MyInter{
	String bar();
}

interface YourInter{
	void baz();
}

/* 인터페이스가 인터페이스를 상속받을 때는 extends로 상속받으며,
 * 여러개를 상속 받을 수 있다. */
interface OurInter extends MyInter, YourInter{
	int ADD = 1;
	int DELETE = 2;
}

abstract class AbsClass{
	void print() {
		System.out.println("AbsClass @@");
	}
	abstract void foo();
}

class MyDemo extends AbsClass implements OurInter {
	@Override
	public void foo() {
		print();
	}
	@Override
	public String bar() {
		return "bar()";
	}
	@Override
	public void baz() {
		System.out.println("baz()");
	}
}

public class InterfaceTest2{
	public static void main(String[] args) {
		MyDemo md = new MyDemo();
		md.foo();
		System.out.println(md.bar());
		md.baz();
		System.out.println("ADD= "+OurInter.ADD);
		System.out.println("DELETE= "+OurInter.DELETE);
		System.out.println("--------------------------");
		
		AbsClass am = new MyDemo();
		am.foo();
		am.print();
		((MyDemo)am).baz();
		System.out.println("--------------------------");
		
		OurInter om = new MyDemo();
		System.out.println(om.bar());
		om.baz();
		((MyDemo)om).foo();
	}
}