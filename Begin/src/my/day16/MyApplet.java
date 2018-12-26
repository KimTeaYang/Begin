package my.day16;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*; //[1]

/* #이벤트 처리 방법------------------------------------------------
 *  1. Event Source : 이벤트가 발생되는 근원지. 
 *  				  주로 컴포넌트나 컨테이너가 이벤트 소스가 됨.
 *  				  ex) Button
 *  2. Event : 발생된 이벤트. JVM이 발생시킨다.
 *  		   이벤트 소스마다 발생되는 이벤트가 다르다.
 *             ex) ActionEvent
 *  3. EventHandler : 이벤트를 처리하는 클래스
 *  				  XXXListener라는 인터페이스를 상속받아 구현
 *  				  ex) ActionListener
 *  				  XXXListener에는 추상메소드가 있음. 이를 구현해야 함.
 * ------------------------------------------------------------
 * #이벤트 처리 절차
 *  [1] import java.awt.event.*;
 *  [2] XXXListener인터페이스를 상속받는 이벤트 핸들러를 구현
 *  [3] [2]번이 갖는 추상메소드를 재정의(일단 빈 블럭으로 오버라이드)
 *  [4] 이벤트 소스에 addXXXListener()메소드를 부착
 *  [5] [3]번에서 재정의한 메소드에 이벤트 처리 코드 구현
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
		// 이벤트가 발생된 객체(이벤트 소스)에 대한 참조값을 반환
		String cmd = e.getActionCommand();
		// 이벤트소스가 가지는 문자열을 반환
		this.showStatus(cmd+"버튼을 눌렀군요!!");
		// 애플릿의 상태바에 문자열을 출력해준다.
		
		if(obj==b1) {
			setBackground(Color.red); //[5]
		}else if(obj==b2){
			setBackground(Color.green);
		}else if(obj==b3) {
			setBackground(Color.blue);
		}
	}
}