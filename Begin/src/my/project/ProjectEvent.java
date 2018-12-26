package my.project;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.AbstractTableModel;

public class ProjectEvent extends JFrame {
	ProjectEvent p=this;
	JPanel pCenter, pNorth, pWest;
	///////////////////////////////////////////////////////
	JPanel pCp,pCp1,pCp2,pCp3;
	JButton btCE;
	CardLayout card;
	String []img = {"img01","img02","img03"};
	int imgCount = 0;
	ProjectEventSubFrame pesf = new ProjectEventSubFrame();
	ProjectEventSubFrame1 pesf1 = new ProjectEventSubFrame1();
	int pCenter_discount=0;
	/////////////////////////////////////////////////////// pCenter
	JButton btLogin, btJoin, btBasket, btLogout;
	JPanel pNp,pNpp;
	JLabel pNp_lb;
	LoginSub loginSub = new LoginSub();
	JoinSub joinSub = new JoinSub();
	Object[][] data = new Object[12][4];
	BasketSub basketSub = new BasketSub(this);
	JTextField pNorth_tf;
	/////////////////////////////////////////////////////// pNorth
	JMenuBar bar;
	JMenu mpClothes, mpFood, mpLeisure;
	JMenuItem mpClothes_Item1, mpClothes_Item2, mpClothes_Item3;
	JMenuItem mpFood_Item1, mpFood_Item2, mpFood_Item3;
	JMenuItem mpLeisure_Item1, mpLeisure_Item2, mpLeisure_Item3;
	MenuBarClothes menuBarClothes = new MenuBarClothes();
	MenuBarFood menuBarFood = new MenuBarFood();
	MenuBarLeisure menuBarLeisure = new MenuBarLeisure();
	//////////////////////////////////////////////////// pWest
	ProductsArray products_Arr = new ProductsArray();
	ArrayList<ProductsInfo> bascket_Arr = new ArrayList<>();
	int products_Sum=0;
	///////////////////////////////////////////////// Bascket
	
	ArrayList<UserInfo> userArr = new ArrayList<>();
	UserInfo userInfo;
	
	public ProjectEvent() {
		super("::ProjectEvent::");
		Container cp = this.getContentPane();
		pCenter = new JPanel() {
			@Override
			public Insets getInsets() {
				return new Insets(20,20,20,20);
			}
		};
		pCenter.setBackground(Color.white);
		pNorth = new JPanel() {
			@Override
			public Insets getInsets() {
				return new Insets(10,0,0,0);
			}
		};
		pWest = new JPanel();
		cp.add(pCenter, "Center");
		cp.add(pNorth, "North");
		cp.add(pWest, "West");
		
		userArr.add(new UserInfo("���¾�","123","123"));
		userArr.add(new UserInfo("�ڹ�ö","123","123"));
		userArr.add(new UserInfo("����ȣ","123","123"));
		userArr.add(new UserInfo("����ȯ","123","123"));
		
		/////////////////////////////////////// pNorth
		
		pNorth.setLayout(new BorderLayout());
		pNp = new JPanel(new BorderLayout());
		pNpp = new JPanel();
		pNorth.setBackground(Color.WHITE);
		pNorth.add(pNp,"East");
		pNp.setBackground(Color.WHITE);
		pNpp.setBackground(Color.WHITE);
		btLogin = new JButton("�α���");
		btJoin = new JButton("ȸ������");
		btBasket = new JButton("��ٱ���");
		btLogout = new JButton("�α׾ƿ�");
		pNorth_tf = new JTextField("�˻����ּ���.");
		pNp_lb = new JLabel("�α����� ���ּ���.", JLabel.CENTER);
		
		pNorth.add(pNorth_tf,"Center");
		pNp.add(pNpp, "Center");
		pNp.add(pNp_lb,"South");
		pNpp.add(btLogin);pNpp.add(btLogout);
		pNpp.add(btJoin);pNpp.add(btBasket);
		
		btLogout.setEnabled(false);
		btBasket.setEnabled(false);
		pNorth_tf.setEnabled(false);
		
		pNorth_tf.addActionListener(new ActionListener() {  // ���� �� �˻�â �̺�Ʈ ó��
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<products_Arr.productsArr.size();i++) {
					if(products_Arr.productsArr.get(i).getProducts_Name().equals(pNorth_tf.getText())) {
						switch(i){
							case 0:
							case 1:
								JOptionPane.showMessageDialog(pCenter, "'�Ƿ�>>����Ű'ī�װ��� �ֽ��ϴ�.");
								break;
							case 2:
							case 3:
								JOptionPane.showMessageDialog(pCenter, "'�Ƿ�>>�Ƶ�ٽ�'ī�װ��� �ֽ��ϴ�.");
								break;
							case 4:
							case 5:
								JOptionPane.showMessageDialog(pCenter, "'����>>�Ұ��'ī�װ��� �ֽ��ϴ�.");
								break;
							case 6:
							case 7:
								JOptionPane.showMessageDialog(pCenter, "'����>>��ġ'ī�װ��� �ֽ��ϴ�.");
								break;
							case 8:
							case 9:
								JOptionPane.showMessageDialog(pCenter, "'����>>������'ī�װ��� �ֽ��ϴ�.");
								break;
							case 10:
							case 11:
								JOptionPane.showMessageDialog(pCenter, "'����>>����'ī�װ��� �ֽ��ϴ�.");
								break;
						}
						pNorth_tf.setText("");
					}else if(i+1==products_Arr.productsArr.size()) {
						JOptionPane.showMessageDialog(pCenter, "�ش� ��ǰ�� �����ϴ�.");
					}
				}
			}
		});
		
		pNorth_tf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pNorth_tf.setText("");
			}
		});
		
		pNorth_tf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				pNorth_tf.setText("�˻����ּ���.");
			}
		});
		
		btLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loginSub.setSize(300, 150);
				loginSub.setLocation(p.getWidth(), 0);
				loginSub.setVisible(true);
			}
		});
		
		btJoin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				joinSub.setSize(350,200);
				joinSub.setLocation(p.getWidth(), 0);
				joinSub.setVisible(true);
			}
		});
		
		loginSub.b_Login.addActionListener(new ActionListener() { // loginSub ������ �ȿ� �α��� ��ư �̺�Ʈ ó��
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<userArr.size();i++) {
					if((userArr.get(i).getUser_Id().equals(loginSub.tf_Id.getText()))
							&&(userArr.get(i).getUser_Pwd().equals(loginSub.tf_Pwd.getText()))) { // ���ǹ��� ���̵�� ��й�ȣ�� ��ġ�ϴ���
						JOptionPane.showMessageDialog(loginSub.pLogin,"�α��� ����");
						if(userArr.get(i).getUser_Id().equals("���¾�")||
								userArr.get(i).getUser_Id().equals("�ڹ�ö")||
								userArr.get(i).getUser_Id().equals("����ȣ")||
								userArr.get(i).getUser_Id().equals("����ȯ")) {
							pNp_lb.setText(loginSub.tf_Id.getText()+" �����ڴ� ȯ���մϴ�.");
						}else {
							pNp_lb.setText(loginSub.tf_Id.getText()+" �Ϲ�ȸ���� ȯ���մϴ�.");
						}
						loginSub.tf_Id.setText("");loginSub.tf_Pwd.setText("");
						loginSub.setVisible(false);
						
						btBasket.setEnabled(true);        // �α����� �Ǿ��� �� ��� ��ɵ��� �۵��ϵ���
						btLogout.setEnabled(true);
						pNorth_tf.setEnabled(true);
						mpClothes_Item1.setEnabled(true);
						mpClothes_Item2.setEnabled(true);
						mpFood_Item1.setEnabled(true);
						mpFood_Item2.setEnabled(true);
						mpLeisure_Item1.setEnabled(true);
						mpLeisure_Item2.setEnabled(true);
						btCE.setEnabled(true);	
						
						break;
					}else if((i+1)==userArr.size()){  // �� ������ �������� ���Ҵµ��� ��ġ���� �ʴ´ٸ�
						loginSub.tf_Id.setText("");loginSub.tf_Pwd.setText("");
						JOptionPane.showMessageDialog(loginSub.pLogin,"�α��� ����");
					}
				}
			}
		});
		
		btLogout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<bascket_Arr.size();i++) { // ��ٱ��� �ʱ�ȭ
					for(int j=0;j<4;j++) {
						data[i][j]=null;
					}
				}
				bascket_Arr.clear(); // ��ٱ��� �ʱ�ȸ
				pCenter_discount=0; // ���� ���� �ʱ�ȭ
				pNp_lb.setText("�α����� ���ּ���.");
				btBasket.setEnabled(false);        
				btLogout.setEnabled(false);
				pNorth_tf.setEnabled(false);
				mpClothes_Item1.setEnabled(false);
				mpClothes_Item2.setEnabled(false);
				mpFood_Item1.setEnabled(false);
				mpFood_Item2.setEnabled(false);
				mpLeisure_Item1.setEnabled(false);
				mpLeisure_Item2.setEnabled(false);
				btCE.setEnabled(false);
				
				imgCount = 0;
				card.show(pCp, img[0]);
				
				JOptionPane.showMessageDialog(pCenter, "���������� �α׾ƿ� �Ǿ����ϴ�.");
			}
		});
		
		loginSub.b_Id_get_Tel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<userArr.size();i++) { 
					if(userArr.get(i).getUser_Tel().equals(loginSub.tf_Id_get_Tel.getText())) { // ��ȭ��ȣ�� ��ġ�ϸ� 
						JOptionPane.showMessageDialog(loginSub.pId_get,"ID : "+
								userArr.get(i).getUser_Id()); // ���̵� �����ش�.
						loginSub.tf_Id_get_Tel.setText("");
						loginSub.setTab(0);
						break;
					}else if((i+1)==userArr.size()){
						loginSub.tf_Id_get_Tel.setText("");
						JOptionPane.showMessageDialog(loginSub.pId_get,"���̵� ã�� ����");
					}
				}
			}
		});
		
		loginSub.b_Pwd_get.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i =0;i<userArr.size();i++) {
					if((userArr.get(i).getUser_Id().equals(loginSub.tf_Pwd_get_Id.getText()))
							&&(userArr.get(i).getUser_Tel().equals(loginSub.tf_Pwd_get_Tel.getText()))) { // ���̵� ��ġ�ϰ� ��ȭ��ȣ�� ��ġ�Ѵٸ�
						JOptionPane.showMessageDialog(loginSub.pPwd_get,"Pwd : "+
								userArr.get(i).getUser_Pwd()); // �н����带 �����ش�.
						loginSub.tf_Pwd_get_Id.setText("");
						loginSub.tf_Pwd_get_Tel.setText("");
						loginSub.setTab(0);
						break;
					}else if((i+1)==userArr.size()){
						loginSub.tf_Pwd_get_Id.setText("");
						loginSub.tf_Pwd_get_Tel.setText("");
						JOptionPane.showMessageDialog(loginSub.pPwd_get,"��й�ȣ ã�� ����");
					}
				}
			}
		});
		
		joinSub.bt_set.addActionListener(new ActionListener() { // ȸ������ �κ�
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean flag=true;
				
				if(joinSub.tf_Id_set.getText().equals("")||
						joinSub.tf_Pwd_set.getText().equals("")||
						joinSub.tf_Tel_set.getText().equals("")) {
					JOptionPane.showMessageDialog(
							joinSub.pCenter,"�Է����� ���� ���� �ֽ��ϴ�.");
				}else {	
					for(int i=0;i<userArr.size();i++) {
						if(joinSub.tf_Id_set.getText().equals(userArr.get(i).getUser_Id())){
							flag = false;
							JOptionPane.showMessageDialog(joinSub.pCenter,"���̵� �ߺ��˴ϴ�.");
							break;
						}
					}
					if(flag==true) {
						userInfo = new UserInfo();
						userInfo.setUser_Id(joinSub.tf_Id_set.getText());  // �Է� ���̵�
						userInfo.setUser_Pwd(joinSub.tf_Pwd_set.getText()); // �Է� ��й�ȣ
						userInfo.setUser_Tel(joinSub.tf_Tel_set.getText()); // �Է� ��ȭ��ȣ
						userArr.add(userInfo);  // user ������ ArrayList�� ����
						JOptionPane.showMessageDialog(joinSub.pCenter,"ȸ�����ԿϷ�!");
						joinSub.setVisible(false);
					}
					joinSub.tf_Id_set.setText("");
					joinSub.tf_Pwd_set.setText("");
					joinSub.tf_Tel_set.setText("");
				}
			}
		});
		
		btBasket.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				products_Sum=0;
				for(int i=0;i<bascket_Arr.size();i++) {  // ��ٱ��� ����
					data[i][0]=new String(bascket_Arr.get(i).getProducts_Name());
					data[i][1]=new Integer(bascket_Arr.get(i).getProducts_Price());
					data[i][2]=new ImageIcon("images/"+bascket_Arr.get(i).getProducts_Img());
					data[i][3]=new Boolean(true);
				}
				for(int i=0;i<bascket_Arr.size();i++) {
					products_Sum += (int)data[i][1];     // ��ǰ ���� ����
				}
				basketSub.lb_Order_Price.setText(products_Sum+"");
				basketSub.lb_AllPrice.setText((products_Sum-pCenter_discount)+""); // ��ǰ���� - ���ΰ��� = ��������
				basketSub.setSize(500,500);
				basketSub.setLocation(p.getWidth(), 0);
				basketSub.setVisible(true);
			}
		});
		
		basketSub.b_Buy.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] buttons = {"Ȯ��","���"};
				if(products_Sum!=0) {
					int result = JOptionPane.showOptionDialog(null, 
							"�����Ͻðڽ��ϱ�?", "Ȯ�θ޽���", 
							JOptionPane.YES_NO_CANCEL_OPTION, 
							JOptionPane.QUESTION_MESSAGE, null, 
							buttons, "�ι�°��");
					if(result==0) {
						JOptionPane.showMessageDialog(null, 
								"�����Ǿ����ϴ�.");
						for(int i=0;i<bascket_Arr.size();i++) { // ��ٱ��� �ʱ�ȭ
							for(int j=0;j<4;j++) {
								data[i][j]=null;
							}
						}
						bascket_Arr.clear(); // ��ٱ��� �ʱ�ȸ
						pCenter_discount=0; // ���� ���� �ʱ�ȭ
						basketSub.lb_Discount_Price.setText("0");
						basketSub.setVisible(false);
					}else {
						JOptionPane.showMessageDialog(null,  
								"��ҵǾ����ϴ�","��� �޽���", 
								JOptionPane.ERROR_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null, 
							"���� �ݾ��� �����ϴ�.");
				}
			}
		});
		
		/////////////////////////////////////// pNorth
		
		/////////////////////////////////////// pWest
		
		bar = this.createMenuBar();
		bar.setBackground(Color.white);
		cp.add(bar, BorderLayout.LINE_START);
		
		mpClothes_Item1.setEnabled(false);
		mpClothes_Item2.setEnabled(false);
		mpFood_Item1.setEnabled(false);
		mpFood_Item2.setEnabled(false);
		mpLeisure_Item1.setEnabled(false);
		mpLeisure_Item2.setEnabled(false);
		
		mpClothes_Item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuBarClothes.setTab(0);
				menuBarClothes.setSize(500,500);
				menuBarClothes.setLocation(p.getWidth(), 0);
				menuBarClothes.setVisible(true);
			}
		});
		
		mpClothes_Item2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuBarClothes.setTab(1);
				menuBarClothes.setSize(500,500);
				menuBarClothes.setLocation(p.getWidth(), 0);
				menuBarClothes.setVisible(true);
			}
		});
		
		mpFood_Item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuBarFood.setTab(0);
				menuBarFood.setSize(500,500);
				menuBarFood.setLocation(p.getWidth(), 0);
				menuBarFood.setVisible(true);
			}
		});
		
		mpFood_Item2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuBarFood.setTab(1);
				menuBarFood.setSize(500,500);
				menuBarFood.setLocation(p.getWidth(), 0);
				menuBarFood.setVisible(true);
			}
		});
		
		mpLeisure_Item1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuBarLeisure.setTab(0);
				menuBarLeisure.setSize(500,500);
				menuBarLeisure.setLocation(p.getWidth(), 0);
				menuBarLeisure.setVisible(true);
			}
		});
		
		mpLeisure_Item2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				menuBarLeisure.setTab(1);
				menuBarLeisure.setSize(500,500);
				menuBarLeisure.setLocation(p.getWidth(), 0);
				menuBarLeisure.setVisible(true);
			}
		});
		
		menuBarClothes.b_N1_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(0)); // ��ٱ��� ArrayList�� ����
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		menuBarClothes.b_N2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(1));
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		menuBarClothes.b_A1_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(2));
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		menuBarClothes.b_A2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(3));
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		menuBarFood.b_B1_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(4));
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		menuBarFood.b_B2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(5));
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		menuBarFood.b_K1_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(6));
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		menuBarFood.b_K2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(7));
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		menuBarLeisure.b_C1_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(8));
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		menuBarLeisure.b_C2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(9));
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		menuBarLeisure.b_G1_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(10));
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		menuBarLeisure.b_G2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(11));
				JOptionPane.showMessageDialog(null,"��ٱ��Ͽ� �����ϴ�.");
			}
		});
		
		
		/////////////////////////////////////// pWest
		
		/////////////////////////////////////// pCenter
		pCenter.setLayout(new BorderLayout());
		
		pCp = new JPanel();
		card = new CardLayout();
		pCp.setLayout(card);
		btCE = new JButton(){
			@Override
			public void paintComponent(Graphics g) {  // ��ư�� �̹���
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/ȭ��ǥ.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		btCE.setBackground(Color.WHITE);
		btCE.setEnabled(false);
		
		pCenter.add(pCp,"Center");
		pCenter.add(btCE,"East");
		
		pCp1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) { // �гο� �̹���
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/img01.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		pCp2 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) { // �гο� �̹���
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/img02.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		pCp3 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) { // �гο� �̹���
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/����.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		pCp.add(pCp3, "img01");
		pCp.add(pCp1, "img02");
		pCp.add(pCp2, "img03");
		
		btCE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // ī�巹�̾ƿ� ���������� �ѱ�� ��ư
				Object o = e.getSource();
				if(o==btCE) {
					card.show(pCp, img[++imgCount]);
					if(imgCount==2) {
						imgCount=-1;
					}
				}
			}
		});
		
		pCp1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pesf.setSize(500, 500);
				pesf.setLocation(p.getWidth(), 0);
				pesf.setVisible(true);
			}
		});
		
		pCp2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				pesf1.setSize(500, 500);
				pesf1.setLocation(p.getWidth(), 0);
				pesf1.setVisible(true);
			}
		});
		
		pesf.tfAnswer.addActionListener(new ActionListener() { // ĳ���� ���߱� �̺�Ʈó��
			Boolean t = true;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t==true) {
					if(pesf.sImg[pesf.count].equals(
							"images/"+pesf.tfAnswer.getText()+".png")) { // TextField�� �Էµ� ���̶� ĳ����(����)�� ������...
						pCenter_discount+=5000;
						basketSub.lb_Discount_Price.setText(pCenter_discount+""); // ��ٱ���ȭ�� ���������� �ߵ���
						JOptionPane.showMessageDialog(pesf.pImg, "�����Դϴ�. 5000�� ���α� ����");
					}else {
						JOptionPane.showMessageDialog(pesf.pImg, "�����Դϴ�.");
					}
					pesf.setVisible(false);
					t=false;
				}
			}
		});
		
		pesf1.tfAnswer.addActionListener(new ActionListener() {
			Boolean t = true;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t==true) {
					if(pesf1.sImg[pesf1.count].equals(
							"images/"+pesf1.tfAnswer.getText()+".png")) {
						pCenter_discount+=5000;
						basketSub.lb_Discount_Price.setText(pCenter_discount+"");
						JOptionPane.showMessageDialog(pesf.pImg, "�����Դϴ�. 5000�� ���α� ����");
					}else {
						JOptionPane.showMessageDialog(pesf1.pImg, "�����Դϴ�.");
					}
					pesf1.setVisible(false);
					t=false;
				}
			}
		});
		/////////////////////////////////////pCenter
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,700);
		setVisible(true);
		JOptionPane.showMessageDialog(pCenter, "�����ڸ� �̿��� �� �ֽ��ϴ�.");
	}
	
	public JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.PAGE_AXIS));
		menuBar.add(createMenu("�Ƿ�"));
		menuBar.add(createMenu("����"));
		menuBar.add(createMenu("����"));

		menuBar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
		return menuBar;
	}

	public JMenu createMenu(String title) {
		JMenu m = new HorizontalMenu(title);
		switch (title) {
		case "�Ƿ�":
			m.add(mpClothes_Item1 = new JMenuItem("����Ű"));
			m.add(mpClothes_Item2 = new JMenuItem("�Ƶ�ٽ�"));
			m.add(mpClothes_Item3 = new JMenuItem("ǻ��"));

			break;
		case "����":
			m.add(mpFood_Item1 = new JMenuItem("�Ұ��"));
			m.add(mpFood_Item2 = new JMenuItem("��ġ"));
			m.add(mpFood_Item3 = new JMenuItem("���"));

			break;
		case "����":
			m.add(mpLeisure_Item1 = new JMenuItem("������"));
			m.add(mpLeisure_Item2 = new JMenuItem("����"));
			m.add(mpLeisure_Item3 = new JMenuItem("ķ��"));
			break;
		}// switch

		return m;
	}
	
	class HorizontalMenu extends JMenu {
		HorizontalMenu(String label) {
			super(label);
			JPopupMenu pm = getPopupMenu();
			pm.setLayout(new BoxLayout(pm, BoxLayout.LINE_AXIS));
		}

		public Dimension getMinimumSize() {
			return getPreferredSize();
		}

		public Dimension getMaximumSize() {
			return getPreferredSize();
		}

		public void setPopupMenuVisible(boolean b) {
			boolean isVisible = isPopupMenuVisible();
			if (b != isVisible) {
				if ((b == true) && isShowing()) {
					int x = 0;
					int y = 0;
					Container parent = getParent();
					if (parent instanceof JPopupMenu) {
						x = 0;
						y = getHeight();
					} else {
						x = getWidth();
						y = 0;
					}
					getPopupMenu().show(this, x, y);
				} else {
					getPopupMenu().setVisible(false);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new ProjectEvent();
	}
	
	@Override
	public Insets getInsets() {
		return new Insets(30,20,20,20);
	}
}

class ProductsArray{
	ArrayList<ProductsInfo> productsArr = new ArrayList<>();
	
	public ProductsArray() {
		productsArr.add(new ProductsInfo("������",80000,"������1.png",false));
		productsArr.add(new ProductsInfo("����",20000,"����1.png",false));
		productsArr.add(new ProductsInfo("����",55000,"����1.png",false));
		productsArr.add(new ProductsInfo("����",45000,"����1.png",false));
		productsArr.add(new ProductsInfo("�Ұ��",12000,"�Ұ��1.png",false));
		productsArr.add(new ProductsInfo("���Ұ��",10000,"���Ұ��1.png",false));
		productsArr.add(new ProductsInfo("�Ѱ���ġ",9000,"�Ѱ���ġ1.png",false));
		productsArr.add(new ProductsInfo("�ı�ġ",8000,"�ı�ġ1.png",false));
		productsArr.add(new ProductsInfo("���ƿ�",120000,"������1.png",false));
		productsArr.add(new ProductsInfo("���ο�",15000,"������21.png",false));
		productsArr.add(new ProductsInfo("������",3000,"������1.png",false));
		productsArr.add(new ProductsInfo("����ä",130000,"����ä1.png",false));
	}
}

class ProductsInfo {
	private String products_Name;
	private int products_Price;
	private String products_Img;
	private boolean products_tf;
	
	public ProductsInfo(String products_Name, int products_Price,
			String products_Img, boolean products_tf) {
		this.products_Name = products_Name;
		this.products_Price = products_Price;
		this.products_Img = products_Img;
		this.products_tf = products_tf;
	}
	public String getProducts_Name() {
		return products_Name;
	}
	public void setProducts_Name(String products_Name) {
		this.products_Name = products_Name;
	}
	public int getProducts_Price() {
		return products_Price;
	}
	public void setProducts_Price(int products_Price) {
		this.products_Price = products_Price;
	}
	public String getProducts_Img() {
		return products_Img;
	}
	public void setProducts_Img(String products_Img) {
		this.products_Img = products_Img;
	}
	public boolean isProducts_tf() {
		return products_tf;
	}
	public void setProducts_tf(boolean products_tf) {
		this.products_tf = products_tf;
	}
}

class UserInfo {
	private String user_Id;
	private String user_Pwd;
	private String user_Tel;
	
	public UserInfo() {
		this("ȫ�浿","1234","010-0000-0000");
	}
	
	public UserInfo(String user_Id, String user_Pwd,String user_Tel) {
		this.user_Id = user_Id;
		this.user_Pwd = user_Pwd;
		this.user_Tel = user_Tel;
	}

	public String getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(String user_Id) {
		this.user_Id = user_Id;
	}

	public String getUser_Pwd() {
		return user_Pwd;
	}

	public void setUser_Pwd(String user_Pwd) {
		this.user_Pwd = user_Pwd;
	}

	public String getUser_Tel() {
		return user_Tel;
	}

	public void setUser_Tel(String user_Tel) {
		this.user_Tel = user_Tel;
	}
}