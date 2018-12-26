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

		t1.setName("�鼺��");
		t1.setno(2016);
		t1.setSubject("Java");

		array[0]=t1;

		t2.setName("���¾�");
		t2.setno(2017);
		t2.setSubject("JSP");

		array[1]=t2;

		t3.setName("���¾�");
		t3.setno(2018);
		t3.setSubject("HTML");

		array[2]=t3;

		for(int i=0;i<array.length;i++) {
			array[i].showInfo();
			System.out.println("---------------");
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ���� �Է�: ");
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
			System.out.println(a+"�� ����� �����.");
		}

		System.out.print("�˻��� �̸� �Է�: ");
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
			System.out.println(b+"�� �����!!");
		}
		/* == : �������
		 *  - �⺻�ڷ��� : ���� ���Ѵ�.
		 *  - ������ : �ּҰ��� ���Ѵ�.
		 *  
		 *  String : == (�ּҰ� ��)
		 *              (���ڿ� ���� ��)
		 *  boolean	equals(Object anObject)
		 *   - String���� ���� ��� ���ڿ��� ������ ������ true�� ��ȯ�Ѵ�.
		 *  public boolean equals(Object anObject)
		 * */

		/*
		s.setName("���¾�");
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
		f.setDept("���");

		f.getName();
		f.getNo();
		f.getDept();

		f.showInfo();
		 */
	}
}