package my.day16;

abstract public class Animal {
	abstract public void crySound();

	abstract public String getBaby(int num);
}

class Dog extends Animal {
	public void crySound() {
		System.out.println("�۸�");
	}

	public String getBaby(int num) {
		return num + "������ ������ ���ƿ�";
	}
}

class Cat extends Animal {
	public void crySound() {
		System.out.println("�߿˾߿�");
	}

	public String getBaby(int num) {
		return num + "������ ������ ���ƿ�";
	}
}

class Duck extends Animal {
	public void crySound() {
		System.out.println("�в�");
	}

	public String getBaby(int num) {
		return num + "���� ���� ���ƿ�";
	}
}