package my.day17;

import java.awt.*;
import java.awt.event.*;
/* Application : 독립적인 응용 프로그램
 *  window --- Frame   (BorderLayout이 디폴트)
 *           +-Dialog
 * */

public class MyCardLayout extends Frame implements ActionListener{
	Button bt, btExit;
	Panel p1, p2;
	TextField tfId, tfPwd;
	CardLayout card; // 카드를 겹쳐놓듯이 배치하는 레이아웃
	Label lb;
	
	public MyCardLayout() {
		super("::MyCard App::");
		// Frame의 기본 레이아웃이 BorderLayout
		card = new CardLayout();
		setLayout(card); // 카드 레이아웃으로 설정
		
		p1 = new Panel();
		p1.setBackground(Color.yellow);
		
		p2 = new Panel(new BorderLayout());
		p2.setBackground(new Color(225,125,125)); // r,g,b
		p2.add(lb=new Label("환영합니다.", Label.CENTER));
		p2.add(btExit=new Button("Exit"), "South");
		
		p1.add(new Label("ID"));
		p1.add(tfId=new TextField(10));
		
		p1.add(new Label("PWD"));
		p1.add(tfPwd=new TextField(10));
		tfPwd.setEchoChar('*');
		
		bt = new Button("Login");
		p1.add(bt);
		
		add(p1, "loginPanel"); // 참조할 이름을 문자열로 저장
		add(p2, "chatPanel");
		
		bt.addActionListener(this);
		btExit.addActionListener(this);
	}
	
	public static void main(String[] args) {
		MyCardLayout mc = new MyCardLayout();
		//window 계열은 반드시 사이즈를 주고, setVisible(true)를 해야 확인 가능
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
				setTitle("아이디를 입력해야 해요");
				tfId.requestFocus();
				return;
			}
			lb.setText(uid+"님 환영합니다");
			lb.setFont(new Font("serif", Font.BOLD, 24));
			lb.setForeground(Color.WHITE);
			
			card.show(this, "chatPanel");
		}else if(o==btExit) {
			//setVisible(false);
			System.exit(0);
		}
	}
}