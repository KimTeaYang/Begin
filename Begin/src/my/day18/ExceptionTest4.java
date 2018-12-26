package my.day18;
import javax.swing.*;
public class ExceptionTest4 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("정수를 입력하세요");
		try {
			int no = Integer.parseInt(str);
			int a = 50/no;
			System.out.println("a="+a);
			
			String str1 = null;
			System.out.println(str1.toUpperCase());
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력해야 해요!");
		}catch(ArithmeticException e) {
			System.out.println("분모가 '0'이에요");
			return;
		}catch(Exception e) {
			System.out.println("기타 예외 발생: "+e);
		}finally {
			System.out.println("반드시 실행돼야 할 코드------");
		}
		System.out.println("The End~~~");
		/* try{}블럭 하나에 catch절은 여러 개 올 수 있다.
		 * 그러나 이 때 catch순서를 주의해야 한다.
		 *  - 부모와 자식의 상속관계가 있는 예외일 경우 자식 예외를 먼저 catch하고
		 *    부모 예외를 나중에 catch해야 한다.
		 *  - finally절을 이용하면 해당 블럭은 반드시 한 번은 수행한다.
		 *    return문이 있더라도 반드시 수행하고 제어권을 넘긴다.
		 * */
	}
}