package my.project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class LoginSub extends JFrame {
	JTabbedPane jLogin;
	JPanel pLogin, pId_get, pPwd_get;
	/////////////////////////////////
	JPanel pLogin_p;
	JLabel lb_Id, lb_Pwd;
	JTextField tf_Id;
	JPasswordField tf_Pwd;
	JButton b_Login;
	/////////////////////////////////
	JLabel lb_Id_get_Tel;
	JTextField tf_Id_get_Tel;
	JButton b_Id_get_Tel;
	/////////////////////////////////
	JPanel pPwd_get_p;
	JLabel lb_Pwd_get_Id, lb_Pwd_get_Tel;
	JTextField tf_Pwd_get_Id, tf_Pwd_get_Tel;
	JButton b_Pwd_get;
	
	public void setTab(int index) {
		jLogin.setSelectedIndex(index);
	}
	
	public LoginSub() {
		super("::LoginSub::");
		Container cp = this.getContentPane();
		jLogin = new JTabbedPane();
		
		cp.add(jLogin);
		pLogin = new JPanel();
		pId_get = new JPanel();
		pPwd_get = new JPanel();
		jLogin.add("Login", pLogin);
		jLogin.add("Id_get", pId_get);
		jLogin.add("Pwd_get", pPwd_get);
		//////////////////////////////////////////
		
		pLogin.setLayout(new BorderLayout());
		pLogin_p = new JPanel(new GridLayout(2,2));
		lb_Id = new JLabel("Id", JLabel.CENTER);
		lb_Pwd = new JLabel("Pwd", JLabel.CENTER);
		tf_Id = new JTextField();
		tf_Pwd = new JPasswordField();
		b_Login = new JButton("Login");
		
		pLogin.add(pLogin_p);
		pLogin.add(b_Login,"South");
		
		pLogin_p.add(lb_Id);
		pLogin_p.add(lb_Pwd);
		pLogin_p.add(tf_Id);
		pLogin_p.add(tf_Pwd);
	
		//////////////////////////////////////////// pLogin
		
		pId_get.setLayout(new BorderLayout());
		lb_Id_get_Tel = new JLabel("전화번호를 입력하세요",JLabel.CENTER);
		tf_Id_get_Tel = new JTextField();
		b_Id_get_Tel = new JButton("아이디 찾기");
		pId_get.add(lb_Id_get_Tel,"North");
		pId_get.add(tf_Id_get_Tel,"Center");
		pId_get.add(b_Id_get_Tel, "South");
		
		/////////////////////////////////////////// pId_get
		
		pPwd_get.setLayout(new BorderLayout());
		pPwd_get_p = new JPanel(new GridLayout(2,2));
		lb_Pwd_get_Id = new JLabel("Id 입력",JLabel.CENTER);
		lb_Pwd_get_Tel = new JLabel("Tel 입력",JLabel.CENTER);
		tf_Pwd_get_Id = new JTextField();
		tf_Pwd_get_Tel = new JTextField();
		b_Pwd_get = new JButton("비밀번호 찾기");
		
		pPwd_get.add(pPwd_get_p,"Center");
		pPwd_get.add(b_Pwd_get,"South");
		
		pPwd_get_p.add(lb_Pwd_get_Id);
		pPwd_get_p.add(lb_Pwd_get_Tel);
		pPwd_get_p.add(tf_Pwd_get_Id);
		pPwd_get_p.add(tf_Pwd_get_Tel);
	}
}
