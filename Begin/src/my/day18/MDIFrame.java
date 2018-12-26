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
		/* Swing JFrame은 컴포넌트를 직접 부착하면 안되고, 
		 * Container를 얻어와서 해당 컨테이너에 부착해야 함
		 *  => 컨텐트패인
		 */
		Container cp = this.getContentPane(); 
		//BorderLayout이 디폴트
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
		// 버튼 텍스트의 위치 지정(탑 중앙에 위치)
		bt.setMnemonic('O'); // 단축키 지정 Alt+O
		bt.setToolTipText("이건 풍선 도움말이에요~");
		bt.setPressedIcon(icon2); // 마우스 클릭시 아이콘 설정
		bt.setRolloverIcon(icon3); // 마우스 오버시 아이콘 설정
		
		tf.setBorder(new TitledBorder("정수를 입력하세요"));
		
		bt.addActionListener(this);
		tf.addActionListener(this);
		sf.btClose.addActionListener(this);
		
		// 창닫기 처리 
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
				sf.ta.append("정수가 아니에요!\n");
				tf.setText("");
			}
		}else if(o==sf.btClose) {
			sf.setVisible(false);
			sf.ta.setText("");
			sf.dispose();
		}
	}
}