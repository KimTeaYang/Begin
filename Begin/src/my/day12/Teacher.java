package my.day12;

public class Teacher {
	private String name; // 멤버변수
	private int no;
	private String subject;
	
	public void setName(String name) { // 매개변수(지역변수)
		/* 지역변수와 멤버변수명이 동일할 경우 지역변수가 우선권을 갖는다.
		 * 둘을 구분하기 위해 멤버변수(인스턴스변수) 앞에는 this.을 붙인다.
		 * this는 인스턴스 변수 앞에 붙는 키워드!
		 * */
		this.name = name;
	}
	public void setno(int no) {
		this.no = no;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public String getSubject() {
		return subject;
	}
	
	public void showInfo() {
		System.out.println("name: "+name);
		System.out.println("no: "+no);
		System.out.println("subject: "+subject);
	}
}