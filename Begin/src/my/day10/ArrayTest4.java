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
		 * 기존 배열 a로 b를 초기화 해줌 이 때 새로운 메모리를 할당받아 생서되는 것이 아니라, a가 참조하는 배열을 b도 같이 참조하는 형태가
		 * 된다.
		 * a---------------->|90|80|70| | b-----------+ 이럴 경우 a나 b의 배열 요소를 변경하면 a, b 모두
		 * 함께 변경된다.
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
		/* 실제로 배열 요소가 이동하지는 않는다.
		 * 메모리에서 배열의 주소만 바뀌기 때문에
		 * 이 연산은 빠른 속도로 진행된다.
		 */
		
	}
}