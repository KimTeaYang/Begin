package my.day17;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import my.day14.MyPanel;

public class MyEmail extends Applet implements ActionListener {
	Label lb1,lb2;
	TextField tf1,tf2;
	TextArea ta;
	Button btSend,btReset;
	Panel p1,p2,p1w,p1c;
	
	public void init() {
		setSize(500,500);
		setLayout(new BorderLayout());
		setBackground(Color.LIGHT_GRAY);
		
		p1 = new MyPanel(0,0,15,0);
		p2 = new MyPanel(20,10,10,10);
		ta = new TextArea();
		add(p1, "North");
		add(ta, "Center");
		add(p2, "South");
		
		p1.setLayout(new BorderLayout());
		p1w = new Panel(new GridLayout(2,1,10,10));
		p1c = new Panel(new GridLayout(2,1,10,10));
		p1.add(p1w, "West");
		p1.add(p1c, "Center");
		p1w.add(lb1 = new Label("수신자: "));
		p1w.add(lb2 = new Label("참  조: "));
		p1c.add(tf1 = new TextField());
		p1c.add(tf2 = new TextField());
		
		tf1.setEchoChar('*'); // 암호
		
		p2.add(btSend = new Button("    Send    "));
		p2.add(btReset = new Button("    Reset    "));
		
		btSend.addActionListener(this);
		btReset.addActionListener(this);
		tf1.addActionListener(this);
	}
	
	@Override
	public Insets getInsets() {
		return new Insets(20,20,20,20);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String cmd = e.getActionCommand();
		this.showStatus(cmd+"버튼을 눌렀군요!");
		
		if(obj==btReset) {
			tf1.setText("\u0000");
			tf2.setText("\u0000");
			ta.setText("\u0000");
			tf1.requestFocus();
		}else if(obj==btSend||obj==tf1) {
			// ta.setText(tf1.getText());
			ta.append(tf1.getText()+"\n");
			tf1.setText("\u0000");
			tf1.requestFocus();
		}
	}
}