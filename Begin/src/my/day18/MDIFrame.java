package my.day18;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
// Frame => awt(abstract window toolkit)
// JFrame => swing
public class MDIFrame extends JFrame implements ActionListener{
	
	JTextField tf;
	JButton bt;
	JPanel p;
	JLabel lb;
	ImageIcon icon1,icon2,icon3,icon4,icon5;
	SubFrame sf = new SubFrame();
	
	public MDIFrame() {
		super("::MDIFrame::");
		/* Swing JFrame�� ������Ʈ�� ���� �����ϸ� �ȵǰ�, 
		 * Container�� ���ͼ� �ش� �����̳ʿ� �����ؾ� ��
		 *  => ����Ʈ����
		 */
		Container cp = this.getContentPane(); 
		//BorderLayout�� ����Ʈ
		icon1 = new ImageIcon("images/icon1.png");
		icon2 = new ImageIcon("images/icon2.png");
		icon3 = new ImageIcon("images/icon3.png");
		icon4 = new ImageIcon("images/icon4.png");
		icon5 = new ImageIcon("images/icon5.png");
		
		p = new JPanel();
		p.setLayout(new BorderLayout());
		cp.add(p, "North");
		
		lb = new JLabel(icon4, JLabel.CENTER);
		cp.add(lb, "Center");
		
		tf = new JTextField(20);
		p.add(tf, "Center");
		bt = new JButton("Open", icon5);
		p.add(bt, "East");
		bt.setHorizontalTextPosition(JButton.CENTER);
		bt.setVerticalTextPosition(JButton.TOP);
		// ��ư �ؽ�Ʈ�� ��ġ ����(ž �߾ӿ� ��ġ)
		bt.setMnemonic('O'); // ����Ű ���� Alt+O
		bt.setToolTipText("�̰� ǳ�� �����̿���~");
		bt.setPressedIcon(icon2); // ���콺 Ŭ���� ������ ����
		bt.setRolloverIcon(icon3); // ���콺 ������ ������ ����
		
		tf.setBorder(new TitledBorder("������ �Է��ϼ���"));
		
		bt.addActionListener(this);
		tf.addActionListener(this);
		sf.btClose.addActionListener(this);
		
		// â�ݱ� ó�� 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		MDIFrame my = new MDIFrame();
		my.setSize(500, 500);
		my.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o==bt) {
			sf.setSize(500, 500);
			sf.setLocation(this.getWidth(), 0);
			sf.setVisible(true);
		}else if(o==tf) {
			try {
				int a = Integer.parseInt(tf.getText());
				sf.ta.append(a+"\n");
				tf.setText("");
			}catch(NumberFormatException e1){
				sf.ta.append("������ �ƴϿ���!\n");
				tf.setText("");
			}
		}else if(o==sf.btClose) {
			sf.setVisible(false);
			sf.ta.setText("");
			sf.dispose();
		}
	}
}