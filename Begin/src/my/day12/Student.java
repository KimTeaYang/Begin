package my.day12;

public class Student {
	private String name;
	private int no;
	private String cname;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setno(int no) {
		this.no = no;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public String getCname() {
		return cname;
	}
	
	public void showInfo() {
		System.out.println("name: "+name);
		System.out.println("no: "+no);
		System.out.println("cname: "+cname);
	}
}