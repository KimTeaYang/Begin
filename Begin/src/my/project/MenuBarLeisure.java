package my.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class MenuBarLeisure extends JFrame {
	JTabbedPane pLeisure;
	JPanel pC_C, pC_G, pC_Cam;
	///////////////////////////////
	JPanel pC_C1, pC_C2;
	JPanel pC_C1_p1, pC_C1_p2, pC_C2_p1, pC_C2_p2;
	JLabel lb_C1_p, lb_C2_p;
	JButton b_C1_p, b_C2_p;
	///////////////////////////////  ������
	JPanel pC_G1, pC_G2;
	JPanel pC_G1_p1, pC_G1_p2, pC_G2_p1, pC_G2_p2;
	JLabel lb_G1_p, lb_G2_p;
	JButton b_G1_p, b_G2_p;
	/////////////////////////////// ����
	
	public void setTab(int index) {
		pLeisure.setSelectedIndex(index);
	}
	
	public MenuBarLeisure() {
		super("::MenuBarLeisure::");
		Container cp = this.getContentPane();
		
		pLeisure = new JTabbedPane();
		cp.add(pLeisure);
		
		pC_C = new JPanel(new GridLayout(1,2));
		pC_G = new JPanel(new GridLayout(1,2));
		pC_Cam = new JPanel(new GridLayout(1,2));
		pLeisure.add("������", pC_C);
		pLeisure.add("����", pC_G);
		pLeisure.add("ķ��", pC_Cam);
		///////////////////////////////////////////////////
		pC_C1 = new JPanel(new BorderLayout());
		pC_C2 = new JPanel(new BorderLayout());
		pC_C.add(pC_C1);
		pC_C.add(pC_C2);
		/////////////////////////////////////////////////// ����Ű
		pC_C1_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/������.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_C1_p2 = new JPanel(new BorderLayout());
		
		pC_C1.add(pC_C1_p1,"Center");
		pC_C1.add(pC_C1_p2,"South");
		
		lb_C1_p = new JLabel("���ƿ� 120,000��", JLabel.CENTER);
		b_C1_p = new JButton("��ٱ��� ���");
		
		pC_C1_p2.add(lb_C1_p, "Center");
		pC_C1_p2.add(b_C1_p, "East");
		//////////////////////////////////////////// ����Ű �����г�
		pC_C2_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/������2.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_C2_p2 = new JPanel(new BorderLayout());
		
		pC_C2.add(pC_C2_p1,"Center");
		pC_C2.add(pC_C2_p2,"South");
		
		lb_C2_p = new JLabel("���ο� 150,000��", JLabel.CENTER);
		b_C2_p = new JButton("��ٱ��� ���");
		
		pC_C2_p2.add(lb_C2_p, "Center");
		pC_C2_p2.add(b_C2_p, "East");
		///////////////////////////////////////////// ����Ű �������г�
		pC_G1 = new JPanel(new BorderLayout());
		pC_G2 = new JPanel(new BorderLayout());
		pC_G.add(pC_G1);
		pC_G.add(pC_G2);
		///////////////////////////////////////////// �Ƶ�ٽ�
		pC_G1_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/������.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_G1_p2 = new JPanel(new BorderLayout());
		
		pC_G1.add(pC_G1_p1,"Center");
		pC_G1.add(pC_G1_p2,"South");
		
		lb_G1_p = new JLabel("������ 3000��", JLabel.CENTER);
		b_G1_p = new JButton("��ٱ��� ���");
		
		pC_G1_p2.add(lb_G1_p, "Center");
		pC_G1_p2.add(b_G1_p, "East");
		///////////////////////////////////////////// �Ƶ�ٽ� �����г�
		pC_G2_p1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/����ä.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		pC_G2_p2 = new JPanel(new BorderLayout());
		
		pC_G2.add(pC_G2_p1,"Center");
		pC_G2.add(pC_G2_p2,"South");
		
		lb_G2_p = new JLabel("����ä 130,000", JLabel.CENTER);
		b_G2_p = new JButton("��ٱ��� ���");
		
		pC_G2_p2.add(lb_G2_p, "Center");
		pC_G2_p2.add(b_G2_p, "East");
		////////////////////////////////////////////////////////
	}
}
