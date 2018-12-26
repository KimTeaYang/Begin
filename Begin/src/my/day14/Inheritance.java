package my.day14;

//��Ӽ�
//�θ� Ŭ���� - Super class, Base class
class Human {
	String name;
	int height;

	public void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("Ű  : " + height);
	}
}

//�ڽ� Ŭ���� - Sub class, Derived class
class Superman extends Human {
	int power;

	public Superman() {
		this("ȫ����", 120, 100);
	}

	public Superman(String n, int h, int p) {
		name = n;
		height = h;
		power = p;
	}
	/*
	 * Override(�޼ҵ� ������): �θ�κ��� �������� �޼ҵ带 �ٽ� �����Ͽ� �����ϴ� �� 
	 *  1. �θ��� �Ͱ� ������ �޼ҵ� ��
	 *  2. �Ű������� �θ�� �����ϰ� 
	 *  3. ��ȯŸ�Ե� �θ�� �����ϰ� 
	 *  4. ���������ڴ� �θ�� �����ϰų� �� ���� ������ �����ڸ� ��� 
	 *  5. Exception�� ��� �θ� �޼ҵ�� �����ϰų� �� ��ü���� Exception�� �߻����Ѿ� �Ѵ�.
	 */
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("��  : " + power);
	}
	
	public void showInfo(String title) {
		System.out.println(title);
		this.showInfo();
	}
	public void showInfo(int up) {
		this.showInfo("***���۸�***");
		power +=up;
		System.out.println(">>>�ʴɷ� ����>>>");
		System.out.println("��  : " + power);
	}
}

class Aquaman extends Human {
	double speed;

	public Aquaman() {
		this("�����ΰ�", 140, 3.0);
	}

	public Aquaman(String n, int h, double s) {
		name = n;
		height = h;
		speed = s;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("�ӵ�: " + speed);
	}
	
	public String showInfo(String title, double sp) {
		System.out.println(title);
		this.showInfo();
		speed +=sp;
		return "���ǵ� ����>> �ӵ�: "+speed;
	}
}

public class Inheritance {
	public static void main(String[] args) {
		/* ������ : �θ�Ÿ���� ������ �����ϰ� �ڽ��� ��ü�� �����Ѵ�.
		 *  ��, �̶� ���������� ������ �� �ִ� ������ ������ �ִ�.
		 *  �θ�κ��� ��ӹ��� ������ �޼ҵ常 ���� �����ϴ�.
		 *  �ٸ�, �������̵��� �޼ҵ尡 ���� ���� �ڽ��� ���� �켱 ȣ���Ѵ�.
		 * */
		Human h1 = new Human();
		h1.name = "ȫ�浿";
		h1.height = 177;
		h1.showInfo();
		System.out.println("------------");
		
		Superman s1 = new Superman();
		s1.name = "�轴��";
		s1.height = 188;
		s1.power = 500;
		s1.showInfo();
		System.out.println("------------");
		s1.showInfo("***���۸�***");
		System.out.println("------------");
		s1.showInfo(200);
		System.out.println("------------");
		
		Aquaman a1 = new Aquaman("����", 180, 4.0);
		a1.showInfo();
		System.out.println("------------");	
		System.out.println(a1.showInfo("����Ƹ�", 10.5));
		
		Human ha2=(Human)a1;
		// System.out.println(ha2.speed); [x]
		System.out.println(a1.speed);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		Human hs = new Superman("�ֽ���",178,300);
		hs.name = "ȫ����";
		hs.height = 177;
		// hs.power=300; [x] �ڽ� ��ü�� ������ ������ ���� �Ұ�
		hs.showInfo(); // �������� �޼ҵ带 �켱 �����Ѵ�.
		System.out.println("---------------------");
		
		Human ha = new Aquaman();
		ha.name = "ȫ����";
		ha.height = 17;
		ha.showInfo();
		System.out.println("---------------------");
		System.out.println(((Aquaman)ha).speed);
		((Aquaman)ha).showInfo("####",50);
		/*�θ�� �ڽ��� ��Ӱ����� ��� ����ȯ�� �����ϴ�.*/
		System.out.println("---------------------");
		
		Human []h = {h1,s1,a1,hs,ha};
		
		for(int i=0;i<h.length;i++) {
			h[i].showInfo();
			System.out.println("$$$$$$$$$$$");
		}
		// Ȯ�� for����
		for(Human hm:h) {
			hm.showInfo();
			System.out.println("^^^^^^^^^^");
		}
	}
}