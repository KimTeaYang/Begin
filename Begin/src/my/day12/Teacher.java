package my.day12;

public class Teacher {
	private String name; // �������
	private int no;
	private String subject;
	
	public void setName(String name) { // �Ű�����(��������)
		/* ���������� ����������� ������ ��� ���������� �켱���� ���´�.
		 * ���� �����ϱ� ���� �������(�ν��Ͻ�����) �տ��� this.�� ���δ�.
		 * this�� �ν��Ͻ� ���� �տ� �ٴ� Ű����!
		 * */
		this.name = name;
	}
	public void setno(int no) {
		this.no = no;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public String getSubject() {
		return subject;
	}
	
	public void showInfo() {
		System.out.println("name: "+name);
		System.out.println("no: "+no);
		System.out.println("subject: "+subject);
	}
}