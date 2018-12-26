package my.day21;

import java.util.ArrayList;
import java.util.Vector;

/* 도메인 객체(VO객체:Value Object, DTO: Data Transfer Object)
 *  - 값을 가지고 있는 객체
 */
class Person{
	private String name;
	private int age;
	
	public Person() {
		this("아무개", 22);
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class VectorTest2 {

	public static void main(String[] args) {
		Vector<Person> v = new Vector<>(5,3);
		Person p1 = new Person();
		Person p2 = new Person("홍길동", 18);
		Person p3 = new Person();
		p3.setAge(20);p3.setName("강길동");
		
		v.add(p1);v.add(p2);v.add(p3);
		
		for(Person p:v) {
			String str = p.getName()+" "+p.getAge();
			System.out.println(str);
		}
		
	}
}