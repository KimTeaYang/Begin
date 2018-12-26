package my.day14;

//상속성
//부모 클래스 - Super class, Base class
class Human {
	String name;
	int height;

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("키  : " + height);
	}
}

//자식 클래스 - Sub class, Derived class
class Superman extends Human {
	int power;

	public Superman() {
		this("홍슈퍼", 120, 100);
	}

	public Superman(String n, int h, int p) {
		name = n;
		height = h;
		power = p;
	}
	/*
	 * Override(메소드 재정의): 부모로부터 물려받은 메소드를 다시 정의하여 구성하는 것 
	 *  1. 부모의 것과 동일한 메소드 명
	 *  2. 매개변수도 부모와 동일하게 
	 *  3. 반환타입도 부모와 동일하게 
	 *  4. 접근지정자는 부모와 동일하거나 더 넓은 범위의 지정자를 사용 
	 *  5. Exception의 경우 부모 메소드와 동일하거나 더 구체적인 Exception을 발생시켜야 한다.
	 */
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("힘  : " + power);
	}
	
	public void showInfo(String title) {
		System.out.println(title);
		this.showInfo();
	}
	public void showInfo(int up) {
		this.showInfo("***슈퍼맨***");
		power +=up;
		System.out.println(">>>초능력 충전>>>");
		System.out.println("힘  : " + power);
	}
}

class Aquaman extends Human {
	double speed;

	public Aquaman() {
		this("수중인간", 140, 3.0);
	}

	public Aquaman(String n, int h, double s) {
		name = n;
		height = h;
		speed = s;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("속도: " + speed);
	}
	
	public String showInfo(String title, double sp) {
		System.out.println(title);
		this.showInfo();
		speed +=sp;
		return "스피드 증속>> 속도: "+speed;
	}
}

public class Inheritance {
	public static void main(String[] args) {
		/* 다형성 : 부모타입의 변수를 선언하고 자식의 객체를 생성한다.
		 *  단, 이때 참조변수로 접근할 수 있는 범위는 제한이 있다.
		 *  부모로부터 상속받은 변수와 메소드만 접근 가능하다.
		 *  다만, 오버라이드한 메소드가 있을 경우는 자식의 것을 우선 호출한다.
		 * */
		Human h1 = new Human();
		h1.name = "홍길동";
		h1.height = 177;
		h1.showInfo();
		System.out.println("------------");
		
		Superman s1 = new Superman();
		s1.name = "김슈퍼";
		s1.height = 188;
		s1.power = 500;
		s1.showInfo();
		System.out.println("------------");
		s1.showInfo("***슈퍼맨***");
		System.out.println("------------");
		s1.showInfo(200);
		System.out.println("------------");
		
		Aquaman a1 = new Aquaman("수중", 180, 4.0);
		a1.showInfo();
		System.out.println("------------");	
		System.out.println(a1.showInfo("아쿠아맨", 10.5));
		
		Human ha2=(Human)a1;
		// System.out.println(ha2.speed); [x]
		System.out.println(a1.speed);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		Human hs = new Superman("최슈퍼",178,300);
		hs.name = "홍슈퍼";
		hs.height = 177;
		// hs.power=300; [x] 자식 객체의 고유한 변수는 접근 불가
		hs.showInfo(); // 재정의한 메소드를 우선 적용한다.
		System.out.println("---------------------");
		
		Human ha = new Aquaman();
		ha.name = "홍수중";
		ha.height = 17;
		ha.showInfo();
		System.out.println("---------------------");
		System.out.println(((Aquaman)ha).speed);
		((Aquaman)ha).showInfo("####",50);
		/*부모와 자식의 상속관계일 경우 형변환이 가능하다.*/
		System.out.println("---------------------");
		
		Human []h = {h1,s1,a1,hs,ha};
		
		for(int i=0;i<h.length;i++) {
			h[i].showInfo();
			System.out.println("$$$$$$$$$$$");
		}
		// 확장 for루프
		for(Human hm:h) {
			hm.showInfo();
			System.out.println("^^^^^^^^^^");
		}
	}
}