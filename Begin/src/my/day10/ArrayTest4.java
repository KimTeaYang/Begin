package my.day10;

public class ArrayTest4 {

	public static void main(String[] args) {
		/*
		int[] a = new int[3];
		a[0] = 90;
		a[1] = 80;
		a[2] = 70;

		int b[];
		b = a;
		*/
		
		/*
		 * ���� �迭 a�� b�� �ʱ�ȭ ���� �� �� ���ο� �޸𸮸� �Ҵ�޾� �����Ǵ� ���� �ƴ϶�, a�� �����ϴ� �迭�� b�� ���� �����ϴ� ���°�
		 * �ȴ�.
		 * a---------------->|90|80|70| | b-----------+ �̷� ��� a�� b�� �迭 ��Ҹ� �����ϸ� a, b ���
		 * �Բ� ����ȴ�.
		 */
		/*
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + "===" + b[i]);
		}
		b[1] = 100;
		System.out.println("a[1]=" + a[1]);
		*/
		
		int x[] = { 1, 2, 3, 4 };
		int y[] = { 10, 20, 30 };
		int tmp[];
		tmp = y;
		y = x;
		x = tmp;
		
		System.out.println("---------------");
		for(int i=0;i<x.length;i++) {
			System.out.printf("x[%d]=%d\n",i,x[i]);
		}
		System.out.println("---------------");
		for(int i=0;i<y.length;i++) {
			System.out.printf("y[%d]=%d\n",i,y[i]);
		}
		/* ������ �迭 ��Ұ� �̵������� �ʴ´�.
		 * �޸𸮿��� �迭�� �ּҸ� �ٲ�� ������
		 * �� ������ ���� �ӵ��� ����ȴ�.
		 */
		
	}
}