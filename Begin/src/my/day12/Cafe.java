package my.day12;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm = new CoffeeMachine();
		
		cm.setCoffee(1);
		cm.setSugar(2);
		cm.setCream(3);
		System.out.println("커피: "+cm.getCoffee());
		System.out.println("설탕: "+cm.getSugar());
		System.out.println("크림: "+cm.getCream());
		
		String str = "1212";
		System.out.println(Integer.parseInt(str));
	}
}