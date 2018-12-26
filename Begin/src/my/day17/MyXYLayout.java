package my.day17;

import java.applet.Applet;
import java.awt.*;

public class MyXYLayout extends Applet {
	Button bt;
	Dimension d;
	
	public void init() {
		// 원하는 위치에 컴포넌트를 부착하고 싶다면 레이아웃을 해제한다.
		setLayout(null);
		setSize(400, 400);
		bt = new Button("Open");
		add(bt);
		// 레이아웃을 해제할 경우 컴포넌트의 크기와 좌표를 지정해야한다.
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