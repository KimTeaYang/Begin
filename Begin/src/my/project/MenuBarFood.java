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
	///////////////////////////////  �Ұ��
	JPanel pC_K1, pC_K2;
	JPanel pC_K1_p1, pC_K1_p2, pC_K2_p1, pC_K2_p2;
	JLabel lb_K1_p, lb_K2_p;
	JButton b_K1_p, b_K2_p;
	/////////////////////////////// ��ġ
	
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
		pFood.add("�Ұ��", pC_B);
		pFood.add("��ġ", pC_K);
		pFood.add("���", pC_R);
		///////////////////////////////////////////////////
		pC_B1 = new JPanel(new BorderLayout());
		pC_B2 = new JPanel(new BorderLayout());
		pC_B.add(pC_B1);
		pC_B.add(pC_B2);
		/////////////////////////////////////////////////// ����Ű
		pC_B1_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/�Ұ��.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_B1_p2 = new JPanel(new BorderLayout());
		
		pC_B1.add(pC_B1_p1,"Center");
		pC_B1.add(pC_B1_p2,"South");
		
		lb_B1_p = new JLabel("�Ұ�� 12,000��", JLabel.CENTER);
		b_B1_p = new JButton("��ٱ��� ���");
		
		pC_B1_p2.add(lb_B1_p, "Center");
		pC_B1_p2.add(b_B1_p, "East");
		//////////////////////////////////////////// ����Ű �����г�
		pC_B2_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/���Ұ��.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_B2_p2 = new JPanel(new BorderLayout());
		
		pC_B2.add(pC_B2_p1,"Center");
		pC_B2.add(pC_B2_p2,"South");
		
		lb_B2_p = new JLabel("���Ұ�� 10,000��", JLabel.CENTER);
		b_B2_p = new JButton("��ٱ��� ���");
		
		pC_B2_p2.add(lb_B2_p, "Center");
		pC_B2_p2.add(b_B2_p, "East");
		///////////////////////////////////////////// ����Ű �������г�
		pC_K1 = new JPanel(new BorderLayout());
		pC_K2 = new JPanel(new BorderLayout());
		pC_K.add(pC_K1);
		pC_K.add(pC_K2);
		///////////////////////////////////////////// �Ƶ�ٽ�
		pC_K1_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/�Ѱ���ġ.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_K1_p2 = new JPanel(new BorderLayout());
		
		pC_K1.add(pC_K1_p1,"Center");
		pC_K1.add(pC_K1_p2,"South");
		
		lb_K1_p = new JLabel("�Ѱ���ġ 9000��", JLabel.CENTER);
		b_K1_p = new JButton("��ٱ��� ���");
		
		pC_K1_p2.add(lb_K1_p, "Center");
		pC_K1_p2.add(b_K1_p, "East");
		///////////////////////////////////////////// �Ƶ�ٽ� �����г�
		pC_K2_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/�ı�ġ.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_K2_p2 = new JPanel(new BorderLayout());
		
		pC_K2.add(pC_K2_p1,"Center");
		pC_K2.add(pC_K2_p2,"South");
		
		lb_K2_p = new JLabel("�ı�ġ 8000��", JLabel.CENTER);
		b_K2_p = new JButton("��ٱ��� ���");
		
		pC_K2_p2.add(lb_K2_p, "Center");
		pC_K2_p2.add(b_K2_p, "East");
		////////////////////////////////////////////////////////
	}
}
