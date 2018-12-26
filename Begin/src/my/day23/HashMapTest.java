package my.day23;

import java.io.*;
import java.util.*;
/* HashMap 계열
 *  - Map계열
 *  - Key와 value를 매핑하여 저장
 *  - key값의 중복을 허용 하지 않음
 *  - Hashtable은 메소드가 동기화 되는 반면 HashMap은 동기화 되어 있지 않음
 * */
public class HashMapTest {

	HashMap<String, String> usersMap = new HashMap<>();
	
	public void join() {
		//회원의 아이디와 비밀번호를 map에 저장하자.
		usersMap.put("hong", "123");
		usersMap.put("king", "abc");
		usersMap.put("admin", "tiger");
		System.out.println(">>>회원 가입 완료!!<<<");
		System.out.println("==등록된 회원수: "+usersMap.size()+"명==");
	}
	
	public void loginCheck() {
		System.out.println(":::Login:::");
		Console console = System.console();
		//이클립스에서 실행하면 null을 반환함. 도스에서 열어 실행하자.
		
		System.out.println("아이디: ");
		String userid = console.readLine();
		char[] pwd= {};
		if(usersMap.containsKey(userid)==false) {
			System.out.println("없는 회원입니다.");
			return;
		}else {
			System.out.println("비밀번호: ");
			pwd = console.readPassword();
			//usersMap.containsValue(new String(pwd))==true [x]
			//--> 아이디와 달라도 저장된 많은 비밀번호와 같으면 true를 반환하므로 [x] 
			if(usersMap.get(userid).equals(new String(pwd))==true) {
				System.out.println(userid+"님 환영합니다.");
			}else {
				System.out.println("비밀번호가 틀려요");
			}
		}
	}
	
	public static void main(String[] args) {
		HashMapTest hmt = new HashMapTest();
		hmt.join();
		hmt.loginCheck();
		
	}

}
