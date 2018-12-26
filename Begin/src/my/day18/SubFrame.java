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
		// 스윙에서는 스크롤바를 별도로 JScrollPane을 이용해서 붙여야 한다.
		JScrollPane sp = new JScrollPane(ta);
		cp.add(sp, "Center");
		
		ta.setEditable(false); // ta를 편집 못하도록
		sp.setBorder(new LineBorder(Color.blue,3));
		
		btClose = new JButton("Close", 
				new ImageIcon("images/icon5.png"));
		cp.add(btClose, "South");
	}
}
