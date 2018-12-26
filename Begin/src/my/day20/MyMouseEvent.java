package my.day20;

import javax.swing.*;

import my.day19.FileReadTest2;

import java.awt.event.*;
import java.awt.*;
import java.io.*;
/* 이벤트소스:
 * */
public class MyMouseEvent extends JFrame {

	JTextArea ta;
	JPopupMenu pop;
	JMenuItem mi1,mi2,mi3;
	
	public MyMouseEvent() {
		super("::MyMouseEvent::");
		Container cp = this.getContentPane();
		cp.add(new JScrollPane(ta=new JTextArea()),"Center");
		
		pop = new JPopupMenu();
		ta.add(pop);
		
		mi1 = new JMenuItem("Open");
		mi2 = new JMenuItem("Color");
		mi3 = new JMenuItem("Exit");
		pop.add(mi1);
		pop.add(mi2);
		pop.addSeparator();
		pop.add(mi3);
		
		ta.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getModifiersEx()==(MouseEvent.CTRL_DOWN_MASK 
						| MouseEvent.BUTTON3_DOWN_MASK)) {
					pop.show(ta, e.getX(), e.getY());
				}
			}
		});
		
		mi1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser("c:/myjava");
				int n = jfc.showOpenDialog(ta); // n=1 취소, n=0 선택
				String path = jfc.getSelectedFile().getAbsolutePath();
				
				if(n==0) {
					try {
						ta.setText(FileReadTest2.reading(path));
					}catch(IOException ex){
						ta.setText("오류발생: "+ex.getMessage());
					}
				}else
					return;
			}
		});
		
		mi2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Color cr = JColorChooser.showDialog(
						ta, "Color", Color.black);
				if(cr==null) return;
				ta.setForeground(cr);
			}
		});
		
		mi3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyMouseEvent();
	}
}