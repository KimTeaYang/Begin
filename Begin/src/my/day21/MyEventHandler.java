package my.day21;

import java.awt.event.*;
/* 이벤트소스 : MyCanvas
 * 이벤트 : MouseEvent
 * 이벤트핸들러 : MouseMotionListener
 * 핸들러어댑터 : MouseMotionAdapter
 * 
 * 외부 클래스로 이벤트핸들러 구현
 *  - 이벤트 소스를 가진 객체 정보를 이벤트 핸들러에 넘겨준다.
 *  - 이벤트 핸들러에 인자 생성자를 구현한다.
 *  - 생성자 안에서 이벤트소스를 가진 객체 정보를 받아 사용한다.
 * */

public class MyEventHandler extends MouseMotionAdapter{
	MyPaint p;
	public MyEventHandler(MyPaint p) {
		this.p = p;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		p.setTitle("x: "+x+", y: "+y);
		
		MyCanvas mc = (MyCanvas)p.can;
		mc.mx = x;
		mc.my = y;

		mc.repaint();
		
		/* 개발자가                 |       JVM      |
		 * repaint() 호출하면=> |===> update() ===> paint()호출한다.
		 *                    |기본 그림을 모두 지움 |   그림 그리기
		 * */
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}