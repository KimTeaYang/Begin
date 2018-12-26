package my.day20;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame{
	
	Panel p = new Panel();
	Button b1,b2,b3;
	
	public MyFrame() {
		super("::MyFrame::");
		add(p, "North");
		
		b1 = new Button("pink");
		b2 = new Button("cyan");
		b3 = new Button("Exit");
		p.add(b1);p.add(b2);p.add(b3);
		//이름없는 로컬 이너 클래스: Anonymous class
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.pink);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.cyan);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
