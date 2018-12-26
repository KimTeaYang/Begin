package my.day24;

import java.util.*;

class Member{
	String name;
	int age;
	
	public Member() {
		this("홍길동", 22);
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showInfo() {
		System.out.println("--회원 정보--");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
	
	//이름과나이가 같으면 중복 저장되지 못하도록 하기위해 
	//equals()와 hashCode()를 오버라이드 하자.
	@Override
	public int hashCode() {
		int hcode = name.hashCode();
		return hcode+age;
	}
	//참조변수 instanceof 클래스명: 변수가 클래스의 객체이면 true, 아니면 false 반환
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
		Member m1 = new Member("홍길동",22);
		Member m2 = new Member("김길동",23);
		Member m3 = new Member("최길동",24);
		
		Set<Member> set = new HashSet<>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		
		for(Member m:set) {
			m.showInfo();
		}
		Member m4 = new Member("홍길동",22);
		set.add(m4);
		System.out.println("==================================");
		
		for(Iterator<Member> it=set.iterator();it.hasNext();) {
			Member m = it.next();
			m.showInfo();
		}
	}
}