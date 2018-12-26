package my.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ProjectEventSubFrame extends JFrame{
	JLabel lb;
	JPanel pImg;
	JTextField tfAnswer;
	CardLayout card;
	String[] sImg = {"images/�Ƿη�.png","images/����.png",
			"images/��Ʈ��.png"};
	int count;
	
	public ProjectEventSubFrame() {
		super("::ProjectEventSubFrame::");
		Container cp = getContentPane();
		count = (int)(Math.random()*3);
		
		lb = new JLabel("�׸��� �����ִ� ĳ���͸� �����ּ���",JLabel.CENTER);
		tfAnswer = new JTextField();
		pImg = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				Dimension d = getSize();
				ImageIcon image = new ImageIcon(sImg[count]);
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		
		cp.add(lb,"North");
		cp.add(pImg,"Center");
		cp.add(tfAnswer,"South");
	}
}