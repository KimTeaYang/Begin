package my.day10;
import java.util.*;

public class ArrayTest6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��ϼ���=>");
		int money = sc.nextInt();
		System.out.println("�ݾ�: "+money+"��");
		
		int unit[] = {50000,10000,1000,100,10,1};
		
		for(int i=0;i<unit.length;i++) {
			System.out.println(unit[i]+"��: "+money/unit[i]);
			money = money%unit[i];
		}
		
		
	}
}