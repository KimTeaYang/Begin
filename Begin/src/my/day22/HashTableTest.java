package my.day22;

import java.awt.Color;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
/* Map�迭
 *  - Hashtable, HashMap, Properties
 *  - Object������ ������ �� �ִ�.
 *  - key�� value�� �����Ͽ� �����Ѵ�.
 *  - �����Ͱ� 75% ���� �ڵ����� ���� ������ Ȯ���Ѵ�.
 *  - key���� �ߺ��� ������� �ʴ´�.
 *  - ������
 *  - ������ ����: Object put(Object key, Object value)
 *  - ������ ����: Object get(Object key)
 * */

public class HashTableTest {

	public static void main(String[] args) {
		// Generic ��� ����
		Hashtable ht = new Hashtable();
		ht.put("�ϳ�", new Integer(1));
		ht.put("��", "Two");
		ht.put("����", "Red");
		ht.put("�Ķ�", java.awt.Color.blue);
		
		Object val = ht.get("��");
		String str = (String)val;
		System.out.println(str);
		
		Color str1 = (Color)ht.get("�Ķ�");
		System.out.println(str1);
		
		// Generic ��� ����: Hashtable<K,V>
		Hashtable<String, Integer> h = new Hashtable<>();
		h.put("����", new Integer(1999));
		h.put("����", new Integer(19));
		h.put("�뵷", 50000);
		
		Integer yy = h.get("����");
		System.out.println(yy);
		System.out.println("h�� ����� ��� ����: "+h.size());
		
		// Enumeration<K> keys() 
		// Set<K> KeySet()
		//  : Ű ������ ����ü ���·� ��ȯ��
		// Collection<V> values()  
		//  : Value������ Colloection���·� ��ȯ
		
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