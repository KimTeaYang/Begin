package my.day12;

public class JobSeeker {
	private String name;
	private int age;
	private String tell;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	
	public void showProfile() {
		System.out.printf("----%s���� ������----\n", this.name);
		System.out.printf("���� : %d��\n", this.age);
		System.out.printf("��ȭ��ȣ : %s\n", this.tell);
	}
}
