package my.day16;

abstract public class Animal {
	abstract public void crySound();

	abstract public String getBaby(int num);
}

class Dog extends Animal {
	public void crySound() {
		System.out.println("¸Û¸Û");
	}

	public String getBaby(int num) {
		return num + "¸¶¸®ÀÇ »õ³¢¸¦ ³º¾Æ¿ä";
	}
}

class Cat extends Animal {
	public void crySound() {
		System.out.println("¾ß¿Ë¾ß¿Ë");
	}

	public String getBaby(int num) {
		return num + "¸¶¸®ÀÇ »õ³¢¸¦ ³º¾Æ¿ä";
	}
}

class Duck extends Animal {
	public void crySound() {
		System.out.println("²Ð²Ð");
	}

	public String getBaby(int num) {
		return num + "°³ÀÇ ¾ËÀ» ³º¾Æ¿ä";
	}
}