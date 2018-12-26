package my.day16;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MyEventApplet extends Applet implements ActionListener {
	Button b1,b2,b3,b4;
	Color a;
	
	public void init() {
		setSize(400,400);
		setLayout(new GridLayout(2,2,10,10));
		
		b1 = new Button("Naver");
		b2 = new Button("Google");
		b3 = new Button("Daum");
		b4 = new Button("Yahoo");
		add(b1);add(b2);add(b3);add(b4);
		
		a = b1.getBackground();
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String cmd = e.getActionCommand();
		this.showStatus(cmd+"버튼을 눌렀군요!");
		
		if(obj==b1) {
			if(a.equals(b1.getBackground())) {
				b1.setBackground(Color.blue);
			}else {
				b1.setBackground(a);
			}
		}else if(obj==b2) {
			if(a.equals(b2.getBackground())) {
				b2.setBackground(Color.magenta);
			}else {
				b2.setBackground(a);
			}
		}else if(obj==b3) {
			if(a.equals(b3.getBackground())) {
				b3.setBackground(Color.gray);
			}else {
				b3.setBackground(a);
			}
		}else if(obj==b4) {
			if(a.equals(b4.getBackground())) {
				b4.setBackground(Color.cyan);
			}else {
				b4.setBackground(a);
			}
		}
	}
	
	@Override
	public Insets getInsets() {
		Insets in = new Insets(20, 20, 20, 20);
		return in;
	}
}
