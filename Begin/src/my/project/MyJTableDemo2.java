package my.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.border.*;

public class MyJTableDemo2 extends JFrame {
	
	Object[][] data = {
			{"dd","SCOTT",
				new ImageIcon("images/icon1.png"),new Boolean(true)},
			{new Integer(2),"Jones",
				new ImageIcon("images/icon2.png"),new Boolean(false)},
			{new Integer(3),"King",
				new ImageIcon("images/icon3.png"),new Boolean(true)},
			{new Integer(4),"Ward",
				new ImageIcon("images/icon4.png"),new Boolean(false)}
	};
	String[] colNames= {"사과","사원명","아이콘","관리자여부"};
	JTable table;
	MyTableModel model;

	public MyJTableDemo2() {
		super("::MyJTableDemo2::");
		Container cp = this.getContentPane();

		table = new JTable();
		cp.add(new JScrollPane(table), "Center");
		
		model = new MyTableModel(data,colNames);
		table.setModel(model);
		table.setRowHeight(100);
		table.setShowGrid(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyJTableDemo2();
	}
}