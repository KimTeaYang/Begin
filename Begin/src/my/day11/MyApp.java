package my.day11;

/* 1. 추상화(Abstraction)
 * 		프로그램에 필요한 객체를 클래스로 옮겨놓은 것.
 * 		ex) 부동산앱 
 * 			1) 객체를 추출 - 집, 매도자, 매수자, 중개인 ...
 * 				==> 클래스로 옮긴다.
 * 					집 - 속성 ==> 멤버변수
 * 						기능(행위) ==> 메소드
 * 2. 캡슐화(Encapsulation)
 * 3. 다형성(Polymorphism)
 * 4. 상속성(Inheritance)
 * */

public class MyApp {

	public static void main(String[] args) {
		/* 클래스(class) ==> 객체를 만들어내는 틀
		    객체(Object) : 클래스를 통해 만들어진 구현물
		    			==> 메모리에 올라간 객체(object)
		*/
		House h1 = new House();
		House h2 = new House();
		House h3 = new House();
		
		h1.owner = "홍길동";
		h1.addr = "서울 마포구";
		h1.room = 3;
		
		h2.owner = "김길동";
		h2.addr = "서울 영등포구";
		h2.room = 4;
		
		h3.owner = "홍홍홍";
		h3.addr = "수유동";
		h3.room = 1;
		h3.rent("전세", 8000);
		h3.existAt(31);
		
	}
}