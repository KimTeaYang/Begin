package my.day16;

abstract public class Shape {
	int x,y;
	
	public String getDetails() {
		return "나 도형 클래스";
	}
	// 추상메소드 : 몸체없이 메소드 헤더만 선언한 것.
	abstract public void area(int a, int b);
}

class Rect extends Shape {
	@Override
	public void area(int x, int y) {
		int k = x*y;
		System.out.printf("폭: %d, 높이: %d인 사각형 면적: %d\n",x,y,k);
	}
}

class Triangle extends Shape {
	@Override
	public void area(int x, int y) {
		double k = x*y/2;
		System.out.printf("폭: %d, 높이: %d인 삼각형 면적: %.1f\n",x,y,k);
	}
}

class Circle extends Shape {
	
	@Override
	public void area(int x, int y) {}
	
	public void area(int r) {
		double k = r*r*Math.PI;
		System.out.printf("반지름: %d인 원 면적: %.1f\n",r,k);
	}
}