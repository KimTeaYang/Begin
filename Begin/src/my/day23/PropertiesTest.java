package my.day23;

import java.util.*;
import java.io.*;
/* Properties 클래스: Map계열
 *  - Hashtable의 자식 클래스
 *  
 *  - XXX.properties 파일을 읽어서 해당 파일에 저장된 내용을 사용하고자 할 때 이용한다.
 *   [실습] database.properties 파일을 읽어서 해당 파일에 저장된 key값과
 *   	   value값을 가져와 보자.
 * */

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		//기준경로: 이클립스는 프로젝트(Begin)
		String path="src/my/day23/database.properties";
		FileReader fr = new FileReader(path);
		
		Properties prop = new Properties();
		prop.load(fr); 
		//database.properties파일을 읽어서 Properties객체로 옮겨 놓는다.
		
		String dbms = prop.getProperty("DBMS");
		System.out.println("dbms: "+dbms);
		
		String os = prop.getProperty("OS", "Mac"); //key, default
		System.out.println("os: "+os);
		
		String dbUser = prop.getProperty("DbUser");
		System.out.println("dbUser: "+dbUser);
		
		String dbPwd = prop.getProperty("DbPwd");
		System.out.println("dbPwd: "+dbPwd);
		
	}
}