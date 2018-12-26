package my.day25;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ThreadGame extends JFrame implements Runnable {
	
	JPanel pNorth,pCenter,pSouth;
	JLabel pN_lb;
	JPanel pCp1, pCp2, pCp3;
	JButton pS_b1, pS_b2;
	
	String[] simg1 = {"img01.png","img02.png","img03.png"};
	String[] simg2 = {"img01.png","img02.png","img03.png"};
	String[] simg3 = {"img01.png","img02.png","img03.png"};
	ImageIcon img1,img2,img3;
	
	boolean flag = false;
	
	public ThreadGame() {
		super("::ThreadGame::");
		Container cp = this.getContentPane();
		pNorth = new JPanel();
		pCenter = new JPanel();
		pSouth = new JPanel();
		cp.add(pNorth,"North");
		cp.add(pCenter,"Center");
		cp.add(pSouth,"South");
		
		pN_lb = new JLabel("준비중입니다.",JLabel.CENTER);
		pNorth.add(pN_lb);
		////////////////////////////////////////////////////
		pCenter.setLayout(new GridLayout(1,3));
		pCp1 = new JPanel(){
			@Override
			public void paintComponent(Graphics g) { // 패널에 이미지
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/루피.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		pCp2 = new JPanel(){
			@Override
			public void paintComponent(Graphics g) { // 패널에 이미지
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/배트맨.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		pCp3 = new JPanel(){
			@Override
			public void paintComponent(Graphics g) { // 패널에 이미지
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/뽀로로.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		pCenter.add(pCp1);pCenter.add(pCp2);pCenter.add(pCp3);
		
		//////////////////////////////////////////////////////
		
		pS_b1 = new JButton("Start");
		pS_b2 = new JButton("Stop");
		
		pSouth.add(pS_b1);pSouth.add(pS_b2);
		pS_b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==pS_b1) {
					pCp1.repaint();
				}
			}
		});
		
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void run() {
		while(flag) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		new ThreadGame();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		ImageIcon image = new ImageIcon("images/뽀로로.png");
		g.drawImage(image.getImage(), 70, 100, this);
	}
}