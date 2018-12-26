package my.day25;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class TickerTapeApplet extends JApplet implements Runnable {
	
	String str="즐거운 하루 되세요~~";
	int x=50, y=100, yCenter;
	Font f;
	Thread tr = null;
	boolean flag = false;
	
	public void init() {
		
		f = new Font("궁서체", Font.BOLD, 22);
		Container cp = this.getContentPane();
		cp.setBackground(Color.white);
		
		cp.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				flag=!flag;
				synchronized(TickerTapeApplet.this) {
					if(!flag) {
						TickerTapeApplet.this.notify();
					}
				}
			}
		});
	}
	
	@Override
	public void start() {
		setSize(400,200);
		/* init()이 딱 한번 호출되고 난 후 start()가 바로 호출된다.
		 * start()는 애플릿이 시작될 때 호출되면 수시로 호출된다.
		 * */
		if(tr == null) {
			tr = new Thread(this);
			tr.start();
		}
	}
	
	@Override
	public void stop() {
		/* 애플릿이 중지될 때 호출... 수시로 호출됨 */
		if(tr != null) {
			tr.interrupt();
			tr=null;
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(f);
		g.setColor(Color.MAGENTA);
		g.drawString(str, x, y);
	}
	
	@Override
	public void run() {
		while(true) {
			if(y>220) {
				y=0;
			}
			y +=5;
			
			synchronized(this) {
				if(flag) {
					try {
						wait();
					} catch (InterruptedException e) {
					}
				}
			}
			
			try {
				tr.sleep(100);
			} catch (InterruptedException e) {
				break;
			}
			repaint();
		}
	}
}