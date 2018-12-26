package my.day10;

public class ArrayTest5 {

	public static void main(String[] args) {
		/*
		System.out.println("1.-------------");
		int [][]a;
		a=new int[3][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[2][0]=50;
		a[2][1]=60;
		
		// a.length ==> 행의 크기
		// a[i].length ==> 열의 크기
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("a[%d][%d]=%d\n", i, j, a[i][j]);
			}
		}
		
		System.out.println("2.-------------");
		
		float []b[]= {{0.1f,0.2f},{10,20,30},{'a','b','c','d'}};
		System.out.println("행의 크기: "+b.length);
		System.out.println("b[0]의 열의 크기: "+b[0].length);
		System.out.println("b[1]의 열의 크기: "+b[1].length);
		System.out.println("b[2]의 열의 크기: "+b[2].length);
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.printf("b[%d][%d]=%.1f\n", i, j, b[i][j]);
			}
		}
		*/
		
		
		System.out.println("3.-------------");
		/*행의 크기만 먼저 잡아놓고 열의 크기를 가변적으로 할당하는 방법*/
		
		char[][] ch = new char[3][]; // 3행
		ch[0] = new char[2]; // 1행 2열
		ch[1] = new char[4]; // 2행 4열
		ch[2] = new char[3]; // 3행 3열
		
		ch[0][0]= 'H';
		ch[0][1]= 'i';
		ch[1][0]= 'J'; 
		ch[1][1]= 'a';
		ch[1][2]= 'v';
		ch[1][3]= 'a';
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.printf("ch[%d][%d]=%s\n", i, j, ch[i][j]);
			}
		}
		
		
		String[][] s = new String[4][4];
		s[0][0] = "Hello";
		s[1][1] = "응용SW";
		s[2][2] = "웹 개발자";
		s[3][3] = "Java Programming";
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length;j++) {
				if(s[i][j]==null) {
					
				}else
					System.out.printf("s[%d][%d] = %s\n", i, j, s[i][j]);
			}
		}
		
		int[][] a = new int[5][5];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					a[i][j]=1;
					System.out.print(a[i][j]+" ");
				}else {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}