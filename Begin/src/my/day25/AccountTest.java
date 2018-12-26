package my.day25;

public class AccountTest {
	
	public static void main(String[] args) {
		Account a = new Account();
		UserOut user1 = new UserOut(a,"남편");
		UserIn user2 = new UserIn(a,"아내");
		user1.start();
		user2.start();
		
	}
	
}