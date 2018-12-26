package my.day20;

public class InnerClassTest {
	
	public static void main(String[] args) {
		Outer o = new Outer();
		System.out.println("o.a= "+o.a); // non-static
		System.out.println("Outer.b= "+Outer.b); // static
		o.test();
		
		Outer.Inner oi = o.new Inner(); 
		System.out.println("oi.c= "+oi.c);
		Outer.Inner oi2 = new Outer().new Inner();
		oi2.sub();
		
		Outer.SInner os = new Outer.SInner();
		System.out.println("os.d= "+os.d);
		System.out.println("Outer.SInner.e= "+Outer.SInner.e);
		os.bar();
		Outer.SInner.foo();
		
	}
}