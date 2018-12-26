package my.day18;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class SubFrame extends JFrame {
	JTextArea ta;
	JButton btClose;
	
	public SubFrame() {
		super("::SubFrame::");
		Container cp = getContentPane();
		ta = new JTextArea();
		// ���������� ��ũ�ѹٸ� ������ JScrollPane�� �̿��ؼ� �ٿ��� �Ѵ�.
		JScrollPane sp = new JScrollPane(ta);
		cp.add(sp, "Center");
		
		ta.setEditable(false); // ta�� ���� ���ϵ���
		sp.setBorder(new LineBorder(Color.blue,3));
		
		btClose = new JButton("Close", 
				new ImageIcon("images/icon5.png"));
		cp.add(btClose, "South");
	}
}
