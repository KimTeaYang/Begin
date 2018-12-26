package my.day14;

import java.applet.*;
import java.awt.*;

public class BorderApplet extends Applet {
	Button []bt = new Button[5];
	
	public void init() {
		this.setSize(400, 400);
		// BorderLayout : 동, 서, 남, 북, 중앙의 영역을 지정하여 배치하는 방식
		setLayout(new BorderLayout(10, 10));
		
		for(int i=0;i<bt.length;i++) {
			bt[i] = new Button("B"+i);
			// add(bt[i]);
		}
		add(bt[0], BorderLayout.NORTH);
		add(bt[1], BorderLayout.WEST);
		add(bt[2], "South");
		add(bt[3], BorderLayout.EAST);
		add(bt[4], "Center");
	}
	
	// 애플릿의 바깥여백(마진)을 주고싶사면 메소드를 override하자
	@Override
	public Insets getInsets() {
		Insets in = new Insets(10,20,30,40);
		return in;
	}
}