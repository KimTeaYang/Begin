package my.day13;

import java.applet.*;
import java.awt.*;

/* ���ø� �ۼ� ��Ģ
 *  1. class �տ� �ݵ�� public�� ���δ�.
 *  2. java.applet.Applet Ŭ������ ���(extends)�޴´�.
 *  3. main()�޼ҵ�� �ʿ����.
 *   - ��� �� ���� ���� �޼ҵ带 ���´�.
 *    ex) init(), paint(), start(), stop(), destroy() ...
 *  4. ���ø��� ������ html����(������)�� �ʿ��ϴ�.
 *  5. ���������� ���� �����Ų��.
 *   - ��, �������� ��� applietviewer�� ���� ���� ����
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
		this.setSize(500, 500); // ���ø��� ������ ���� w, h
		b1 = new Button(); // ������Ʈ
		b2 = new Button("��ư1");
		b3 = new Button("��ư2");
		// ���ø� => �����̳�
		// �����̳ʿ� ������Ʈ�� �����ؾ� ����� ����
		this.add(b1);
		add(b2);
		add(b3);
		
		lb1 = new Label("�̸�:");  // �⺻�� : ���� ����
		// Label(String text, int alignment)
		lb2 = new Label("���̵�:", Label.CENTER);
		lb3 = new Label("��й�ȣ:", Label.RIGHT);
		add(lb1);
		add(lb2);
		add(lb3);
		lb1.setBackground(Color.yellow); // ����
		lb1.setForeground(Color.blue); // ���ڻ�
		lb2.setBackground(Color.orange);
		lb3.setBackground(Color.cyan);
		
		tf1 = new TextField();
		tf2 = new TextField(20);
		tf3 = new TextField("���̹��� �˻��غ�", 40);
		add(tf1);
		add(tf2);
		add(tf3);
		
		c1 = new Checkbox("����", true);
		c2 = new Checkbox("���ǰ���");
		c3 = new Checkbox("�");
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
		
		lst2 = new List(4, true); // ���� ���� ����(true)
		lst2.add("JSP");
		lst2.add("Servlet");
		lst2.add("Oracle");
		lst2.add("Spring");
		lst2.add("Android");
		add(lst2);
		
	}
}