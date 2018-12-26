package my.day13;

public class Overloading2 {

	public static void main(String[] args) {
		Superman s1 = new Superman();
		s1.showInfo();
		Superman s2 = new Superman("홍길동 슈퍼맨");
		s2.showInfo();
		Superman s3 = new Superman("김", 10);
		s3.showInfo();
		Superman s4 = new Superman("홍", 10, 20);
		s4.showInfo();
		
		Aquaman a1 = new Aquaman();
		a1.showInfo();
		Aquaman a2 = new Aquaman("김2");
		a2.showInfo();
		Aquaman a3 = new Aquaman("김3", 30);
		a3.showInfo();
		Aquaman a4 = new Aquaman("김4", 40, 5.0);
		a4.showInfo();
		
	}
}

class Superman{
	String name;
	int height;
	int power;
	
	public void showInfo() {
		System.out.println("----슈퍼맨 정보----");
		System.out.println("이름  : "+name);
		System.out.println("키    : "+height);
		System.out.println("초능력: "+power);
	}
	/* [1] this.변수 : 자기가 가진 인스턴스 변수를 의미
	 * [2] this() : 자기가 가진 생성자를 의미 this()는 반드시 생성자 안에서만 
	 *              호출할 수 있으며, 생성자의 첫번째 문장으로 와야한다.
	 * [3] this.메소드() : 자기가 가진 인스턴스 메소드를 의미
	 * */
	public Superman() {
		this("아무개 슈퍼맨", 177, 100);
		/*name = "김태양";
		height = 120;
		power = 100;*/
	}
	public Superman(String name) {
		this(name, 188, 200);
		/*this.name = name;
		height = 188;
		power = 200;*/
	}
	public Superman(String name, int h) {
		this(name, h, 300);
		/*name = n;
		height = h;
		power = 300;*/
	}
	public Superman(int h, String n) {
		this(n, h, 400);
		/*name = n;
		height = h;
		power = 400;*/
	}
	
	//target : 목적지. 여기서 초기화를 하자
	public Superman(String n, int h, int p) {
		name = n;
		height = h;
		power = p;
	}
}

class Aquaman{
	String name;
	int height;
	double speed;
	
	public void showInfo() {
		System.out.println("----아쿠아맨 정보----");
		System.out.println("이름: "+name);
		System.out.println("키  : "+height);
		System.out.println("속도: "+speed);
	}
	
	public Aquaman() {
		this("김1", 10, 2.0);
		/*name = "김1";
		height = 10;
		speed = 2.0;*/
	}
	public Aquaman(String n) {
		this(n, 20, 3.0);
		/*name = n;
		height = 20;
		speed = 3.0;*/
	}
	public Aquaman(String n, int h) {
		this(n, h, 4.0);
		/*name = n;
		height = h;
		speed = 4.0;*/
	}
	public Aquaman(String n, int h, double s) {
		name = n;
		height = h;
		speed = s;
	}
}