package my.day16;


import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MyEvent2 extends Applet implements ActionListener{
	Button b1,b2,b3,b4,b5,b6;
	LayoutManager c;
	GridLayout g;
	public void init() {
		setSize(400,400);
		setLayout(new GridLayout(2,3,10,10));
		c = getLayout();
		
		g = (GridLayout) getLayout();
		
		b1 = new Button("B1");
		b2 = new Button("B2");
		b3 = new Button("B3");
		b4 = new Button("B4");
		b5 = new Button("B5");
		b6 = new Button("B6");
		
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(g.equals(getLayout())) {
			setLayout(new GridLayout(3,2,10,10));
		}else {
			setLayout(g);
		}
		validate();
	}
	
	@Override
	public Insets getInsets() {
		Insets in = new Insets(20, 20, 20, 20);
		return in;
	}
}
