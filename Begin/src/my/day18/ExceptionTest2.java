package my.day18;

public class ExceptionTest2 {

	public static void main(String[] args) {	
		try {
			for(int i=1;i<=5;i++) {
				int a = 50/(i-3);
				System.out.println("a="+a);
			}
		}catch(ArithmeticException e) {
			System.out.println("연산오류: 분모가 0이될 수 없어요!!");
		}
		System.out.println("The End~~");
	}
}