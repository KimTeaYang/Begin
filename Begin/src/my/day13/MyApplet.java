package my.day13;

import java.applet.*;
import java.awt.*;

/* 애플릿 작성 규칙
 *  1. class 앞에 반드시 public을 붙인다.
 *  2. java.applet.Applet 클래스를 상속(extends)받는다.
 *  3. main()메소드는 필요없다.
 *   - 대신 몇 가지 내장 메소드를 갖는다.
 *    ex) init(), paint(), start(), stop(), destroy() ...
 *  4. 애플릿을 포함할 html문서(웹문서)가 필요하다.
 *  5. 웹브라우저를 통해 실행시킨다.
 *   - 단, 개발자의 경우 applietviewer를 통해 실행 가능
 * */
public class MyApplet extends Applet {
	
	Button b1, b2, b3; //component
	Label lb1, lb2, lb3;
	TextField tf1, tf2, tf3;
	Checkbox c1, c2, c3;
	Checkbox cm, cf;
	TextArea ta1, ta2;
	Choice ch;
	List lst1, lst2;
	CheckboxGroup gr;
	
	public void init() {
		this.setSize(500, 500); // 애플릿의 사이즈 지정 w, h
		b1 = new Button(); // 컴포넌트
		b2 = new Button("버튼1");
		b3 = new Button("버튼2");
		// 애플릿 => 컨테이너
		// 컨테이너에 컴포넌트를 부착해야 모양이 나옴
		this.add(b1);
		add(b2);
		add(b3);
		
		lb1 = new Label("이름:");  // 기본값 : 왼쪽 정렬
		// Label(String text, int alignment)
		lb2 = new Label("아이디:", Label.CENTER);
		lb3 = new Label("비밀번호:", Label.RIGHT);
		add(lb1);
		add(lb2);
		add(lb3);
		lb1.setBackground(Color.yellow); // 배경색
		lb1.setForeground(Color.blue); // 글자색
		lb2.setBackground(Color.orange);
		lb3.setBackground(Color.cyan);
		
		tf1 = new TextField();
		tf2 = new TextField(20);
		tf3 = new TextField("네이버를 검색해봐", 40);
		add(tf1);
		add(tf2);
		add(tf3);
		
		c1 = new Checkbox("독서", true);
		c2 = new Checkbox("음악감상");
		c3 = new Checkbox("운동");
		add(c1);
		add(c2);
		add(c3);
		gr = new CheckboxGroup();
		cm = new Checkbox("M", true, gr);
		cf = new Checkbox("F", false, gr);
		add(cm);
		add(cf);
		
		ta1 = new TextArea(7, 20);
		ta2 = new TextArea("", 7, 20, TextArea.SCROLLBARS_VERTICAL_ONLY);
		add(ta1);
		add(ta2);
		
		ch = new Choice();
		ch.add("011");
		ch.add("010");
		ch.add("019");
		add(ch);
		
		lst1 = new List();
		lst1.add("Java");
		lst1.add("JSP");
		lst1.add("HTML");
		lst1.add("CSS");
		add(lst1);
		
		lst2 = new List(4, true); // 다중 선택 가능(true)
		lst2.add("JSP");
		lst2.add("Servlet");
		lst2.add("Oracle");
		lst2.add("Spring");
		lst2.add("Android");
		add(lst2);
		
	}
}