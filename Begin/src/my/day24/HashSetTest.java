package my.day24;

import java.util.*;
/* Set계열
 *  - HashSet
 *  - 데이터 중복을 허용하지 않음
 * */
public class HashSetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		System.out.println("set.size() 1: "+set.size());
		
		set.add("JSP");
		System.out.println("set.size() 2: "+set.size());
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		set.remove("JDBC");
		System.out.println("set.size() 3: "+set.size());
		
		for(String str:set) {
			System.out.println(str);
		}
		
	}
}