package my.day13;

/* 1. 추상화
   2. 캡슐화
   3. 다형성
    - 오버로딩 (Overloading)  - 다중정의
     1) 생성자 오버로딩
     2) 메소드 오버로딩
    - 오버라이딩 (Overriding) - 재정의
   4. 상속성
   
	한 페이지 내에 여러 개의 클래스를 구성할 수 있다.
	이때 주의. public 속성을 갖는 클래스는 1개만 될 수 있으며,
	public인 클래스명으로 파일명을 지정해야 한다.
 * */

public class Overloading{

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		Yuja y = new Yuja();
		
		cm.makeTea(10, 20, 30);
		System.out.println("-------------------");
		
		cm.makeTea(10, 30);
		System.out.println("-------------------");
		
		cm.makeTea(10);
		System.out.println("-------------------");
		
		cm.makeTea((short)1);
		System.out.println("-------------------");
		
		System.out.println(cm.makeTea((short)20, 10));
		
		y.setYuja(10);
		y.setSugar(20);
		cm.makeTea(y);
	}
}

class Yuja{
	private int yuja, sugar;

	public void setYuja(int yuja) {
		this.yuja = yuja;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public int getYuja() {
		return yuja;
	}
	public int getSugar() {
		return sugar;
	}
	
}

class CoffeeMachine {
	int coffee, sugar, cream;
	/* 메소드 오버로딩
	 * 	한 클래스 내에서 동일한 메소드 명으로 여러개를 정의하는 것
	 * 	 - 규칙
	 * 	  1) 메소드 명은 동일하게
	 *    2) 매개변수의 자료형이 다르거나, 갯수가 다르거나, 순서가 다르게 구현.
	 *    3) 반환타입은 같아도 되고 달라도 됨(신경 안씀)
	 * */
	public void makeTea(int coffee) {
		this.coffee = coffee;
		System.out.println("블랙 커피 나가요~~ 농도: "+this.coffee);
	}
	public void makeTea(short sugar) {
		this.sugar = sugar;
		System.out.println("설탕물 나가요~ 농도: "+this.sugar);
	}
	public void makeTea(int coffee, int sugar) {
		this.coffee = coffee;
		this.sugar = sugar;
		System.out.println("설탕 커피 나가요~~ 농도: "
		+(this.coffee+this.sugar));
	}
	public void makeTea(int coffee, int sugar, int cream) {
		this.coffee = coffee;
		this.sugar = sugar;
		this.cream = cream;
		System.out.println("밀크 커피 나가요~~ 농도: "
		+(this.coffee+this.sugar+this.cream));
	}
	public String makeTea(int coffee, short cream) {
		this.coffee = coffee;
		this.cream = cream;
		System.out.println("크림 커피 나가요~~ ");
		return "농도: "+(this.coffee+this.cream);
	}
	public String makeTea(short c, int cf) {
		String str = makeTea(cf, c);
		return str;
	}
	
	public void makeTea(Yuja y) {
		System.out.println("====유자차 나가요====");
		System.out.println("유자 농도: "+y.getYuja());
		System.out.println("설탕 농도: "+y.getSugar());
		System.out.println("------------------");
	}
}
