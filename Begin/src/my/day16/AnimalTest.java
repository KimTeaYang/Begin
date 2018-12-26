package my.day16;
import javax.swing.*;

public class AnimalTest {
	public static void main(String[] args) {
		
		String type = JOptionPane.showInputDialog(
				"동물 종류를 입력하세요");
		String num = JOptionPane.showInputDialog(
				"마리 수를 입력하세요");
		Animal a = null;
		
		if(type.equals("강아지")) {
			a = new Dog();
		}else if(type.equals("고양이")) {
			a = new Cat();
		}else if(type.equals("오리")) {
			a = new Duck();
		}else {
			System.out.println("잘못입력하셨습니다.");
			return;
		}
		
		a.crySound();
		System.out.println(a.getBaby(Integer.parseInt(num)));
	}
}