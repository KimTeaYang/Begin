package my.day19;

import javax.swing.*;
import java.io.*;
/* Exception
 *	   |
 *  IOException : ����� ����(������Ÿ�� ����)
 *     +--- FileNotFoundException : �а��� �ϴ� ������ ���� �� �߻�
 * */
public class FileReadTest2 {

	public static void main(String[] args) {
		String fileName = JOptionPane.showInputDialog(
				"���� ���ϸ��� �Է��ϼ���.");
		
		//trim(): ���ڿ� �� ���� ������ ������
		if(fileName == null||fileName.trim().equals("")) {
			System.out.println("���ϸ��� �Է��ؾ� �ؿ�");
			return;
		}
		try {
			String str = reading(fileName);
			System.out.println("===="+fileName+"==========");
			System.out.println(str);
		}catch(IOException e) {
			String msg = e.getMessage();
			System.out.println("���� �д� �� ���� �߻�: "+msg);
		}
	}
	
	public static String reading(String fileName) 
			throws FileNotFoundException, IOException{
		FileReader fr = null;
		char[] data = new char[1000];
		
		fr = new FileReader(fileName);
		//���ϰ� ��� �����ϴ� ��Ʈ�� ����
		
		int n = fr.read(data); // ������ �о����. ���� �����ʹ� �迭(data)�� �������.
		fr.close();
		
		String contents = new String(data,0,n);
		
		return contents;
	}

}
