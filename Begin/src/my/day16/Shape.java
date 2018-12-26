package my.day16;

abstract public class Shape {
	int x,y;
	
	public String getDetails() {
		return "�� ���� Ŭ����";
	}
	// �߻�޼ҵ� : ��ü���� �޼ҵ� ����� ������ ��.
	abstract public void area(int a, int b);
}

class Rect extends Shape {
	@Override
	public void area(int x, int y) {
		int k = x*y;
		System.out.printf("��: %d, ����: %d�� �簢�� ����: %d\n",x,y,k);
	}
}

class Triangle extends Shape {
	@Override
	public void area(int x, int y) {
		double k = x*y/2;
		System.out.printf("��: %d, ����: %d�� �ﰢ�� ����: %.1f\n",x,y,k);
	}
}

class Circle extends Shape {
	
	@Override
	public void area(int x, int y) {}
	
	public void area(int r) {
		double k = r*r*Math.PI;
		System.out.printf("������: %d�� �� ����: %.1f\n",r,k);
	}
}