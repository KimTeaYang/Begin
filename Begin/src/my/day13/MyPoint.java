package my.day13;

import java.util.Scanner;

public class MyPoint {
	private int x;
	private int y;
	Scanner sc = new Scanner(System.in);
	int a;

	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public MyPoint() {
		this(5, 5);
	}
	public MyPoint(int x) {
		this(x, 10);
	}
	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void xy() {
		System.out.print("[1]x���� [2]x���� [3]y���� [4]y���� �����ϼ���=>");
		a = sc.nextInt();
		
		switch(a) {
			case 1:
				x++;
				break;
			case 2:
				x--;
				break;
			case 3:
				y++;
				break;
			case 4:
				y--;
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�. ���� ���� �����մϴ�.");
		}
	}
	
	public void same() {
		if (a > 0 && a < 5) {
			if (x == y) {
				System.out.printf("x=%d, y=%d �����ϴ�.\n", getX(), getY());
			} else {
				System.out.printf("x=%d, y=%d �ٸ��ϴ�.\n", getX(), getY());
			}
		}else {
			System.out.printf("x=%d, y=%d\n", getX(), getY());
		}
	}
}