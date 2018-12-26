package my.day14;

import java.applet.*;
import java.awt.*;

public class MyTest extends Applet{
	Panel p1;
	Panel pp1;
	Panel ppp1;
	Panel p2;
	Panel p3;
	Panel pp3;
	Label la1;
	Label la2;
	TextField tf1;
	TextField tf2;
	TextArea ta;
	Button b1;
	Button b2;
	
	public void init() {
		setSize(500, 500);
		
		setLayout(new BorderLayout());
		
		p1 = new Panel();
		pp1 = new Panel();
		ppp1 = new MyPanel();
		p1.setLayout(new GridLayout(2, 1, 10, 10));
		pp1.setLayout(new GridLayout(2, 1, 10, 10));
		ppp1.setLayout(new BorderLayout());
		la1 = new Label("수신자:");
		la2 = new Label("참조인:");
		tf1 = new TextField();
		tf2 = new TextField();
		pp1.add(la1);
		pp1.add(la2);
		p1.add(tf1);
		p1.add(tf2);
		ppp1.add(p1, "Center");
		ppp1.add(pp1, "West");
		add(ppp1, "North");
		
		p2 = new MyPanel();
		p2.setLayout(new BorderLayout());
		ta = new TextArea();
		p2.add(ta);
		add(p2, "Center");
		
		p3 = new MyPanel();
		pp3 = new Panel();
		pp3.setLayout(new GridLayout(1, 2, 10, 10));
		b1 = new Button("send");
		b2 = new Button("Reset");
		pp3.add(b1);
		pp3.add(b2);
		p3.add(pp3);
		add(p3, "South");
	}
}
