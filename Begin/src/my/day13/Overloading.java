package my.day13;

/* 1. �߻�ȭ
   2. ĸ��ȭ
   3. ������
    - �����ε� (Overloading)  - ��������
     1) ������ �����ε�
     2) �޼ҵ� �����ε�
    - �������̵� (Overriding) - ������
   4. ��Ӽ�
   
	�� ������ ���� ���� ���� Ŭ������ ������ �� �ִ�.
	�̶� ����. public �Ӽ��� ���� Ŭ������ 1���� �� �� ������,
	public�� Ŭ���������� ���ϸ��� �����ؾ� �Ѵ�.
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
	/* �޼ҵ� �����ε�
	 * 	�� Ŭ���� ������ ������ �޼ҵ� ������ �������� �����ϴ� ��
	 * 	 - ��Ģ
	 * 	  1) �޼ҵ� ���� �����ϰ�
	 *    2) �Ű������� �ڷ����� �ٸ��ų�, ������ �ٸ��ų�, ������ �ٸ��� ����.
	 *    3) ��ȯŸ���� ���Ƶ� �ǰ� �޶� ��(�Ű� �Ⱦ�)
	 * */
	public void makeTea(int coffee) {
		this.coffee = coffee;
		System.out.println("�� Ŀ�� ������~~ ��: "+this.coffee);
	}
	public void makeTea(short sugar) {
		this.sugar = sugar;
		System.out.println("������ ������~ ��: "+this.sugar);
	}
	public void makeTea(int coffee, int sugar) {
		this.coffee = coffee;
		this.sugar = sugar;
		System.out.println("���� Ŀ�� ������~~ ��: "
		+(this.coffee+this.sugar));
	}
	public void makeTea(int coffee, int sugar, int cream) {
		this.coffee = coffee;
		this.sugar = sugar;
		this.cream = cream;
		System.out.println("��ũ Ŀ�� ������~~ ��: "
		+(this.coffee+this.sugar+this.cream));
	}
	public String makeTea(int coffee, short cream) {
		this.coffee = coffee;
		this.cream = cream;
		System.out.println("ũ�� Ŀ�� ������~~ ");
		return "��: "+(this.coffee+this.cream);
	}
	public String makeTea(short c, int cf) {
		String str = makeTea(cf, c);
		return str;
	}
	
	public void makeTea(Yuja y) {
		System.out.println("====������ ������====");
		System.out.println("���� ��: "+y.getYuja());
		System.out.println("���� ��: "+y.getSugar());
		System.out.println("------------------");
	}
}
