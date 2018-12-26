package my.day11;

public class jobSeeker {

		String name;
		int age;
		char gender;
		String tel;
		
		public void showProfile() {
			System.out.println("ÀÌ  ¸§: "+name);
			System.out.println("³ª  ÀÌ: "+age);
			System.out.println("¼º  º°: "+gender);
			System.out.println("¿¬¶ôÃ³: "+tel);
			
		}
		
		public void want(String job, int money) {
			showProfile();
			System.out.println("----Èñ¸Á »çÇ×----");
			System.out.println("Èñ¸ÁÁ÷¹«: "+job);
			System.out.println("Èñ¸ÁÀÓ±İ: "+money+" ¸¸¿ø");
		}
		
}