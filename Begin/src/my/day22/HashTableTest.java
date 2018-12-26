package my.day22;

import java.awt.Color;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
/* Map계열
 *  - Hashtable, HashMap, Properties
 *  - Object유형을 저장할 수 있다.
 *  - key와 value를 매핑하여 저장한다.
 *  - 데이터가 75% 차면 자동으로 저장 영역을 확대한다.
 *  - key값의 중복을 허용하지 않는다.
 *  - 무순서
 *  - 데이터 저장: Object put(Object key, Object value)
 *  - 데이터 추출: Object get(Object key)
 * */

public class HashTableTest {

	public static void main(String[] args) {
		// Generic 사용 이전
		Hashtable ht = new Hashtable();
		ht.put("하나", new Integer(1));
		ht.put("둘", "Two");
		ht.put("빨강", "Red");
		ht.put("파랑", java.awt.Color.blue);
		
		Object val = ht.get("둘");
		String str = (String)val;
		System.out.println(str);
		
		Color str1 = (Color)ht.get("파랑");
		System.out.println(str1);
		
		// Generic 사용 이후: Hashtable<K,V>
		Hashtable<String, Integer> h = new Hashtable<>();
		h.put("생년", new Integer(1999));
		h.put("나이", new Integer(19));
		h.put("용돈", 50000);
		
		Integer yy = h.get("생년");
		System.out.println(yy);
		System.out.println("h에 저장된 요소 개수: "+h.size());
		
		// Enumeration<K> keys() 
		// Set<K> KeySet()
		//  : 키 값들을 집합체 형태로 반환함
		// Collection<V> values()  
		//  : Value값들을 Colloection형태로 반환
		
		Enumeration<String> en = h.keys();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			Integer val2 = h.get(key);
			System.out.println(key+": "+val2);
		}
		
		Collection<Integer> c = h.values();
		Iterator<Integer> it = c.iterator();
		
		while(it.hasNext()) {
			int a = it.next();
			System.out.println(a);
		}
		
		Set<String> set = h.keySet();
		Iterator<String> it2 = set.iterator();
		
		while(it2.hasNext()) {
			String str2 = it2.next();
			System.out.println(str2);
		}
		
	}
}