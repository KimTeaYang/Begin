package my.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class MenuBarFood extends JFrame {
	JTabbedPane pFood;
	JPanel pC_B, pC_K, pC_R;
	///////////////////////////////
	JPanel pC_B1, pC_B2;
	JPanel pC_B1_p1, pC_B1_p2, pC_B2_p1, pC_B2_p2;
	JLabel lb_B1_p, lb_B2_p;
	JButton b_B1_p, b_B2_p;
	///////////////////////////////  불고기
	JPanel pC_K1, pC_K2;
	JPanel pC_K1_p1, pC_K1_p2, pC_K2_p1, pC_K2_p2;
	JLabel lb_K1_p, lb_K2_p;
	JButton b_K1_p, b_K2_p;
	/////////////////////////////// 김치
	
	public void setTab(int index) {
		pFood.setSelectedIndex(index);
	}
	
	public MenuBarFood() {
		super("::MenuBarFood::");
		Container cp = this.getContentPane();
		
		pFood = new JTabbedPane();
		cp.add(pFood);
		
		pC_B = new JPanel(new GridLayout(1,2));
		pC_K = new JPanel(new GridLayout(1,2));
		pC_R = new JPanel(new GridLayout(1,2));
		pFood.add("불고기", pC_B);
		pFood.add("김치", pC_K);
		pFood.add("라면", pC_R);
		///////////////////////////////////////////////////
		pC_B1 = new JPanel(new BorderLayout());
		pC_B2 = new JPanel(new BorderLayout());
		pC_B.add(pC_B1);
		pC_B.add(pC_B2);
		/////////////////////////////////////////////////// 나이키
		pC_B1_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/불고기.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_B1_p2 = new JPanel(new BorderLayout());
		
		pC_B1.add(pC_B1_p1,"Center");
		pC_B1.add(pC_B1_p2,"South");
		
		lb_B1_p = new JLabel("불고기 12,000원", JLabel.CENTER);
		b_B1_p = new JButton("장바구니 담기");
		
		pC_B1_p2.add(lb_B1_p, "Center");
		pC_B1_p2.add(b_B1_p, "East");
		//////////////////////////////////////////// 나이키 왼쪽패널
		pC_B2_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/양념불고기.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_B2_p2 = new JPanel(new BorderLayout());
		
		pC_B2.add(pC_B2_p1,"Center");
		pC_B2.add(pC_B2_p2,"South");
		
		lb_B2_p = new JLabel("양념불고기 10,000원", JLabel.CENTER);
		b_B2_p = new JButton("장바구니 담기");
		
		pC_B2_p2.add(lb_B2_p, "Center");
		pC_B2_p2.add(b_B2_p, "East");
		///////////////////////////////////////////// 나이키 오른쪽패널
		pC_K1 = new JPanel(new BorderLayout());
		pC_K2 = new JPanel(new BorderLayout());
		pC_K.add(pC_K1);
		pC_K.add(pC_K2);
		///////////////////////////////////////////// 아디다스
		pC_K1_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/총각김치.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_K1_p2 = new JPanel(new BorderLayout());
		
		pC_K1.add(pC_K1_p1,"Center");
		pC_K1.add(pC_K1_p2,"South");
		
		lb_K1_p = new JLabel("총각김치 9000원", JLabel.CENTER);
		b_K1_p = new JButton("장바구니 담기");
		
		pC_K1_p2.add(lb_K1_p, "Center");
		pC_K1_p2.add(b_K1_p, "East");
		///////////////////////////////////////////// 아디다스 왼쪽패널
		pC_K2_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/파김치.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_K2_p2 = new JPanel(new BorderLayout());
		
		pC_K2.add(pC_K2_p1,"Center");
		pC_K2.add(pC_K2_p2,"South");
		
		lb_K2_p = new JLabel("파김치 8000원", JLabel.CENTER);
		b_K2_p = new JButton("장바구니 담기");
		
		pC_K2_p2.add(lb_K2_p, "Center");
		pC_K2_p2.add(b_K2_p, "East");
		////////////////////////////////////////////////////////
	}
}
