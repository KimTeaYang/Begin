package my.day10;

import java.applet.*;
import java.awt.*;

/* java.applet.Applet 클래스
 * => 애플릿 프로그램을 만들 수 있다.
 * 자바 프로그램 종류
 * 자바 SE의 프로그램 종류
 * 1. 애플리케이션(Application) : 독립적인 실행 프로그램
		- main()메소드를 갖는다.
 * 2. 애플릿(Applet) : 비독립적 실행 프로그램
 * 		html웹 문서에 포함되어 실행된다.
 * 		applietviewer를 사용하여 실행시키거나, 웹 브라우저를 이용해서 실행시킬 수 있다.
 * 			- main()메소드가 필요없음.
 * 			- 대신 웹문서(html문서)가 필요함
 * */
public class MyApplet extends Applet {
	
	Color[] s = {Color.black,Color.blue,Color.cyan,Color.darkGray,
			Color.gray,Color.green,Color.lightGray,
			Color.magenta,Color.orange,Color.pink,
			Color.red,Color.yellow};
	int b = 10;
	public void paint(Graphics g) {
		g.drawString("내가 만든 애플릿~", 50, 50);
		// 문자열을 x가 50, y가 50인 지점에 그려줌
		
		for(int i=0;i<s.length;i++) {
		
			b +=20;
			g.setColor(s[i]);
			g.drawString("내가 만든 애플릿", 50, b);
		}
	}
}