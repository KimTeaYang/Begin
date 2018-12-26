package my.day16;

public class UnitTest {

	public static void main(String[] args) {
		// Shape s = new Shape();[x]
		// 추상클래스는 타입 선언은 할 수 있으나, new 해서 객체생성은 불가능하다.
		
		Shape s = new Rect();
		Rect r = new Rect();
		Triangle t = new Triangle();
		Circle c = new Circle();
		
		s.area(8, 7);
		System.out.println(s.getDetails());
		
		r.area(5, 5);
		
		t.area(5, 3);
		
		c.area(5);
	}
}