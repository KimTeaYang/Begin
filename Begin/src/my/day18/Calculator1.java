package my.day18;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator1 extends Applet implements ActionListener {
	JButton bt[]=new JButton[16];
	String str[]= {"7","8","9","+","4","5","6","-",
			"1","2","3","*","0","CE","=","/"};
	JLabel lb;
	JPanel p1,p2;
	JTextField tf;
	int first = 0, second = 0;
	String oper = null;
	
	public void init() {
		setSize(280,260);
		setLayout(new BorderLayout(10,10));
		lb=new JLabel("",Label.RIGHT);
		add(lb,"North");
		tf=new JTextField();
		add(tf,"Center");
		p1=new JPanel();
		add(p1,"South");
		p1.setLayout(new GridLayout(4,4,7,7));
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton(str[i]);
			p1.add(bt[i]);
			bt[i].addActionListener(this);
		}//for----
	}//init()-------------
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd=e.getActionCommand();
		showStatus(cmd);
		
		switch(cmd) {
			case "+":
			case "-":
			case "*":
			case "/":
				setOperator(cmd); // cmd에는 연산자
				break;
			case "=":
				setCalc();
				break;
			case "CE":
				break;
			default: // 숫자버튼을 눌렀을 경우
				setNumber(cmd); // cmd에는 숫자
				break;
		}
		
	}//--------------------
	
	public void setNumber(String num) {
		String txt = tf.getText(); // 처음에는 빈문자열 반환
		tf.setText(txt+num); // 숫자와 결합한 것을 tf에 셋팅
	}
	
	public void setOperator(String cmd) {
		switch(cmd) {
			case "+":
				first += Integer.parseInt(tf.getText());
				break;
			case "-":
				first -= Integer.parseInt(tf.getText());
				break;
			case "*":
				first *= Integer.parseInt(tf.getText());
				break;
			case "/":
				first /= Integer.parseInt(tf.getText());
				break;
		}
		first = Integer.parseInt(tf.getText());
		oper=cmd;
		tf.setText("");
		lb.setText(first+oper);
	}
	
	public void setCalc() {
		second = Integer.parseInt(tf.getText());
		switch(oper) {
			case "+":
				first+=second;
				break;
			case "-":
				first-=second;
				break;
			case "*":
				first*=second;
				break;
			case "/":
				first/=second;
				break;
		}
		tf.setText(first+"");
		lb.setText("");
		oper = null;
	}
	
	public Insets getInsets() {
		return new Insets(20,10,10,10);
	}
}
