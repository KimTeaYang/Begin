package my.day19;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.event.*;
/* 이벤트 처리 (MenuItem ==> ActionEvent)
 *  이너클래스로 핸들러 만들어 구현하기
 *  
 *  miNew : ta 비워주기
 *  miExit : 시스템 종료
 *  
 *  yellow, gray : ta배경색
 *  글자색 : ta의 글자색 적용
 * */

public class MyNote extends JFrame {
	JTextArea ta;
	JMenuBar bar;
	JMenu mnFile, mnColor;
	JMenu mnFont;
	JMenuItem miNew, miOpen, miSave, miExit;
	JMenu mnFontC;
	JMenuItem miYellow, miGray;
	
	public MyNote() {
		super(":::MyNote v1.1:::");
		Container cp = this.getContentPane();
		
		//메뉴바 부착은 setJMenuBar()이용
		bar = new JMenuBar();
		setJMenuBar(bar);
		
		//메뉴 생성해서 메뉴바에 부착
		mnFile = new JMenu("File");
		mnColor = new JMenu("Color");
		bar.add(mnFile);
		bar.add(mnColor);
		
		miNew = new JMenuItem("New", 'N');
		miOpen = new JMenuItem("Open", 'O');
		miSave = new JMenuItem("Save As", 'S');
		miExit = new JMenuItem("Exit", 'E');
		
		//메뉴에 메뉴를 붙이면 서브 메뉴가 된다.
		mnFont = new JMenu("Font");
		mnFile.add(mnFont);
		mnFont.add("Sans-serif");
		mnFont.add("Dialog");
		mnFont.addSeparator();
		mnFont.add("궁서체");
		mnFont.add("굴림체");
		
		mnFile.add(miNew);
		mnFile.add(miOpen);
		mnFile.add(miSave);
		mnFile.addSeparator();
		mnFile.add(miExit);
		
		miYellow = new JMenuItem("Yellow", 'Y');
		miGray = new JMenuItem("Gray", 'G');
		
		mnColor.add(miYellow);
		mnColor.add(miGray);
		mnColor.addSeparator();
		
		mnFontC = new JMenu("글자색");
		mnColor.add(mnFontC);
		mnFontC.add("Blue");
		mnFontC.add("Red");
		mnFontC.add("Green");
		
		ta = new JTextArea();
		cp.add(new JScrollPane(ta),"Center");
		
		Handler handler = new Handler();
		mnFont.addActionListener(handler);
		miNew.addActionListener(handler);
		miOpen.addActionListener(handler);
		miSave.addActionListener(handler);
		miExit.addActionListener(handler);
		
		miYellow.addActionListener(handler);
		miGray.addActionListener(handler);
		mnFontC.addChangeListener(handler);
		
		setSize(600,600);
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class Handler implements ActionListener, ChangeListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Object o = e.getSource();
			String cmd = e.getActionCommand();
			setTitle(cmd);
			
			if(o==miNew) {
				ta.setText("");
			}else if(o==miOpen) {
				JFileChooser jfc = new JFileChooser("c:/myjava");
				int n = jfc.showOpenDialog(ta); // n=1 취소, n=0 선택
				String path = jfc.getSelectedFile().getAbsolutePath();

				if(n==1) {
					return;
				}else if(n==0) {
					try {
						ta.setText(FileReadTest2.reading(path));
					}catch(IOException e1) {
						ta.setText("예외 발생: "+e1.getMessage());
					}
				}
				/* [1] jFileChooser를 띄운다. (열기모드)
				 * [2] jFileChooser를 통해 선택한 파일명을
				 *     알아내어 타이틀에 파일명을 보여주세요
				 * [3] FileReadTest클랫의 reading()메소드에
				 *     해당 파일명을 건네주어 파일 데이터를 문자열로 받는다.
				 * [4] 받은 문자열을 ta에 붙인다.
				 * */
			}else if(o==miSave) {
				
			}else if(o==miExit) {
				System.exit(0);
			}else if(o==miYellow) {
				ta.setBackground(Color.yellow);
			}else if(o==miGray) {
				ta.setBackground(Color.gray);
			}else if(o==mnFont) {
				
			}else if(o==mnFontC) {
				
			}
		}
		
		@Override
		public void stateChanged(ChangeEvent e) {
			
		}
		
	}
	
	/*public static String reading(String jFileChooser) 
		throws FileNotFoundException, IOException{
		FileReader fr = null;
		char []data = new char[1000];
		fr = new FileReader(jFileChooser);
		
		fr.read(data);
		fr.close();
		
		String contents = new String(data);
		return contents;
	}*/

	public static void main(String[] args) {
		new MyNote();
	}

}
