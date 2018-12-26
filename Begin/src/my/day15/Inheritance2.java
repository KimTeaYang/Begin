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
		return "이름: "+name+"\n나이: "+age+"\n";
	}
	public String toString() {
		return "2";
	}
}

class Student extends Person{
	String cname;
	
	public Student() {
		super("김",21);
		/*  상속관계를 맺을 경우 자식 클래스의 생성자에서 맨 처음 하는 일은 부모의 기본
		 * 생성자(super())를 호출하는 일이다. 따라서 부모에는 기본 생성자를 갖추는
		 * 것이 좋다.
		 *  하지만 부모 클래스에 기본생성자가 없다면, 자식 클래스에서는 부모가 가진 인자 
		 * 생성자를 super()를 이용해 명시적으로 호출해주자 */
	}
	public Student(String name, int age, String cname) {
		super(name, age);
		/* super()는 생성자 안에서만 호출 가능하고, 첫번째 줄에서 호출되어야 함
		 * this()와는 함께 사용 불가 */
		this.cname = cname;
	}
	
	/* 재정의하려는 메소드 앞에 @Override라는 annotation을 붙이면, 컴파일러는 해당
	 * 메소드가 재정의 문법에 위배되는 부분이 없는지 체크를 해준다.*/
	@Override
	public String show() {
		return super.show()+"학급: "+cname+"\n";
	}
	
	public void show(String title) {
		System.out.println(title);
		System.out.println(this.show());
	}
	
}

public class Inheritance2 {
	public static void main(String[] args) {
		Person p = new Person("사람", 20);
		System.out.println(new Person());
		
		Student s = new Student("김학생", 20, "Jave");
		System.out.println(s.show());
		
		s.show("----학생1----");
		
		Person p1 = new Student("이학생", 22, "JSP");
		System.out.println(p1.show());
		((Student)p1).show("----학생2----");
	}
}