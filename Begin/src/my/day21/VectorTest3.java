package my.day21;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* ������ ��ü(VO��ü:Value Object, DTO: Data Transfer Object)
 *  - ���� ������ �ִ� ��ü
 */

public class VectorTest3 {

	public static void main(String[] args) {
		Vector<Person> v = new Vector<>(5,3);
		Person p1 = new Person("ȫ�浿", 22);
		Person p2 = new Person("��浿", 18);
		Person p3 = new Person("�ֱ浿", 25);
		
		v.add(p1);v.add(p2);v.add(p3);
	
		/* public Enumeration<e> elements()
		 *  - ���Ϳ� ����� ��ü���� �Ѳ����� �������� �� �� ���.
		 *    Enumeration�� Iterator�������̽��� ��ü���� ����ü��
		 *    �����ϵ��� ���ִ� �������̽���.
		 *    �̵� �������̽������� ������ ��ü���� �� ������ �ϳ��� ó���� ��
		 *    �ִ� �޼ҵ带 �����Ѵ�.
		 *    
		 *    Enumeration�� ���----------------
		 *    [1] boolean hasMoreElements() : ���� Ŀ��(ù��° ���
		 *        ������ ��ġ) ���Ŀ� ��ҵ��� �ִ��� ���θ� üũ.
		 *        ������ true, ������ false�� ��ȯ
		 *    [2] E nextElement() : ���� Ŀ���� ���� ��ҷ� �̵��ϰ�
		 *        ���� ī��Ű�� �ִ� ��Ҹ� ��ȯ�Ѵ�.
		 *    Iterator�� ���--------------------
		 *    [1] boolean hasNext()
		 *    [2] E next()
		 *    ==================================
		 * */
		
		Enumeration<Person> en = v.elements();
		
		while(en.hasMoreElements()) {
			Person p = en.nextElement();
			System.out.println(p.getName()+"/"+p.getAge());
		}
		System.out.println("=====================");
		
		Iterator<Person> it = v.iterator();
		
		while(it.hasNext()) {
			Person i = it.next();
			System.out.println(i.getName()+"/"+i.getAge());
		}
		System.out.println("=====================");
		
		// public void copyInto(Object[] anArray)
		/* ���Ϳ� ����� ��ҵ��� �迭�� ī�����ش�. */
		Person []ps = new Person[v.size()];
		v.copyInto(ps);
		
		for(Person p:ps) {
			System.out.println(p.getName()+"/"+p.getAge());
		}
		System.out.println("=====================");
		
		// ���Ϳ� ����� ��� ��� �����
		System.out.println("v.size: "+v.size());
		
		for(Person p:v) {
			System.out.println(p.getName()+"/"+p.getAge());
			System.out.println("v.size: "+v.size());
		}
		System.out.println("=====================");
		
	}
}