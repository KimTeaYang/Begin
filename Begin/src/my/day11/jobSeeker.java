package my.day11;

public class jobSeeker {

		String name;
		int age;
		char gender;
		String tel;
		
		public void showProfile() {
			System.out.println("��  ��: "+name);
			System.out.println("��  ��: "+age);
			System.out.println("��  ��: "+gender);
			System.out.println("����ó: "+tel);
			
		}
		
		public void want(String job, int money) {
			showProfile();
			System.out.println("----��� ����----");
			System.out.println("�������: "+job);
			System.out.println("����ӱ�: "+money+" ����");
		}
		
}