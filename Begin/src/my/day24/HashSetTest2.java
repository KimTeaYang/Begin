package my.day24;

import java.util.*;

class Member{
	String name;
	int age;
	
	public Member() {
		this("ȫ�浿", 22);
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("--ȸ�� ����--");
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
	}
	
	//�̸������̰� ������ �ߺ� ������� ���ϵ��� �ϱ����� 
	//equals()�� hashCode()�� �������̵� ����.
	@Override
	public int hashCode() {
		int hcode = name.hashCode();
		return hcode+age;
	}
	//�������� instanceof Ŭ������: ������ Ŭ������ ��ü�̸� true, �ƴϸ� false ��ȯ
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member user = (Member)obj;
			boolean b=(user.name.equals(this.name))&&
					(user.age==this.age);
			return b;
		}
		return false;
	}
}

public class HashSetTest2 {

	public static void main(String[] args) {
		Member m1 = new Member("ȫ�浿",22);
		Member m2 = new Member("��浿",23);
		Member m3 = new Member("�ֱ浿",24);
		
		Set<Member> set = new HashSet<>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		
		for(Member m:set) {
			m.showInfo();
		}
		Member m4 = new Member("ȫ�浿",22);
		set.add(m4);
		System.out.println("==================================");
		
		for(Iterator<Member> it=set.iterator();it.hasNext();) {
			Member m = it.next();
			m.showInfo();
		}
	}
}