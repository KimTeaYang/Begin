package my.day20;

import java.awt.*;
import java.awt.event.*;

/* 창닫기 이벤트 처리
 *  1. 이벤트 소스: Frame
 *  2. 이벤트 : WindowEvent
 *  3. 이벤트 핸들러: WindowAdapter 클래스
 * */

public class MyWindowEvent3 extends Frame {

	public MyWindowEvent3() {
		super("::MyWindowEvent3::");
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		MyWindowEvent3 my = new MyWindowEvent3();
		my.setSize(400,400);
		my.setVisible(true);
	}

}
