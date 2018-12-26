package my.day20;

public class Outer {
	int a = 10;
	static int b = 20;
	
	void test() {
		System.out.println("====test()====");
		Inner in = new Inner();
		System.out.println("in.c= "+in.c);
		
		Outer.Inner in2 = this.new Inner();
		System.out.println("in2.c= "+in2.c);
		System.out.println("==================");
	}
	
	class Inner{ // Inner Member (non-static)
		int c = 30;
		
		void sub() {
			System.out.println("sub()");
		}
	}
	
	static class SInner{ // Inner Member (static)
		int d = 40;
		static int e = 50;
		
		void bar() {
			System.out.println("bar()###");
		}
		
		static void foo() {
			System.out.println("foo()@@@");
		}
	}
}