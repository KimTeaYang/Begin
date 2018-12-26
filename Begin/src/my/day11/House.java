package my.day11;

public class House {
	
	// 1. 속성 : 멤버변수(has a 관계가 성립해야 함)
	String addr;
	String owner;
	int room;
	int year;
	
	// 2. 기능(행위): 메소드
	public void showInfo() {
		System.out.println("----House 정보----");
		System.out.println("소유주: "+owner);
		System.out.println("주  소: "+addr);
		System.out.println("방  수: "+room);
	}
	
	public void existAt(int bunji) {
		System.out.println(owner+"의 집: "+addr+" "+bunji
				+"번지에 위치합니다");
	}
	
	public void Money(int price) {
		System.out.println("가  격: "+price+" 만원");
	}
	
	public void rent(String type, int money) {
		showInfo();
		System.out.println("타  입: "+type);
		System.out.println("가  격: "+money);
	}
	
}