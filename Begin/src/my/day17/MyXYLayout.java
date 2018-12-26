package my.day17;

import java.applet.Applet;
import java.awt.*;

public class MyXYLayout extends Applet {
	Button bt;
	Dimension d;
	
	public void init() {
		// ���ϴ� ��ġ�� ������Ʈ�� �����ϰ� �ʹٸ� ���̾ƿ��� �����Ѵ�.
		setLayout(null);
		setSize(400, 400);
		bt = new Button("Open");
		add(bt);
		// ���̾ƿ��� ������ ��� ������Ʈ�� ũ��� ��ǥ�� �����ؾ��Ѵ�.
		bt.setSize(150, 150);
		//bt.setLocation(100, 100);
		d = this.getSize();
		Dimension btd = bt.getSize();
		
		int x = d.width/2 - btd.width/2;
		int y = d.height/2 - btd.height/2;
		//bt.setBounds(x, y, 50, 50);
		bt.setLocation(x, y);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.drawLine(0, 0, d.width, d.height);
		g.drawLine(d.width, 0, 0, d.height);
	}
}