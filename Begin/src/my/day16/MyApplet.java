package my.day16;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*; //[1]

/* #�̺�Ʈ ó�� ���------------------------------------------------
 *  1. Event Source : �̺�Ʈ�� �߻��Ǵ� �ٿ���. 
 *  				  �ַ� ������Ʈ�� �����̳ʰ� �̺�Ʈ �ҽ��� ��.
 *  				  ex) Button
 *  2. Event : �߻��� �̺�Ʈ. JVM�� �߻���Ų��.
 *  		   �̺�Ʈ �ҽ����� �߻��Ǵ� �̺�Ʈ�� �ٸ���.
 *             ex) ActionEvent
 *  3. EventHandler : �̺�Ʈ�� ó���ϴ� Ŭ����
 *  				  XXXListener��� �������̽��� ��ӹ޾� ����
 *  				  ex) ActionListener
 *  				  XXXListener���� �߻�޼ҵ尡 ����. �̸� �����ؾ� ��.
 * ------------------------------------------------------------
 * #�̺�Ʈ ó�� ����
 *  [1] import java.awt.event.*;
 *  [2] XXXListener�������̽��� ��ӹ޴� �̺�Ʈ �ڵ鷯�� ����
 *  [3] [2]���� ���� �߻�޼ҵ带 ������(�ϴ� �� ������ �������̵�)
 *  [4] �̺�Ʈ �ҽ��� addXXXListener()�޼ҵ带 ����
 *  [5] [3]������ �������� �޼ҵ忡 �̺�Ʈ ó�� �ڵ� ����
 * */

public class MyApplet extends Applet implements ActionListener{//[2]
	Button b1, b2, b3;
	
	public void init() {
		setSize(400,400);
		
		b1 = new Button("Red");
		b2 = new Button("Green");
		b3 = new Button("Blue");
		add(b1);add(b2);add(b3);
		b1.addActionListener(this); //[4]
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //[3]
		Object obj = e.getSource(); 
		// �̺�Ʈ�� �߻��� ��ü(�̺�Ʈ �ҽ�)�� ���� �������� ��ȯ
		String cmd = e.getActionCommand();
		// �̺�Ʈ�ҽ��� ������ ���ڿ��� ��ȯ
		this.showStatus(cmd+"��ư�� ��������!!");
		// ���ø��� ���¹ٿ� ���ڿ��� ������ش�.
		
		if(obj==b1) {
			setBackground(Color.red); //[5]
		}else if(obj==b2){
			setBackground(Color.green);
		}else if(obj==b3) {
			setBackground(Color.blue);
		}
	}
}