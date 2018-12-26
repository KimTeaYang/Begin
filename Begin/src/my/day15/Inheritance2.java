package my.day15;

class Person{
	String name;
	int age;
	
	public Person() {
		
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String show() {
		return "�̸�: "+name+"\n����: "+age+"\n";
	}
	public String toString() {
		return "2";
	}
}

class Student extends Person{
	String cname;
	
	public Student() {
		super("��",21);
		/*  ��Ӱ��踦 ���� ��� �ڽ� Ŭ������ �����ڿ��� �� ó�� �ϴ� ���� �θ��� �⺻
		 * ������(super())�� ȣ���ϴ� ���̴�. ���� �θ𿡴� �⺻ �����ڸ� ���ߴ�
		 * ���� ����.
		 *  ������ �θ� Ŭ������ �⺻�����ڰ� ���ٸ�, �ڽ� Ŭ���������� �θ� ���� ���� 
		 * �����ڸ� super()�� �̿��� ��������� ȣ�������� */
	}
	public Student(String name, int age, String cname) {
		super(name, age);
		/* super()�� ������ �ȿ����� ȣ�� �����ϰ�, ù��° �ٿ��� ȣ��Ǿ�� ��
		 * this()�ʹ� �Բ� ��� �Ұ� */
		this.cname = cname;
	}
	
	/* �������Ϸ��� �޼ҵ� �տ� @Override��� annotation�� ���̸�, �����Ϸ��� �ش�
	 * �޼ҵ尡 ������ ������ ����Ǵ� �κ��� ������ üũ�� ���ش�.*/
	@Override
	public String show() {
		return super.show()+"�б�: "+cname+"\n";
	}
	
	public void show(String title) {
		System.out.println(title);
		System.out.println(this.show());
	}
	
}

public class Inheritance2 {
	public static void main(String[] args) {
		Person p = new Person("���", 20);
		System.out.println(new Person());
		
		Student s = new Student("���л�", 20, "Jave");
		System.out.println(s.show());
		
		s.show("----�л�1----");
		
		Person p1 = new Student("���л�", 22, "JSP");
		System.out.println(p1.show());
		((Student)p1).show("----�л�2----");
	}
}