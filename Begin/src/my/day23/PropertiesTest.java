package my.day23;

import java.util.*;
import java.io.*;
/* Properties Ŭ����: Map�迭
 *  - Hashtable�� �ڽ� Ŭ����
 *  
 *  - XXX.properties ������ �о �ش� ���Ͽ� ����� ������ ����ϰ��� �� �� �̿��Ѵ�.
 *   [�ǽ�] database.properties ������ �о �ش� ���Ͽ� ����� key����
 *   	   value���� ������ ����.
 * */

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		//���ذ��: ��Ŭ������ ������Ʈ(Begin)
		String path="src/my/day23/database.properties";
		FileReader fr = new FileReader(path);
		
		Properties prop = new Properties();
		prop.load(fr); 
		//database.properties������ �о Properties��ü�� �Ű� ���´�.
		
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