package my.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class MenuBarClothes extends JFrame {
	JTabbedPane pClothes;
	JPanel pC_N, pC_A, pC_P;
	///////////////////////////////
	JPanel pC_N1, pC_N2;
	JPanel pC_N1_p1, pC_N1_p2, pC_N2_p1, pC_N2_p2;
	JLabel lb_N1_p, lb_N2_p;
	JButton b_N1_p, b_N2_p;
	///////////////////////////////  나이키
	JPanel pC_A1, pC_A2;
	JPanel pC_A1_p1, pC_A1_p2, pC_A2_p1, pC_A2_p2;
	JLabel lb_A1_p, lb_A2_p;
	JButton b_A1_p, b_A2_p;
	/////////////////////////////// 아디다스
	
	public void setTab(int index) {
		pClothes.setSelectedIndex(index);
	}
	
	public MenuBarClothes() {
		super("::MenuBarClothes::");
		Container cp = this.getContentPane();
		
		pClothes = new JTabbedPane();
		cp.add(pClothes);
		
		pC_N = new JPanel(new GridLayout(1,2));
		pC_A = new JPanel(new GridLayout(1,2));
		pC_P = new JPanel(new GridLayout(1,2));
		pClothes.add("나이키", pC_N);
		pClothes.add("아디다스", pC_A);
		pClothes.add("퓨마", pC_P);
		///////////////////////////////////////////////////
		pC_N1 = new JPanel(new BorderLayout());
		pC_N2 = new JPanel(new BorderLayout());
		pC_N.add(pC_N1);
		pC_N.add(pC_N2);
		/////////////////////////////////////////////////// 나이키
		pC_N1_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/맨투맨.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_N1_p2 = new JPanel(new BorderLayout());
		
		pC_N1.add(pC_N1_p1,"Center");
		pC_N1.add(pC_N1_p2,"South");
		
		lb_N1_p = new JLabel("맨투맨 80,000원", JLabel.CENTER);
		b_N1_p = new JButton("장바구니 담기");
		
		pC_N1_p2.add(lb_N1_p, "Center");
		pC_N1_p2.add(b_N1_p, "East");
		//////////////////////////////////////////// 나이키 왼쪽패널
		pC_N2_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/모자.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_N2_p2 = new JPanel(new BorderLayout());
		
		pC_N2.add(pC_N2_p1,"Center");
		pC_N2.add(pC_N2_p2,"South");
		
		lb_N2_p = new JLabel("모자 20,000원", JLabel.CENTER);
		b_N2_p = new JButton("장바구니 담기");
		
		pC_N2_p2.add(lb_N2_p, "Center");
		pC_N2_p2.add(b_N2_p, "East");
		///////////////////////////////////////////// 나이키 오른쪽패널
		pC_A1 = new JPanel(new BorderLayout());
		pC_A2 = new JPanel(new BorderLayout());
		pC_A.add(pC_A1);
		pC_A.add(pC_A2);
		///////////////////////////////////////////// 아디다스
		pC_A1_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/상의.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_A1_p2 = new JPanel(new BorderLayout());
		
		pC_A1.add(pC_A1_p1,"Center");
		pC_A1.add(pC_A1_p2,"South");
		
		lb_A1_p = new JLabel("상의 55,000원", JLabel.CENTER);
		b_A1_p = new JButton("장바구니 담기");
		
		pC_A1_p2.add(lb_A1_p, "Center");
		pC_A1_p2.add(b_A1_p, "East");
		///////////////////////////////////////////// 아디다스 왼쪽패널
		pC_A2_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/하의.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_A2_p2 = new JPanel(new BorderLayout());
		
		pC_A2.add(pC_A2_p1,"Center");
		pC_A2.add(pC_A2_p2,"South");
		
		lb_A2_p = new JLabel("하의 45,000원", JLabel.CENTER);
		b_A2_p = new JButton("장바구니 담기");
		
		pC_A2_p2.add(lb_A2_p, "Center");
		pC_A2_p2.add(b_A2_p, "East");
		////////////////////////////////////////////////////////
	}
}
