package my.day10;

import java.applet.*;
import java.awt.*;

/* java.applet.Applet Ŭ����
 * => ���ø� ���α׷��� ���� �� �ִ�.
 * �ڹ� ���α׷� ����
 * �ڹ� SE�� ���α׷� ����
 * 1. ���ø����̼�(Application) : �������� ���� ���α׷�
		- main()�޼ҵ带 ���´�.
 * 2. ���ø�(Applet) : �񵶸��� ���� ���α׷�
 * 		html�� ������ ���ԵǾ� ����ȴ�.
 * 		applietviewer�� ����Ͽ� �����Ű�ų�, �� �������� �̿��ؼ� �����ų �� �ִ�.
 * 			- main()�޼ҵ尡 �ʿ����.
 * 			- ��� ������(html����)�� �ʿ���
 * */
public class MyApplet extends Applet {
	
	Color[] s = {Color.black,Color.blue,Color.cyan,Color.darkGray,
			Color.gray,Color.green,Color.lightGray,
			Color.magenta,Color.orange,Color.pink,
			Color.red,Color.yellow};
	int b = 10;
	public void paint(Graphics g) {
		g.drawString("���� ���� ���ø�~", 50, 50);
		// ���ڿ��� x�� 50, y�� 50�� ������ �׷���
		
		for(int i=0;i<s.length;i++) {
		
			b +=20;
			g.setColor(s[i]);
			g.drawString("���� ���� ���ø�", 50, b);
		}
	}
}