package my.day22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;
/* JFC (Java Foundation Class) : Swing
 *  MVC패턴 (디자인 패턴)
 *   - Model : 데이터(배열, 벡터...자료구조)를 가지고 있는 클래스
 *      XXXModel 
 *       ex) DefaultListModel, DefaultComboBoxModel,
 *           DefaultTableModel..
 *   - View : UI를 담당하는 부분. 주로 컴포넌트, 컨테이너 ..
 *       ex) JButton, JList, JComboBox, JTable..    
 *   - Controller : UI와 Model의 중간에서 제어하는 역할을 수행
 *       ex) XXXRenderer, XXXEditor
 * */

public class MyJListDemo extends JFrame {
	
	JPanel p = new JPanel();
	JList<String> lst1, lst2;
	JComboBox<String> comb1, comb2; 
	DefaultListModel<String> model1, model2; //Model (데이터를 갖는다)
	String[] data = {"Windows","Linux","Mac"}; // 데이터
	JButton b1;
	Vector<String> userV = new Vector<>(5,3);
	int cnt=0;
	
	public MyJListDemo() {
		super("::MyJListDemo::");
		Container cp = this.getContentPane();
		cp.add(p, "Center");
		p.setLayout(new GridLayout(1,0)); // 행은 1행으로 고정, 열은 가변
		
		lst1 = new JList<>(); //View
		p.add(new JScrollPane(lst1));
		
		model1 = new DefaultListModel<>(); // 모델은 데이터를 갖는다.
		for(String str:data) {
			model1.addElement(str);
		}
		
		lst1.setModel(model1); //View와 Model을 연결
		
		
		
		comb1 = new JComboBox<>(); // View
		DefaultComboBoxModel<String> cm 
			= new DefaultComboBoxModel<>(data); // Model
		JPanel p1 = new JPanel();
		p1.add(comb1);
		p.add(p1);
		comb1.setModel(cm); // View와 Model을 연결
		
		
		comb2 = new JComboBox<>(userV);
		p1.add(comb2);
		
		
		b1 = new JButton("대화 참여");
		p1.add(b1);
		
		lst2 = new JList<>(userV);
		// JList생성자에 userV벡터를 넣어주면 생성자 안에서 알아서
		// DefaultListModel에 저장해줌
		p.add(new JScrollPane(lst2));
		lst2.setBorder(new TitledBorder("대화방 참여자"));
		
		b1.setMnemonic('C');
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1) {
					String uid=JOptionPane.showInputDialog("참여자명");
					if(uid==null||uid.trim().equals("")) {
						return;
					}
					userV.add(uid); // 데이터 저장
					//데이터 변경이 일어났으나, View에서는 아직 파악하지 못함
					lst2.updateUI();
					comb2.updateUI();
				}
			}
		});
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyJListDemo();
	}
	
}