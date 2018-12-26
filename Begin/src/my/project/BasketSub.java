package my.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BasketSub extends JFrame{
	
	JPanel pCenter, pSouth;
	JLabel lb_Order,lb_Order_Price, lb_Discount,lb_Discount_Price,
			lb_Price, lb_AllPrice;
	JButton b_Buy;
	JPanel pNp;
	JTable table;
	MyTableModel model;
	String[] colNames= {"��ǰ","����","����","Ȯ��"};
	ProjectEvent main;
	
	public BasketSub(ProjectEvent projectEvent) {
		super("::BasketSub::");
		main = projectEvent;
		Container cp = this.getContentPane();

		pCenter = new JPanel();
		pSouth = new JPanel(new BorderLayout());
		cp.add(pCenter, "Center");
		table = new JTable();
		pCenter.add(new JScrollPane(table));
		model = new MyTableModel(main.data,colNames);
		table.setModel(model);
		table.setRowHeight(100);
		
		cp.add(pSouth, "South");
		
		lb_Order = new JLabel("�ֹ��ݾ�");
		lb_Order_Price = new JLabel();
		lb_Discount = new JLabel("���αݾ�");
		lb_Discount_Price = new JLabel();
		lb_Price = new JLabel("�����ݾ�");
		lb_AllPrice = new JLabel();
		b_Buy = new JButton("�ֹ� ����");
		
		pSouth.add(b_Buy,"South");
		
		pNp = new JPanel(new GridLayout(1,6));
		pSouth.add(pNp, "Center");
		pNp.add(lb_Order);
		pNp.add(lb_Order_Price);
		pNp.add(lb_Discount);
		pNp.add(lb_Discount_Price);
		pNp.add(lb_Price);
		pNp.add(lb_AllPrice);
		
	}

}
