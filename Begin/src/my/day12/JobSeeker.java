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
		System.out.printf("----%s님의 프로필----\n", this.name);
		System.out.printf("나이 : %d세\n", this.age);
		System.out.printf("전화번호 : %s\n", this.tell);
	}
}
