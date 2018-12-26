package my.day18;
import javax.swing.*;
public class ExceptionTest4 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("������ �Է��ϼ���");
		try {
			int no = Integer.parseInt(str);
			int a = 50/no;
			System.out.println("a="+a);
			
			String str1 = null;
			System.out.println(str1.toUpperCase());
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��ؾ� �ؿ�!");
		}catch(ArithmeticException e) {
			System.out.println("�и� '0'�̿���");
			return;
		}catch(Exception e) {
			System.out.println("��Ÿ ���� �߻�: "+e);
		}finally {
			System.out.println("�ݵ�� ����ž� �� �ڵ�------");
		}
		System.out.println("The End~~~");
		/* try{}�� �ϳ��� catch���� ���� �� �� �� �ִ�.
		 * �׷��� �� �� catch������ �����ؾ� �Ѵ�.
		 *  - �θ�� �ڽ��� ��Ӱ��谡 �ִ� ������ ��� �ڽ� ���ܸ� ���� catch�ϰ�
		 *    �θ� ���ܸ� ���߿� catch�ؾ� �Ѵ�.
		 *  - finally���� �̿��ϸ� �ش� ���� �ݵ�� �� ���� �����Ѵ�.
		 *    return���� �ִ��� �ݵ�� �����ϰ� ������� �ѱ��.
		 * */
	}
}