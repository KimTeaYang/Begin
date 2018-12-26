package my.day22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;
/* JFC (Java Foundation Class) : Swing
 *  MVC���� (������ ����)
 *   - Model : ������(�迭, ����...�ڷᱸ��)�� ������ �ִ� Ŭ����
 *      XXXModel 
 *       ex) DefaultListModel, DefaultComboBoxModel,
 *           DefaultTableModel..
 *   - View : UI�� ����ϴ� �κ�. �ַ� ������Ʈ, �����̳� ..
 *       ex) JButton, JList, JComboBox, JTable..    
 *   - Controller : UI�� Model�� �߰����� �����ϴ� ������ ����
 *       ex) XXXRenderer, XXXEditor
 * */

public class MyJListDemo extends JFrame {
	
	JPanel p = new JPanel();
	JList<String> lst1, lst2;
	JComboBox<String> comb1, comb2; 
	DefaultListModel<String> model1, model2; //Model (�����͸� ���´�)
	String[] data = {"Windows","Linux","Mac"}; // ������
	JButton b1;
	Vector<String> userV = new Vector<>(5,3);
	int cnt=0;
	
	public MyJListDemo() {
		super("::MyJListDemo::");
		Container cp = this.getContentPane();
		cp.add(p, "Center");
		p.setLayout(new GridLayout(1,0)); // ���� 1������ ����, ���� ����
		
		lst1 = new JList<>(); //View
		p.add(new JScrollPane(lst1));
		
		model1 = new DefaultListModel<>(); // ���� �����͸� ���´�.
		for(String str:data) {
			model1.addElement(str);
		}
		
		lst1.setModel(model1); //View�� Model�� ����
		
		
		
		comb1 = new JComboBox<>(); // View
		DefaultComboBoxModel<String> cm 
			= new DefaultComboBoxModel<>(data); // Model
		JPanel p1 = new JPanel();
		p1.add(comb1);
		p.add(p1);
		comb1.setModel(cm); // View�� Model�� ����
		
		
		comb2 = new JComboBox<>(userV);
		p1.add(comb2);
		
		
		b1 = new JButton("��ȭ ����");
		p1.add(b1);
		
		lst2 = new JList<>(userV);
		// JList�����ڿ� userV���͸� �־��ָ� ������ �ȿ��� �˾Ƽ�
		// DefaultListModel�� ��������
		p.add(new JScrollPane(lst2));
		lst2.setBorder(new TitledBorder("��ȭ�� ������"));
		
		b1.setMnemonic('C');
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==b1) {
					String uid=JOptionPane.showInputDialog("�����ڸ�");
					if(uid==null||uid.trim().equals("")) {
						return;
					}
					userV.add(uid); // ������ ����
					//������ ������ �Ͼ����, View������ ���� �ľ����� ����
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