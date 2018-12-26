package my.day16;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MyEvent1 extends Applet implements ActionListener{
	Button b1,b2,b3;
	Panel p, p1, p2, p3;
	String str;
	
	public void init() {
		setSize(400,400);
		
		b1 = new Button("Left");
		b2 = new Button("Center");
		b3 = new Button("Right");
		add(b1);add(b2);add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj==b1) {
			setLayout(new FlowLayout(FlowLayout.LEFT));
		}else if(obj==b2) {
			setLayout(new FlowLayout());
		}else if(obj==b3) {
			setLayout(new FlowLayout(FlowLayout.RIGHT));
		}
		validate();
	}
}
