package my.day21;

import java.awt.event.*;
/* �̺�Ʈ�ҽ� : MyCanvas
 * �̺�Ʈ : MouseEvent
 * �̺�Ʈ�ڵ鷯 : MouseMotionListener
 * �ڵ鷯����� : MouseMotionAdapter
 * 
 * �ܺ� Ŭ������ �̺�Ʈ�ڵ鷯 ����
 *  - �̺�Ʈ �ҽ��� ���� ��ü ������ �̺�Ʈ �ڵ鷯�� �Ѱ��ش�.
 *  - �̺�Ʈ �ڵ鷯�� ���� �����ڸ� �����Ѵ�.
 *  - ������ �ȿ��� �̺�Ʈ�ҽ��� ���� ��ü ������ �޾� ����Ѵ�.
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
		
		/* �����ڰ�                 |       JVM      |
		 * repaint() ȣ���ϸ�=> |===> update() ===> paint()ȣ���Ѵ�.
		 *                    |�⺻ �׸��� ��� ���� |   �׸� �׸���
		 * */
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		
	}
}