package my.day20;

import java.awt.*;
import java.awt.event.*;
/* 창닫기 이벤트 처리
 *  1. 이벤트 소스: Frame
 *  2. 이벤트 : WindowEvent
 *  3. 이벤트 핸들러: WindowListener
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
