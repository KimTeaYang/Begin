package my.day18;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends Applet implements ActionListener {
	JButton bt[]=new JButton[16];
	String str[]= {"7","8","9","+","4","5","6","-","1","2","3","*",
			"0","CE","=","/"};
	JLabel lb;
	JPanel p1,p2;
	JTextField tf;
	String value="";
	String operation="";
	int save=0;
	int save1=0;

	public void init() {
		setSize(280,260);
		setLayout(new BorderLayout(10,10));
		
		p2 = new JPanel();
		p2.setLayout(new GridLayout(2,1,7,7));
		
		lb = new JLabel("result", JLabel.RIGHT);
		p2.add(lb);
		
		tf = new JTextField();
		p2.add(tf);
		add(p2);
		
		p1 = new JPanel();
		add(p1,"South");
		p1.setLayout(new GridLayout(4,4,7,7));
		
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton(str[i]);
			p1.add(bt[i]);
			bt[i].addActionListener(this);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o==bt[0]) {
			value +="7";
			lb.setText(value);
		}else if(o==bt[1]) {
			value +="8";
			lb.setText(value);
		}else if(o==bt[2]) {
			value +="9";
			lb.setText(value);
		}else if(o==bt[4]) {
			value +="4";
			lb.setText(value);
		}else if(o==bt[5]) {
			value +="5";
			lb.setText(value);
		}else if(o==bt[6]) {
			value +="6";
			lb.setText(value);
		}else if(o==bt[8]) {
			value +="1";
			lb.setText(value);
		}else if(o==bt[9]) {
			value +="2";
			lb.setText(value);
		}else if(o==bt[10]) {
			value +="3";
			lb.setText(value);
		}else if(o==bt[12]) {
			value +="0";
			lb.setText(value);
		}else if(o==bt[3]) {
			save += Integer.parseInt(value);
			operation = "+";
			value += "+";
			tf.setText(value);
			lb.setText("");
			value="";
		}else if(o==bt[7]) {
			save -= Integer.parseInt(value);
			operation = "-";
			value += "-";
			tf.setText(value);
			lb.setText("");
			value="";
		}else if(o==bt[11]) {
			save = Integer.parseInt(value);
			operation = "*";
			value += "*";
			tf.setText(value);
			lb.setText("");
			value="";
		}else if(o==bt[15]) {
			save = Integer.parseInt(value);
			operation = "/";
			value += "/";
			tf.setText(value);
			lb.setText("");
			value="";
		}else if(o==bt[14]) {
			switch(operation) {
				case "+":
					tf.setText((save+Integer.parseInt(value))+"");
					break;
				case "-":
					tf.setText((save-Integer.parseInt(value))+"");
					break;
				case "*":
					tf.setText((save*Integer.parseInt(value))+"");
					break;
				case "/":
					tf.setText((save/Integer.parseInt(value))+"");
					break;
			}
			value = tf.getText();
			lb.setText("");
		}else if(o==bt[13]) {
			value = "";
			save = 0;
			tf.setText("");
			lb.setText("");
		}
	}
}
