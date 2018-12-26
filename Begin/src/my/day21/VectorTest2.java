package my.day21;

import java.util.ArrayList;
import java.util.Vector;

/* ������ ��ü(VO��ü:Value Object, DTO: Data Transfer Object)
 *  - ���� ������ �ִ� ��ü
 */
class Person{
	private String name;
	private int age;
	
	public Person() {
		this("�ƹ���", 22);
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
		Person p2 = new Person("ȫ�浿", 18);
		Person p3 = new Person();
		p3.setAge(20);p3.setName("���浿");
		
		v.add(p1);v.add(p2);v.add(p3);
		
		for(Person p:v) {
			String str = p.getName()+" "+p.getAge();
			System.out.println(str);
		}
		
	}
}