package my.day21;

import java.awt.*;

public class MyCanvas extends Canvas{
	
	public static int mx=-50,my=-50;
	public MyCanvas() {
		
	}
	
	//Component들은 모두 paint()를 가짐
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(mx, my, 7, 7);
		
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
}