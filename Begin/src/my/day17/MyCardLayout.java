package my.day17;

import java.awt.*;
import java.awt.event.*;
/* Application : �������� ���� ���α׷�
 *  window --- Frame   (BorderLayout�� ����Ʈ)
 *           +-Dialog
 * */

public class MyCardLayout extends Frame implements ActionListener{
	Button bt, btExit;
	Panel p1, p2;
	TextField tfId, tfPwd;
	CardLayout card; // ī�带 ���ĳ����� ��ġ�ϴ� ���̾ƿ�
	Label lb;
	
	public MyCardLayout() {
		super("::MyCard App::");
		// Frame�� �⺻ ���̾ƿ��� BorderLayout
		card = new CardLayout();
		setLayout(card); // ī�� ���̾ƿ����� ����
		
		p1 = new Panel();
		p1.setBackground(Color.yellow);
		
		p2 = new Panel(new BorderLayout());
		p2.setBackground(new Color(225,125,125)); // r,g,b
		p2.add(lb=new Label("ȯ���մϴ�.", Label.CENTER));
		p2.add(btExit=new Button("Exit"), "South");
		
		p1.add(new Label("ID"));
		p1.add(tfId=new TextField(10));
		
		p1.add(new Label("PWD"));
		p1.add(tfPwd=new TextField(10));
		tfPwd.setEchoChar('*');
		
		bt = new Button("Login");
		p1.add(bt);
		
		add(p1, "loginPanel"); // ������ �̸��� ���ڿ��� ����
		add(p2, "chatPanel");
		
		bt.addActionListener(this);
		btExit.addActionListener(this);
	}
	
	public static void main(String[] args) {
		MyCardLayout mc = new MyCardLayout();
		//window �迭�� �ݵ�� ����� �ְ�, setVisible(true)�� �ؾ� Ȯ�� ����
		mc.setSize(400, 400);
		mc.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if(o==bt) {
			p1.setBackground(Color.CYAN);
			String uid = tfId.getText();
			if(uid==null||uid.equals("")) {
				setTitle("���̵� �Է��ؾ� �ؿ�");
				tfId.requestFocus();
				return;
			}
			lb.setText(uid+"�� ȯ���մϴ�");
			lb.setFont(new Font("serif", Font.BOLD, 24));
			lb.setForeground(Color.WHITE);
			
			card.show(this, "chatPanel");
		}else if(o==btExit) {
			//setVisible(false);
			System.exit(0);
		}
	}
}