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
		
		userArr.add(new UserInfo("김태양","123","123"));
		userArr.add(new UserInfo("박민철","123","123"));
		userArr.add(new UserInfo("전동호","123","123"));
		userArr.add(new UserInfo("김종환","123","123"));
		
		/////////////////////////////////////// pNorth
		
		pNorth.setLayout(new BorderLayout());
		pNp = new JPanel(new BorderLayout());
		pNpp = new JPanel();
		pNorth.setBackground(Color.WHITE);
		pNorth.add(pNp,"East");
		pNp.setBackground(Color.WHITE);
		pNpp.setBackground(Color.WHITE);
		btLogin = new JButton("로그인");
		btJoin = new JButton("회원가입");
		btBasket = new JButton("장바구니");
		btLogout = new JButton("로그아웃");
		pNorth_tf = new JTextField("검색해주세요.");
		pNp_lb = new JLabel("로그인을 해주세요.", JLabel.CENTER);
		
		pNorth.add(pNorth_tf,"Center");
		pNp.add(pNpp, "Center");
		pNp.add(pNp_lb,"South");
		pNpp.add(btLogin);pNpp.add(btLogout);
		pNpp.add(btJoin);pNpp.add(btBasket);
		
		btLogout.setEnabled(false);
		btBasket.setEnabled(false);
		pNorth_tf.setEnabled(false);
		
		pNorth_tf.addActionListener(new ActionListener() {  // 왼쪽 위 검색창 이벤트 처리
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<products_Arr.productsArr.size();i++) {
					if(products_Arr.productsArr.get(i).getProducts_Name().equals(pNorth_tf.getText())) {
						switch(i){
							case 0:
							case 1:
								JOptionPane.showMessageDialog(pCenter, "'의류>>나이키'카테고리에 있습니다.");
								break;
							case 2:
							case 3:
								JOptionPane.showMessageDialog(pCenter, "'의류>>아디다스'카테고리에 있습니다.");
								break;
							case 4:
							case 5:
								JOptionPane.showMessageDialog(pCenter, "'음식>>불고기'카테고리에 있습니다.");
								break;
							case 6:
							case 7:
								JOptionPane.showMessageDialog(pCenter, "'음식>>김치'카테고리에 있습니다.");
								break;
							case 8:
							case 9:
								JOptionPane.showMessageDialog(pCenter, "'레저>>자전거'카테고리에 있습니다.");
								break;
							case 10:
							case 11:
								JOptionPane.showMessageDialog(pCenter, "'레저>>골프'카테고리에 있습니다.");
								break;
						}
						pNorth_tf.setText("");
					}else if(i+1==products_Arr.productsArr.size()) {
						JOptionPane.showMessageDialog(pCenter, "해당 상품이 없습니다.");
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
				pNorth_tf.setText("검색해주세요.");
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
		
		loginSub.b_Login.addActionListener(new ActionListener() { // loginSub 프레임 안에 로그인 버튼 이벤트 처리
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<userArr.size();i++) {
					if((userArr.get(i).getUser_Id().equals(loginSub.tf_Id.getText()))
							&&(userArr.get(i).getUser_Pwd().equals(loginSub.tf_Pwd.getText()))) { // 조건문은 아이디랑 비밀번호가 일치하는지
						JOptionPane.showMessageDialog(loginSub.pLogin,"로그인 성공");
						if(userArr.get(i).getUser_Id().equals("김태양")||
								userArr.get(i).getUser_Id().equals("박민철")||
								userArr.get(i).getUser_Id().equals("전동호")||
								userArr.get(i).getUser_Id().equals("김종환")) {
							pNp_lb.setText(loginSub.tf_Id.getText()+" 관리자님 환영합니다.");
						}else {
							pNp_lb.setText(loginSub.tf_Id.getText()+" 일반회원님 환영합니다.");
						}
						loginSub.tf_Id.setText("");loginSub.tf_Pwd.setText("");
						loginSub.setVisible(false);
						
						btBasket.setEnabled(true);        // 로그인이 되었을 시 모든 기능들이 작동하도록
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
					}else if((i+1)==userArr.size()){  // 맨 마지막 바퀴까지 돌았는데도 일치하지 않는다면
						loginSub.tf_Id.setText("");loginSub.tf_Pwd.setText("");
						JOptionPane.showMessageDialog(loginSub.pLogin,"로그인 실패");
					}
				}
			}
		});
		
		btLogout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<bascket_Arr.size();i++) { // 장바구니 초기화
					for(int j=0;j<4;j++) {
						data[i][j]=null;
					}
				}
				bascket_Arr.clear(); // 장바구니 초기회
				pCenter_discount=0; // 할인 쿠폰 초기화
				pNp_lb.setText("로그인을 해주세요.");
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
				
				JOptionPane.showMessageDialog(pCenter, "정상적으로 로그아웃 되었습니다.");
			}
		});
		
		loginSub.b_Id_get_Tel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<userArr.size();i++) { 
					if(userArr.get(i).getUser_Tel().equals(loginSub.tf_Id_get_Tel.getText())) { // 전화전호가 일치하면 
						JOptionPane.showMessageDialog(loginSub.pId_get,"ID : "+
								userArr.get(i).getUser_Id()); // 아이디를 보여준다.
						loginSub.tf_Id_get_Tel.setText("");
						loginSub.setTab(0);
						break;
					}else if((i+1)==userArr.size()){
						loginSub.tf_Id_get_Tel.setText("");
						JOptionPane.showMessageDialog(loginSub.pId_get,"아이디 찾기 실패");
					}
				}
			}
		});
		
		loginSub.b_Pwd_get.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i =0;i<userArr.size();i++) {
					if((userArr.get(i).getUser_Id().equals(loginSub.tf_Pwd_get_Id.getText()))
							&&(userArr.get(i).getUser_Tel().equals(loginSub.tf_Pwd_get_Tel.getText()))) { // 아이디가 일치하고 전화번호가 일치한다면
						JOptionPane.showMessageDialog(loginSub.pPwd_get,"Pwd : "+
								userArr.get(i).getUser_Pwd()); // 패스워드를 보여준다.
						loginSub.tf_Pwd_get_Id.setText("");
						loginSub.tf_Pwd_get_Tel.setText("");
						loginSub.setTab(0);
						break;
					}else if((i+1)==userArr.size()){
						loginSub.tf_Pwd_get_Id.setText("");
						loginSub.tf_Pwd_get_Tel.setText("");
						JOptionPane.showMessageDialog(loginSub.pPwd_get,"비밀번호 찾기 실패");
					}
				}
			}
		});
		
		joinSub.bt_set.addActionListener(new ActionListener() { // 회원가입 부분
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean flag=true;
				
				if(joinSub.tf_Id_set.getText().equals("")||
						joinSub.tf_Pwd_set.getText().equals("")||
						joinSub.tf_Tel_set.getText().equals("")) {
					JOptionPane.showMessageDialog(
							joinSub.pCenter,"입력하지 않은 곳이 있습니다.");
				}else {	
					for(int i=0;i<userArr.size();i++) {
						if(joinSub.tf_Id_set.getText().equals(userArr.get(i).getUser_Id())){
							flag = false;
							JOptionPane.showMessageDialog(joinSub.pCenter,"아이디가 중복됩니다.");
							break;
						}
					}
					if(flag==true) {
						userInfo = new UserInfo();
						userInfo.setUser_Id(joinSub.tf_Id_set.getText());  // 입력 아이디
						userInfo.setUser_Pwd(joinSub.tf_Pwd_set.getText()); // 입력 비밀번호
						userInfo.setUser_Tel(joinSub.tf_Tel_set.getText()); // 입력 전화번호
						userArr.add(userInfo);  // user 정보를 ArrayList에 저장
						JOptionPane.showMessageDialog(joinSub.pCenter,"회원가입완료!");
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
				for(int i=0;i<bascket_Arr.size();i++) {  // 장바구니 저장
					data[i][0]=new String(bascket_Arr.get(i).getProducts_Name());
					data[i][1]=new Integer(bascket_Arr.get(i).getProducts_Price());
					data[i][2]=new ImageIcon("images/"+bascket_Arr.get(i).getProducts_Img());
					data[i][3]=new Boolean(true);
				}
				for(int i=0;i<bascket_Arr.size();i++) {
					products_Sum += (int)data[i][1];     // 상품 가격 저장
				}
				basketSub.lb_Order_Price.setText(products_Sum+"");
				basketSub.lb_AllPrice.setText((products_Sum-pCenter_discount)+""); // 상품가격 - 할인가격 = 최종가격
				basketSub.setSize(500,500);
				basketSub.setLocation(p.getWidth(), 0);
				basketSub.setVisible(true);
			}
		});
		
		basketSub.b_Buy.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] buttons = {"확인","취소"};
				if(products_Sum!=0) {
					int result = JOptionPane.showOptionDialog(null, 
							"구매하시겠습니까?", "확인메시지", 
							JOptionPane.YES_NO_CANCEL_OPTION, 
							JOptionPane.QUESTION_MESSAGE, null, 
							buttons, "두번째값");
					if(result==0) {
						JOptionPane.showMessageDialog(null, 
								"결제되었습니다.");
						for(int i=0;i<bascket_Arr.size();i++) { // 장바구니 초기화
							for(int j=0;j<4;j++) {
								data[i][j]=null;
							}
						}
						bascket_Arr.clear(); // 장바구니 초기회
						pCenter_discount=0; // 할인 쿠폰 초기화
						basketSub.lb_Discount_Price.setText("0");
						basketSub.setVisible(false);
					}else {
						JOptionPane.showMessageDialog(null,  
								"취소되었습니다","취소 메시지", 
								JOptionPane.ERROR_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null, 
							"결제 금액이 없습니다.");
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
				bascket_Arr.add(products_Arr.productsArr.get(0)); // 장바구니 ArrayList에 저장
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
			}
		});
		
		menuBarClothes.b_N2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(1));
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
			}
		});
		
		menuBarClothes.b_A1_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(2));
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
			}
		});
		
		menuBarClothes.b_A2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(3));
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
			}
		});
		
		menuBarFood.b_B1_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(4));
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
			}
		});
		
		menuBarFood.b_B2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(5));
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
			}
		});
		
		menuBarFood.b_K1_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(6));
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
			}
		});
		
		menuBarFood.b_K2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(7));
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
			}
		});
		
		menuBarLeisure.b_C1_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(8));
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
			}
		});
		
		menuBarLeisure.b_C2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(9));
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
			}
		});
		
		menuBarLeisure.b_G1_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(10));
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
			}
		});
		
		menuBarLeisure.b_G2_p.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bascket_Arr.add(products_Arr.productsArr.get(11));
				JOptionPane.showMessageDialog(null,"장바구니에 담겼습니다.");
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
			public void paintComponent(Graphics g) {  // 버튼에 이미지
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/화살표.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		btCE.setBackground(Color.WHITE);
		btCE.setEnabled(false);
		
		pCenter.add(pCp,"Center");
		pCenter.add(btCE,"East");
		
		pCp1 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) { // 패널에 이미지
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/img01.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		pCp2 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) { // 패널에 이미지
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/img02.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		pCp3 = new JPanel() {
			@Override
			public void paintComponent(Graphics g) { // 패널에 이미지
				Dimension d = getSize();
				ImageIcon image = new ImageIcon("images/구글.png");
				g.drawImage(image.getImage(),0,0,d.width,d.height,null);
			}
		};
		pCp.add(pCp3, "img01");
		pCp.add(pCp1, "img02");
		pCp.add(pCp2, "img03");
		
		btCE.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) { // 카드레이아웃 순차적으로 넘기기 버튼
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
		
		pesf.tfAnswer.addActionListener(new ActionListener() { // 캐릭터 맞추기 이벤트처리
			Boolean t = true;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(t==true) {
					if(pesf.sImg[pesf.count].equals(
							"images/"+pesf.tfAnswer.getText()+".png")) { // TextField에 입력된 값이랑 캐릭터(사진)랑 같은지...
						pCenter_discount+=5000;
						basketSub.lb_Discount_Price.setText(pCenter_discount+""); // 장바구니화면 할인쿠폰에 뜨도록
						JOptionPane.showMessageDialog(pesf.pImg, "정답입니다. 5000원 할인권 증정");
					}else {
						JOptionPane.showMessageDialog(pesf.pImg, "오답입니다.");
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
						JOptionPane.showMessageDialog(pesf.pImg, "정답입니다. 5000원 할인권 증정");
					}else {
						JOptionPane.showMessageDialog(pesf1.pImg, "오답입니다.");
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
		JOptionPane.showMessageDialog(pCenter, "가입자만 이용할 수 있습니다.");
	}
	
	public JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new BoxLayout(menuBar, BoxLayout.PAGE_AXIS));
		menuBar.add(createMenu("의류"));
		menuBar.add(createMenu("음식"));
		menuBar.add(createMenu("레저"));

		menuBar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK));
		return menuBar;
	}

	public JMenu createMenu(String title) {
		JMenu m = new HorizontalMenu(title);
		switch (title) {
		case "의류":
			m.add(mpClothes_Item1 = new JMenuItem("나이키"));
			m.add(mpClothes_Item2 = new JMenuItem("아디다스"));
			m.add(mpClothes_Item3 = new JMenuItem("퓨마"));

			break;
		case "음식":
			m.add(mpFood_Item1 = new JMenuItem("불고기"));
			m.add(mpFood_Item2 = new JMenuItem("김치"));
			m.add(mpFood_Item3 = new JMenuItem("라면"));

			break;
		case "레저":
			m.add(mpLeisure_Item1 = new JMenuItem("자전거"));
			m.add(mpLeisure_Item2 = new JMenuItem("골프"));
			m.add(mpLeisure_Item3 = new JMenuItem("캠핑"));
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
		productsArr.add(new ProductsInfo("맨투맨",80000,"맨투맨1.png",false));
		productsArr.add(new ProductsInfo("모자",20000,"모자1.png",false));
		productsArr.add(new ProductsInfo("상의",55000,"상의1.png",false));
		productsArr.add(new ProductsInfo("하의",45000,"하의1.png",false));
		productsArr.add(new ProductsInfo("불고기",12000,"불고기1.png",false));
		productsArr.add(new ProductsInfo("양념불고기",10000,"양념불고기1.png",false));
		productsArr.add(new ProductsInfo("총각김치",9000,"총각김치1.png",false));
		productsArr.add(new ProductsInfo("파김치",8000,"파김치1.png",false));
		productsArr.add(new ProductsInfo("유아용",120000,"자전거1.png",false));
		productsArr.add(new ProductsInfo("성인용",15000,"자전거21.png",false));
		productsArr.add(new ProductsInfo("골프공",3000,"골프공1.png",false));
		productsArr.add(new ProductsInfo("골프채",130000,"골프채1.png",false));
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
		this("홍길동","1234","010-0000-0000");
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