package my.day19;

import javax.swing.*;
import java.io.*;
/* Exception
 *	 |
 *   IOException : 입출력 예외(컴파일타임 예외)
 *      +--- FileNotFoundException : 읽고자 하는 파일이 없을 때 발생
 * */
public class FileReadTest {

	public static void main(String[] args) {
		String fileName = JOptionPane.showInputDialog(
				"읽을 파일명을 입력하세요.");
		
		//trim(): 문자열 앞 뒤의 공백을 제거함
		if(fileName == null||fileName.trim().equals("")) {
			System.out.println("파일명을 입력해야 해요");
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
			//파일과 노드 연결하는 스트림 생성
			
			fr.read(data); // 파일을 읽어들임. 파일 데이터는 배열(data)에 담겨있음.
			fr.close();
		}catch(FileNotFoundException e){
			System.out.println("찾는 파일이 없어요!");
		}catch(IOException e) {
			System.out.println("입출력 중 오류 발생!");
		}
		
		String contents = new String(data);
		
		return contents;
	}

}
