package my.day21;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* 도메인 객체(VO객체:Value Object, DTO: Data Transfer Object)
 *  - 값을 가지고 있는 객체
 */

public class VectorTest3 {

	public static void main(String[] args) {
		Vector<Person> v = new Vector<>(5,3);
		Person p1 = new Person("홍길동", 22);
		Person p2 = new Person("김길동", 18);
		Person p3 = new Person("최길동", 25);
		
		v.add(p1);v.add(p2);v.add(p3);
	
		/* public Enumeration<e> elements()
		 *  - 벡터에 저장된 객체들을 한꺼번에 꺼내고자 할 때 사용.
		 *    Enumeration과 Iterator인터페이스는 개체들을 집합체로
		 *    관리하도록 해주는 인터페이스다.
		 *    이들 인터페이스에서는 각각의 객체들을 한 순간에 하나씩 처리할 수
		 *    있는 메소드를 제공한다.
		 *    
		 *    Enumeration의 경우----------------
		 *    [1] boolean hasMoreElements() : 논리적 커서(첫번째 요소
		 *        직전에 위치) 이후에 요소들이 있는지 여부를 체크.
		 *        있으면 true, 없으면 false를 반환
		 *    [2] E nextElement() : 논리적 커서를 다음 요소로 이동하고
		 *        현재 카리키고 있는 요소를 반환한다.
		 *    Iterator의 경우--------------------
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
		/* 벡터에 저장된 요소들을 배열로 카피해준다. */
		Person []ps = new Person[v.size()];
		v.copyInto(ps);
		
		for(Person p:ps) {
			System.out.println(p.getName()+"/"+p.getAge());
		}
		System.out.println("=====================");
		
		// 벡터에 저장된 요소 모두 지우기
		System.out.println("v.size: "+v.size());
		
		for(Person p:v) {
			System.out.println(p.getName()+"/"+p.getAge());
			System.out.println("v.size: "+v.size());
		}
		System.out.println("=====================");
		
	}
}