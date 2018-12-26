package my.day14;

import java.awt.*;
import java.awt.*;

public class MyPanel extends Panel{
	private int a, b, c, d;

	public MyPanel() {
		this(20,20,20,20);
	}

	public MyPanel(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public Insets getInsets() {
		Insets in = new Insets(a,b,c,d);
		return in;
	}
}