package my.day12;

public class CoffeeMachine {
	private int coffee;
	private int sugar;
	private int cream;
	
	/* access modifier(���� ������)
	 * - private : �ڱ� Ŭ���� �������� ���� ����
	 * - ������ : ���� ��Ű�� ������ ���� ����
	 * - protected : ���� ��Ű���� ���� �ٸ� ��Ű�������� ��Ӱ��谡 ������ ���� ����
	 * - public : ��𼭵� ���� ����
	 * 
	 * ĸ��ȭ(Encapsulation)
	 *  ��������� ���������� private�� ���̰� �ش� ������ ������ �� �ִ�
	 *  �޼ҵ�(setter/getter)�� �����Ѵ�.
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