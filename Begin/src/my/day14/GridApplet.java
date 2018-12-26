package my.day14;

import java.applet.Applet;
import java.awt.*;

public class GridApplet extends Applet {
	Button []bt = new Button[5];
	Panel p; // Container이면서 Component역할도 수행
	Button btn;
	Checkbox ch;
	
	public void init() {
		setSize(400, 400);
		
		setLayout(new GridLayout(3, 2, 10, 10));
		
		for(int i=0;i<bt.length;i++) {
			bt[i] = new Button("B"+(i+1));
			add(bt[i]);
		}
		
		p = new Panel();
		btn = new Button("Send");
		ch = new Checkbox("동의합니다");
		p.setLayout(new BorderLayout());
		p.setBackground(Color.yellow);
		p.add(ch, "North");
		p.add(btn, "South");
		add(p);
		
	}
	
	@Override
	public Insets getInsets() {
		Insets in = new Insets(20, 20, 20, 20);
		return in;
	}
}