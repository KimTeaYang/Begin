package my.day12;

public class Staff {
	private String name;
	private int no;
	private String dept;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setno(int no) {
		this.no = no;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public String getDept() {
		return dept;
	}
	
	public void showInfo() {
		System.out.println("name: "+name);
		System.out.println("no: "+no);
		System.out.println("dept: "+dept);
	}
}