package my.day16;
import javax.swing.*;

public class AnimalTest {
	public static void main(String[] args) {
		
		String type = JOptionPane.showInputDialog(
				"���� ������ �Է��ϼ���");
		String num = JOptionPane.showInputDialog(
				"���� ���� �Է��ϼ���");
		Animal a = null;
		
		if(type.equals("������")) {
			a = new Dog();
		}else if(type.equals("�����")) {
			a = new Cat();
		}else if(type.equals("����")) {
			a = new Duck();
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return;
		}
		
		a.crySound();
		System.out.println(a.getBaby(Integer.parseInt(num)));
	}
}