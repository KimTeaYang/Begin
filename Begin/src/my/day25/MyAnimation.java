package my.day25;

import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;

public class MyAnimation extends JApplet implements Runnable {
	
	JComboBox<String> combo;
	JButton btStart, btStop;
	Image img;
	AudioClip audio;
	
	Vector<String> item = new Vector<>(10, 5);
	URL url;
	Thread tr = null;
	boolean flag = false;
	
	public void init() {
		setSize(400,400);
		Container cp = this.getContentPane();
		JPanel p = new JPanel();
		cp.add(p, "North");
		
		btStart = new JButton("Start");
		btStop = new JButton("Stop");
		
		for(int i=0;i<14;i++) {
			item.add("T"+i+".gif");
		}
		combo = new JComboBox<>(item);
		
		p.add(combo);
		p.add(btStart);
		p.add(btStop);
		
		url = this.getDocumentBase();
		/* - getDocumentBase()는 html문서가 있는 곳의 URL을 반환한다.
		 * - getCodeBase()는 바이트코드(class)가 있는 곳의 URL경로를 반환한다.
		 * */
		
		img = this.getImage(url, "../images/img03.png");
		audio = this.getAudioClip(url, "../audios/town.mid");
		
		MyHandler my = new MyHandler();
		combo.addItemListener(my);
		btStart.addActionListener(my);
		btStop.addActionListener(my);
	}
	
	@Override
	public void run() {
			for(int i=0;flag;i++) {
				if(i>13) {
					i=0;
				}
				String str = item.get(i);
				img = getImage(url, "../images/"+str);
				repaint();
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {
					break;
				}
			}
	}
	
	class MyHandler implements ItemListener, ActionListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			int mode = e.getStateChange();
			if(mode==ItemEvent.SELECTED) {
				String str = combo.getItemAt(combo.getSelectedIndex());
				img = getImage(url, "../images/"+str);
				repaint();
			}
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btStart) {
				audio.play();
				
				flag = true;
				if(tr==null) {
					tr = new Thread(MyAnimation.this);
					tr.start();
				}
			}else if(e.getSource()==btStop) {
				audio.stop();
				
				flag = false;
				if(tr!=null) {
					tr.interrupt();
					tr=null;
				}
			}
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, 70, 100, this);
	}
}