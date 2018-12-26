package my.day12;

import java.util.Scanner;

public class School{

	public static void main(String[] args) {
		Student s = new Student();
		Teacher []array = new Teacher[3];
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();
		Teacher t3 = new Teacher();
		Staff f = new Staff();

		t1.setName("백성애");
		t1.setno(2016);
		t1.setSubject("Java");

		array[0]=t1;

		t2.setName("김태양");
		t2.setno(2017);
		t2.setSubject("JSP");

		array[1]=t2;

		t3.setName("김태양");
		t3.setno(2018);
		t3.setSubject("HTML");

		array[2]=t3;

		for(int i=0;i<array.length;i++) {
			array[i].showInfo();
			System.out.println("---------------");
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 교번 입력: ");
		int a = sc.nextInt();
		System.out.println("---------------");

		int cnt = 0;

		for(int i=0;i<array.length;i++) {
			if(a==array[i].getNo()) {
				array[i].showInfo();
				System.out.println("---------------");
				cnt++;
				break;
			}
		}

		if(cnt==0) {
			System.out.println(a+"번 교사는 없어요.");
		}

		System.out.print("검색할 이름 입력: ");
		String b = sc.next();
		System.out.println("---------------");
		
		cnt=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i].getName().equals(b)) {
				array[i].showInfo();
				System.out.println("---------------");
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println(b+"은 없어요!!");
		}
		/* == : 등가연산자
		 *  - 기본자료형 : 값을 비교한다.
		 *  - 참조형 : 주소값을 비교한다.
		 *  
		 *  String : == (주소값 비교)
		 *              (문자열 내용 비교)
		 *  boolean	equals(Object anObject)
		 *   - String에서 사용될 경우 문자열의 내용이 같으면 true를 반환한다.
		 *  public boolean equals(Object anObject)
		 * */

		/*
		s.setName("김태양");
		s.setno(2018);
		s.setCname("TIS");

		s.getName();
		s.getNo();
		s.getCname();

		s.showInfo();
		 */

		/*
		f.setName("ABC");
		f.setno(011);
		f.setDept("사원");

		f.getName();
		f.getNo();
		f.getDept();

		f.showInfo();
		 */
	}
}