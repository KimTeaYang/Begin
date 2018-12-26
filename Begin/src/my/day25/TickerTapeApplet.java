package my.day25;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class TickerTapeApplet extends JApplet implements Runnable {
	
	String str="��ſ� �Ϸ� �Ǽ���~~";
	int x=50, y=100, yCenter;
	Font f;
	Thread tr = null;
	boolean flag = false;
	
	public void init() {
		
		f = new Font("�ü�ü", Font.BOLD, 22);
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
		/* init()�� �� �ѹ� ȣ��ǰ� �� �� start()�� �ٷ� ȣ��ȴ�.
		 * start()�� ���ø��� ���۵� �� ȣ��Ǹ� ���÷� ȣ��ȴ�.
		 * */
		if(tr == null) {
			tr = new Thread(this);
			tr.start();
		}
	}
	
	@Override
	public void stop() {
		/* ���ø��� ������ �� ȣ��... ���÷� ȣ��� */
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