package my.day25;

public class AccountTest {
	
	public static void main(String[] args) {
		Account a = new Account();
		UserOut user1 = new UserOut(a,"����");
		UserIn user2 = new UserIn(a,"�Ƴ�");
		user1.start();
		user2.start();
		
	}
	
}