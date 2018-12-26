package my.day20;

import java.awt.*;
import java.awt.event.*;

public class MyWindowEvent2 extends Frame{

	public MyWindowEvent2() {
		super("::MyWindowEvent2::");
		
		this.addWindowListener(new MyHandler());
		
		setSize(400,400);
		setVisible(true);
	}
	
	class MyHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new MyWindowEvent2();
	}

}
