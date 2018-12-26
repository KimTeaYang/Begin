package my.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JoinSub extends JFrame {
	
	JLabel lb_Id_set, lb_Pwd_set,lb_Tel_set,lb_text;
	JTextField tf_Id_set, tf_Pwd_set,tf_Tel_set;
	JPanel pCenter,pNorth,pSouth;
	JButton bt_set;
	
	public JoinSub() {
		super("::JoinSub::");
		Container cp = this.getContentPane();
		
		pCenter=new JPanel() {
			@Override
			public Insets getInsets() {
				return new Insets(0,20,0,80);
				//��,��,��,�� �������� �����ִ°�
			}
		};
		pCenter.setLayout(new GridLayout(3,2));
		pNorth=new JPanel();
		pSouth=new JPanel();
		
		cp.add(pCenter,"Center");
		cp.add(pNorth,"North");
		cp.add(pSouth,"South");
		
		lb_Id_set=new JLabel("���̵� ", JLabel.CENTER);
		lb_Pwd_set=new JLabel("��й�ȣ ", JLabel.CENTER);
		lb_Tel_set=new JLabel("��ȭ��ȣ", JLabel.CENTER);
		lb_text=new JLabel("ȸ������ â", JLabel.CENTER);
		
		tf_Id_set=new JTextField(15);
		tf_Pwd_set=new JTextField(15);
		tf_Tel_set=new JTextField(15);

		pNorth.setBorder(new LineBorder(Color.black,2));
		// �ʵ带 ���� ���ϰ� �ϱ����Ѱ�
		
		pCenter.add(lb_Id_set);
		pCenter.add(tf_Id_set);
		pCenter.add(lb_Pwd_set);
		pCenter.add(tf_Pwd_set);
		pCenter.add(lb_Tel_set);
		pCenter.add(tf_Tel_set);
		pNorth.add(lb_text);
		
		bt_set = new JButton("ȸ������");
		
		pSouth.add(bt_set);
	}

}