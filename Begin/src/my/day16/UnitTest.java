package my.day16;

public class UnitTest {

	public static void main(String[] args) {
		// Shape s = new Shape();[x]
		// �߻�Ŭ������ Ÿ�� ������ �� �� ������, new �ؼ� ��ü������ �Ұ����ϴ�.
		
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