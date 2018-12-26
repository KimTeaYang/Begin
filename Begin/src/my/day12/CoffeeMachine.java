package my.day12;

public class CoffeeMachine {
	private int coffee;
	private int sugar;
	private int cream;
	
	/* access modifier(접근 지정자)
	 * - private : 자기 클래스 내에서만 접근 가능
	 * - 생략형 : 같은 패키지 내에서 접근 가능
	 * - protected : 같은 패키지는 물론 다른 패키지일지라도 상속관계가 있으면 접근 가능
	 * - public : 어디서든 접근 가능
	 * 
	 * 캡슐화(Encapsulation)
	 *  멤버변수에 접근지정자 private을 붙이고 해당 변수에 접근할 수 있는
	 *  메소드(setter/getter)를 구성한다.
	 * */
	
	public void setCoffee(int c) {
		coffee = c;
	}
	public void setSugar(int s) {
		sugar = s;
	}
	public void setCream(int c) {
		cream = c;
	}
	
	public int getCoffee() {
		return coffee;
	}
	public int getSugar() {
		return sugar;
	}
	public int getCream() {
		return cream;
	}
}