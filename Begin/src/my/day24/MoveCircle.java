package my.day24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends JApplet{
	JButton btStart, btStop;
	JPanel p = new JPanel();
	JPanel pcenter = new MyJPanel();
	MyThread mt = null;
	int sw=1;
	boolean flag=true;
	
	public void init() {
		setSize(400,400);
		Container cp = this.getContentPane();
		cp.add(p, "North");
		cp.add(pcenter, "Center");
		btStart = new JButton("Start");
		btStop = new JButton("Stop");
		p.add(btStart);
		p.add(btStop);
		p.setBackground(Color.WHITE);
		pcenter.setBackground(Color.white);
		
		MyHandler my = new MyHandler();
		
		btStart.addActionListener(my);
		btStop.addActionListener(my);
	}
	
	class MyHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// MyThread mt = new MyThread();
			
			Object o = e.getSource();
			String cmd = e.getActionCommand();
			showStatus(cmd+"버튼클릭");
			
			if(o==btStart) {
				flag = true;
				if(mt==null) {
					mt = new MyThread();
					mt.start();
				}
			}else if(o==btStop) {
				flag = false;
				if(mt!=null) {
					mt.interrupt();
					mt=null;
				}
			}
		}
	}
	
	class MyThread extends Thread{
		@Override
		public void run() {
			for(int i=0;flag;i++) {
				
				if(((MyJPanel)pcenter).x>getWidth()-70) {
					sw=-1;
				}else if(((MyJPanel)pcenter).x<0) {
					sw=1;
				}
				((MyJPanel)pcenter).x +=(5*sw);
				pcenter.repaint();
				try {
					sleep(30);
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}
}

class MyJPanel extends JPanel{
	int x = 30;
	int y = 150;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.red);
		g.drawLine(100, 0, 100, 400);
		g.drawLine(0, 100, 400, 100);
		
		g.setColor(Color.blue);
		g.fillOval(x, y, 70, 70);
	}
}