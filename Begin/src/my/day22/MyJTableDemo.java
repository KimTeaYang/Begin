package my.day22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.table.*;

/* JTable => View
 *  �⺻ �� => javax.swing.table.DefaultTableModel (class)
 *   - TableModel (�������̽�)
 *   - AbstractTableModel (�߻�Ŭ����)
 * */
public class MyJTableDemo extends JFrame {
	
	JTable table;
	DefaultTableModel model;
	Object[][] data = {
			{new Integer(1),"SCOTT",
				new ImageIcon("images/icon1.png"),new Boolean(true)},
			{new Integer(2),"Jones",
				new ImageIcon("images/icon2.png"),new Boolean(false)},
			{new Integer(3),"King",
				new ImageIcon("images/icon3.png"),new Boolean(true)},
			{new Integer(4),"Ward",
				new ImageIcon("images/icon4.png"),new Boolean(false)}
	};
	String[] colNames= {"���","�����","������","�����ڿ���"};
	
	public MyJTableDemo() {
		super("::MyJTableDemo::");
		Container cp = this.getContentPane();
		
		table = new JTable(); // View
		cp.add(new JScrollPane(table));
		
		model = new DefaultTableModel(data,colNames); // Model
		// View�� Model�� ����
		table.setModel(model);
		table.setRowHeight(30);
		table.setSelectionBackground(Color.blue);
		table.setSelectionForeground(Color.white);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		
		
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyJTableDemo();
	}
}