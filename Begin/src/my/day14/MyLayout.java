package my.day14;

import java.applet.Applet;
import java.awt.*;

public class MyLayout extends Applet {
	MyPanel p = new MyPanel();
	Button []bt = new Button[6];
	Panel p1 = new MyPanel();
	Panel p2 = new MyPanel(10,10,10,10);
	
	public void init() {
		setSize(400, 400);
		
		for(int i=0;i<bt.length;i++) {
			bt[i] = new Button("b"+i);
		}
		setLayout(new BorderLayout());
		
		p1.setBackground(Color.yellow);
		p1.setLayout(new GridLayout(2, 2, 10, 10));
		p1.add(bt[0]);
		p1.add(bt[1]);
		p1.add(bt[2]);
		p1.add(bt[3]);
		add(p1, "Center");
		
		p2.setSize(400, 300);
		p2.setBackground(Color.pink);
		p2.setLayout(new BorderLayout(10, 10));
		p2.add(bt[4], "North");
		p2.add(bt[5], "South");
		add(p2, "South");
	}
}
