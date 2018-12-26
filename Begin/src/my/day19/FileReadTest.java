package my.day19;

import javax.swing.*;
import java.io.*;
/* Exception
 *	 |
 *   IOException : ����� ����(������Ÿ�� ����)
 *      +--- FileNotFoundException : �а��� �ϴ� ������ ���� �� �߻�
 * */
public class FileReadTest {

	public static void main(String[] args) {
		String fileName = JOptionPane.showInputDialog(
				"���� ���ϸ��� �Է��ϼ���.");
		
		//trim(): ���ڿ� �� ���� ������ ������
		if(fileName == null||fileName.trim().equals("")) {
			System.out.println("���ϸ��� �Է��ؾ� �ؿ�");
			return;
		}
		String str = reading(fileName);
		System.out.println("===="+fileName+"==========");
		System.out.println(str);
	}
	
	public static String reading(String fileName) {
		FileReader fr = null;
		char[] data = new char[1000];
		try {
			fr = new FileReader(fileName);
			//���ϰ� ��� �����ϴ� ��Ʈ�� ����
			
			fr.read(data); // ������ �о����. ���� �����ʹ� �迭(data)�� �������.
			fr.close();
		}catch(FileNotFoundException e){
			System.out.println("ã�� ������ �����!");
		}catch(IOException e) {
			System.out.println("����� �� ���� �߻�!");
		}
		
		String contents = new String(data);
		
		return contents;
	}

}
