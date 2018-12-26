package my.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ProjectEventSubFrame1 extends JFrame{
	JLabel lb;
	JPanel pImg;
	JTextField tfAnswer;
	CardLayout card;
	String[] sImg = {"images/¾û¶×ÇÑ »ç¶÷.png","images/¹ö¸£Àå¸Ó¸®.png",
			"images/byc.png"};
	int count;
	
	public ProjectEventSubFrame1() {
		super("::ProjectEventSubFrame1::");
		Container cp = getContentPane();
		count = (int)(Math.random()*3);
		
		lb = new JLabel("³Í¼¾½º ÄûÁî¸¦ ¸ÂÃçÁÖ¼¼¿ä",JLabel.CENTER);
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