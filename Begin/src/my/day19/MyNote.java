package my.day19;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.event.*;
/* �̺�Ʈ ó�� (MenuItem ==> ActionEvent)
 *  �̳�Ŭ������ �ڵ鷯 ����� �����ϱ�
 *  
 *  miNew : ta ����ֱ�
 *  miExit : �ý��� ����
 *  
 *  yellow, gray : ta����
 *  ���ڻ� : ta�� ���ڻ� ����
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
		
		//�޴��� ������ setJMenuBar()�̿�
		bar = new JMenuBar();
		setJMenuBar(bar);
		
		//�޴� �����ؼ� �޴��ٿ� ����
		mnFile = new JMenu("File");
		mnColor = new JMenu("Color");
		bar.add(mnFile);
		bar.add(mnColor);
		
		miNew = new JMenuItem("New", 'N');
		miOpen = new JMenuItem("Open", 'O');
		miSave = new JMenuItem("Save As", 'S');
		miExit = new JMenuItem("Exit", 'E');
		
		//�޴��� �޴��� ���̸� ���� �޴��� �ȴ�.
		mnFont = new JMenu("Font");
		mnFile.add(mnFont);
		mnFont.add("Sans-serif");
		mnFont.add("Dialog");
		mnFont.addSeparator();
		mnFont.add("�ü�ü");
		mnFont.add("����ü");
		
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
		
		mnFontC = new JMenu("���ڻ�");
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
				int n = jfc.showOpenDialog(ta); // n=1 ���, n=0 ����
				String path = jfc.getSelectedFile().getAbsolutePath();

				if(n==1) {
					return;
				}else if(n==0) {
					try {
						ta.setText(FileReadTest2.reading(path));
					}catch(IOException e1) {
						ta.setText("���� �߻�: "+e1.getMessage());
					}
				}
				/* [1] jFileChooser�� ����. (������)
				 * [2] jFileChooser�� ���� ������ ���ϸ���
				 *     �˾Ƴ��� Ÿ��Ʋ�� ���ϸ��� �����ּ���
				 * [3] FileReadTestŬ���� reading()�޼ҵ忡
				 *     �ش� ���ϸ��� �ǳ��־� ���� �����͸� ���ڿ��� �޴´�.
				 * [4] ���� ���ڿ��� ta�� ���δ�.
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
