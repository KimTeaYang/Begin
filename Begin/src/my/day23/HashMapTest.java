package my.day23;

import java.io.*;
import java.util.*;
/* HashMap �迭
 *  - Map�迭
 *  - Key�� value�� �����Ͽ� ����
 *  - key���� �ߺ��� ��� ���� ����
 *  - Hashtable�� �޼ҵ尡 ����ȭ �Ǵ� �ݸ� HashMap�� ����ȭ �Ǿ� ���� ����
 * */
public class HashMapTest {

	HashMap<String, String> usersMap = new HashMap<>();
	
	public void join() {
		//ȸ���� ���̵�� ��й�ȣ�� map�� ��������.
		usersMap.put("hong", "123");
		usersMap.put("king", "abc");
		usersMap.put("admin", "tiger");
		System.out.println(">>>ȸ�� ���� �Ϸ�!!<<<");
		System.out.println("==��ϵ� ȸ����: "+usersMap.size()+"��==");
	}
	
	public void loginCheck() {
		System.out.println(":::Login:::");
		Console console = System.console();
		//��Ŭ�������� �����ϸ� null�� ��ȯ��. �������� ���� ��������.
		
		System.out.println("���̵�: ");
		String userid = console.readLine();
		char[] pwd= {};
		if(usersMap.containsKey(userid)==false) {
			System.out.println("���� ȸ���Դϴ�.");
			return;
		}else {
			System.out.println("��й�ȣ: ");
			pwd = console.readPassword();
			//usersMap.containsValue(new String(pwd))==true [x]
			//--> ���̵�� �޶� ����� ���� ��й�ȣ�� ������ true�� ��ȯ�ϹǷ� [x] 
			if(usersMap.get(userid).equals(new String(pwd))==true) {
				System.out.println(userid+"�� ȯ���մϴ�.");
			}else {
				System.out.println("��й�ȣ�� Ʋ����");
			}
		}
	}
	
	public static void main(String[] args) {
		HashMapTest hmt = new HashMapTest();
		hmt.join();
		hmt.loginCheck();
		
	}

}
