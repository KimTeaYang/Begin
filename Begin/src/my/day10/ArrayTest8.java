package my.day10;

public class ArrayTest8 {

	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball = new int[3];
		
		for(int i=0; i<ballArr.length;i++) {
			int j = (int)(Math.random()*9);
			int k = (int)(Math.random()*9);
			int tmp;
			
			tmp = ballArr[j];
			ballArr[j] = ballArr[k];
			ballArr[k] = tmp;
		}
		
		for(int i=0; i<ballArr.length;i++) {
			System.out.print(ballArr[i]+", ");
		}
		
		System.out.println();
		System.arraycopy(ballArr, 0, ball, 0, 3);
		
		for(int i=0; i<ball.length;i++) {
			System.out.print(ball[i]+", ");
		}
	}
}