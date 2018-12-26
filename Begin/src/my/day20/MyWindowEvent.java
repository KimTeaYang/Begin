package my.day20;

import java.awt.*;
import java.awt.event.*;
/* â�ݱ� �̺�Ʈ ó��
 *  1. �̺�Ʈ �ҽ�: Frame
 *  2. �̺�Ʈ : WindowEvent
 *  3. �̺�Ʈ �ڵ鷯: WindowListener
 * */

public class MyWindowEvent extends Frame {

	public MyWindowEvent() {
		super("::MyWindowEvent::");
		
		MyEventHandler h = new MyEventHandler();
		this.addWindowListener(h);
	}
	
	class MyEventHandler implements WindowListener{
		@Override
		public void windowActivated(WindowEvent e) {
			
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
			
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
			
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
			
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
			
		}
		
		@Override
		public void  windowOpened(WindowEvent e)  {
			
		}
	}
	
	public static void main(String[] args) {
		MyWindowEvent my = new MyWindowEvent();
		my.setSize(400,400);
		my.setVisible(true);
	}

}
