package my.day18;

public class ExceptionTest3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			try {
				int a = 50/(i-3);
				System.out.println("a="+a);
			}catch(ArithmeticException e) {
				System.out.println("�������: �и� 0�̵� �� �����!!");
			}
		}
		System.out.println("The End~~");
	}

}
