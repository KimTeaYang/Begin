package my.day11;

public class jobCompany {
	String nameC;
	int salaryC;
	String regionC;
	String telC;
	
	public void showCompany() {
		System.out.println("회  사: "+nameC);
		System.out.println("급  여: "+salaryC+"만원");
		System.out.println("지  역: "+regionC);
		System.out.println("연락처: "+telC);
	}
}