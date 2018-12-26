package my.day21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MyPaint extends JFrame{

	JPanel p;
	Canvas can;
	
	public MyPaint() {
		super("::MyPaint::");
		Container cp = this.getContentPane();
		p = new JPanel() {
			@Override
			public Insets getInsets() {
				return new Insets(40,0,0,0);
			}
		};
		cp.add(p, "Center");
		can = new MyCanvas();
		p.add(can);
		can.setSize(300, 300);
		can.setBackground(Color.white);
		
		//Äµ¹ö½º¿¡ ¸®½º³Ê ºÎÂø
		MyEventHandler my = new MyEventHandler(this);
		can.addMouseMotionListener(my);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyPaint();
	}
}