package my.day19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
/* Swing의 JFrame, JApplet, JInternalFrame 등은 
 * 컨텐트페인을 컴포넌트를 부착해야 함.
 */

public class MyPaintGui extends JFrame {
	JPanel p;
	JToolBar bar;
	Canvas can; // 도화지 역할을 하는 컴포넌트
	JRadioButton ra1, ra2, ra3;
	JButton b1,b2,b3;
	ButtonGroup group = new ButtonGroup();
	
	public MyPaintGui() {
		super("::MyPaintGui::");
		Container cp = this.getContentPane(); //내용물을 부착하는 패널얻기
		bar = new JToolBar();
		p = new JPanel();
		cp.add(bar, "North");
		cp.add(p, "Center");
		
		b1 = new JButton(new ImageIcon("images/Y.png"));
		b2 = new JButton(new ImageIcon("images/W.png"));
		b3 = new JButton(new ImageIcon("images/G.png"));
		
		
		ra1 = new JRadioButton("Red");
		ra2 = new JRadioButton("Green", true);
		ra3 = new JRadioButton("Blue");
		
		group.add(ra1);group.add(ra2);group.add(ra3);
		
		bar.add(b1);bar.add(b2);bar.add(b3);
		bar.add(ra1);bar.add(ra2);bar.add(ra3);
		
		can = new Canvas(); 
		// 캔버스는 반드시 사이즈를 주고, 배경색을 지정해야 한다.
		p.add(can);
		can.setSize(300, 300);
		can.setBackground(Color.WHITE);
		
		MyHandler handler = new MyHandler();
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		
		ra1.addItemListener(handler);
		ra2.addItemListener(handler);
		ra3.addItemListener(handler);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창닫기
	}
	
	// 이벤트 핸들러를 inner클래스로 구현하자.
	class MyHandler implements ActionListener, ItemListener{	
		@Override
		public void actionPerformed(ActionEvent e) {
			Object o = e.getSource();
			/*String cmd = e.getActionCommand();
			setTitle(cmd);*/
			
			if(o==b1) {
				can.setBackground(Color.YELLOW);
			}else if(o==b2) {
				can.setBackground(Color.WHITE);
			}else if(o==b3) {
				can.setBackground(Color.LIGHT_GRAY);
			}
		}
		
		Color cr = Color.WHITE;
		// 라디오버튼, 체크박스, List 등에 대한 이벤트 처리 메소드
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object o = e.getSource();

			Object obj = e.getItem();
			// ActionEvent의 getActionCommand()와 유사한 메소드
			JRadioButton cmd = (JRadioButton)obj;
			setTitle(cmd.getActionCommand()+"버튼을 눌렀군요");
			
			if(o==ra1) {
				cr = Color.red;
			}else if(o==ra2) {
				cr = Color.green;
			}else if(o==ra3) {
				cr = Color.blue;
			}
			p.setBackground(cr);
		}
	}
	
	public static void main(String[] args) {
		MyPaintGui my = new MyPaintGui();
		my.setSize(500,500);
		my.setVisible(true);
	}
}
