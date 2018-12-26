package my.day20;

import java.awt.*;
import java.awt.event.*;

/* â�ݱ� �̺�Ʈ ó��
 *  1. �̺�Ʈ �ҽ�: Frame
 *  2. �̺�Ʈ : WindowEvent
 *  3. �̺�Ʈ �ڵ鷯: WindowAdapter Ŭ����
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
