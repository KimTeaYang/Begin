package my.day13;

public class Overloading2 {

	public static void main(String[] args) {
		Superman s1 = new Superman();
		s1.showInfo();
		Superman s2 = new Superman("ȫ�浿 ���۸�");
		s2.showInfo();
		Superman s3 = new Superman("��", 10);
		s3.showInfo();
		Superman s4 = new Superman("ȫ", 10, 20);
		s4.showInfo();
		
		Aquaman a1 = new Aquaman();
		a1.showInfo();
		Aquaman a2 = new Aquaman("��2");
		a2.showInfo();
		Aquaman a3 = new Aquaman("��3", 30);
		a3.showInfo();
		Aquaman a4 = new Aquaman("��4", 40, 5.0);
		a4.showInfo();
		
	}
}

class Superman{
	String name;
	int height;
	int power;
	
	public void showInfo() {
		System.out.println("----���۸� ����----");
		System.out.println("�̸�  : "+name);
		System.out.println("Ű    : "+height);
		System.out.println("�ʴɷ�: "+power);
	}
	/* [1] this.���� : �ڱⰡ ���� �ν��Ͻ� ������ �ǹ�
	 * [2] this() : �ڱⰡ ���� �����ڸ� �ǹ� this()�� �ݵ�� ������ �ȿ����� 
	 *              ȣ���� �� ������, �������� ù��° �������� �;��Ѵ�.
	 * [3] this.�޼ҵ�() : �ڱⰡ ���� �ν��Ͻ� �޼ҵ带 �ǹ�
	 * */
	public Superman() {
		this("�ƹ��� ���۸�", 177, 100);
		/*name = "���¾�";
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
	
	//target : ������. ���⼭ �ʱ�ȭ�� ����
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
		System.out.println("----����Ƹ� ����----");
		System.out.println("�̸�: "+name);
		System.out.println("Ű  : "+height);
		System.out.println("�ӵ�: "+speed);
	}
	
	public Aquaman() {
		this("��1", 10, 2.0);
		/*name = "��1";
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