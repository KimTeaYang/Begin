package my.day14;

import java.applet.*;
import java.awt.*;

/* Object
 *  +--Component <---- Button, Label, Checkbox ...
 *       +---- Container
 *                 +---- Window <---- Frame (BorderLayout이 디폴트)
 *                              <---- Dialog <---- FileDialog
 *                 +---- Panel <---- Applet (FlowLayout이 디폴트)
 *  
 *  - LayoutManager(배치 관리자)
 *   [1] FlowLayout
 *   [2] BorderLayout
 *   [3] GridLayout : 행과 열의 형태로 배치
 *   [4] GridBagLayout
 *   [5] CardLayout
 *    ...
 * */

public class FlowApplet extends Applet {
	// Applet : Container
	Button b1, b2, b3, b4, b5; // Component
	
	public void init() {
		this.setSize(400, 400);
		
		// 애플릿의 기본 레이아웃 : FLowLayout
		FlowLayout fl = new FlowLayout(FlowLayout.RIGHT, 20, 50);
		this.setLayout(fl); // 레이아웃 설정
		
		b1 = new Button("B1");
		b2 = new Button("B2");
		b3 = new Button("B3");
		b4 = new Button("B4");
		b5 = new Button("B5");
		add(b1);add(b2);add(b3);
		add(b4);add(b5);
	}
}