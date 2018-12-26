package my.day22;

import java.util.*;
/* ArrayList
 *  - java.util.List계열
 *  - Vector와 기능은 동일
 *  - 단 벡터는 메소드들이 동기화가 구현된 반면, 
 *    ArrayList는 동기화되어 있지 않아 가볍다. 웹 프로그래밍에서 많이 사용함
 * */

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<>();
		
		arrList.add("Java");
		arrList.add("HTML");
		arrList.add("CSS");
		// Object유형을 저장. 저장 영역을 자동으로 확대함
		
		String str = arrList.get(0);
		System.out.println(str);
		
		Iterator<String> it = arrList.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("arrList.size: "+arrList.size());
	}
}