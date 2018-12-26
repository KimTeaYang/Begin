package my.day19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
/* Swing�� JFrame, JApplet, JInternalFrame ���� 
 * ����Ʈ������ ������Ʈ�� �����ؾ� ��.
 */

public class MyPaintGui extends JFrame {
	JPanel p;
	JToolBar bar;
	Canvas can; // ��ȭ�� ������ �ϴ� ������Ʈ
	JRadioButton ra1, ra2, ra3;
	JButton b1,b2,b3;
	ButtonGroup group = new ButtonGroup();
	
	public MyPaintGui() {
		super("::MyPaintGui::");
		Container cp = this.getContentPane(); //���빰�� �����ϴ� �гξ��
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
		// ĵ������ �ݵ�� ����� �ְ�, ������ �����ؾ� �Ѵ�.
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
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //â�ݱ�
	}
	
	// �̺�Ʈ �ڵ鷯�� innerŬ������ ��������.
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
		// ������ư, üũ�ڽ�, List � ���� �̺�Ʈ ó�� �޼ҵ�
		@Override
		public void itemStateChanged(ItemEvent e) {
			Object o = e.getSource();

			Object obj = e.getItem();
			// ActionEvent�� getActionCommand()�� ������ �޼ҵ�
			JRadioButton cmd = (JRadioButton)obj;
			setTitle(cmd.getActionCommand()+"��ư�� ��������");
			
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
